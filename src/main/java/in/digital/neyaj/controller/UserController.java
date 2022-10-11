package in.digital.neyaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.digital.neyaj.dto.UserDto;
import in.digital.neyaj.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserDto userdto) {
		return userService.addUser(userdto);
	}
	
//	@PostMapping("/bulkAdd")
//	public String addUsers(@RequestBody List<UserDto> userdtos) {
//		return userService.addUsers(userdtos);
//	}
	
	
	@GetMapping("/getByPhone/{phone}")
	public String getByPhone(@PathVariable String phone) {
		UserDto usr =  userService.getUserByPhone(phone);
		if(usr == null) return "invalid phone number or user not found";
		return "name: " + usr.getName() + " " + "address: " + usr.getAddress();
		//return usr == null ? "no user found" : usr;
	}
	
//	@DeleteMapping("/delete/{name}")
//	public String deleteUser(@PathVariable String name) {
//		return userService.deleteUser(name);
//	}
//	
//	@PutMapping("/update/{name}")
//	public String updateUser(@PathVariable String name, @RequestBody UserDto user) {
//		return userService.updateUser(name,user);	
//	}
//	
	@GetMapping("/getAll")
	public List<UserDto> getUserDto() {
		return userService.getAll();
	}

}
