/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_clase_persona;

/**
 *
 * @author invitado
 */
public class EVA1_5_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1=new Persona ();
        perso1.setNombre("Miguel");
        perso1.setApellidos("Martinez");
        perso1.setEdad(27);
        
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
        
    }
    
}


 class Persona{
     /*ATRIBUTOS --> ESTADO DEL OBJETO
       NO DEBEN SER ACCESIBLE DIRECTAMENTE*/
     private String nombre;
     private String apellidos;
     private int edad;
 
     /*Metodos:
     Publicos --> Son la interfaz
     si son para manipular los atributos hay un estandar en java
     metodos SET y GET*/
     
     public String getNombre (){
     return nombre;
     }
     public void setNombre(String valor){
         nombre = valor;
     }
     
     public String getApellidos (){
     return apellidos;
     }
     public void setApellidos(String valor){
         apellidos = valor;
     }
     public int getEdad (){
     return edad;
     }
     public void setEdad (int valor){
         edad = valor;
     }
     
 }