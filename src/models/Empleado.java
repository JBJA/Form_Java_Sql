/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juárez Arevalo
 */
public class Empleado extends Persona{
    private String codigo;
    private String id_puestos;
    private int id_empleado;
    Conexion cn;

    public Empleado(){}
    public Empleado(int id_empleado, String codigo, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String id_puestos) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.id_empleado = id_empleado;
        this.id_puestos = id_puestos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    public String getId_puestos() {
        return id_puestos;
    }

    public void setId_puestos(String id_puestos) {
        this.id_puestos = id_puestos;
    }
    
    public DefaultTableModel leer_empleado(){
        DefaultTableModel tabla = new DefaultTableModel();
         try{
             String query;
             cn = new Conexion();
             cn.abrir_conexion();
             query = "SELECT id_empleados as id_empleados,codigo,nombres,apellidos,direccion,telefono,fecha_nacimiento,id_puestos FROM empleados;";
             ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
             String encabezado[] = {"id","Codigo","Nombres","Apellidos","Direccion","Telefono","Nacimiento","Id Puesto"};
             tabla.setColumnIdentifiers(encabezado);
             
 String datos[] = new String[8]; 
             while(consulta.next()){
                 datos[0] = consulta.getString("id_empleados");
                 datos[1] = consulta.getString("codigo");
                 datos[2] = consulta.getString("nombres");
                 datos[3] = consulta.getString("apellidos");
                 datos[4] = consulta.getString("direccion");
                 datos[5] = consulta.getString("telefono");
                 datos[6] = consulta.getString("fecha_nacimiento");
                 datos[7] = consulta.getString("id_puestos");
           
 tabla.addRow(datos); 
             }
             cn.cerrar_conexion();
         }catch(SQLException ex){
    System.out.println("Error" + ex.getMessage());
    }
        return tabla;
    
    }
    
    public void agregar_empleado(){
        try{
            PreparedStatement parametro;
            String query;
            cn = new Conexion();
            cn.abrir_conexion();
            query = "INSERT INTO empleados(codigo,nombres,apellidos,direccion,telefono,fecha_nacimiento,id_puestos) VALUES(?,?,?,?,?,?,?);";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getId_puestos());
            int executar = parametro.executeUpdate();
            cn.cerrar_conexion();
             
            JOptionPane.showMessageDialog(null,Integer.toString(executar) + " Registros Ingresados", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
        
        }catch(HeadlessException | SQLException ex){
           System.out.println("Error . . ."+ ex.getMessage()); 
        }
    }
   
    public void modificar_empleado (){
    try{
        PreparedStatement parametro;
        String query;
            cn = new Conexion();
            cn.abrir_conexion();
            query = "UPDATE empleados SET codigo = ?,nombres = ?,apellidos = ?,direccion = ?,telefono = ?,fecha_nacimiento = ?,id_puestos = ? WHERE id_empleados = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, this.getId_puestos());
            parametro.setInt(8, getId_empleado());
            int exec = parametro.executeUpdate();
            cn.cerrar_conexion();
             
            JOptionPane.showMessageDialog(null,Integer.toString(exec) + " Registros Modificados", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
                
    }catch(HeadlessException | SQLException ex){
    System.out.println("Error" + ex.getMessage());
    }    
    }
    
     public void eliminar_empleado(){
         try{
        PreparedStatement parametro;
        String query;
            cn = new Conexion();
            cn.abrir_conexion();
            query = "delete from empleados WHERE id_empleados = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setInt(1, getId_empleado());
            int exec = parametro.executeUpdate();
            cn.cerrar_conexion();
             
            JOptionPane.showMessageDialog(null,Integer.toString(exec) + " Registros Eliminado", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
             
            
    }catch(HeadlessException | SQLException ex){
    System.out.println("Error" + ex.getMessage());
    }       
    }
    
}
