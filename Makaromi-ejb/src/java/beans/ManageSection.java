/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Event;
import entites.Representation;
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
    
    @Override
    public List mesEventparRubrique(String rubrique,int page){
        
        
        String req04 = "select e from Event e"
                + " where e.section.name = :paramRubrique";
        Query qr04 = em.createQuery(req04);
        qr04.setParameter("paramRubrique", rubrique);
        qr04.setFirstResult((page-1)*3+0);
        qr04.setMaxResults ((page-1)*3+3);
        List<Event> le = qr04.getResultList();
        System.out.println("le------------------------------------>"+le);
        return le;
    }
    
    @Override
    public int nbpageEvent(String rubrique){
        String req04 = "select e from Event e"
                + " where e.section.name = :paramRubrique";
        Query qr04 = em.createQuery(req04);
        qr04.setParameter("paramRubrique", rubrique);
        List<Event> le = qr04.getResultList();
        int nb = le.size()/3;  
        if (le.size()%3 > 0){
            nb=nb+1;
        }
        System.out.println("max result page = "+nb+" maxsize "+le.size());
        return nb;
    }
    
    @Override
    public Event eventByName (String event){
        String req05 = "select e from Event e "
                + "where e.name = :paramEvent";
        Query qr05 = em.createQuery(req05);
        qr05.setParameter("paramEvent", event);
        Event myevent = (Event)qr05.getSingleResult();        
        return myevent;
    }
     
    @Override
    public List mesRepresentationByEvent(String event){
        String req055 = "select e.representationsev from Event e where e.name = :paramEvent";
        Query qr055 = em.createQuery(req055);
        qr055.setParameter("paramEvent", event);
        List<Section> ls = qr055.getResultList();
        return ls;
    }
    
    @Override
    public Representation representationById (int idRep){
        String req05 = "select r from Representation r "
                + "where r.id = :paramrep";
        Query qr05 = em.createQuery(req05);
        qr05.setParameter("paramrep", idRep);
        Representation myRep = (Representation)qr05.getSingleResult();        
        return myRep;
    }
  
}
