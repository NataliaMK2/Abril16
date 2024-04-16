package com.softtek.Abril16.modelo.Ej3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TallerMecanica implements iTaller {
    @Override
    public String reparar(Cochee c) {
        return "reparar coche " + c.getMatricula();
    }
}

