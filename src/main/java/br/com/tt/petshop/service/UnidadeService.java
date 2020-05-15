package br.com.tt.petshop.service;

import br.com.tt.petshop.repository.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;


@Service
public class UnidadeService {

    private UnidadeRepository unidadeRepository;

    public UnidadeService(UnidadeRepository unidadeRepository){
        this.unidadeRepository = unidadeRepository;
    }

    public List<String> listarUnidades(){
        return unidadeRepository.listarUnidades();
    }
}


