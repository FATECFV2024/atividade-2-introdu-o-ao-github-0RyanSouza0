public class RGM2920482411038 {
    private String nome;
    private String rgm;
    private int idade;
    private String linkedin;
    private String github;
    private String curso;
    private int turma;

    public RGM2920482411038(String nome, String rgm, int idade, String linkedin, String github, String curso,
            int turma) {
        this.nome = nome;
        this.rgm = rgm;
        this.idade = idade;
        this.linkedin = linkedin;
        this.github = github;
        this.curso = curso;
        this.turma = turma;
    }

    // FAZENDO APENAS METODOS GETTERS, POIS VOU INSERIR OS DADOS NO CONSTRUTOR
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getLinkedin() {
        return this.linkedin;
    }

    public String getRgm() {
        return this.rgm;
    }

    public String getGithub() {
        return this.github;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getTurma() {
        return this.turma;
    }

    // CRIANDO METODO PARA EXIBIR INFORMACOES
    public void exibirInfo(RGM2920482411038 dados) throws DadosNaoInseridos {
        // FAZENDO UMA VERIFICACAO DE INFORMAÇOES USANDO EXCEÇAO PERSONALIZADA.
        if (getCurso() == null || getGithub() == null || getIdade() <= 0 || getLinkedin() == null || getNome() == null
                || getRgm() == null || getTurma() != 2) {
            throw new DadosNaoInseridos();
        } else {
            System.out.println(" ");
            System.out.println("Nome Completo: " + dados.getNome());
            System.out.println("RGM: " + dados.getRgm());
            System.out.println("Idade: " + dados.getIdade());
            System.out.println("Github: " + dados.getGithub());
            System.out.println("Linkedin: " + dados.getLinkedin());
            System.out.println("Turma: " + dados.getTurma() + "º" + getCurso());
        }
    }

}
