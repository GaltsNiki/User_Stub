package com.hw.user_stub.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/v4/user")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getUser(){

        User newUser = new User("Nikita", "V4");
        return new ResponseEntity<>(newUser, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<?> postUser (@RequestBody User user){
        LocalDate localDate = LocalDate.now();
        user.setLocalDate(localDate);
        return ResponseEntity.ok(user);
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleBadRequestException(HttpMessageNotReadableException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid request data");
    }


}
