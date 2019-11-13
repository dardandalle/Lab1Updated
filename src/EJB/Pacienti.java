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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dardan
 */
@Entity
@Table(name = "Pacienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacienti.findAll", query = "SELECT p FROM Pacienti p"),
    @NamedQuery(name = "Pacienti.findByPId", query = "SELECT p FROM Pacienti p WHERE p.pId = :pId"),
    @NamedQuery(name = "Pacienti.findByPName", query = "SELECT p FROM Pacienti p WHERE p.pName = :pName"),
    @NamedQuery(name = "Pacienti.findByPLast", query = "SELECT p FROM Pacienti p WHERE p.pLast = :pLast"),
    @NamedQuery(name = "Pacienti.findByPNumber", query = "SELECT p FROM Pacienti p WHERE p.pNumber = :pNumber")})
public class Pacienti implements Serializable {
    @OneToMany(mappedBy = "pId")
    private Collection<Terminet> terminetCollection;
    @Column(name = "pvL")
    private String pvL;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "pId")
    private Integer pId;
    @Column(name = "pName")
    private String pName;
    @Column(name = "pLast")
    private String pLast;
    @Column(name = "pNumber")
    private Integer pNumber;

    public Pacienti() {
    }

    public Pacienti(Integer pId) {
        this.pId = pId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPLast() {
        return pLast;
    }

    public void setPLast(String pLast) {
        this.pLast = pLast;
    }

    public Integer getPNumber() {
        return pNumber;
    }

    public void setPNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacienti)) {
            return false;
        }
        Pacienti other = (Pacienti) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Pacienti[ pId=" + pId + " ]";
    }

    public String getPvL() {
        return pvL;
    }

    public void setPvL(String pvL) {
        this.pvL = pvL;
    }

    @XmlTransient
    public Collection<Terminet> getTerminetCollection() {
        return terminetCollection;
    }

    public void setTerminetCollection(Collection<Terminet> terminetCollection) {
        this.terminetCollection = terminetCollection;
    }
    
}
