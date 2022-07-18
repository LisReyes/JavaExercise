import java.util.Scanner;

/* Programa que calcula el area de un triangulo, circulo, trapecio, cuadrado, en 
 * función a la elección del usuario. Valida los datos considerando las
 * restricciones adecuadas para cada caso. Obliga al usuario a dar valores
 * validos.
 * Entrada: Figura, valores.
 * Salida: Area
 */
class Ejemplo6 {
    int op;
    int b,h,r,l,area;
    public Ejemplo6(int c){
        op = c;
    }

    /**
     * 
     */
    public void Figuras(){
        try (Scanner leer = new Scanner (System.in)) {
            switch(op){
                case 1: 
                    do{
                        System.out.println ("Ingrese la base y altura");
                        b = leer.nextInt();
                        h = leer.nextInt();
                        if((b <= 0) || (h <= 0)){
                            System.out.println (" Ingrese nuevamente sus datos no pueden ser menor a 0");
                        }
                    }while ((b < 0) && (h < 0));
                    area  = (b*h)/2;
                    System.out.println (" El área del triangulo es: "+area);
                break;
                case 2:
                    do{
                        System.out.println ("Ingrese el radio");
                        r = leer.nextInt();
                        if(r <= 0){
                            System.out.println (" Ingrese nuevamente sus datos no pueden ser menor a 0");
                        }
                        }while (r < 0);
                        area  = (int) (Math.PI * r*r);
                        System.out.println (" El área del circulo es: "+area);
                        break; 
                        case 3:
                        do{
                            System.out.println ("Ingrese la medida del cuadrado");
                            l = leer.nextInt();
                            if(l <= 0){
                                System.out.println (" Ingrese nuevamente sus datos no pueden ser menor a 0");
                            }
                        }while (l < 0);
                        area  = l * l;
                        System.out.println (" El área del cuadrado es: "+area);
                        break; 
            }
        }
    }
}
class Principal6{
    /**
     * @param args
     */
    public static void main (String[]args){
    int op;
    do{
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println ("Ingrese el numero de la figura a calcular el área ");
            System.out.println (" 1. Triangulo 2. Circulo 3.Trapecio 4. Cuadrado 5. Salir");
            op = leer.nextInt();
            Ejemplo6 obj = new Ejemplo6(op);
            obj.Figuras();
        }
    }while(op != 4);
    }
}