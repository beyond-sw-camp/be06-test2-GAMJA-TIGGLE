package org.example.springdb.tiggle.user;


import org.example.springdb.tiggle.user.model.request.SignInRequest;
import org.example.springdb.tiggle.user.model.request.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int signup(SignupRequest request) {
        return userRepository.signup(request);

    }

    public String signIn(SignInRequest request) {
        return userRepository.signIn(request);

    }
}
