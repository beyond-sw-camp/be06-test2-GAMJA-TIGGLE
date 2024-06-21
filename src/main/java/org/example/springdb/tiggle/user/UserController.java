package org.example.springdb.tiggle.user;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.springdb.tiggle.user.model.request.SignInRequest;
import org.example.springdb.tiggle.user.model.request.SignupRequest;
import org.example.springdb.tiggle.user.model.response.SignInResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<Integer> signup(@RequestBody SignupRequest request) {
        int signup = userService.signup(request);
        return ResponseEntity.ok(signup);
    }

    @PostMapping("/signIn")
    public ResponseEntity<SignInResponse> signIn(@RequestBody SignInRequest form, HttpServletRequest request) {
        String user = userService.signIn(form);
        HttpSession session = request.getSession(true);
        session.setAttribute("sessionId", user);
        return ResponseEntity.ok(new SignInResponse(session.getId(), user));
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody HttpSession session) {
        session.invalidate();
        return ResponseEntity.ok("logout");
    }
}
