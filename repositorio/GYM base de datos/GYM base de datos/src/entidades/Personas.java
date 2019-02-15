/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafae
 */
@Entity
@Table(name = "personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p")
    , @NamedQuery(name = "Personas.findByNumeroDocumento", query = "SELECT p FROM Personas p WHERE p.numeroDocumento = :numeroDocumento")
    , @NamedQuery(name = "Personas.findByTipoDocumento", query = "SELECT p FROM Personas p WHERE p.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Personas.findByNombrePersonas", query = "SELECT p FROM Personas p WHERE p.nombrePersonas = :nombrePersonas")
    , @NamedQuery(name = "Personas.findByApellidoPersonas", query = "SELECT p FROM Personas p WHERE p.apellidoPersonas = :apellidoPersonas")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero documento")
    private String numeroDocumento;
    @Basic(optional = false)
    @Column(name = "tipo documento")
    private String tipoDocumento;
    @Basic(optional = false)
    @Column(name = "nombre personas")
    private String nombrePersonas;
    @Basic(optional = false)
    @Column(name = "apellido personas")
    private String apellidoPersonas;

    public Personas() {
    }

    public Personas(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Personas(String numeroDocumento, String tipoDocumento, String nombrePersonas, String apellidoPersonas) {
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombrePersonas = nombrePersonas;
        this.apellidoPersonas = apellidoPersonas;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombrePersonas() {
        return nombrePersonas;
    }

    public void setNombrePersonas(String nombrePersonas) {
        this.nombrePersonas = nombrePersonas;
    }

    public String getApellidoPersonas() {
        return apellidoPersonas;
    }

    public void setApellidoPersonas(String apellidoPersonas) {
        this.apellidoPersonas = apellidoPersonas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.numeroDocumento == null && other.numeroDocumento != null) || (this.numeroDocumento != null && !this.numeroDocumento.equals(other.numeroDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Personas[ numeroDocumento=" + numeroDocumento + " ]";
    }
    
}
