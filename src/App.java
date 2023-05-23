import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import entidades.Feedbacks;
import listas.ListaAsc;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
        ListaAsc fbList = new ListaAsc();
        Random r = new Random();
        

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar feedback");
            System.out.println("2 - Ler Feedbacks");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    Feedbacks newFeedback = new Feedbacks();
                   
                    System.out.print("Informe o ANO: ");
                    int y = input.nextInt();
                    System.out.println("Informe o mes (1-12): ");
                    int m = input.nextInt();  // 1-12 for January-December.
                    System.out.println("Informe o dia (1-31): ");
                    int d = input.nextInt();
                    LocalDate ld = LocalDate.of( y , m , d );
                    newFeedback.setDataEntrada(ld);
                    newFeedback.setId(r.nextInt(1, 101));
                    fbList.add(newFeedback);

                    break;

                case 2:
                    
                    fbList.show();

                    break;

                default:
                    break;
            }

        }

        input.close();
    }
}
