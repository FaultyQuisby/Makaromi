/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
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
    private String firstName;
    private String lastName;
    private String dateBirth;
    private String emailUser;
    private String commentUser;
    
   
    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address addFacturation;
    
    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address addLivraison;

    
    
    public UserReg() {
    }

    public UserReg(String firstName, String lastName, String dateBrith, String emailUser,  String commentUser, String login, String password) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.emailUser = emailUser;
        this.commentUser = commentUser;
        this.login = login;
        this.password = password;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser;
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
 public void add(Ticket t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(UserReg u1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



      

}
