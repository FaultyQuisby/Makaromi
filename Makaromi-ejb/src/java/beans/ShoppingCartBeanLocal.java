/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Ticket;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cdi306
 */
@Local
public interface ShoppingCartBeanLocal {

    public void initialize();

    public void initialize(List<Ticket> content);

    public void addTicket(Ticket t);

    public void removeTicket(Ticket t) throws Exception;

    public Collection<Ticket> getContent();

    public String getCartPrice();

    public void remove();
    
}
