package com.tolux.resumeapplicationwar;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@OpenAPIDefinition(info=@Info(
        title = "Resume Info API",
        version="1.0.0",
        description = "Resume App API"
),
        servers = @Server(
                url="https://Demo.473tech.com",
                description = "Tourist Info API URL"
        ))

public class ResumeApplicationWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplicationWarApplication.class, args);
    }

}
