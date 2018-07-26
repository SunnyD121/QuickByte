package com.revature.dao;

import java.util.List;

public interface UserDao {
	public Integer insertUser(User user);
	public Boolean insertUserViaSp(User user);
	public List<User> selectAllEmployee();
	public User selectEmployeeById(Integer id);
	public Integer deleteUserById(Integer id);
	public Integer updateUser(User user);
	public User selectUserByUsername(String username);
}
