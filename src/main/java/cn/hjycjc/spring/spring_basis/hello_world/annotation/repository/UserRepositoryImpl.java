package cn.hjycjc.spring.spring_basis.hello_world.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepositoryImpl ...");
	}

}
