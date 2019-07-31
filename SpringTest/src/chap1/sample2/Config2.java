package chap1.sample2;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap1.sample.User;
import chap1.sample.UserRepository;

@Configuration
public class Config2 {
	@Bean
	public User user1() {
		return new User("bkchoi","1234");
	}
	@Bean(name = "user2")
	public User user() {
		return new User("madvirus","qwer");
	}
	@Bean
	public UserRepository userRepository() {
		UserRepository userRepo = new UserRepository();
		userRepo.setUsers(Arrays.asList(user1(),user()));
		return userRepo;
	}
}
