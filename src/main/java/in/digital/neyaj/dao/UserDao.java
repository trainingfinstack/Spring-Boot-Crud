package in.digital.neyaj.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.digital.neyaj.dto.UserDto;

@Repository
public interface UserDao extends JpaRepository<UserDto, String>{
	
	UserDto getUsersByPhone(String phone);
	
	UserDto findByName(String name);
}
