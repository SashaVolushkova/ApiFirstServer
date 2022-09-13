package com.volushkova.apifirst.apifirstserver.controller;

import com.volushkova.apifirst.generated.PetsApi;
import com.volushkova.apifirst.generated.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PetApiImpl implements PetsApi {
    @Override
    public ResponseEntity<Void> createPets() {
        // your future implementation
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        // your future implementation
        return null;
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {
        // your future implementation
        return null;
    }
}
