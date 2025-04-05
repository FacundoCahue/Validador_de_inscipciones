package Domain.main;

import java.util.List;

class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo, List<Materia> materiasAprobadas) {
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public Alumno() {
        this.legajo = legajo;
    }

    List<Materia> getMateriasAprobadas(){
        return this.materiasAprobadas;
    }
}