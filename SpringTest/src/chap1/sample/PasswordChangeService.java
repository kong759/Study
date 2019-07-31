package chap1.sample;

public class PasswordChangeService {
	
	private UserRepository userRepository;
	
	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void changePassword(String userId, String oldPw, String newPw) {
		System.out.println("����� ��й�ȣ:"+newPw);

		User user = userRepository.findUserById(userId);
		
		if (user == null) {
			throw new UserNotFoundException();
		} else {
			
			user.changePassword(oldPw, newPw);
		}
		
	}

}
