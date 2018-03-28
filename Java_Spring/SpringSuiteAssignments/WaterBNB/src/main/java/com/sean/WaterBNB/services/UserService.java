package com.sean.WaterBNB.services;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sean.WaterBNB.models.User;
import com.sean.WaterBNB.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private BCryptPasswordEncoder bcrypt;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		this.bcrypt = encoder();
	}
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	public boolean isMatch(String password, String dbPassword) {
		if(bcrypt.matches(password, dbPassword)) {
			return true;
		}else {
			return false;
		}
	}
	public void login(HttpSession s, long id) {s.setAttribute("id", id);}
	
	public void logout(HttpSession s) {s.setAttribute("id", null);}
	
	public String redirect() {return "redirect:/users/new";}
	
	public boolean isValid(HttpSession session) {
		if(session.getAttribute("id") == null) {return false;}
		else {return true;}
	}
	
	public User create(User user) {
		user.setPassword(bcrypt.encode(user.getPassword()));
		return this.userRepository.save(user);
	}
	public ArrayList<User> all(){
		return (ArrayList<User>) this.userRepository.findAll();
	}
	public User find(long id) {
		return (User) this.userRepository.findById(id).orElse(null);
	}
	public User findByEmail(String email) {
		return (User) this.userRepository.findByEmail(email);
	}
	public void update(User user) {
		this.userRepository.save(user);
	}
	public void destroy(long id) {
		this.userRepository.deleteById(id);
	}
}
