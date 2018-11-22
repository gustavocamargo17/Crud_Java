/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQL;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
/**
 *
 * @author internet
 */
public class MyConnection {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/bdjava";
    private String usuario = "root";
    private String senha = "";
    
    public Connection conn;
    
    public void conexao (){
        try { // Bloco lógico Boleano
            System.setProperty("dbc.drivers", driver);
            conn = DriverManager.getConnection(caminho,usuario,senha);
            /*JOptionPane.showMessageDialog(null, "Conectado!");*/
        } catch(SQLException ex){
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão! código do erro: "+ex);
        }
        
    }
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex ){
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE , null , ex);
            JOptionPane.showMessageDialog(null,"Erro ao fechar a conexão" + ex);
        }
    }
  public void executaSQL(String sql) throws SQLException{
        stm = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs = stm.executeQuery(sql);
        
        }
  
  public void executaInsert(String sql) throws SQLException{
        stm = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stm.executeUpdate(sql);
        }
}

// CONECTOR : https://goo.gl/uVmxx1


