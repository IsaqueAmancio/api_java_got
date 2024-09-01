package dev.isaqueaa.GOT.service;

import dev.isaqueaa.GOT.model.Cavaleiro;
import dev.isaqueaa.GOT.repository.CavaleiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CavaleiroService {

    @Autowired
    private CavaleiroRepository repo;
    //criar cavaleiro
    public Cavaleiro addCAvaleiro(Cavaleiro cavaleiro){
        return repo.save(cavaleiro);
    }
    //mostrar cavaleiros
    public List<Cavaleiro> verCavaleiro(){
        return repo.findAll();
    }




}
