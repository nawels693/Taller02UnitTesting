import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;
public class main {
    static String ruta = "C:\Users\mussk\IdeaProjects\Taller02UnitTesting";
    public static void main(String[] args) {

        String[] a = ingresarPalabra();

        validarArchivo(b);


        }


    public String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return contenido;
    }



    public static boolean validarArchivo(String s[]) {
        int c = 0;
        for (int i=0; i<s.length; i++){
            int fin = s[i].length()-1;
            int ini=0;
            boolean b=true;
            while(ini < fin){
                if(s[i].charAt(ini)!=s[i].charAt(fin)){
                    b=false;
                }
                ini++;
                fin--;
            }
            if(b){
                System.out.print("\nEs palindromo.");
                b=true;
                c++;
            }
            else{
                System.out.print("\nNo es palindromo.");
                b = false;
            }

        }
        if (c==s.length){
            return true;
        }
        else{return false;}
    }

    private static String[] ingresarPalabra() {
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        String[] palabra = contenido.split("\n");
        return palabra;
    }

    public static String[] ModificarArchivo(String[] a) {
         String b= "";
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].replace(" ", "").toLowerCase();
            for(int j=0; j< b.length(); j++){



            }
        }
        return a;
    }
}
