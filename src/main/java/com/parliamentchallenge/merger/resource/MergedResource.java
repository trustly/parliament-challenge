package com.parliamentchallenge.merger.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/speeches")
public class MergedResource {

  @GetMapping("/hello")
  public String hello() {
    return "world!";
  }

}
