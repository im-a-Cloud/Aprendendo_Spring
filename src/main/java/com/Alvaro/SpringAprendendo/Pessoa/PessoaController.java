package com.Alvaro.SpringAprendendo.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Pessoa")

public class PessoaController {
    @GetMapping
    public List<Pessoa> getPessoas(){
        return List.of(
                new Pessoa(7,"Cloud Strife","nuvemzinhagameplay@gmail.com",25,
                        "Mercenário", LocalDate.of(1997, Month.JANUARY,31)));
    }
}
