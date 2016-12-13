/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Address;
import entites.User;
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

    @Override
    public void createUser(String login, String password, String civillite, String firstName, String lastName,String addLivrue) {
        Address addLiv = new Address();
        Address addFact = new Address();
        addLiv.setStreet(addLivrue);
        addFact.setStreet(addLivrue);
        User user1 = new User(addLiv,addFact,login, password, civillite, firstName, lastName);
        em.persist(user1);

    }

    @Override
    public User ConnectUser(String login, String password) {
       
        User user1 = findBylogin(login);
        if (user1 != null) {
            if (user1.getPassword().equalsIgnoreCase(password)) {
                return user1;
            }
        }

        return null;
    }

    @Override
    public User findBylogin(String login) {
        User user1 = null;
        user1 = em.find(User.class, login);
        return user1;
    }

}
