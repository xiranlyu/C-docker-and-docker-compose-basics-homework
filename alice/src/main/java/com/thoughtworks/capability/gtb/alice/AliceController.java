package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

  @GetMapping("/hello")
  public String hello() {
    RestTemplate restTemplate = new RestTemplate();
    String getUrl = "http://bob:8081/hello";
    return restTemplate.getForObject(getUrl, String.class);
  }
}
