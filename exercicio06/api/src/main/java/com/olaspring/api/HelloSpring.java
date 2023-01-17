package com.olaspring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloSpring {

  @GetMapping
  public String getHelloSpring() {
    return "Hello, Spring!";
  }
}
