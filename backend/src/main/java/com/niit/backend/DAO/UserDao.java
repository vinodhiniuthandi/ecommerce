package com.niit.backend.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.niit.backend.model.User;
@Repository

public interface UserDao

{
	public List<User> list();
	public User get(String email);
	public void saveorupdate(User user);
	public void delete(User user);
	public User isvalidUser(String email, String password);
	public boolean isAlreadyRegister(String email, boolean b);

}