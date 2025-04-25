package cl.perfulandia.resenias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class reseniasController {

    @GetMapping("/resenias")
    public HashMap resenias() {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"El perfume me recuerda mi infancia");

        return hashMap;
    }

}
