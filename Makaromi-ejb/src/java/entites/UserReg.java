/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author cdi310
 */
@Entity
@NamedQueries({})
public class UserReg implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String login;

    private String password;
    private String civillite;
    private String firstName;
    private String lastName;

   
    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address addFacturation;
    
    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address addLivraison;

    
    
    public UserReg() {
    }

    public UserReg(Address addLiv,Address addFact, String login, String password, String civillite, String firstName, String lastName) {
        this.addLivraison = addLiv;
        this.addFacturation= addFact;
        this.login = login;
        this.password = password;
        this.civillite = civillite;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCivillite() {
        return civillite;
    }

    public void setCivillite(String civillite) {
        this.civillite = civillite;
    }

    public Address getAddFacturation() {
        return addFacturation;
    }

    public void setAddFacturation(Address addFacturation) {
        this.addFacturation = addFacturation;
    }

    public Address getAddLivraison() {
        return addLivraison;
    }

    public void setAddLivraison(Address addLivraison) {
        this.addLivraison = addLivraison;
    }

}
