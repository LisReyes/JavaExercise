/* Programa que lee un caracter y diga "seccion 1" cuando
 * este dentro de ['A'-'M'] y "seccion 2" cuando este ['M'-'Z']
 * Cuando el caracter no sea letra, se le otorga una 'F'
 * Entrada: Caracter
 * Salida: "Seccion 1" "Seccion 2"
 * LisReyes
 */
import java.util.Scanner;
 class Ejemplo2{
    char letra;
    public Ejemplo2(char y){
        letra = y;
    }

    public void Validar(){
        if ((letra < 'A') || (letra > 'Z')){
            System.out.println ("F");
        }
        if ((letra >= 'A') && (letra <= 'M')){
            System.out.println ("Sección 1");
        }else{
            System.out.println (" Sección 2");
        }
    }
 }

 class Principal2 {
    public static void main(String[]args){
        try(Scanner leer = new Scanner(System.in)){
            char letra;
            System.out.println (" Ingrese el caracter a validar ");
            letra = leer.next().charAt(0);
            Ejemplo2 ob1 = new Ejemplo2(letra);
            ob1.Validar();
        }
    }
 }


