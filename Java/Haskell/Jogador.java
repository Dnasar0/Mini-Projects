public class Jogador {
    
    private String nome; 
    private Double altura;
    private int pontos;
    private int assistencias;


    public Jogador(String nome, Double altura, int pontos, int assistencias) {

        this.nome = nome;
        this.altura = altura;
        this.pontos = pontos;
        this.assistencias = assistencias;
    }

    public String getNome() {

        return nome; 
    }

    public double getAlturaEmMetros() {

        return altura;
    }

    public int getPontos() {

        return pontos;
    }

    public int getAssistencias() {

        return assistencias;
    }
}
