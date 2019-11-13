/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EJB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dardan
 */
@Entity
@Table(name = "Terminet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terminet.findAll", query = "SELECT t FROM Terminet t"),
    @NamedQuery(name = "Terminet.findByTId", query = "SELECT t FROM Terminet t WHERE t.tId = :tId"),
    @NamedQuery(name = "Terminet.findByTKoha", query = "SELECT t FROM Terminet t WHERE t.tKoha = :tKoha"),
    @NamedQuery(name = "Terminet.findByTData", query = "SELECT t FROM Terminet t WHERE t.tData = :tData"),
    @NamedQuery(name = "Terminet.findByTDhoma", query = "SELECT t FROM Terminet t WHERE t.tDhoma = :tDhoma")})
public class Terminet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
     @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "tId")
    private Integer tId;
    @Basic(optional = false)
    @Column(name = "tKoha")
    private String tKoha;
    @Basic(optional = false)
    @Column(name = "tData")
    private String tData;
    @Basic(optional = false)
    @Column(name = "tDhoma")
    private String tDhoma;
    @JoinColumn(name = "dID", referencedColumnName = "dID")
    @ManyToOne
    private Doktori did;
    @JoinColumn(name = "pId", referencedColumnName = "pId")
    @ManyToOne
    private Pacienti pId;

    public Terminet() {
    }

    public Terminet(Integer tId) {
        this.tId = tId;
    }

    public Terminet(Integer tId, String tKoha, String tData, String tDhoma) {
        this.tId = tId;
        this.tKoha = tKoha;
        this.tData = tData;
        this.tDhoma = tDhoma;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public String getTKoha() {
        return tKoha;
    }

    public void setTKoha(String tKoha) {
        this.tKoha = tKoha;
    }

    public String getTData() {
        return tData;
    }

    public void setTData(String tData) {
        this.tData = tData;
    }

    public String getTDhoma() {
        return tDhoma;
    }

    public void setTDhoma(String tDhoma) {
        this.tDhoma = tDhoma;
    }

    public Doktori getDid() {
        return did;
    }

    public void setDid(Doktori did) {
        this.did = did;
    }

    public Pacienti getPId() {
        return pId;
    }

    public void setPId(Pacienti pId) {
        this.pId = pId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terminet)) {
            return false;
        }
        Terminet other = (Terminet) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Terminet[ tId=" + tId + " ]";
    }
    
}
