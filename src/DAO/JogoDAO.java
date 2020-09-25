/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import modelo.Jogo;
import controle.ControleBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class JogoDAO {
    
    protected static boolean insert(Jogo jogo){
        boolean retorno = false;
        PreparedStatement pstdados = null;
        ControleBD bd = new ControleBD();
        Connection connection = null;
        String sqldml = "INSERT INTO jogo (jogo_nome, jogo_dev, jogo_gen)"
                + "VALUES (?,?,?);";
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, jogo.getNome());
            pstdados.setString(2, jogo.getDesenvolvedora());
            pstdados.setString(3, jogo.getGenero());
            pstdados.executeUpdate();
            
            connection = bd.commitNoBanco();
            retorno = true;
        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "JOGO JÁ CADASTRADO EM NOSSO SISTEMA!");
            connection = bd.rollbackBanco();
        } finally {
            connection = bd.Sair(connection, pstdados);
        }
        return retorno;
    }
    
    protected static boolean update(Jogo jogo){
        boolean retorno = false;
        PreparedStatement pstdados;
        ControleBD bd = new ControleBD();
        Connection connection = null;
        String sqldml = "UPDATE jogo SET jogo_nome = ? ,"
                + "jogo_dev = ? ,"
                + "jogo_gen = ? "
                + "WHERE jogo_nome = ?";
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, jogo.getNome());
            pstdados.setString(2, jogo.getDesenvolvedora());
            pstdados.setString(3, jogo.getGenero());
            pstdados.setString(4, jogo.getNome());
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
    
    protected static boolean delete(String nome_jogo) {
        boolean retorno = false;
        PreparedStatement pstdados;
        ControleBD bd = new ControleBD();
        Connection connection = null;

        try {
            String sqldml = "delete from jogo where jogo_nome = ?";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            connection = bd.AcessaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            pstdados.setString(1, nome_jogo);
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
    
}
