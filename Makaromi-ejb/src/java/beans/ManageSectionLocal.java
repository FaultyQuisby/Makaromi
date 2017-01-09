/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Event;
import entites.Representation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cdi310
 */
@Local
public interface ManageSectionLocal {

    public List mesRubriques();

   

    public List mesEventparRubrique(String rubrique, int page);

    public int nbpageEvent(String rubrique);

    public Event eventByName(String event);

    

    public List mesRepresentationByEvent(String event);

    public Representation representationById(int idRep);
}
