package ClasseObjeto;

public class Filme {
    // Atributos
    private String titulo;
    private int anoLancamento;
    private String diretor;

    // Construtor
    public Filme(String titulo, int anoLancamento, String diretor) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
    }

    // Métodos de acesso (getters e setters) para os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Métodos
    public void reproduzir() {
        System.out.println("Reproduzindo o filme: " + titulo);
    }

    public void pausar() {
        System.out.println("Pausando o filme: " + titulo);
    }

    public void exibirInformacoes() {
        System.out.println("Filme: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Diretor: " + diretor);
    }
}
