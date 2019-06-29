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
import modelo.Avaliacao;
import modelo.Jogo;

/**
 *
 * @author samue
 */
public class AvaliacaoDAO {
    public static boolean insert(Avaliacao aval){
        boolean retorno = false;
        PreparedStatement pstdados = null;
        ControleBD bd = new ControleBD();
        Connection connection = null;
        String sqldml = "INSERT INTO avaliacao (nota, comentario, usu_email_fk, jogo_nome_fk)"
                + "VALUES (?,?,?,?);";
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setDouble(1, aval.getNota());
            pstdados.setString(2, aval.getComentario());
            pstdados.setString(3, aval.getUsuario().getEmail());
            pstdados.setString(4, aval.getJogo().getNome());
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
    
    
    public static boolean delete(String email, String nome) {
        boolean retorno = false;
        PreparedStatement pstdados;
        ControleBD bd = new ControleBD();
        Connection connection = null;

        try {
            String sqldml = "DELETE FROM avaliacao where usu_email_fk = ? AND jogo_nome_fk = ? ;";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            pstdados.setString(1, email);
            pstdados.setString(2, nome);
            pstdados.executeUpdate();
            //Chama o Commit
            connection = bd.commitNoBanco();
            //Ocorreu tudo bem e o objeto está salvo
            
            retorno = true;
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, "Jogo não pode ser excluído!\nPode haver avaliações de outras pessoas");
            //Dá Roolback
            connection = bd.rollbackBanco();
        } finally {
            connection = bd.Sair(connection);
        }
        return retorno;
    }
    
    public static boolean delete(String nome) {
        boolean retorno = false;
        PreparedStatement pstdados;
        ControleBD bd = new ControleBD();
        Connection connection = null;

        try {
            String sqldml = "DELETE FROM avaliacao where jogo_nome_fk = ? ;";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            pstdados.setString(1, nome);
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
            connection = bd.Sair(connection);
        }
        return retorno;
    }
    
     public static boolean update(Avaliacao aval) {
        boolean retorno = false;
        PreparedStatement pstdados;
        ControleBD bd = new ControleBD();
        Connection connection = null;

        try {
            String sqldml = "UPDATE avaliacao SET nota = ?, comentario = ? where usu_email_fk = ? AND jogo_nome_fk = ? ;";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            pstdados.setDouble(1, aval.getNota());
            pstdados.setString(2, aval.getComentario());
            pstdados.setString(3, aval.getUsuario().getEmail());
            pstdados.setString(4, aval.getJogo().getNome());
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
            connection = bd.Sair(connection);
        }
        return retorno;
    }
    
}
