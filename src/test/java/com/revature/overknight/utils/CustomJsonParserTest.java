package com.revature.overknight.utils;

import com.revature.overknight.beans.Users;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomJsonParserTest {

//    private static String nullJson, emptyJson, emptyStringJson, json1, json2, json3, ultimateJson;
//    private CustomJsonParser parser1, parser2, parser3, parser4, parser5, parser6, parser7;
//
//    @BeforeClass
//    public static void beforeClass() {
//        nullJson = null;
//        emptyJson = "{}";
//        emptyStringJson = "";
//        json1 = "{apples: 7, donkeys: 4, cucumbers: 12}";
//        try {
//            json2 = new ObjectMapper().writeValueAsString(
//                    new User(
//                            1, "TestUsername", "TestPassword",
//                            1, "TestFirstName", "TestLastName",
//                            "test@test.test", 1234567890L, 1111222233334444L,
//                            "TestProfileImageKey"
//                    ));
//        }
////        catch (JsonGenerationException | JsonMappingException e){ //NOTE: These are subclasses of IOException
////            Logger.log(CustomJsonParserTest.class, e);
////        }
//        catch (IOException e){
//            Logger.log(CustomJsonParserTest.class, e);
//            json2 = "Exception Triggered.";
//        }
//        json3 = "{values: [5,6,7,9,12,3], berries: 5}";
//        ArrayList<User> userList = new ArrayList<>();
//        userList.add(new User(1, "TestUsername", "TestPassword",
//                1, "TestFirstName", "TestLastName",
//                "test@test.test", 1234567890L, 1111222233334444L,
//                "TestProfileImageKey"));
//        userList.add(new User(2, "TestUsername2", "TestPassword2",
//                1, "TestFirstName2", "TestLastName2",
//                "test2@test2.test2", 1234567892L, 1111222233334442L,
//                "TestProfileImageKey2"));
//        userList.add(new User(3, "TestUsername3", "TestPassword3",
//                1, "TestFirstName3", "TestLastName3",
//                "test3@test3.test3", 1234567893L, 1111222233334443L,
//                "TestProfileImageKey3"));
//        try {
//            ultimateJson = new ObjectMapper().writeValueAsString(userList);
//        } catch (IOException e) {
//            Logger.log(CustomJsonParserTest.class, e);
//            ultimateJson = "Exception Triggered";
//        }
//    }
//
//    @Before
//    public void before(){
//        parser1 = new CustomJsonParser(nullJson);
//        parser2 = new CustomJsonParser(emptyJson);
//        parser3 = new CustomJsonParser(emptyStringJson);
//        parser4 = new CustomJsonParser(json1);
//        parser5 = new CustomJsonParser(json2);
//        parser6 = new CustomJsonParser(json3);
//        parser7 = new CustomJsonParser(ultimateJson);
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void testGetParametersThrowsNullPointerException1() {
//        parser1.getParameters();
//    }
//    @Test(expected = NullPointerException.class)
//    public void testGetParametersThrowsNullPointerException3() {
//        parser3.getParameters();
//    }
//
//    @Test
//    public void testGetParameters() {
//        assertEquals("[]", parser2.getParameters().toString());
//        assertEquals("[apples, donkeys, cucumbers]", parser4.getParameters().toString());
//        assertEquals("TODO: Replace this", parser5.getParameters().toString());
//        assertEquals("[values, berries]", parser6.getParameters().toString());
//        assertEquals("TODO: Replace this", parser7.getParameters().toString());
//    }
//
//    @Test
//    public void testGetParameter() {
//        assertNull(parser2.getParameter("NonexistentParameter"));
//
//        assertNull(parser4.getParameter("NonexistentParameter"));
//        assertEquals("7", parser4.getParameter("apples"));
//        assertEquals("4", parser4.getParameter("donkeys"));
//        assertEquals("12", parser4.getParameter("cucumbers"));
//
//        assertNull(parser5.getParameter("NonexistentParameter"));
//        assertEquals("TODO: Not sure.", parser5.getParameter("???"));
//
//        assertNull(parser6.getParameter("NonexistentParameter"));
//        assertEquals("[5,6,7,9,12,3]", parser6.getParameter("values"));
//        assertEquals("5", parser6.getParameter("berries"));
//
//        assertNull(parser7.getParameter("NonexistentParameter"));
//        assertEquals("TODO: Not sure1.", parser7.getParameter("???1"));
//        assertEquals("TODO: Not sure2.", parser7.getParameter("???2"));
//        assertEquals("TODO: Not sure3.", parser7.getParameter("???3"));
//
//
//    }
}