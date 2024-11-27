package com.example.building_monitor_backend.controller;

import com.example.building_monitor_backend.domain.edificacao.EdificacaoRepository;
import com.example.building_monitor_backend.domain.sensor.DadosCadastroSensor;
import com.example.building_monitor_backend.domain.sensor.Sensor;
import com.example.building_monitor_backend.domain.sensor.SensorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SensorController {

    @Autowired
    private SensorRepository sensorRepository;

    @Autowired
    private EdificacaoRepository edificacaoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Sensor> cadastrar(@RequestBody @Valid DadosCadastroSensor dados) {
        var edificacao = edificacaoRepository.findById(dados.idEdificacao())
                .orElseThrow(() -> new RuntimeException("Edificação não encontrada!"));
        var sensor = new Sensor(dados, edificacao);
        sensorRepository.save(sensor);
        return ResponseEntity.ok(sensor);
    }

    @GetMapping
    public ResponseEntity<List<Sensor>> listar() {
        var sensores = sensorRepository.findAll();
        return ResponseEntity.ok(sensores);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Sensor> atualizarValorAtual(@PathVariable Long id, @RequestBody String valorAtual) {
        var sensor = sensorRepository.findById(id).orElseThrow(() -> new RuntimeException("Sensor não encontrado!"));
        sensor.setValorAtual(valorAtual);
        return ResponseEntity.ok(sensor);
    }
}
