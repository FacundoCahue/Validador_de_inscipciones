package Domain.main;

import java.util.List;
import java.util.stream.Collectors;

class Inscripcion {

    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;

    }
    public boolean aprobada(){
        List<Materia> materiasDelAlumno = alumno.getMateriasAprobadas();
        List<Materia> materiasNecesarias = materias
                                           .stream()
                                           .flatMap(materia -> materia.getCorrelativas().stream())
                                           .collect(Collectors.toList());

        return materiasDelAlumno.containsAll(materiasNecesarias);
    }
}