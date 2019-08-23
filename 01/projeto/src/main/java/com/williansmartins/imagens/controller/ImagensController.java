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
}
