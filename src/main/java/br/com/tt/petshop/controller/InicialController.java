package br.com.tt.petshop.controller;

import br.com.tt.petshop.repository.UnidadeRepository;
import br.com.tt.petshop.service.UnidadeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Track;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class InicialController {

    private UnidadeService unidadeService ;

    public InicialController(UnidadeService unidadeService){
        this.unidadeService = unidadeService;

    }

    @RequestMapping("/admin")
    public String getPaginaInicial(){
        return "pagina_inicial";
    }


    @RequestMapping("/admin/unidade/lista")
    public String getUnidadeLista(Model model){

        System.out.println("Iniciei o Controller! "+this);

        List<String> unidades = unidadeService.listarUnidades();
        model.addAttribute("unidades", unidades);
        return "unidade_lista";
    }
}
