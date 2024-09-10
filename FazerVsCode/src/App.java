public class App {
    public static void main(String[] args) throws DadosNaoInseridos {
        RGM2920482411038 dadosAluno = new RGM2920482411038("Ryan Dias Rocha de Souza", "2920482411038", 18, "Ryan Dias",
                "0RyanSouza0",
                "ADS", 2);

        dadosAluno.exibirInfo(dadosAluno);
    }
}
