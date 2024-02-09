/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE_1;

import PAQUETE_2.ClassB;
import PAQUETE_2.ClassC;

/**
 *
 * @author invitado
 */
public class ClassA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One obj1 = new One();
        System.out.println(obj1);
        // Clases del paquete 2
        ClassB objB = new ClassB();
        System.out.println(objB);
        /*Two obj2 = new Two(); No se puede usar
                                porque no es accesible
                                tiene modificador default
        
        */
        ClassC objC = new ClassC ();
        System.out.println(objC);
    }
    
}

class One {

}
