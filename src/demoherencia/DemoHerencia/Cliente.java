/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia.DemoHerencia;

/**
 *
 * @author EliasAlejandro
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    public Cliente (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimieto(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getDirreccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
