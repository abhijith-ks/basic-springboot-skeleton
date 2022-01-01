package io.abhijith.basicspringbootskeleton.controller;

import io.abhijith.basicspringbootskeleton.model.BasicModel;
import io.abhijith.basicspringbootskeleton.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BasicController {

    @Autowired
    BasicService service;

    @GetMapping("/basic")
    public ResponseEntity<BasicModel> getMapping() {
        BasicModel basicModel = service.getData();
        return ResponseEntity.ok(basicModel);
    }

}
