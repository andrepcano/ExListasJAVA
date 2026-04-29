import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEx02lst {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ana");
        list.add("André");
        list.add("Antônio");
        list.add("Mell");//agr esse é o 3
        list.add(2, "Nilza"); //add na posição 2 sem prejudicar o resto

        System.out.println(list.size());

        System.out.println("----------------------------------");

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); // se começar com M vai ser retirado (->) "tal que"

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");
        System.out.println("Index Off Ana: " + list.indexOf("Ana")); // posição na qual está
        System.out.println("index Off Marco: " + list.indexOf("Marco")); // como não tem retorna "-1"

        System.out.println("----------------------------------");
        //converte para String faz a operação lambda e dps retorna para a Lista;
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");
        //findFirst vai pegar o primeiro elemento que tiver o "A" começando e se n tiver retornará null;
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        //exemplo retornando null;
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}

