package br.com.tt.petshop.repository;

import br.com.tt.petshop.enumeration.TipoAnimal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AnimalRelatorioProjection {

        String getNome();
        LocalDate getDataNascimento();
        TipoAnimal getTipo();
        String getNomeCliente();
        String getCpfCliente();
}