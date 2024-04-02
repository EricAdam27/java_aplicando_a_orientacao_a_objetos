public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.nome = "O poderoso chefao";
        filme1.anoDeLancamento = 1970;
        filme1.duracaoEmMinutos = 180;

        filme1.avaliarFilme(8);
        filme1.avaliarFilme(5);
        filme1.avaliarFilme(10);

        filme1.exibirFichaTecnica();
    }
}
