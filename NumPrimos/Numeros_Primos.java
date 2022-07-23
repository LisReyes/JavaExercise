public class Numeros_Primos {
    
    static boolean esPrimo(int n){
        boolean esprimo = true;
        int i = 2;
        while( i < n){
            if (n%i == 0){
                esprimo = false;
            }
            i++;
        }
        return esprimo;
    }

    public static void main(String[]args){
        for (int i = 1; i<=1000; i++){
            if(esPrimo(i))
                System.out.println(i);
        }
    }
}
