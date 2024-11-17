package me.jorgemoran.semana4.model.recursoshumanos;
import java.util.List;
import java.util.ArrayList;
public class Nomina {
    protected List<Empleado> empleados;

    public Nomina() {
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularTotalNomina() {
        double total = 0;
        for (Empleado emp : empleados) {
            total += emp.calcularSalario();
        }
        return total;
    }
    /*Los bonos solo aplican para empleados tiempo completo*/
    public double calcularTotalNominaIncluyendoBonos(double porcentajeBono){
        double total = 0;
        for (Empleado emp : empleados) {
            System.out.println("Sumando un sueldo de: " + emp.getClass());
            if(emp instanceof EmpleadoPorHoras) {
                total += emp.calcularSalario();
            }else if(emp instanceof EmpleadoTiempoCompleto){
                total += (emp.calcularSalario()*porcentajeBono/100) + emp.calcularSalario();
            }
        }
        return total;
    }


    public static void main(String[] args){
        Nomina nomina = new Nomina();
        System.out.println("Total: " + nomina.calcularTotalNomina());
        Empleado e1 = new EmpleadoPorHoras(10,5);
        nomina.agregarEmpleado(e1);
        System.out.println(e1.getClass());
        nomina.agregarEmpleado(new EmpleadoTiempoCompleto(1000));
        nomina.agregarEmpleado(new EmpleadoTiempoCompleto(1200));
        nomina.agregarEmpleado(new EmpleadoTiempoCompleto(1500));
        nomina.agregarEmpleado(new EmpleadoPorHoras(10,5));
        nomina.agregarEmpleado(new EmpleadoPorHoras(3,5));
        nomina.agregarEmpleado(new EmpleadoPorHoras(2,5));
        System.out.println("Total: " + nomina.calcularTotalNomina());
        System.out.println("Total con Bono: " + nomina.calcularTotalNominaIncluyendoBonos(10));

    }
}