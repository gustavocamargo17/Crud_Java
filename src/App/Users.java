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
 * @author internet
 */
@Entity
@Table(name = "users", catalog = "bdjava", schema = "")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUsuario", query = "SELECT u FROM Users u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "Users.findBySenha", query = "SELECT u FROM Users u WHERE u.senha = :senha")
    , @NamedQuery(name = "Users.findByHierarquia", query = "SELECT u FROM Users u WHERE u.hierarquia = :hierarquia")
    , @NamedQuery(name = "Users.findByNome", query = "SELECT u FROM Users u WHERE u.nome = :nome")
    , @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")
    , @NamedQuery(name = "Users.findByIdFunc", query = "SELECT u FROM Users u WHERE u.idFunc = :idFunc")})
public class Users implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "hierarquia")
    private String hierarquia;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFunc")
    private Integer idFunc;

    public Users() {
    }

    public Users(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public Users(Integer idFunc, String usuario, String senha, String hierarquia, String nome, String email) {
        this.idFunc = idFunc;
        this.usuario = usuario;
        this.senha = senha;
        this.hierarquia = hierarquia;
        this.nome = nome;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        String oldHierarquia = this.hierarquia;
        this.hierarquia = hierarquia;
        changeSupport.firePropertyChange("hierarquia", oldHierarquia, hierarquia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        Integer oldIdFunc = this.idFunc;
        this.idFunc = idFunc;
        changeSupport.firePropertyChange("idFunc", oldIdFunc, idFunc);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunc != null ? idFunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.idFunc == null && other.idFunc != null) || (this.idFunc != null && !this.idFunc.equals(other.idFunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "App.Users[ idFunc=" + idFunc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
