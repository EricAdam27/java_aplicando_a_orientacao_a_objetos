package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class Calcular {

    private int tempoTotal;

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
