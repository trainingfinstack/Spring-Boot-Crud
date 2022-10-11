package in.digital.neyaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.digital.neyaj.dao.UserDao;
import in.digital.neyaj.dto.UserDto;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public String addUser(UserDto userdto) {
		dao.save(userdto);
		return "new User has been added into DataBase, name : "+userdto.getName();
		
	}
	
//	public String addUsers(List<UserDto> userdtos) {
//		dao.saveAll(userdtos);
//		return "All new User has been added into DataBase";
//	}
	
	public UserDto getUserByPhone(String phone) {
		System.out.println(phone.substring(0,3));
		
		if(phone.length() != 13 || !phone.substring(0,3).equals("+91")) return null;
		return dao.getUsersByPhone(phone);
	}
	
//	public String deleteUser(String name) {
//		UserDto userdto = dao.findByName(name);
//		if(userdto == null) return "no user " + name + " found";
//		dao.delete(userdto);
//		return "user deleted";
//	}
//	
//	public String updateUser(String name, UserDto user) {
//		UserDto usr = dao.findByName(name);
//		if(usr == null) return "no user " + name + " found";
//		dao.delete(usr);
//		dao.save(user);
//		return "user updated";
//	}
	
	public List<UserDto> getAll() {
		return dao.findAll();
	}

}
