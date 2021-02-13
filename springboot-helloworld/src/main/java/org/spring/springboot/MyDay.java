package org.spring.springboot;

import org.springframework.stereotype.Service;

@Service
public class MyDay implements IMyday {

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "eat";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "sleep";
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "read";
	}

	@Override
	public String exercise() {
		// TODO Auto-generated method stub
		return "exercise";
	}

}
