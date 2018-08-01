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
<<<<<<< HEAD
       dao.insertUser(new Users("Bobby", "password".getBytes(), "password".getBytes(), 3,"Bobby" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
       dao.insertUser(new Users("Chad", "password".getBytes(), "password".getBytes(), 3,"Chadrick" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
       dao.insertUser(new Users("Abby", "password".getBytes(), "password".getBytes(), 3,"Abigail" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
       dao.insertUser(new Users("Casandra", "password".getBytes(), "password".getBytes(), 3,"Casandra" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
       
=======
       dao.insertUser(new Users("username", new KDF().encryptPassword("password"), new KDF().generateSalt(), 2, "User", "Name", "test@email.com", 1234321234L, "Uhh..."));
>>>>>>> 1272cfc6da31725a7d41ff212d3047d627838c4e
    }


}
