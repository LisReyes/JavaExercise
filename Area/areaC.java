/* Programa que realice el área de un circulo
 * Entrada: radio
 * Salida: Area
 * LisReyes
 */
import java.util.Scanner;
 class Ejemplo4 {
    int r;
    int area;
    public Ejemplo4 (int y){ r = y;}

    public void AreaC(){
        if (r > 0){
            area = (int) (Math.PI * r * r);
            System.out.println (" El area del circulo es: "+ area);
        }else{
            System.out.println (" Error. Valor ingresado no valido");
        }
    }
 }

 class Principal4{
    public static void main(String[]args){
        int radio;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println (" Ingrese el valor del radio ");
            radio = leer.nextInt();
        }
        Ejemplo4 ob = new Ejemplo4(radio);
        ob.AreaC();
    }
 }