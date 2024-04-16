package com.softtek.Abril16.modelo.Ej3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SeguroCoche {
    @Autowired
    @Qualifier("tallerMecanica")
    private iTaller taller;
    @Value("Lokquiera")
    private String aseguradora;

    public String reparar(Cochee c) {
        return(taller.reparar(c) + aseguradora);
    }

}