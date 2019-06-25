/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Avaliacao;
import modelo.Jogo;
import modelo.Usuario;

/**
 *
 * @author samue
 */
public class AvaliacaoRecursoController {
    
    public boolean criarAval(ArrayList listaCriar) {
        boolean retorno = false;
        if (this.validarDados(listaCriar)) {
            Iterator iterator = listaCriar.iterator();

            Avaliacao novaAval = new Avaliacao(
                    (double) iterator.next(),
                    (String) iterator.next(),
                    (Usuario) iterator.next(),
                    (Jogo) iterator.next()
            );
            retorno = novaAval.insert();
        }

        return retorno;
    }
    
    public boolean excluirAval(Usuario usuario, Jogo jogo) {
        if (usuario.getEmail().isEmpty() || jogo.getNome().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão.\n");
            return false;
        }
        System.out.println("NOME "+usuario.getEmail());
        System.out.println("JOGO "+jogo.getNome());
        
        Avaliacao excluiAval = new Avaliacao(usuario, jogo);
        return excluiAval.delete();
    }
    
    public boolean editarAval(ArrayList listaEditar) {

        boolean retorno = false;

        
            Iterator iterator = listaEditar.iterator();
            Avaliacao editaAval = new Avaliacao(
                    (double) iterator.next(),
                    (String) iterator.next(),
                    (Usuario) iterator.next(),
                    (Jogo) iterator.next()
            );
            retorno = editaAval.update();
        
        return retorno;
    }

    
    private boolean validarDados(ArrayList<String> lista) {
        Iterator iterator = lista.iterator();
        String message = "Erros: \n\n";
        boolean valido = true;
        try {
            double nota = (double) iterator.next();
            if (nota < 0 || nota > 10) {
                message += "O campo nota é obrigatório e deve ser entre 0 e 10.\n";
                valido = false;
            }
            String comentario = (String) iterator.next();
            if (comentario.isEmpty()) {
                message += "O campo comentario é obrigatório.\n";
                valido = false;
            }
            
        } catch (Exception error) {
            message += "\nConfira todos os campos!\n";
            valido = false;
        }

        if (!valido) {
            JOptionPane.showMessageDialog(null, message);
        }
        return valido;
    }
}
