package com.example.building_monitor_backend.domain.edificacao;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroEdificacao (
        @NotBlank
        String nome,

        @NotBlank
        String endereco,

        @NotBlank
        String tipo,

        @NotBlank
        String status
) { }
