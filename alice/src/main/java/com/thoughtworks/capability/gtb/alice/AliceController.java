package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliceController {

  @GetMapping("/hello")
  public String hello() {
    return "";
  }
}
