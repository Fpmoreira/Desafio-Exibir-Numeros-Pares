import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibirNumerosPares {
  
  public static void main(String[] args) throws IOException {
    
    String valorDeEntrada;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    valorDeEntrada = br.readLine();
    
    for (int i = 2; i <= Integer.parseInt(valorDeEntrada); i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}