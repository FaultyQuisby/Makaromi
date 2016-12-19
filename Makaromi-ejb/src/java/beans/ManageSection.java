/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Event;
import entites.Section;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cdi310
 */
@Stateless
public class ManageSection implements ManageSectionLocal {
    @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;

    
    @Override
    public List mesRubriques(){
        String req031 = "select s from Section s";
        Query qr031 = em.createQuery(req031);
        List<Section> ls = qr031.getResultList();
       
        System.out.println("ls-------------------------------------->"+ls);
        return ls;
    }
    
    
    
  
}
