package org.example;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Desarrollador desarrollador1=new Desarrollador("1","Juan","Dep 106",1206.90, 5);
            desarrollador1.mostrarDetalles();

            Empleado emp1 = desarrollador1;
            Empleado emp2= new Gerente();

            List<Empleado> list1=new ArrayList<>();
            list1.add(emp1);
            list1.add(desarrollador1);
        }
    }
