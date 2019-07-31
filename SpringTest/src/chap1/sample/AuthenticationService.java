package chap1.sample;


public class AuthenticationService {

	private UserRepository userRepository;
	private AuthFailLogger failLogger;
	
	  public AuthInfo authenticate(String id, String password) throws AuthException {
		    System.out.println("아이디:"+id);
		    System.out.println("비밀번호:"+password);

	        User user = userRepository.findUserById(id);
	        if (user == null) {
	            throw new UserNotFoundException();
	        }
	        if (!user.matchPassword(password)) {
	            failLogger.insertBadPw(id, password);
	            throw new AuthException();
	            
	            
	        }
	        return new AuthInfo(user.getId());
	        
	    }
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void setFailLogger(AuthFailLogger failLogger) {
		this.failLogger = failLogger;
	}
}
