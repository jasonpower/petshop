package br.com.tt.petshop.service;

import br.com.tt.petshop.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RelatorioServive {

    private RelatorioClienteRepository relatorioClienteRepository;
    private RelatorioAnimalRepository relatorioAnimalRepository;

    public RelatorioServive(RelatorioClienteRepository relatorioClienteRepository, RelatorioAnimalRepository relatorioAnimalRepository) {
        this.relatorioClienteRepository = relatorioClienteRepository;
        this.relatorioAnimalRepository = relatorioAnimalRepository;
    }

    public List<ClienteRelatorioProjection> listarRelatorioClientes() {
        return relatorioClienteRepository.listarClientes();
    }

//    public List<ClienteSimplicadoProjection> listaSimplificada(){
//        return relatorioClienteRepository.listaSimplificada();
//    }

    public List<AnimalRelatorioProjection> listarAnimais(){
        return relatorioAnimalRepository.listarRelatorioAnimais();
    }

}

