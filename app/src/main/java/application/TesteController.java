package application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TesteController {
    private String[] frutas = {"Maçã", "Banana", "Morango"};

    @GetMapping("/teste")
    public String[] get() {
        return this.frutas;
    }

    @GetMapping("/teste/{id}")
    public String get(@PathVariable int id) {
        return this.frutas[id];
    }
}

