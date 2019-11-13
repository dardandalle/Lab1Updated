/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import EJB.Doktori;
import java.util.List;

/**
 *
 * @author Dardan
 */

    public class DoktoriRepository extends EntMng implements DoktoriInterface {
   @Override
    public void create(Doktori d) throws MedException {
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Doktori p) throws MedException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Doktori d) throws MedException {
       try {
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Doktori> findAll() throws MedException {
        try {
            return em.createNamedQuery("Doktori.findAll").getResultList();
        } catch (Exception e) {
            throw new MedException("Msg! \n" + e.getMessage());
        }
    }
    
    @Override
    public Doktori findByID(Integer ID) throws MedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    
}
    

