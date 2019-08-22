package com.matheuswendel.imagens;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ImagensApplication {

    @RequestMapping("/")
    String home() {
        return "<a>http://localhost:8080/imagens/123<br></a>"
        		+ "<a>http://localhost:8080/imagens/criar<br></a>"
        		+ "<a>http://localhost:8080/imagens/excluir<br></a>";
    }

    public static void main(String[] args) {
        SpringApplication.run(ImagensApplication.class, args);
    }

}