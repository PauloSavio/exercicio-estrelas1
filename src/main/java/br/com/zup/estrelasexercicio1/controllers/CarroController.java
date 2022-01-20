package br.com.zup.estrelasexercicio1.controllers;


import br.com.zup.estrelasexercicio1.dtos.CarroDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/carros")
public class CarroController {
    private List<CarroDTO> concessionaria = new ArrayList<>();

    @GetMapping
    public List<CarroDTO> exibirTodosOsCarros(){
        return concessionaria;
    }

    @PostMapping
    public void cadastrarCarro(@RequestBody CarroDTO carroDTO){
        concessionaria.add(carroDTO);
    }
}

