import screenmatch.calculos.Calcular;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.setNome("O poderoso chefao");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(true);

        filme1.avaliarFilme(8);
        filme1.avaliarFilme(5);
        filme1.avaliarFilme(10);

        filme1.exibirFichaTecnica();

        Serie serie1 = new Serie();

        serie1.setNome("Lost");
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodios(50);
        serie1.setAnoDeLancamento(2000);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(false);

        serie1.avaliarFilme(8);
        serie1.avaliarFilme(5);
        serie1.avaliarFilme(10);

        serie1.exibirFichaTecnica();

        Calcular calculadoraDeTempo = new Calcular();

        calculadoraDeTempo.inclui(filme1);
        calculadoraDeTempo.inclui(serie1);

        System.out.println("Tempo total: "+ calculadoraDeTempo.getTempoTotal());
    }
}
