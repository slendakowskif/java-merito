import javax.swing.text.html.StyleSheet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        int number = 7;
//        int condition_number = 5;
//
//        if(number > condition_number){
//            System.out.println("Liczba " + number + " jest większa od " + condition_number);
//        } else if (number == condition_number) {
//            System.out.println("Liczba " + number + " jest taka sama jak " + condition_number);
//        }else{
//            System.out.println("Liczba " + number + " jest mniejsza od " + condition_number);
//        }
//
////        int is_odd;
////        Scanner input = new Scanner(System.in);
////
////        System.out.print("Podaj liczbe: ");
////        is_odd = input.nextInt();
////
////        if (is_odd %2 == 0){
////            System.out.println("Liczba jest parzysta");
////        }else{
////            System.out.print("Liczba nie jest parzysta");
////        }
////
////        input.close();
//
//        Random rand = new Random();
//        Scanner scanner = new Scanner(System.in);
//        while( true) {
//            int randint = rand.nextInt(10);
//            String check = String.valueOf(randint) ;
//
//            System.out.println("Enter a number or exit to break:");
//
//            if (!scanner.hasNext()){
//                System.out.println(("No input found, exiting ... "));
//            }
//            String userInteraction = scanner.next();
//            if (userInteraction.equals("exit")) {
//                System.out.println("Goodbye");
//                break;
//            }
//
//            if(userInteraction.equals(check)) {
//                System.out.println("You won!");
//            }else{
//                System.out.println("You lost");
//            }
//
//        }


//        int max;
//        boolean done = false;
//        while (!done) {
//
//
//            try {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Podaj liczbe: ");
//
//                max = scanner.nextInt();
//                for (int i = 1; i <= max; i++) {
//                    for (int j = 1; j <= max; j++) {
//                        if (j < max) {
//                            System.out.print(j + ", ");
//                        } else {
//                            System.out.print(j);
//                        }
//                    }
//                    System.out.println();
//                }
//                done = true;
//            } catch (InputMismatchException e) {
//                //            throw new RuntimeException(e);
//                System.out.println("Prosze podać liczbe całkowitą");
//            }
//        }
//        double celsjusz;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę celsjuszy: ");
//        celsjusz = scanner.nextInt();
//        scanner.close();
//        double farenhajt = (celsjusz * 1.78) + 32;
//        System.out.println("Celsujesze na fahrenheity: " + farenhajt);


        int najwieksza = 0;
        int najmniejsza = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbę: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();
        if(liczba1 > liczba2){
            najwieksza = liczba1;
            najmniejsza = liczba2;
        } else if (liczba2 > liczba3) {
            najwieksza = liczba2;
            najmniejsza = liczba3;
        } else if (liczba1 > liczba3) {
            najwieksza = liczba1;
            najmniejsza = liczba3;
        }

        System.out.print("Najmniejsza liczba to: " + najmniejsza + ", a największa  " + najwieksza);


    }

}
