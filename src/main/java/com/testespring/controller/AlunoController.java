package com.testespring.controller;

import com.testespring.domain.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {
    @GetMapping(path= "list")
    public List<Aluno> list() {
        return List.of(new Aluno("David", "blabla@mail.com"), new Aluno("Joao", "haha@mail.com"));
    }
}
