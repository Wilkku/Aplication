package travis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
 
@SpringBootApplication
//@Import (SwaggerConfig.class) //for Swagger documentation - Swagger home http://localhost:8080/swagger-ui.html
public class Aplication {
 
    public static void main(String[] args) {
        SpringApplication.run(Aplication.class);
    }
}
