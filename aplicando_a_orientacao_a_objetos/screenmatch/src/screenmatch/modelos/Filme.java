package screenmatch.modelos;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lancamento: "+ anoDeLancamento);
        System.out.println("Duracao: "+ duracaoEmMinutos +"min");
        System.out.println("Incluido no plano: "+ incluidoNoPlano);
        System.out.println("Total de avaliacoes: "+ totalDeAvaliacoes);
        System.out.println("Media das avaliacoes: "+ mediaDasAvaliacoes());
    }

    public void avaliarFilme(double suaNota) {
        somaDasAvaliacoes += suaNota;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
