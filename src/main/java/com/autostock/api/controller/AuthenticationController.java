package com.autostock.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autostock.api.config.TokenService;
import com.autostock.api.dtos.AuthenticationDto;
import com.autostock.api.dtos.LoginResponseDTO;
import com.autostock.api.dtos.RegisterDTO;
import com.autostock.api.model.User;
import com.autostock.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@RestController()
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationManager manager;
    private final UserRepository repository;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody AuthenticationDto data){
        var usernamePass = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = manager.authenticate(usernamePass);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterDTO data){
        if(repository.findByLogin(data.login())!=null){return ResponseEntity.badRequest().build();}
        String crip = new BCryptPasswordEncoder().encode(data.password());
        this.repository.save(User.builder().login(data.login()).password(crip).role(data.role()).build());
        return ResponseEntity.ok().build();
    }
}
