package com.example.demo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String marca;
	String modelo;
	Integer ano;
	
}
