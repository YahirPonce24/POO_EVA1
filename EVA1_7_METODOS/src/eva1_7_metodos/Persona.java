/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
    
    /*Nombre, Apellidos, Edad*/
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    /*Get y Set*/
    
    public String getNombre(){
    return nombre;
    }
    public String getApellidos(){
    return apellidos;
    }
    public int getEdad(){
    return edad;
    }
    
    public void setNombre (String valor){
        nombre = valor;
    }
    public void setApellidos (String valor){
        apellidos = valor;
    }
    public void setEdad (int valor){
        edad = valor;
    }
    /*
    Reglas para el nombre de los métodos en Java
    es un verbo, empieza en minuscula
    */
    public String genNomComp (){
    
        return nombre + " " + apellidos;
        
    }
    
    // calcilar año de nacimiento
    public int calcAnnioNac (){

        return 2024 - edad;
    
    }
    public void imprimir(){
        System.out.println("EL NOMBRE DE LA PERSONA ES: "+ genNomComp());
        System.out.println("EL AÑO DE NACIMIENTO DE LA PERSONA ES: "+calcAnnioNac());
    
    
    
    }
}
