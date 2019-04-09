/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author samue
 */
public class ArquivoTexto {
    
    /**
     *
     * @throws IOException
     */
    public void criaArquivo() throws IOException{
        File diretorio = new File("c:\\AvaliacaoJogos");
        diretorio.mkdir();
        File arquivoUsu = new File(diretorio, "Usuarios.txt");
        File arquivoJogo = new File(diretorio, "Jogos.txt");
        File arquivoAval = new File(diretorio, "Avaliacoes.txt");
        if (!arquivoUsu.exists()) {
            arquivoUsu.createNewFile();
        }
        if (!arquivoJogo.exists()) {
            arquivoJogo.createNewFile();
        }
        if (!arquivoAval.exists()) {
            arquivoAval.createNewFile();
        }
    }
    
}
