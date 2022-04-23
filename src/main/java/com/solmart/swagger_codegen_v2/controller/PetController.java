package com.solmart.swagger_codegen_v2.controller;

import com.solmart.swagger_codegen_v2.api.PetApi;
import com.solmart.swagger_codegen_v2.models.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class PetController implements PetApi {

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }
}
