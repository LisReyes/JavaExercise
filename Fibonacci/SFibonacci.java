import java.util.Scanner;

class SFibonacci {

    public SFibonacci() {
    }
    
    public int GFibonacci(int n){
        if (n == 0 || n == 1)
            return n;
        else
            return GFibonacci(n-1)+GFibonacci(n-2);
    }
}

class PrincipalF{
    public static void main(String[]arg){
        Scanner leer = new Scanner(System.in);
        System.out.println ("Ingrese el limite de la suma ");
        int lim = leer.nextInt();
        leer.close();
        SFibonacci ob = new SFibonacci();
        System.out.println(ob.GFibonacci(lim));
    }
}
