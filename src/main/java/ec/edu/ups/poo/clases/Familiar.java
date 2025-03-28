package ec.edu.ups.poo.clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() {
        super();
    }

    // Constructor completo
    public Familiar(String cedula, String nombre, String apellido, String direccion,
                    String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    @Override
    public String toString() {
        return super.toString() +
                ",\n\t Parentesco: " + parentesco +
                ",\n\t Tipo de Sangre: " + tipoDeSangre +
                ",\n\t Fecha de Nacimiento: " +
                (fechaDeNacimiento != null ?
                        fechaDeNacimiento.get(GregorianCalendar.YEAR) + "-" +
                                (fechaDeNacimiento.get(GregorianCalendar.MONTH)+1) + "-" +
                                fechaDeNacimiento.get(GregorianCalendar.DAY_OF_MONTH)
                        : "No especificada");
    }
}