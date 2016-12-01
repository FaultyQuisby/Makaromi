/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi308
 */
@Stateless
public class ManageOrder implements ManageOrderLocal {

    @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;

}
