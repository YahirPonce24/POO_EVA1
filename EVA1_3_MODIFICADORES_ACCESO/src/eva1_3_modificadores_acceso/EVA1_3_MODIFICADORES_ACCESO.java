/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_modificadores_acceso;

import PAQUETE_DOS.PAQUETE_DOS;

/**
 *
 * @author invitado
 */
public class EVA1_3_MODIFICADORES_ACCESO {

    private static void PAQUETE_DOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int x;
    protected int y;
    private int z;
    int w;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaA objA = new PruebaA();
        /*objA. ---> PUEDO VER X /PUBLIC/
        puedo ver a y /PROTECTED/
        puedo ver a w /DEFFAULT/
        
        
        */
        PAQUETE_DOS otroObj = new PAQUETE_DOS(); // SE DEBE DE IMPORTAR
        //otroObj.
        //PruebaB objB = new PruebaB(); /NO LA PUEDO VER PORQUE ES DEFAULT/
    }
    
}
// Estas clases son deffault
class PruebaA {
    public int x;
    protected int y;
    private int z;
    int w;
    

}