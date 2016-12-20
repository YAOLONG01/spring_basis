package cn.hjycjc.spring.spring_basis.hello_world.bean_generic_di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	@Autowired
	private BaseRepository<T> baseRepository;
	public void add(){
		System.out.println("BaseService:add"+baseRepository);
	}
	

}
