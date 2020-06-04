package br.com.tt.petshop.api;

import br.com.tt.petshop.dto.UnidadeDto;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.service.ClienteService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> lista(){
        return clienteService.listarClientes();
    }

    @GetMapping(value = "/clientes/{clienteId}", produces = "application/json")
    public Cliente buscarPorId(@PathVariable("clienteId") Integer id){
        return clienteService.buscarPorId(id);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity atualizar(@PathVariable("id") Integer id, //respondeEntity serve para respostas HTTP
                                    @RequestBody Cliente clienteASerAtualizado){
        clienteService.atualizar(id, clienteASerAtualizado);

       return ResponseEntity.noContent().build(); //reponde um http dizendo OK e nao tem corpo.
    }

    //aqui nós vamos fazer o remover
    @DeleteMapping("/clientes/{id}")
    public ResponseEntity remover(@PathVariable ("id") Integer id){
        clienteService.remover(id);

        return ResponseEntity.noContent().build();

    }

}
