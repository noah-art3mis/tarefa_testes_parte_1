import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Luciana - F, Mario - M, Jonas - M, Raquel - F

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Pessoa> lista1 = new ArrayList<>();

    System.out.print("Enter something: ");

    String line = scanner.nextLine();

    String[] items = line.split(",");

    for (String item : items) {
      String[] params = item.split("-");
      String nome = params[0].trim();
      String sexo = params[1].trim();
      Pessoa pessoa = new Pessoa(nome, sexo);
      lista1.add(pessoa);
    }

    List<Pessoa> lista2 = listarMulheres(lista1);

    System.out.println(lista2);
    scanner.close();
  }

  public static List<Pessoa> listarMulheres(ArrayList<Pessoa> lista1) {
    List<Pessoa> lista2 = lista1
      .stream()
      .filter(item -> item.getSex().equalsIgnoreCase("F"))
      .collect(Collectors.toList());
    return lista2;
  }
}
