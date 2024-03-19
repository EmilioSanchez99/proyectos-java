/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparador;

/**
 *
 * @author Medac
 */
public class Cesta {
    
    private String prducto;
    private int unidades;

    public void setPrducto(String prducto) {
        this.prducto = prducto;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Cesta{" + "prducto=" + prducto + ", unidades=" + unidades + '}';
    }

    
    
    
}
