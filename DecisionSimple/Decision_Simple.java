import java.util.Scanner;

/* Programa que lea una calificación, la valide y diga
** "aprobado","reprobado","valido","no valido"
** 7-10 aprobado, 5-6 reprobado, 5-10 valido, -inf - 4, 11 - inf NO VALIDO
** Entrada: Calificación num entero
** Salida: "aprobado","reprobado","valido","no valido" */

class Ejemplo{
    int cal;
    public Ejemplo(int x){
        cal = x;
    }

    public void Validar(){
        if ((cal <= 4) || (cal >= 11)){
            System.out.println (" INVALIDO ");
        }
        if ((cal >= 5) && (cal <= 10)){
            System.out.println (" Valido ");
            if((cal >= 7) && (cal <= 10)){
                System.out.println ("Felicidades. Aprobado ");
            }
            if (cal < 7){
                System.out.println (" Reprobado ");
            }
        }
    }
}

class Principal1{
    public static void main(String[]args){
        try (Scanner leer = new Scanner(System.in)) {
            int calif = 0;
            System.out.println (" Ingrese la calificacion");
            calif = leer.nextInt();
            Ejemplo ob1 = new Ejemplo(calif);
            ob1.Validar();
        }
    }
}