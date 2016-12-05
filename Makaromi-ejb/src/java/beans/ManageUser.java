/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.UserReg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi310
 */
@Stateless
public class ManageUser implements ManageUserLocal {
 @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;
 
 @Override
    public void createUser(String login, String password,String civillite,String firstName,String lastName){
       UserReg user1= new UserReg(login,password,civillite,firstName,lastName);
       em.persist(user1);
       
   }
}
