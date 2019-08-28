package com.williansmartins.imagens.Controller;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.williansmartins.imagens.dao.ImagensDAO;
=======
import com.williansmartins.imagens.dao.CustomersDAO;
import com.williansmartins.imagens.model.Book;
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
import com.williansmartins.imagens.model.Customer;
import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.BookRepository;

@RestController
@RequestMapping("/imagens")
public class ImagensController {
	
	@Autowired
    private BookRepository repository;
	
	@GetMapping
<<<<<<< HEAD
	public List<Customer>buscarTudo() {
		ImagensDAO dao = new ImagensDAO();
		return dao.buscarTodos();
	}
=======
    public List<Customer> buscarTudo() {
		CustomersDAO dao = new CustomersDAO();
        return dao.buscarCustomers();
    }
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	
	@GetMapping("/{id}")
    public Customer buscarUm(@PathVariable String id) {
        System.out.println("buscando imagem com id: " + id);
       CustomersDAO dao = new CustomersDAO();
       
       int idParafuncao = Integer.parseInt(id);
		return dao.buscarCustomer(idParafuncao);
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable String id) {
        return "removendo imagem com id: " + id;
    }
	
	@PostMapping
    public String inserir(@RequestBody Imagem imagem) {
		repository.save(new Book("Java"));
        return "inserindo imagem" + imagem;
    }
	
	@PutMapping("/{id}")
    public String atualizar(Imagem imagem) {
        return "atualizando imagem" + imagem;
    }
}
