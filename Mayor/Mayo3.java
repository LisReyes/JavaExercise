import java.util.Scanner;

/* Programa que determina el mayor de 3 numeros y en caso de que sean igual
 * Entrada: n1,n2,n3
 * Salida: mayor, igual
 */

 class Ejemplo5{
    int a,b,c;
    public Ejemplo5(int n1,int n2, int n3){
        a = n1;
        b = n2;
        c = n3;
    }

    public void NumMayor(){
        if ((a>b) && (a>c)){
            System.out.println (" El mayor es a = "+ a);
        }else{
            if((b>a) && (b>c)){
                System.out.println (" El número mayor es b =  "+b);
            }else{
                if((c>a)&&(c>b)){
                    System.out.println (" El numero mayor es c =  "+c);
                }else{
                    System.out.println ("Los numeros son iguales");
                }
            }
        }
    }
 }
 class Principal4 {
    public static void main(String[]args){
        int n1,n2,n3;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println (" Ingrese los numeros ");
            n1 = leer.nextInt();
            n2 = leer.nextInt();
            n3 = leer.nextInt();
        }
        Ejemplo5 obj = new Ejemplo5(n1,n2,n3);
        obj.NumMayor();
    }
 }