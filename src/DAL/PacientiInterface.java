/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import EJB.Pacienti;
import java.util.List;

/**
 *
 * @author Dardan
 */
public interface PacientiInterface {
    void create(Pacienti p) throws MedException;
    void edit(Pacienti p) throws MedException;
    void delete(Pacienti p) throws MedException;
    List<Pacienti> findAll() throws MedException;
    Pacienti findByID(Integer ID) throws MedException;
    
}

