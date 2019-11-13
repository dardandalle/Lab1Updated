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
public interface DoktoriInterface {
    
    void create(Doktori d) throws MedException;
    void edit(Doktori d) throws MedException;
    void delete(Doktori d) throws MedException;
    List<Doktori> findAll() throws MedException;
    Doktori findByID(Integer ID) throws MedException;
    
}
    

