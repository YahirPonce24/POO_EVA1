/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_veiculo;

/**
 *
 * @author invitado
 */
public class EVA1_6_VEICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        veiculo auto = new veiculo ();
        
        
        
        auto.setMarca("Ford");
        auto.setModelo("F150");
        auto.setColor("Rojo");
        auto.setAnnio(1979);
        auto.setPrecio(187845);
        
        
        
        System.out.println("Muy bien su auto es");
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.getColor());
        System.out.println(auto.getAnnio());
        System.out.println(auto.getPrecio());
        
        
    }
    
}

