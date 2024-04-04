/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingrecuperacion;

/**
 *
 * @author Medac
 */
public class Coche {
 
    private int id;
    private String matricula;
    private int horaEntrada;
    private int horaSalida;

    public Coche(int id, String matricula, String hora) {
        this.id = id;
        this.matricula = matricula;
        horaEntrada = Integer.parseInt(hora);
        horaSalida=23;
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", matricula=" + matricula + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
    
    
}
