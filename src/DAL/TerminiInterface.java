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
public interface TerminiInterface {
    void create(Terminet t) throws MedException;
    void edit(Terminet t) throws MedException;
    void delete(Terminet t) throws MedException;
    List<Terminet> findAll() throws MedException;
    Terminet findByID(Integer ID) throws MedException;
    
}
