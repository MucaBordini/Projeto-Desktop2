/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Jogo;
/**
 *
 * @author samue
 */
public class JogoRecursoController {
    
    public boolean criarJogo(ArrayList listaCriar) {
        boolean retorno = false;
        if (this.validarDados(listaCriar)) {
            
            Iterator iterator = listaCriar.iterator();
            
            Jogo novoJogo = new Jogo(
                    (String) iterator.next(),
                    (String) iterator.next(),
                    (String) iterator.next()
                    
            );
            System.out.println("NOME "+novoJogo.getNome());
            System.out.println("DEV "+novoJogo.getDesenvolvedora());
            System.out.println("GEN "+novoJogo.getGenero());
            retorno = novoJogo.insert();
        }
        return retorno;
    }
    
    public boolean editarJogo(ArrayList listaEditar) {

        boolean retorno = false;

        if (this.validarDados(listaEditar)) {
            Iterator iterator = listaEditar.iterator();
            Jogo alteracaoJogo = new Jogo(
                    (String) iterator.next(),
                    (String) iterator.next(),
                    (String) iterator.next()
            );
            System.out.println("Um : "+ alteracaoJogo.getNome());
            System.out.println("dois : "+ alteracaoJogo.getDesenvolvedora());
            System.out.println("tres : "+ alteracaoJogo.getGenero());
            retorno = alteracaoJogo.update();
        }
        return retorno;
    }
    
    private boolean validarDados(ArrayList<String> lista) {
        Iterator iterator = lista.iterator();
        String message = "Erros: \n\n";
        boolean valido = true;
        try {
            String nome = (String) iterator.next();
            if (nome.isEmpty()) {
                message += "O campo nome é obrigatório.\n";
                valido = false;
            }
            String dev = (String) iterator.next();
            if (dev.isEmpty()) {
                message += "O campo desenvolvedora é obrigatório.\n";
                valido = false;
            }
            String gen = (String) iterator.next();
            if (gen.isEmpty()) {
                message += "O campo genero é obrigatório.\n";
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
