package br.com.zup.estrelasexercicio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CarroController {

    @GetMapping("/carros/fusca")
    public HashMap<String, String> exibirFusca(){
        HashMap<String, String> fusca = new HashMap<>();
        fusca.put("Cor", "Azul");
        fusca.put("Ano", "1964");
        fusca.put("Motor", "1000");

        return fusca;
    }
}
