package com.example.Loan.swaggerConfig;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Loan API",
                version = "1.0",
                description = "This API provides endpoints for managing Loan. It includes operations for creating, retrieving, and updating account details.",
                contact = @Contact(
                        name = "Support Team",
                        email = "support@example.com",
                        url = "https://example.com/support"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        servers = {
                @Server(url = "http://localhost:7777", description = "Local server"),
                @Server(url = "https://api.example.com", description = "Production server")
        }
)
public class SwaggerConfig {

}


