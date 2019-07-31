package chap1.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap1.sample.AuthFailLogger;
import chap1.sample.AuthenticationService;
import chap1.sample.PasswordChangeService;
import chap1.sample.UserRepository;

@Configuration
public class Config1 {
	 @Autowired
	   private UserRepository userRepository;
	   
	   @Bean
	   public PasswordChangeService pwChangeSvc() {
	      return new PasswordChangeService(userRepository);
	   }
	   
	   @Bean
	   public AuthFailLogger authFailLogger() {
	      AuthFailLogger logger = new AuthFailLogger();
	      logger.setThreshold(2);
	      return logger;
	   }
	   @Bean
	   public AuthenticationService authenticationService() {
	      AuthenticationService authSvc = new AuthenticationService();
	      authSvc.setFailLogger(authFailLogger());
	      authSvc.setUserRepository(userRepository);
	      return authSvc;
	   }

}
