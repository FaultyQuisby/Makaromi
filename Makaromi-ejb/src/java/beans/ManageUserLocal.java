/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.UserReg;
import javax.ejb.Local;

/**
 *
 * @author cdi310
 */
@Local
public interface ManageUserLocal {

    

    public UserReg ConnectUser(String login, String password);

    public UserReg findBylogin(String login);

    public void createUser(String login, String password, String civillite, String firstName, String lastName, String addLivrue);
    
}
