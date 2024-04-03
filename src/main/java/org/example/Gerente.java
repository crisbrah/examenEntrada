package org.example;
import java.util.Scanner;

public class Gerente extends Empleado implements IEvaluacionDesempeno{
    private int equipo;
    private Double bono;


    public Gerente(String id, String nombre, String departamento, Double salario, int equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    public String evaluarDesempeno(){
        if (equipo<=20)
        {
            return "BUENO";
        } else if (equipo<=10) {
            return "REGULAR";

        }
        else {
            return "MALO";
        }
    }

    @Override
    public double calcularBono() {
        if (evaluarDesempeno() == "BUENO") {
            bono = 1 * salario;
            return bono;
        } else if (evaluarDesempeno() == "Regular") {
            bono = 0.5 * salario;
            return bono;
        }
        else{
            return 0;
        }
    }
}
