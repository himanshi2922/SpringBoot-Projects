package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Location;
import com.example.demo.entity.User;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class DtoProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DtoProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Location location = new Location();
		location.setPlace("Delhi");
		location.setDescription("Delhi is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		
		locationRepository.save(location);
		
		User user1 = new User();
		user1.setFirstname("himanshi");
		user1.setLastname("hora");
		user1.setEmail("himanshihora10@gmail.com");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);
		
		User user2 = new User();
		user2.setFirstname("prabhjyot");
		user2.setLastname("hora");
		user2.setEmail("prabh10@gmail.com");
		user2.setPassword("password2");
		user2.setLocation(location);
		userRepository.save(user2);

		
	}
	

}
