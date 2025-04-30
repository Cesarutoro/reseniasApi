package cl.perfulandia.resenias.controller;

import cl.perfulandia.resenias.Model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

public class reseniasController {

    @GetMapping("/resenias")
    public HashMap resenias() {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"El perfume me recuerda mi infancia");

        return hashMap;
    }

    @PostMapping("/crearResenias")
    public HashMap<Integer,String> crearResenia(@RequestBody Usuario usuario) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(usuario.getId(), usuario.getResenia());

        return hashMap;
    }
}
