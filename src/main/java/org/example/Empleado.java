package org.example;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected String departamento;
    protected Double salario;
   // protected String desempeno;

    public Empleado(String id, String nombre, String departamento, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }
     public void mostrarDetalles(){
         System.out.println("id del empleado: "+id);
         System.out.println("nombre del empleado: "+nombre);
         System.out.println("deártamento del empleado: "+departamento);
         System.out.println("Salario del empleado: "+salario);
     }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract double calcularBono();

}
