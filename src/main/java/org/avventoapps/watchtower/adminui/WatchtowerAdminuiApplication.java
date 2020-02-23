package org.avventoapps.watchtower.adminui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WatchtowerAdminuiApplication {

  public static void main(String[] args) {
    SpringApplication.run(WatchtowerAdminuiApplication.class, args);
  }

}
