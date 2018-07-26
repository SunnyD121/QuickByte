package com.revature.overknight.dao;

import java.util.List;
import com.revature.overknight.beans.User;

public interface UserDao {
	public Integer insertUser(User user);
	public Boolean insertUserViaSp(User user);
	public List<User> selectAllEmployee();
	public User selectEmployeeById(Integer id);
	public Boolean deleteUserById(Integer id);
	public User updateUser(User user);
	public User selectUserByUsername(String username);
}
