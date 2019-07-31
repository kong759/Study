package chap1.sample2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap1.sample.AuthenticationService;
import chap1.sample.PasswordChangeService;

public class MainByJavaPackage {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("chap1.sample2");
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234","5678");

		ctx.close();
		
		
	}
}
