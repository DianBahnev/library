package com.learning.libraryManagerSpringBoot.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

//    @PostMapping("/newUserDummy")
//    public ResponseEntity<User> addNewUserDummy(){
//        User u1 = new User("pe6o", "pe6o@kur.com");
//        return ResponseEntity.ok(userRepository.save(u1));
//    }
    @PostMapping("/newUser")
    public ResponseEntity<User> addNewUser( @RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));

    }

    @PostMapping("/newUser")
    public ResponseEntity<Iterable<User>> addNewUsers(@RequestBody List<User> users){
        return ResponseEntity.ok(userRepository.saveAll(users));
    }
}
