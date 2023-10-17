package br.com.picpay.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
        contact = @Contact(
                name = "Patrick Nunes",
                email = "patrick.tavares@idor.org"
        ),
        description = "OpenApi documentation for picpay challenge",
        title = "OpenApi specification - PicPay Challenge",
        version = "1.0"
),
        servers = @Server(
                    description = "local ENV",
                    url = "http://localhost:8080"
            )
)
public class OpenApiConfig {
}
