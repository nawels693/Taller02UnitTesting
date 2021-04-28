
import java.util.Scanner;
public class main {



        static Scanner sc= new Scanner(System.in);
        public static void main(String[] args) {
            menu();



        }






        public static void menu() {
            String opcion = "100";
            while (Integer.parseInt(opcion) != 0) {
                System.out.println("");
                System.out.println("Menu");
                System.out.println("");
                System.out.println("0) Terminar Porgrama");
                System.out.println("1) Ingresar una frase");
                System.out.print("ingrese opcion numerica: ");
                opcion = sc.next();
                while (validarNumerico(opcion) == false) {
                    System.out.print("ingrese CORRECTAMENTE opcion en Formato: ");
                    opcion = sc.next();
                }
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        ingresarFrase();
                        validarFrase(ingresarFrase());
                        break;


                }
            }

        }

        public static boolean validarNumerico(String dato) {
            try {
                int numero = Integer.parseInt(dato);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }

        public static boolean validarFrase(String s) {
            int fin = s.length()-1;
            int ini=0;
            boolean espalin=true;

            while(ini < fin){
                if(s.charAt(ini)!=s.charAt(fin)){
                    espalin=false;
                }
                ini++;
                fin--;
            }
            if(espalin)
                System.out.print("\nEs palindromo.");
            else
                System.out.print("\nNo es palindromo.");

            return espalin;
        }



        public static String ingresarFrase(){
            System.out.print("Introduce una frase: ");
            String s = sc.nextLine();
            s = s.replace(" ", "");
            s = s.replace(",", "");
            s = s.replace(".", "");
            System.out.print(s);


            return s;
        }
    }
}
