package com.williansmartins.imagens.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.imagens.Model.Imagem;

@RestController
@RequestMapping("/imagens")
public class ImagensController {

	@GetMapping
	public String buscarTudo()
	{
		return "buscando tudo";
	}
	
	@GetMapping("/{id}")
	public String buscarUm(@PathVariable String id)
	{
		return "buscando imagem com Id: " + id;
	}

	@DeleteMapping("/{id}")
	public String removerUm(@PathVariable String id)
	{
		return "Removendo imagens com Id: " + id;
	}
	
	@PostMapping
	public String Inserir(Imagem Imagem)
	{
		return "Inserindo imagem" +Imagem;
	}
	
	@PutMapping("/{id}")
	public String Atualizar(Imagem Imagem )
	{
		return "Atualizando imagem" + Imagem;
	}
	
	
	
}
