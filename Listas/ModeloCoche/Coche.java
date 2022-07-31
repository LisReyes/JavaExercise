package ModeloCoche;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coche {
    private String marca;
    private String modelo;
    private int color;
    private List<Rueda> ruedas = null;
    private List<Motor> motores = null;
    private List<Puerta> puertas = null;

    public Coche(){
        ruedas = new ArrayList<>();
        for (int i=0; i<4; i++){
            ruedas.add(new Rueda());
        }

        motores = new LinkedList<>();
        puertas = new ArrayList<>();

        motores.add(new Motor());

        for(int i=0; i<5;i++){
            puertas.add(new Puerta());
        }
    }
    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}
    public String getModelo(){return modelo;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public int getColor(){return color;}
    public void setColor(int color){this.color = color;}

}
