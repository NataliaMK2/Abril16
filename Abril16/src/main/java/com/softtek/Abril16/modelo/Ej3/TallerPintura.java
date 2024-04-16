package com.softtek.Abril16.modelo.Ej3;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements iTaller {

        @Override
        public String reparar(Cochee c) {
            return("pintando el coche " + c.getMatricula());
        }


}
