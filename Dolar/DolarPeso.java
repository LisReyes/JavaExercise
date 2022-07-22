import java.util.Scanner;

/* Programa que convierte dolares a pesos
 * Entrada: Dolares
 * Salida: pesos
 */

class Ejemplo8{
    double usd = 20.67;
    int dolar;
    double cm,cq,cd,cc,cci,cv,cdi,ccin,cu,mex;
    public Ejemplo8(int d){
        dolar = d;
    }

    public void Convertir (){
        if (dolar <= 0){
            System.out.println ("Debe ingresar un numero mayor a 0");
        }else{
            mex = (dolar * usd);
        }
        cm = mex/1000;
        mex = mex % 1000;
        cq = mex/500;
        mex = mex % 500;
        cd = mex/200;
        mex = mex  % 200;
        cc = mex / 100;
        mex = mex % 100;
        cci = mex / 50;
        mex = mex % 50;
        cv = mex / 20;
        mex = mex % 20;
        cdi = mex / 10;
        mex = mex % 10;
        ccin = mex / 5;
        mex = mex % 5;
        cu = mex % 1;
        if (cm > 0){ System.out.println ("El total de billetes de 1000 es: "+(int)cm);}
        if (cq > 0){ System.out.println ("El total de billetes de 500 es: "+(int)cq);}
        if (cd > 0){ System.out.println ("El total de billetes de 200 es: "+(int)cd);}
        if (cc > 0){ System.out.println ("El total de billetes de 100 es: "+(int)cc);}
        if (cci > 0){ System.out.println ("El total de billetes de 100 es: "+(int)cci);}
        if (cv > 0){ System.out.println ("El total de billetes de 20 es: "+(int)cv);}
        if (cdi > 0){ System.out.println ("El total de monedas de 10 es: "+(int)cdi);}
        if (ccin > 0){ System.out.println ("El total de monedas de 5 es: "+(int)ccin);}
        if (cu > 0){ System.out.println ("El total de monedas de 1 es: "+(int)cu);}
    }

}
class Principal8{
    public static void main(String[]args){
        int dolar;
        System.out.println (" Ingrese los billetes a convertir");
        try (Scanner leer = new Scanner(System.in)) {
            dolar = leer.nextInt();
        }
        Ejemplo8 ob1 = new Ejemplo8(dolar);
        ob1.Convertir();
    }
}