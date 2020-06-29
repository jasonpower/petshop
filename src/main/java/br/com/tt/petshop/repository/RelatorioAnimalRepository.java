package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelatorioAnimalRepository
                 extends JpaRepository<Animal, Long> {

    @Query( "select a.nome as nome, a.dataNascimento as dataNascimento, a.tipo as tipo," +
            "c.nome as nomeCliente, c.cpf as cpfCliente from Animal a join a.cliente c")
    List<AnimalRelatorioProjection> listarRelatorioAnimais();
}
