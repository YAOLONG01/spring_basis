package cn.hjycjc.spring.spring_basis.hello_world.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.hjycjc.spring.spring_basis.hello_world.annotation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	@Qualifier("userRepositoryImpl")
	private UserRepository userRepository;
	public void add(){
		System.out.println("UserService add() ...");
		userRepository.save();
	}

}
