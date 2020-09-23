/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controle.AvaliacaoRecursoController;
import controle.JogoRecursoController;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samue
 */
public class testeC1 {
    ArrayList jogo = new ArrayList();
    ArrayList aval = new ArrayList();
    JogoRecursoController jogoCon = new JogoRecursoController();
    AvaliacaoRecursoController avalCon = new AvaliacaoRecursoController();
    public testeC1() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void testeDeleteJogo() {
        jogo.add("Teste2");
        jogo.add("Teste2");
        jogo.add("RPG");
        jogoCon.criarJogo(jogo);
        System.out.println("Verifique no banco, e pressione enter se registrou um jogo");
        
        aval.add(9.0);
        aval.add("Boa");
        aval.add("sam@mail");
        aval.add("Teste2");
        avalCon.criarAval(aval);
        System.out.println("Verifique no banco, e pressione enter se registrou uma avaliacao");
        
        jogoCon.excluirJogo("Teste");
        System.out.println("Verifique no banco, e pressione enter se deletou um jogo e sua avaliacao");
        
        assertEquals("teste","teste");
    }
    
}
