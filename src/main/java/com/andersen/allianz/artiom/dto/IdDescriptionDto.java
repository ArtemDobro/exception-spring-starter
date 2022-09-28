package com.andersen.allianz.artiom.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class IdDescriptionDto {
    UUID id;
    String description;
}
