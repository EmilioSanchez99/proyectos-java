/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DarthVader d=new DarthVader();
        Leia l=new Leia();
        Luke lu=new Luke();
        KyloRen k=new KyloRen();
        
        d.hablar();
        l.hablar();
        lu.hablar();
        k.hablar();
    }
    
}
