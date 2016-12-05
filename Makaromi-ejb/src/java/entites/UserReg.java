/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author cdi310
 */
@Entity
public class UserReg implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    @Id
    private String login;
    
    private String password;
    private String civillite;
    private String firstName;
    private String lastName;
    
    

    public UserReg() {
    }

    public UserReg(String login, String password,String civillite,String firstName,String lastName) {
        this.login = login;
        this.password = password;
        this.civillite=civillite;
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
    
}
