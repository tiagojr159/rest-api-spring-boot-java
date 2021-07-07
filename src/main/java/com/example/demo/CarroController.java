package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class CarroController {

	CarroRepository repositorio;
	
	@GetMapping("/carro")
	public List<Carro> getAllCarros(){
		return repositorio.findAll();
	}
	
	@PostMapping("/carro")
	public Carro saveCarro(@RequestBody Carro carro) {
		return repositorio.save(carro);
	}
	
	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repositorio.findById(id).get();
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repositorio.deleteById(id);
	}
	
	
	

}
