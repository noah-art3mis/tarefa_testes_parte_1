import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class AppTest {

  @Test
  public void listarMulheresTest() {
    //A
    ArrayList<Pessoa> list = new ArrayList<>();
    list.add(new Pessoa("Freya", "F"));
    list.add(new Pessoa("Freya", "F"));
    list.add(new Pessoa("Shiffman", "M"));
    list.add(new Pessoa("Shiffman", "M"));

    //A
    List<Pessoa> result = App.listarMulheres(list);

    //A
    for (Pessoa p : result) {
      assertEquals("F", p.getSex());
    }
  }
}
