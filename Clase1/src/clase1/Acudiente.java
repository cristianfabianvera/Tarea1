/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;


public class Acudiente extends Persona{

String Telefono;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
@Override
    
public String nombre_completo(){

  String nombre_completo;

nombre_completo= Nombre+" "+Apellido+" "+Telefono;  

return nombre_completo;

}

}

