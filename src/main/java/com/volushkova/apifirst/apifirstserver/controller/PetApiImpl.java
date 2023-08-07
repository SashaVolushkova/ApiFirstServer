package com.volushkova.apifirst.apifirstserver.controller;

import com.volushkova.apifirst.generated.PetsApi;
import com.volushkova.apifirst.generated.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
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
        if(limit == null) {
            limit = 10;
        }
        List<Pet> pets = new ArrayList<>();
        // your future implementation
        for(long i = 0; i < limit; i++) {
            Pet pet = new Pet();
            pet.setTag("teg_" + i);
            pet.setName("name_" + i);
            pet.id(i);
            pets.add(pet);
        }
        return ResponseEntity.ok(pets);
    }
}
