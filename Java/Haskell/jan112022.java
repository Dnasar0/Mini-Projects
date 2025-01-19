import java.util.stream.Stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class jan112022 {
    
    public static void main(String[] args) throws IOException {
        System.out.println("--Original--");
        System.out.println(fileToWordStream(null).collect(Collectors.toList()));
        System.out.println("--Filtrada--");
        System.out.println(longestWords(null, 10));
    }

    static List<String> longestWords(String filename, int n) throws IOException {
        Stream<String> stream = fileToWordStream(filename);
        return stream.map(String::toLowerCase)
                     .distinct()
                     .sorted((s1, s2) -> s2.length() - s1.length())
                     .limit(n)
                     .collect(Collectors.toList());
    }


    static Stream<String> fileToWordStream(String filename) throws IOException {
        String estrofe1 = "As armas e os barões assinalados,\n"
            + "Que da ocidental praia Lusitana,\n"
            + "Por mares nunca de antes navegados,\n"
            + "Passaram ainda além da Taprobana,\n"
            + "Em perigos e guerras esforçados,\n"
            + "Mais do que prometia a força humana,\n"
            + "E entre gente remota edificaram\n"
            + "Novo Reino, que tanto sublimaram;";
        return Arrays.asList(estrofe1.split("[\\s,;.\\-!?]+")).stream();
    }

}
