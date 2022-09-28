package com.andersen.allianz.artiom.service;

import com.andersen.allianz.artiom.config.StarterProperties;
import com.andersen.allianz.artiom.dto.ErrorDto;
import com.andersen.allianz.artiom.dto.IdDescriptionDto;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Data
@Service
public class ServiceException {

    private StarterProperties props;

    @Autowired
    public ServiceException(StarterProperties props) {
        this.props = props;
    }

    public ErrorDto generateError(String message) {
        ErrorDto errorDto = new ErrorDto();
        IdDescriptionDto idDescriptionDto = new IdDescriptionDto();
        idDescriptionDto.setDescription(message);
        idDescriptionDto.setId(UUID.randomUUID());
        errorDto.setFailt(idDescriptionDto);
        return errorDto;
    }
}
