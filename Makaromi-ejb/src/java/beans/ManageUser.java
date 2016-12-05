/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Address;
import entites.UserReg;
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
public class ManageUser implements ManageUserLocal {

    @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;

    public void createUser(String login, String password, String civillite, String firstName, String lastName,String addLivrue) {
        Address addLiv = new Address();
        Address addFact = new Address();
        addLiv.setStreet(addLivrue);
        addFact.setStreet(addLivrue);
        UserReg user1 = new UserReg(addLiv,addFact,login, password, civillite, firstName, lastName);
        em.persist(user1);

    }

    @Override
    public UserReg ConnectUser(String login, String password) {
       
        UserReg user1 = findBylogin(login);
        if (user1 != null) {
            if (user1.getPassword().equalsIgnoreCase(password)) {
                return user1;
            }
        }

        return null;
    }

    @Override
    public UserReg findBylogin(String login) {
        UserReg user1 = null;
        user1 = em.find(UserReg.class, login);
        return user1;
    }

}
