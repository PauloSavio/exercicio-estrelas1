package br.com.zup.estrelasexercicio1.controllers;


import br.com.zup.estrelasexercicio1.dtos.CarroDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/carros")
public class CarroController {
    private List<CarroDTO> concessionaria = new ArrayList<>();
    }
}

