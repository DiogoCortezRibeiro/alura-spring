package br.com.alura.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {
    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagens() {
        return linguagemRepository.findAll();
    }

    @PostMapping(value = "/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        return linguagemRepository.save(linguagem);
    }

}
