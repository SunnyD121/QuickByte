package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Users;

public interface UserDao {
	public Integer insertUser(Users user);
	public List<Users> selectAllUsers();
	public Users selectUserById(Integer id);
	public Boolean deleteUserById(Integer id);
	public Users updateUser(Users user);
	public Users selectUserByUsername(String username);
}
