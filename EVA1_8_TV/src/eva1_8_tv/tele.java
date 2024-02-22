/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_tv;

/**
 *
 * @author invitado
 */
public class tele {

    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    public tele(){
        volumen = 30;
        canal = 7;
        estaEncendida = false;        
    }
    //<         >
    public void subirVolumen(){
        if (estaEncendida == true && volumen < 100)
         
            volumen = volumen ++;
        
    }
    public void bajarVolumen(){
        if (estaEncendida == true && volumen > 100)
        volumen = volumen -1;
        
    }
    public void subirCanal(){
        if (estaEncendida == true)
        canal = canal ++;
        
    }
    public void bajarCanal(){
        if (estaEncendida == true && canal > 0)
        canal = canal -1;
        
    }
    public void cambiarCanal(int noCanal){
        if (estaEncendida == true && canal > 0)
        canal = noCanal;
        
    }
    
    public void power(){
    
        /*if(estaEncendida == true)
            estaEncendida = false;
        else
            estaEncendida = true;*/
        estaEncendida = !estaEncendida;
        
        
    }
    
    public void imprimirConfig(){
    
        System.out.println("VOLUMEN: "+ volumen);
        System.out.println("CANAL: "+ canal);
        System.out.println("POWER: "+ estaEncendida);
        
        
    }
}
