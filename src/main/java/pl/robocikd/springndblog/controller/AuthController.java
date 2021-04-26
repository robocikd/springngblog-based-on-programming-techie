package pl.robocikd.springndblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.robocikd.springndblog.dto.LoginRequest;
import pl.robocikd.springndblog.dto.RegisterRequest;
import pl.robocikd.springndblog.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }


    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
}
