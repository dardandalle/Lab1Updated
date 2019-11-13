/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import EJB.Terminet;
import java.util.List;

/**
 *
 * @author Dardan
 */
public class TerminiRepository extends EntMng implements TerminiInterface {
    @Override
    public void create(Terminet p) throws MedException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Terminet p) throws MedException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Terminet p) throws MedException {
       try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Terminet> findAll() throws MedException {
        try {
            return em.createNamedQuery("Terminet.findAll").getResultList();
        } catch (Exception e) {
            throw new MedException("Msg! \n" + e.getMessage());
        }
    }
    
    @Override
    public Terminet findByID(Integer ID) throws MedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    
    
}
