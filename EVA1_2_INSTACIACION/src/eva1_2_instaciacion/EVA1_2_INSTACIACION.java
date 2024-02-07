/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_instaciacion;

/**
 *
 * @author invitado
 */
public class EVA1_2_INSTACIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int valor = 100;
        // INSTANCIACION: Crear el objeto --> darle memoria
        // CLASE IDENTIDICADOR = new Constructor();
        // Constructor --> Método con el mismo nombre que la clase
        Persona perso1 = new Persona(); // instanciacion
        System.out.println(perso1);
        // perso1 --> referencia --> direccion en memoria
        Veiculo carro = new Veiculo();

        carro.marca = "Ford";
        carro.modelo = "Mustang";
        carro.annio = 1995;
        
        System.out.println("Marca: "+ carro.marca);
        System.out.println("Modelo: "+ carro.modelo);
        System.out.println("Año: "+ carro.annio);
        
        
    }
        

}
    //TIPO DE CLASE ABSTRACTO
    class Persona {
    
    }
    class Veiculo {
    //Atributos
        String marca;
        int annio;
        String modelo;
    }
    