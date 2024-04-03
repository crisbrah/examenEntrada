package org.example;

public class Desarrollador extends Empleado implements IEvaluacionDesempeno{
    private int lenguajes;
    private Double bono;
    public Desarrollador(String id, String nombre, String departamento, Double salario, int lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes=lenguajes;
    }

    @Override
    //para calcular si es bueno <20, regular de 5-19, si es malo menor que 4
    public String evaluarDesempeno(){
        if (lenguajes>=20)
        {  return "BUENO";}
        else if (lenguajes>=5 && lenguajes<=19)
        {  return "REGULAR";}
        else
        {   return "MALO";   }
    }


    public double calcularBono() {
        if (evaluarDesempeno() == "BUENO") {
            bono = 1 * salario;
            return bono;
        }
        if (evaluarDesempeno() == "REGULAR") {
            bono = 0.5 * salario;
            return bono;
        }
        else{
            return 0;
        }
    }

}
