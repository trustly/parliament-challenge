package com.parliamentchallenge.merger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.parliamentchallenge.merger.resource.MergedResource;

@Configuration
public class MergerConfig {

  @Bean
  public MergedResource mergeEndpoint() {
    return new MergedResource();
  }

}
