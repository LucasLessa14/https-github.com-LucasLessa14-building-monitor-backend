package com.example.building_monitor_backend.domain.sensor;

import com.example.building_monitor_backend.domain.edificacao.Edificacao;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "sensores")
@Entity(name = "sensores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_edificacao", nullable = false)
    @JsonBackReference
    private Edificacao edificacao;

    private String nome;
    private String unidade;
    private String tipoSensor;
    private String valorAtual;

    public Sensor(DadosCadastroSensor dados, Edificacao edificacao) {
        this.nome = dados.nome();
        this.tipoSensor = dados.tipoSensor();
        this.valorAtual = "0";
        this.unidade = dados.unidade();
        this.edificacao = edificacao;
    }

}
