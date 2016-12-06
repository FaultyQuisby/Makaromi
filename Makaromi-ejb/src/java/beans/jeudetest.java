/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Artist;
import entites.Event;
import entites.Representation;
import entites.Section;
import entites.Venue;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi310
 */
@Stateless
public class jeudetest implements jeudetestLocal {
 
 @PersistenceContext(unitName = "Makaromi-ejbPU")
 private EntityManager em;
  
 
 @Override
   public void createbd(){
      //////////////////////////////////////////section
       Section s1 = new Section("sport");
       Section s2 = new Section("theatre");
       Section s3 = new Section("cinema");
       //////////////////////////////////////////acteur
       
       Artist a1 = new Artist("karim","riahi");
       Artist a2 = new Artist("robert","deniro");
       Artist a3 = new Artist("Stephen","spilberg");
      ///////////////////////////////////////////evenement
       Event e1 = new Event();
       Event e2 = new Event ();
       Event e3 = new Event ();
         ///////////////////////////////////////////////venue
       Venue v1 = new Venue("odeon");
       Venue v2 = new Venue("velodrom");
       Venue v3 = new Venue("grandrex");
       
     ///////////////////////////////////////////representation
       Representation R1= new Representation(v1);
       Representation R2= new Representation(v2);
       Representation R3= new Representation(v3);
       Representation R4= new Representation(v1);
      
       
     ////////////////////////////////////////////////creation  
       e1.getRepresentationsev().add(R1);
       e1.getRepresentationsev().add(R2);
       e1.getRepresentationsev().add(R3);
       e1.getRepresentationsev().add(R4);
       
       
       
       
       e1.getArtists().add(a3);
       e2.getArtists().add(a2);
       e3.getArtists().add(a1);
       
       e3.setSection(s3);
       e2.setSection(s2);
       e1.setSection(s1);
       
       e3.setName("rambo");
       e2.setName("miserable");
       e1.setName("coupeeurope");
       
       
       
       em.persist(e1);
       em.persist(e2);
       em.persist(e3);
      
      
     
   }
}
