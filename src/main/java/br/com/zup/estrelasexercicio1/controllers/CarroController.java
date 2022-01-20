package br.com.zup.estrelasexercicio1.controllers;


import br.com.zup.estrelasexercicio1.dtos.CarroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/carros")
public class CarroController {
    private List<CarroDTO> concessionaria = new ArrayList<>();

    @GetMapping
    public List<CarroDTO> exibirTodosOsCarros() {
        return concessionaria;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO) {
        concessionaria.add(carroDTO);
    }

    @GetMapping("/{nomeDoCarro}")
    public CarroDTO exibirCarro(@PathVariable String nomeDoCarro) {
        for (CarroDTO referencia : concessionaria) {
            if (referencia.getModelo().equalsIgnoreCase(nomeDoCarro)) {
                return referencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{nomeDoCarro}")
    public CarroDTO atualizarCarro(@PathVariable String nomeDoCarro, @RequestBody CarroDTO carroDTO) {
        CarroDTO carroObjeto = null;
        for (CarroDTO referencia : concessionaria) {
            if (referencia.getModelo().equalsIgnoreCase(nomeDoCarro)) {
                carroObjeto = referencia;
            }
        }
        if (carroObjeto == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        carroObjeto.setAno(carroDTO.getAno());
        carroObjeto.setCor(carroDTO.getCor());
        carroObjeto.setMotor(carroDTO.getMotor());

        return carroObjeto;
    }
}

