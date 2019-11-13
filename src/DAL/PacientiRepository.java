

package DAL;

import EJB.Pacienti;
import java.util.List;



/**
 *
 * @author Dardan
 */
public class PacientiRepository extends EntMng implements PacientiInterface {
   @Override
    public void create(Pacienti p) throws MedException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Pacienti p) throws MedException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Pacienti p) throws MedException {
       try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new MedException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Pacienti> findAll() throws MedException {
        try {
            return em.createNamedQuery("Pacienti.findAll").getResultList();
        } catch (Exception e) {
            throw new MedException("Msg! \n" + e.getMessage());
        }
    }
    
    @Override
    public Pacienti findByID(Integer ID) throws MedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    
}
