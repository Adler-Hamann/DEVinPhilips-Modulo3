package com.example.exercicios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")
public class VeiculoEntity {
    @Id
    private String placa;
    private String tipo;
    private String cor;
    private Integer anoDeFabricacao;
    private Integer qtdMultas;
}
