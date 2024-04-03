package org.example;

public class Desarrollador extends Empleado implements IEvaluacionDesempeno{
    private int lenguajes;
    private Double bono;
    public Desarrollador(String id, String nombre, String departamento, Double salario, int lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes=lenguajes;
    }

    @Override
    public String evaluarDesempeno(){
        if (lenguajes<=20)
        {
            return "BUENO";
        } else if (lenguajes<=10) {
            return "REGULAR";

        }
        else {
            return "MALO";
        }
    }


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
