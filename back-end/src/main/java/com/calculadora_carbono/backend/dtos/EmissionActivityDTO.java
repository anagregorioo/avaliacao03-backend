package com.calculadora_carbono.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmissionActivityDTO {

    private Long emissionActivityId;
    private Double quantity;
    private CategoryDTO categoryDTO;
}
