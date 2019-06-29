/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controle.ControleBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author julio
 */
public class UsuarioDAO {
    ControleBD bd = new ControleBD();
    Connection connection;
    public boolean insert(Usuario usu){
        boolean retorno = false;
        PreparedStatement pstdados = null;
        
        Connection connection = null;
        String sqldml = "INSERT INTO usuario (usu_nome, usu_email, usu_pass, usu_pass_conf)"
                + "VALUES (?,?,?,?);";
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, usu.getNome());
            pstdados.setString(2, usu.getEmail());
            pstdados.setString(3, usu.getSenha());
            pstdados.setString(4, usu.getcSenha());
            
            pstdados.executeUpdate();
            
            connection = bd.commitNoBanco();
            retorno = true;
        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "ERRO NO BANCO DE DADOS! "+ error);
            connection = bd.rollbackBanco();
        } finally {
            connection = bd.Sair(connection, pstdados);
        }
        return retorno;
    }
    
    public boolean update(Usuario usu){
        boolean retorno = false;
        PreparedStatement pstdados;
        
        Connection connection = null;
        String sqldml = "UPDATE usuario SET usu_nome = ? ,"
                + "usu_pass = ? ,"
                + "usu_pass_conf = ? "
                + "WHERE usu_email = ?;";
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, usu.getNome());
            pstdados.setString(2, usu.getSenha());
            pstdados.setString(3, usu.getcSenha());
            pstdados.setString(4, usu.getEmail());
            pstdados.executeUpdate();
            connection = bd.commitNoBanco();
            
            retorno = true;
        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "ERRO : "+ error);
            //Dá Roolback
            connection = bd.rollbackBanco();
        } finally {
            connection = bd.Sair(connection);
        }
        return retorno;
    }
    
    public boolean delete(String usu_email) {
        boolean retorno = false;
        PreparedStatement pstdados;
       
        Connection connection = null;

        try {
            String sqldml = "DELETE FROM usuario WHERE usu_email = ?;";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            pstdados.setString(1, usu_email);
            pstdados.executeUpdate();
            //Chama o Commit
            connection = bd.commitNoBanco();
            //Ocorreu tudo bem e o objeto está salvo
            retorno = true;
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, msgErro);
            //Dá Roolback
            connection = bd.rollbackBanco();
        } finally {
            //Termina connecção
            connection = bd.Sair(connection);
        }
        return retorno;
    }
    
    
    public Usuario select(Usuario u){
        try {
            bd.AcessaBD();
            bd.ExecutaQuery("SELECT * FROM usuario WHERE usu_email like '"+u.getEmail()+"'");
            bd.rsdados.first();
            u.setNome(bd.rsdados.getString("usu_nome"));
            u.setEmail(bd.rsdados.getString("usu_email"));
            u.setSenha(bd.rsdados.getString("usu_pass"));
            u.setcSenha(bd.rsdados.getString("usu_pass_conf"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado"+ex);
            
        }
        bd.Sair();
        return u;
    }
}
