/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Address;
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
    public void createUser(String civilite,String firstName, String lastName, String dateBirth, String emailUser, String login, String password,
        String street, String postalCode, String city) {
        Address adLiv = new Address(street, postalCode, city);
        Address adFac = new Address(street, postalCode, city);
        UserReg user1 = new UserReg(adLiv,adFac,civilite,firstName, lastName,dateBirth, emailUser, login, password);
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
