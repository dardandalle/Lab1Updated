/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EJB;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dardan
 */
@Entity
@Table(name = "Doktori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktori.findAll", query = "SELECT d FROM Doktori d"),
    @NamedQuery(name = "Doktori.findByDID", query = "SELECT d FROM Doktori d WHERE d.dID = :dID"),
    @NamedQuery(name = "Doktori.findByDName", query = "SELECT d FROM Doktori d WHERE d.dName = :dName"),
    @NamedQuery(name = "Doktori.findByDLast", query = "SELECT d FROM Doktori d WHERE d.dLast = :dLast"),
    @NamedQuery(name = "Doktori.findByDVitiLindjes", query = "SELECT d FROM Doktori d WHERE d.dVitiLindjes = :dVitiLindjes"),
    @NamedQuery(name = "Doktori.findByDNumber", query = "SELECT d FROM Doktori d WHERE d.dNumber = :dNumber"),
    @NamedQuery(name = "Doktori.findByDRoli", query = "SELECT d FROM Doktori d WHERE d.dRoli = :dRoli")})
public class Doktori implements Serializable {
    @OneToMany(mappedBy = "did")
    private Collection<Terminet> terminetCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dID")
    private Integer dID;
    @Basic(optional = false)
    @Column(name = "dName")
    private String dName;
    @Basic(optional = false)
    @Column(name = "dLast")
    private String dLast;
    @Basic(optional = false)
    @Column(name = "dVitiLindjes")
    private String dVitiLindjes;
    @Basic(optional = false)
    @Column(name = "dNumber")
    private String dNumber;
    @Basic(optional = false)
    @Column(name = "dRoli")
    private String dRoli;

    public Doktori() {
    }

    public Doktori(Integer dID) {
        this.dID = dID;
    }

    public Doktori(Integer dID, String dName, String dLast, String dVitiLindjes, String dNumber, String dRoli) {
        this.dID = dID;
        this.dName = dName;
        this.dLast = dLast;
        this.dVitiLindjes = dVitiLindjes;
        this.dNumber = dNumber;
        this.dRoli = dRoli;
    }

    public Integer getDID() {
        return dID;
    }

    public void setDID(Integer dID) {
        this.dID = dID;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getDLast() {
        return dLast;
    }

    public void setDLast(String dLast) {
        this.dLast = dLast;
    }

    public String getDVitiLindjes() {
        return dVitiLindjes;
    }

    public void setDVitiLindjes(String dVitiLindjes) {
        this.dVitiLindjes = dVitiLindjes;
    }

    public String getDNumber() {
        return dNumber;
    }

    public void setDNumber(String dNumber) {
        this.dNumber = dNumber;
    }

    public String getDRoli() {
        return dRoli;
    }

    public void setDRoli(String dRoli) {
        this.dRoli = dRoli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dID != null ? dID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doktori)) {
            return false;
        }
        Doktori other = (Doktori) object;
        if ((this.dID == null && other.dID != null) || (this.dID != null && !this.dID.equals(other.dID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return dName + " " + dLast + " - " + dRoli;
    }

    @XmlTransient
    public Collection<Terminet> getTerminetCollection() {
        return terminetCollection;
    }

    public void setTerminetCollection(Collection<Terminet> terminetCollection) {
        this.terminetCollection = terminetCollection;
    }
    
}
