package Domain.main;

import java.util.List;

class Materia {
    private List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    List<Materia> getCorrelativas() {
        return this.correlativas;
    }
}