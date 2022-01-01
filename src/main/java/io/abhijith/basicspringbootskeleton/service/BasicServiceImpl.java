package io.abhijith.basicspringbootskeleton.service;

import io.abhijith.basicspringbootskeleton.model.BasicModel;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BasicServiceImpl implements BasicService{

    @Override
    public BasicModel getData() {

        BasicModel model = new BasicModel();
        model.setId(UUID.randomUUID().toString());
        model.setName("Prolog");
        return model;
    }
}
