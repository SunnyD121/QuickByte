package com.revature.overknight.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * NOTE: This class is NOT robust. IE, it only works if the json object you pass in is a bunch of key-value pairs.
 */
public class CustomJsonParser {

    private String json;
    private HashMap<String, String> map;

    public CustomJsonParser(String json){
        this.json = json;
        if (this.json == null || this.json.equals("")){
            map = null;
        }
        else if (this.json.equals("{}")) map = new HashMap<>();

        else{
            map = new HashMap<>();
            parse(json);
        }
    }

    public String[] getParameters(){
        if (map == null) return null;
        String[] keys = new String[map.keySet().size()];
        Iterator<String> it = map.keySet().iterator();
        int i = 0;
        while(it.hasNext()) keys[i++] = it.next();
        return keys;
    }

    public String getParameter(String param){
        if (map == null) return null;
        return map.get(param);
    }

    /*
    Use Cases:
    {a: b}
    {a: [b,c]}
    {a: {b: c}}
    [a,b]
    [{a: b, c: d}, {e: f, g: h}]
     */
    private void parse(String json){
        json = json.replaceAll("\\s", "");  //removes whitespace
        map = parseKeyValuePairs(json);

//        char firstChar = json.charAt(0);
//        json = json.substring(1);   //index 1 -> end
//        if (firstChar == '{'){
//            //Json object
//            if (json.charAt(json.length()-1) != '}') throw new InvalidJsonException("Invalid Final Character");
//            json = json.substring(0, json.length()-1);  //remove ending '}'
//            char at = json.charAt(0);
//            switch(at){
//                case '{': parseObject(json); break;
//                case '[': parseArray(json); break;
//                default:
//
//            }
//        }
//        else if (firstChar == '['){
//            if (json.charAt(json.length()-1) != ']') throw new InvalidJsonException("Invalid Final Character");
//            //TODO: Conditional on json array
//        }
//        else {
//            throw new InvalidJsonException("Not a valid character at position 0: "+json.charAt(0));
//        }
    }

    private HashMap<String, String> parseKeyValuePairs(String json){
        System.out.println(json);
        HashMap<String, String> localMap = new HashMap<>();
        json = json.substring(1, json.length()-1);
        String[] array = json.split(",");
        for (String s : array){
            String[] pair = s.split(":");
            String key = pair[0].trim();
            String value = pair[1].trim();
            key = key.replace("\"","");
            value = value.replace("\"","");
            System.out.println("\'"+key+"\'");
            System.out.println("\'"+value+"\'");
            localMap.put(key, value);
        }
        return localMap;
    }

    protected class InvalidJsonException extends RuntimeException{
        public InvalidJsonException(){
            super();
        }
        public InvalidJsonException(String message){
            super(message);
        }
    }
}
