package br.com.tt.petshop.servicecommock;

import br.com.tt.petshop.controller.UnidadeController;
import br.com.tt.petshop.dto.UnidadeDto;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.repository.UnidadeRepository;

import java.util.Arrays;
import java.util.List;

public class MockUnidadeRepository extends UnidadeRepository {

    public MockUnidadeRepository (){super(null);}

    @Override
    public List<UnidadeDto> listarUnidades() {
        UnidadeDto dieison = new UnidadeDto(1, "dieison", "Rua 5");
        return Arrays.asList(dieison);
    }

    int chamouSalvar = 0;
    @Override
    public void criarUnidade(UnidadeDto unidadeDto) {
        chamouSalvar++;
    }

    public int getChamouSalvar() {
        return chamouSalvar;
    }
}
