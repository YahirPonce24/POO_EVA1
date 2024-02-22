/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_formulageneral;

/**
 *
 * @author invitado
 */
public class formula {
    private double a;
    private double b;
    private double c;
    
    
    public void setA (double valor){
     a = valor;
    }
    public double getA (){
    return a;
    }
    public void setB (double valor){
     b = valor;
    }
    public double getB (){
    return b;
    }
    public void setC (double valor){
     c = valor;
    }
    public double getC (){
    return c;
    }
    

private double x1 (){
double x1; 
x1 = (- b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
return x1;
}
private double x2 (){
double x2;   
x2 = (- b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
return x2;
}
public void imprimirDatos(){

    System.out.println("EL VALOR DE A ES: "+a);
    System.out.println("EL VALOR DE B ES: "+b);
    System.out.println("EL VALOR DE C ES: "+c);

    System.out.println("FORMULA GENERAL X1 ES IGUAL A: "+ x1() );
    System.out.println("FORMULA GENERAL X2 ES IGUAL A: "+ x2() );


}    
    
}





    