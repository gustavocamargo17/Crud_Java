/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author diasv
 */
@Entity
@Table(name = "jogos", catalog = "bdjava", schema = "")
@NamedQueries({
    @NamedQuery(name = "Jogos_1.findAll", query = "SELECT j FROM Jogos_1 j")
    , @NamedQuery(name = "Jogos_1.findByIdJogo", query = "SELECT j FROM Jogos_1 j WHERE j.idJogo = :idJogo")
    , @NamedQuery(name = "Jogos_1.findByNome", query = "SELECT j FROM Jogos_1 j WHERE j.nome = :nome")
    , @NamedQuery(name = "Jogos_1.findByGenero", query = "SELECT j FROM Jogos_1 j WHERE j.genero = :genero")
    , @NamedQuery(name = "Jogos_1.findByPreco", query = "SELECT j FROM Jogos_1 j WHERE j.preco = :preco")})
public class Jogos_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jogo")
    private Integer idJogo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "preco")
    private int preco;

    public Jogos_1() {
    }

    public Jogos_1(Integer idJogo) {
        this.idJogo = idJogo;
    }

    public Jogos_1(Integer idJogo, String nome, String genero, int preco) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public Integer getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Integer idJogo) {
        Integer oldIdJogo = this.idJogo;
        this.idJogo = idJogo;
        changeSupport.firePropertyChange("idJogo", oldIdJogo, idJogo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        String oldGenero = this.genero;
        this.genero = genero;
        changeSupport.firePropertyChange("genero", oldGenero, genero);
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        int oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJogo != null ? idJogo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jogos_1)) {
            return false;
        }
        Jogos_1 other = (Jogos_1) object;
        if ((this.idJogo == null && other.idJogo != null) || (this.idJogo != null && !this.idJogo.equals(other.idJogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "App.Jogos_1[ idJogo=" + idJogo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
