package Modelo;

import java.sql.*;
import java.util.UUID;
import modelo.ClaseConexion;

public class Visitas {
    
    //1-Parametros
    private String uuid_paciente;
    private String nombre;
    private int edad;
    private String especialidad;
    
    //2-getters y setters

    public String getUuid_paciente() {
        return uuid_paciente;
    }

    public void setUuid_paciente(String uuid_paciente) {
        this.uuid_paciente = uuid_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void Guardar() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addProducto = conexion.prepareStatement("INSERT INTO TB_VISITAS (UUID_Paciente, nombre, edad, Especialidad) VALUES (?, ?, ?, ?)");
            //Establecer valores de la consulta SQL
            addProducto.setString(1, UUID.randomUUID().toString());
            addProducto.setString(2, getNombre());
            addProducto.setInt(3, getEdad());
            addProducto.setString(4, getEspecialidad());
            //Ejecutar la consulta
            addProducto.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
    
}
