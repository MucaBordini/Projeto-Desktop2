/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author samue
 */
public class Jogo {
    private int jId;
    private String jNome;

    public int getjId() {
        return jId;
    }

    public String getjNome() {
        return jNome;
    }

    public String getjProdutora() {
        return jProdutora;
    }

    public String getjPublisher() {
        return jPublisher;
    }

    public String getjDataLancamento() {
        return jDataLancamento;
    }

    public String getjGenero() {
        return jGenero;
    }

    public void setjId(int jId) {
        this.jId = jId;
    }

    public void setjNome(String jNome) {
        this.jNome = jNome;
    }

    public void setjProdutora(String jProdutora) {
        this.jProdutora = jProdutora;
    }

    public void setjPublisher(String jPublisher) {
        this.jPublisher = jPublisher;
    }

    public void setjDataLancamento(String jDataLancamento) {
        this.jDataLancamento = jDataLancamento;
    }

    public void setjGenero(String jGenero) {
        this.jGenero = jGenero;
    }
    private String jProdutora;
    private String jPublisher;
    private String jDataLancamento;
    private String jGenero;
}
