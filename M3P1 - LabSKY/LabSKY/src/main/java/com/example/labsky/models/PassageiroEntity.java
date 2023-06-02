package com.example.labsky.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passageiros")
public class PassageiroEntity {
    @Id
    private String cpf;
    private String nome;
    private LocalDate datanasc;
    private Enum classificacao;
    private Integer milhas;
}
