import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class jan292020 {
    

    public static void main(String[] args) {
        
        LinkedList<Jogador> lista = new LinkedList<Jogador>();
        lista.add(new Jogador("Jõao", 2.13, 20000, 101));
        lista.add(new Jogador("Luís", 1.80, 24000, 90));
        lista.add(new Jogador("Pedro", 2.08, 40000, 300));
        lista.add(new Jogador("Tomás", 2.09, 16000, 600));
        lista.add(new Jogador("Mário", 2.16, 5000, 25));
        
        Stream<Jogador> jogadores = lista.stream();

        int totalPontos = jogadores.filter( jogador -> jogador.getAlturaEmMetros() > 2).filter(jogador -> jogador.getAssistencias() >= 100).map(jogador -> jogador.getPontos()).reduce(0,(x,y) -> x + y);
        System.out.println(totalPontos);
    }
}
