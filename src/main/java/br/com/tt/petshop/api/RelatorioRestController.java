package br.com.tt.petshop.api;

import br.com.tt.petshop.repository.AnimalRelatorioProjection;
import br.com.tt.petshop.repository.ClienteRelatorioProjection;
import br.com.tt.petshop.service.RelatorioServive;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Relatorios de Clientes e Animais")
public class RelatorioRestController {

    private final RelatorioServive relatorioServive;

    public RelatorioRestController(RelatorioServive relatorioServive) {
        this.relatorioServive = relatorioServive;
    }

    @GetMapping("/relatorio/cliente")
    @ApiOperation("Retorna a Lista de Clientes")
    public List<ClienteRelatorioProjection> listaClientes(){
        return relatorioServive.listarRelatorioClientes();
    }

    @GetMapping("/relatorio/animal")
    @ApiOperation("Retorna a Lista de Animais")
    public List<AnimalRelatorioProjection> listarAnimais(){
        return relatorioServive.listarAnimais();
    }

}
