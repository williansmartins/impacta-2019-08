package com.williansmartins.imagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagens")
public class ImagensController {
	
	@GetMapping("/{id}")
    public String getPerson(@PathVariable Long id) {
        System.out.println(">>>" + id);
        return "<<<" + id;
    }
	
	@GetMapping("/")
    public String buscarTudo() {
		return "Buscar Tudo"
    }
	
	@GetMapping("/{id}")
    public String buscarUm(@PathVariable Long id) {
        return"Buscar imagens com id"
    }
	
	@DeleteMapping("/{id}")
    public String apagarUm@PathVariable Long id) {
    	return"Apagar uma Imagen com id"
      
    }
    
    @GetMapping("/{id}")
    public String salvarImagen(@PathVariable Long id) {
    	return"Salvar imagn com id"
       
    }
    @PostMapping("/{id}")
    public String inserir(Imagem Imagem) {
    	return "Imagem inserida"
    }
    
    @PutMapping("/{id}")
    public String atualizar(Imagem Imagem) {
    	return "atualizar imagem"
    }
}
}
    
}
}
}
}
}
