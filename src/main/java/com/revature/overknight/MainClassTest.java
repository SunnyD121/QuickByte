package com.revature.overknight;

import com.revature.overknight.beans.Users;
import com.revature.overknight.dao.UserDaoImpl;
import com.revature.overknight.services.KDF;
import com.revature.overknight.services.UserService;

public class MainClassTest {


    public static void main(String[] args){
        UserDaoImpl dao = new UserDaoImpl();
        UserService us = new UserService();



       dao.insertUser(new Users("Toby", "password".getBytes(), "password".getBytes(), 3,"Toby" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
       dao.insertUser(new Users("username", new KDF().encryptPassword("password"), new KDF().generateSalt(), 2, "User", "Name", "test@email.com", 1234321234L, "Uhh..."));
    }


}
