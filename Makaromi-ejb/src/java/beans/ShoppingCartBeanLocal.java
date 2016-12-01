/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;

/**
 *
 * @author cdi306
 */
@Local
public interface ShoppingCartBeanLocal {
    public void initialize(String person, String id)
    public void addBook(String title);
    public List<String> getContents();
    public void remove();
}
