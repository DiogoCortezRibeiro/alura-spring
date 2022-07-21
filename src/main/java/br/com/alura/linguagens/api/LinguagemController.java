package br.com.alura.linguagens.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens;

    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagens() {
        return linguagens;
    }

}
