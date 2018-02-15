/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author cfvera
 */
public class Docente extends Persona{
   
    String Profesion;
    String Cedula;

    public String getProfesion() {
        return Profesion;
    }
    
    public String getCedula(){
    
    return Cedula;
    
    }

    @Override
    
    public String nombre_completo(){
    
    String nombre_completo;
    nombre_completo = Nombre+" "+Apellido+" "+Profesion+" "+Cedula;
        
    return nombre_completo;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    public void setCedula(String Cedula){
       this.Cedula = Cedula;
    }
}
