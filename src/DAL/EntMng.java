
package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Dardan
 */
public class EntMng {
    EntityManager em=Persistence.createEntityManagerFactory("MedManagementPU").createEntityManager();
    
    
}
