package com.example.deneb.configure.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ApiController {

  private final static Logger log = LoggerFactory.getLogger(ApiController.class);

  @GetMapping(path = "get")
  public ResponseEntity<?> get() {
    log.info("get area");
    return ResponseEntity.ok("get ok");
  }

  @PostMapping(path = "post")
  public ResponseEntity<?> post() {
    log.info("post area");
    return ResponseEntity.ok("post ok");
  }

}
