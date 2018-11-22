/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author diasv
 */
public class Jogos {
    private int idJogo;
    private String nomeJogo;
    private String genero;
    private float preco;

    /**
     * @return the idJogo
     */
    public int getIdJogo() {
        return idJogo;
    }

    /**
     * @param idJogo the idJogo to set
     */
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    /**
     * @return the nomeJogo
     */
    public String getNomeJogo() {
        return nomeJogo;
    }

    /**
     * @param nomeJogo the nomeJogo to set
     */
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
