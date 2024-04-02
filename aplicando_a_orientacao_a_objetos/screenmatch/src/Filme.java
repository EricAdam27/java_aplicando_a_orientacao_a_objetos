public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lancamento: "+ anoDeLancamento);
        System.out.println("Duracao: "+ duracaoEmMinutos +"min");
        System.out.println("Incluido no plano: "+ incluidoNoPlano);
        System.out.println("Total de avaliacoes: "+ totalDeAvaliacoes);
        System.out.println("Media das avaliacoes: "+ mediaDasAvaliacoes());
    }

    void avaliarFilme(double suaNota){
        somaDasAvaliacoes += suaNota;
        totalDeAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
