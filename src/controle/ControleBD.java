/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author samue
 */
public class ControleBD {
    private Connection connection = null;
    private Statement stdados = null;
    private ResultSet rsdados = null;
    
    public void Sair() {
        try {
            if (rsdados != null) {
                rsdados.close();
                stdados.close();
                connection.close();
            }
        } catch (SQLException erro) {
            System.out.println("Nao foi possivel a desconexao." + erro);
        }
    }
    
    public boolean AcessaBD() {
        
        try {
            String usuario = "postgres";
            String senha = "postgres";
            
            Class.forName("org.postgresql.Driver");  //para acesso ao banco de dados Postgre
            String urlconexao = "jdbc:postgresql://localhost/avaliacao_jogos"; //para acesso ao banco de dados fabricio, usando o banco de dados Postgre.

            connection = DriverManager.getConnection(urlconexao, usuario, senha);
            connection.setAutoCommit(false);//configuracao necessaria para confirmacao ou nao de alteracoes no banco de dados.

        } catch (ClassNotFoundException erro) {
            System.out.println("Falha ao carregar o driver JDBC/ODBC." + erro);
            return false;
        } catch (SQLException erro) {
            System.out.println("Falha na conexao, comando sql = " + erro);
            return false;
        }
        return true;
    }
    
    public boolean ExecutaInsert(String tabela, StringBuilder inserts) {
        try {
            String querydados = "INSERT INTO "+tabela+" VALUES ("+inserts+");";
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            //a) ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao eh rolavel, isto e, soh anda para frente uma unica vez.
            //b) ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados eh rolavel, mas nao eh sensivel as alteracoes do banco de dados.
            //c) ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados eh rolavel sendo sensivel as alteracoes do banco de dados.

            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            //ResultSet.CONCUR_READ_ONLY => O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE tabela => O conjunto de resultados pode ser usado para atualizar o banco de dados.

            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela

            stdados = connection.createStatement(tipo, concorrencia);
            //connection.prepareStatement(sql)
            int resposta = stdados.executeUpdate(querydados);//DML
            //boolean resposta = stdados.execute(querydados);//DDL
            //rsdados = stdados.executeQuery(querydados);//DQL
            System.out.println("Resposta do Update = " + resposta);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Update = " + erro);
            return false;
        }
        return true;
    }
    
    public boolean ExecutaUpdate(String tabela, String inserts) {
        try {
            String querydados = "UPDATE "+tabela+" SET "+inserts+" ;";
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;//(c)
            //a) ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao eh rolavel, isto e, soh anda para frente uma unica vez.
            //b) ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados eh rolavel, mas nao eh sensivel as alteracoes do banco de dados.
            //c) ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados eh rolavel sendo sensivel as alteracoes do banco de dados.

            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            //ResultSet.CONCUR_READ_ONLY => O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE tabela => O conjunto de resultados pode ser usado para atualizar o banco de dados.

            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela

            stdados = connection.createStatement(tipo, concorrencia);
            //connection.prepareStatement(sql)
            int resposta = stdados.executeUpdate(querydados);//DML
            //boolean resposta = stdados.execute(querydados);//DDL
            //rsdados = stdados.executeQuery(querydados);//DQL
            System.out.println("Resposta do Update = " + resposta);
        } catch (SQLException erro) {
            System.out.println("Erro Executa Update = " + erro);
            return false;
        }
        return true;
    }
    
    public void commitNoBanco(){
        try {
            connection.commit();
        } catch (SQLException erro) {
            System.out.println("Erro commit = " + erro);
        }
    }
    
    public void rollbackBanco(){
        try {
            connection.rollback();
        } catch (SQLException erro) {
            System.out.println("Erro Roolback = " + erro);
        }
    }   
    
    public void ExecutaQuery(String tabela, StringBuilder campos) {
        try {
            String querydados = "SELECT "+campos+" FROM "+tabela+";";
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            //ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao � rol�vel, isto �, s� anda para frente uma �nica vez.
            //ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados � rol�vel, mas nao � sens�vel �s altera�oes do banco de dados.
            //ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados � rol�vel e � sens�vel �s altera�oes do banco de dados.
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            //ResultSet.CONCUR_READ_ONLY = O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE = O conjunto de resultados pode ser usado para atualizar o banco de dados.
            stdados = connection.createStatement(tipo, concorrencia);
            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela
            rsdados = stdados.executeQuery(querydados);
            //stdados.executeQuery = retorna um resultSet
            
        } catch (SQLException erro) {
            System.out.println("Erro Executa Query = " + erro);
        }
    }
    
    public void ExecutaQuery(String tabela, String campos, String whereUpdate) {
        try {
            String querydados = "SELECT * FROM "+tabela+" WHERE "+campos+" = '"+whereUpdate+"' ;";
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            //ResultSet.TYPE_FORWARD_ONLY = O conjunto de dados nao � rol�vel, isto �, s� anda para frente uma �nica vez.
            //ResultSet.TYPE_SCROLL_INSENSITIVE = O conjunto de dados � rol�vel, mas nao � sens�vel �s altera�oes do banco de dados.
            //ResultSet.TYPE_SCROLL_SENSITIVE = O conjunto de dados � rol�vel e � sens�vel �s altera�oes do banco de dados.
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            //ResultSet.CONCUR_READ_ONLY = O conjunto de resultados nao pode ser usado para atualizar o banco de dados.
            //ResultSet.CONCUR_UPDATABLE = O conjunto de resultados pode ser usado para atualizar o banco de dados.
            stdados = connection.createStatement(tipo, concorrencia);
            //stdados.execute("SET SEARCH_PATH TO nome_esquema");//necessario para selecionar o esquema no banco de dados Postgre.
            //ou se utiliza o nome do esquema.nomedatabela
            rsdados = stdados.executeQuery(querydados);
            //stdados.executeQuery = retorna um resultSet
            
        } catch (SQLException erro) {
            System.out.println("Erro Executa Query = " + erro);
        }
    }
    
    public Vector ProximoRegistro(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
        Vector registro = new Vector();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            //A classe Types eh uma classo do pacote java.sql
            if (rsmd.getColumnType(i) == Types.VARCHAR
                    || rsmd.getColumnClassName(i).equalsIgnoreCase("java.lang.String")) {//para string
                registro.addElement(rs.getString(i));
            } else if (rsmd.getColumnType(i) == Types.INTEGER) {//para inteiros
                registro.addElement(new Long(rs.getLong(i)));
            } else {
                //tratamento para os tipos que serao lidos do banco de dados.
            }
        }
        return registro;
    }
    
    
    
     public void ExibeTabela(ResultSet rs, JTable tabela, JScrollPane scroller) throws SQLException {
        if (!rs.first()) {// Se nao houver registros, exibe uma mensagem e termina a execucao do metodo
            JOptionPane.showMessageDialog(null, "O ResultSet esta vazio.");
            return;
        }
        
        final Vector cabecalhos = new Vector();
        final Vector registros = new Vector();
        //comentario sobre a classe Vector

        try {
            // obtem titulos de coluna
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cabecalhos.addElement(rsmd.getColumnName(i));
            }
            // obtem dados da linha
            do {
                registros.addElement(ProximoRegistro(rs, rsmd));
            } while (rs.next());
            
            //if (tabela != null) {
            //    remove(tabela);
            //    remove(scroller);
            //}
            //tabela = new JTable(registros, cabecalhos);
            // exibe a tabela com conteudos de ResultSet
            ///scroller = new JScrollPane(tabela);
            //add(scroller);
            //scroller.setBounds(10, 330, 490, 180);
            //validate();
            //this.repaint();
        } catch (SQLException erro) {
            System.out.println("Erro Exibe Tabela = " + erro);
        }
    }
    
    
    public ResultSet retornaConsulta(){
        return rsdados;
    }
}
