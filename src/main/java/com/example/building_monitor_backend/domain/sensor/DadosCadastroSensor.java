package com.example.building_monitor_backend.domain.sensor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroSensor(
        @NotBlank
        String nome,

        @NotBlank
        String tipoSensor,

        @NotBlank
        String unidade,

        @NotNull
        Long idEdificacao
) {}
