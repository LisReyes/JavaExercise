import java.util.Scanner;

/* Programa que realiza la lectura de la variables necesarias para poder
 * realizar una ecuacion cuadraticas
 * Entras: a,b,c
 * Salida: raices o raíz
 */

 class Ejemplo7{
    int a,b,c;
    float ar,div;
    double x1,x2;
    public Ejemplo7(int a1,int b1,int c1){
        a = a1;
        b = b1;
        c = c1;
    }

    public void ECuadratica(){
        if (a > 0){
            ar = ((b*b) - 4*(a*c));
            div  = 2*a;
           System.out.println(div);
        }else{
            System.out.println (" Ax2 no puede ser menor o igual a 0");
        }
        if ((ar == 0) && (div != 0)){ 
            System.out.println (div);
            System.out.println (" x1 = x2 = "+ (float)(-b / div));
        }else{
            System.out.println (ar);
            if (ar != 0){
                x1 =  (-b + Math.sqrt(ar))/div;
                x2 =  (-b - Math.sqrt(ar))/div;
            }
        }
        System.out.println (" La raiz x1 = "+x1);
        System.out.println (" La raiz x2 = "+x2);
    }
 }

 class Principal7{
    public static void main(String[]args){
        int a,b,c;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println (" Ingrese los valores");
            System.out.println (" a: ");
            a = leer.nextInt();
            System.out.println (" b: ");
            b = leer.nextInt();
            System.out.println (" c: ");
            c = leer.nextInt();
        }
        Ejemplo7 ob = new Ejemplo7(a,b,c);
        ob.ECuadratica();
    }
 }