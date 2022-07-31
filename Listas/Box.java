/* Referencia e intancia 
 * Box<Integer> integerBox;
 * Box<Integer> integerBox = new Box<Integer>(); instancia
 * Box<Integer> integerBox = new Box<>(); Java 1.7+
 */

 /* Interfaz List
  * Coleccion de elementos en una secuencia particular
    que mantienen un ordeny  permite duplicados
    
  */
public class Box{
    private Object object;

    public void set(Object object){this.object = object;}
    public Object get(){return object;}
}