package com.example.building_monitor_backend.controller;

import com.example.building_monitor_backend.domain.edificacao.DadosCadastroEdificacao;
import com.example.building_monitor_backend.domain.edificacao.Edificacao;
import com.example.building_monitor_backend.domain.edificacao.EdificacaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edificacoes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EdificacoesController {

    @Autowired
    private EdificacaoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Edificacao> cadastrar(@RequestBody @Valid DadosCadastroEdificacao dados) {
        var edificacao = new Edificacao(dados);
        repository.save(edificacao);
        return ResponseEntity.ok(edificacao);
    }

    @GetMapping
    public ResponseEntity<List<Edificacao>> listar() {
        var edificacoes = repository.findAll();
        return ResponseEntity.ok(edificacoes);
    }
}
