package model;
// Generated 27/01/2021 05:03:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private long idCliente;
     private String nombre;
     private String apellido;
     private String direccion;
     private String fechaNacimiento;
     private String telefono;
     private String email;
     private Set facturas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(long idCliente, String nombre, String apellido, String direccion, String fechaNacimiento, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
    }
    public Cliente(long idCliente, String nombre, String apellido, String direccion, String fechaNacimiento, String telefono, String email, Set facturas) {
       this.idCliente = idCliente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.fechaNacimiento = fechaNacimiento;
       this.telefono = telefono;
       this.email = email;
       this.facturas = facturas;
    }
   
    public long getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


