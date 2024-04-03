package org.example;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Desarrollador desarrollador1=new Desarrollador("1","Juan Perez","Dep 106",1206.90, 2);
            Desarrollador desarrollador2=new Desarrollador("2","Carlos Paredes","Dep 502",4500.10, 10);
            Desarrollador desarrollador3=new Desarrollador("3","Matias Jurado","Dep 802",6500.20, 25);

            Gerente gerente1=new Gerente("4","Steve Perez","Dep 1000",8500.25,10);
            Gerente gerente2=new Gerente("5","Rossy Poma","Dep 705",10500.25,1);
            Gerente gerente3=new Gerente("6","Antonio Velez","Dep 655",5000.25,22);


            Empleado emp1 = desarrollador1;
            List<Empleado> list1=new ArrayList<>();
            list1.add(emp1);
            list1.add(desarrollador2);
            list1.add(desarrollador3);
            list1.add(gerente1);
            list1.add(gerente2);
            list1.add(gerente3);

            desarrollador1.mostrarDetalles();
            Double bono1= desarrollador1.calcularBono();
            System.out.println("bono del primer desarrollador "+bono1);
            desarrollador2.mostrarDetalles();
            Double bono2= desarrollador2.calcularBono();
            System.out.println("bono del primer desarrollador "+bono2);
        desarrollador3.mostrarDetalles();
        Double bono3 =desarrollador1.calcularBono();
        System.out.println("bono del primer desarrollador "+bono3);
        gerente1.mostrarDetalles();
        gerente2.mostrarDetalles();
        gerente3.mostrarDetalles();

        }
    }
