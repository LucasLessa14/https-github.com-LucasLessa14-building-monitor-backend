package com.example.building_monitor_backend.domain.edificacao;

import com.example.building_monitor_backend.domain.sensor.Sensor;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "edificacoes")
@Entity(name = "edificacoes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Edificacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String tipo;
    private String status;

    @OneToMany(mappedBy = "edificacao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Sensor> sensores;

    public Edificacao(DadosCadastroEdificacao dados) {
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.status = dados.status();
        this.tipo = dados.tipo();
    }
}
