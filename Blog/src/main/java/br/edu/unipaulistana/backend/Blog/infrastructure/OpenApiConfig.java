package br.edu.unipaulistana.backend.Blog.infrastructure;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Blog")
                                .version("1.0")
                                .description("Description of what the service will do"));
    }
}
