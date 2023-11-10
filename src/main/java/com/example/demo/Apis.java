package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
class User {
    String name;
    String phone;
}


@RestController
public class Apis {
    @GetMapping("/")
    Mono<String> hello() {
        return Mono.just("hi mun");
    }


    @GetMapping("/patrolmans")
    Mono<List<User>> patrol_mans() {
        ArrayList<User> _순찰자목록 = new ArrayList<>();
        _순찰자목록.add(new User("믄나래", "01011112222"));
        _순찰자목록.add(new User("김연진", "01011113333"));
        _순찰자목록.add(new User("강형채", "010111144442"));

        return Mono.just(_순찰자목록);
    }
}
