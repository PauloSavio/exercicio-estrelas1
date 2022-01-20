package br.com.zup.estrelasexercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @GetMapping("/fusca")
    public HashMap<String, String> exibirFusca(){
        HashMap<String, String> fusca = new HashMap<>();
        fusca.put("Cor", "Azul");
        fusca.put("Ano", "1964");
        fusca.put("Motor", "1000");

        return fusca;
    }

    @GetMapping("/kombi")
    public HashMap<String, String> exibirKombi() {
        HashMap<String, String> kombi = new HashMap<>();
        kombi.put("Cor", "Branca");
        kombi.put("Ano", "1974");
        kombi.put("Motor", "1600");

        return kombi;
    }
}

