/* Ingrese un numero e indique a que dia de la semana
 * corresponde
 * Entrada: int numero
 * Salida: Dia 
 * LisReyes
 */

 import java.util.Scanner;

 class Ejemplo3{
    int op;
    public Ejemplo3(int c){
        op = c;
    }

    public void NumDia(){
        switch (op){
            case 1:
                System.out.println (" Lunes ");
            break;
            case 2:
                System.out.println (" Martes ");
            break;
            case 3:
                System.out.println (" Miercoles ");
            break;
            case 4: 
                System.out.println (" Jueves ");
            break;
            case 5:
                System.out.println (" Viernes ");
            break;
            case 6:
                System.out.println (" Sabado ");
            break;
            case 7:
                System.out.println (" Domingo ");
            break;
            default:
                System.out.println (" Error, numero no valido");
        }
    }
 }

 class Principal3{
    public static void main (String[]args){
        int opc;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println (" Ingrese el numero ");
            opc = leer.nextInt();
            Ejemplo3 ob = new Ejemplo3(opc);
            ob.NumDia();
        }
    }
}
