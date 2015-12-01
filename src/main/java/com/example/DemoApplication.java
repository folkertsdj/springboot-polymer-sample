package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/random")
	public Map<String, String> token(HttpSession session) {
		return Collections.singletonMap("id", UUID.randomUUID().toString());
	}

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
