package com.example.deneb.configure;

import com.example.deneb.configure.interceptor.CommonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigure implements WebMvcConfigurer  {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new CommonInterceptor());
  }

}
