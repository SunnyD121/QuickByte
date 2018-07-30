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
        map = new HashMap<>();
        parse(json);
    }

    public String[] getParameters(){
        String[] keys = new String[map.keySet().size()];
        Iterator<String> it = map.keySet().iterator();
        int i = 0;
        while(it.hasNext()) keys[i++] = it.next();
        return keys;
    }

    public String getParameter(String param){
        return map.get(param);
    }

    public void parse(String json){
        json = json.substring(1, json.length()-1);
        String[] array = json.split(",");
        for (String s : array){
            String[] pair = s.split(":");
            String key = pair[0].trim();
            String value = pair[1].trim();
            key = key.replace("\"","");
            value = value.replace("\"","");
            map.put(key, value);
        }
    }

    private String recurse(String json, int level){
        return null;
    }
    private void storePair(String pair){
        String[] array = pair.split(":");
        map.put(array[0].trim(), array[1].trim());
    }
}
