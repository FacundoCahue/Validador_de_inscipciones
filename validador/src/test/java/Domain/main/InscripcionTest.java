package Domain.main;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest{
    @Test
    public void InscripcionTestAm2() {
        Materia AM1 = new Materia(Collections.emptyList());
        Materia AGA = new Materia(Collections.emptyList());
        Materia AM2 = new Materia(Arrays.asList(AM1, AGA));

        Alumno facu = new Alumno(2135528, Arrays.asList(AM1, AGA));
        Inscripcion inscripcionDeFacu = new Inscripcion(facu, Arrays.asList(AM2));


        Assertions.assertTrue(inscripcionDeFacu.aprobada());
    }

    @Test
    public void InscripcionAMasMaterias() {
        Materia IT1 = new Materia(Collections.emptyList());
        Materia SPN = new Materia(Collections.emptyList());
        Materia AyED = new Materia(Collections.emptyList());
        Materia LED = new Materia(Collections.emptyList());
        Materia PdEP = new Materia(Arrays.asList(LED, AyED));
        Materia ADS = new Materia(Arrays.asList(SPN, LED));
        Materia DSI = new Materia(Arrays.asList(ADS, IT1, PdEP));
        Materia IT2 = new Materia(Arrays.asList(IT1, AyED));

        Alumno nico = new Alumno(2135528, Arrays.asList(ADS,IT1, PdEP, SPN, AyED, LED));
        Inscripcion inscripcion = new Inscripcion(nico, Arrays.asList(DSI, IT2));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void InscripcionFallada() {
        Materia AM1 = new Materia(Collections.emptyList());
        Materia AGA = new Materia(Collections.emptyList());
        Materia AM2 = new Materia(Arrays.asList(AM1, AGA));

        Alumno leo = new Alumno(2135528, Arrays.asList(AGA));
        Inscripcion inscripcionDeleo = new Inscripcion(leo, Arrays.asList(AM2));

        Assertions.assertFalse(inscripcionDeleo.aprobada());
    }

}