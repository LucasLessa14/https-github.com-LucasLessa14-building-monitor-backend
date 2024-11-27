package com.example.building_monitor_backend.domain.edificacao;

public record DadosListagemEdificacao(
        Long id,
        String nome,
        String endereco,
        String tipo,
        String status
) { }
