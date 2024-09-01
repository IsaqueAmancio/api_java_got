package dev.isaqueaa.GOT.controller;


import dev.isaqueaa.GOT.model.Cavaleiro;
import dev.isaqueaa.GOT.service.CavaleiroService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cavaleiro")
public class CavaleiroController {
    @Autowired
    private CavaleiroService service;

    @PostMapping("/add")
    public ResponseEntity<Cavaleiro>addCavaleiro(@RequestBody Cavaleiro cavaleiro){
        Cavaleiro newCavaleiro = service.addCAvaleiro(cavaleiro);
        return new ResponseEntity<>(newCavaleiro,HttpStatus.CREATED);

    }
}
