package com.moto.service.service;

import com.moto.service.entities.Moto;
import com.moto.service.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {
    @Autowired
    private MotoRepository motoRepository;
    public List<Moto> getAll(){
        return motoRepository.findAll();
    }
    public Moto getCarro(int id){
        return motoRepository.findById(id).orElse(null);
    }
    public Moto save(Moto carro){
        Moto newMoto = motoRepository.save(carro);
        return newMoto;
    }
    public List<Moto> byUsuarioId(int usuarioId){
        return motoRepository.findByUsuarioId(usuarioId);
    }
}
