/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author cdi306
 */
@Stateful
public class ShoppingCartBean implements ShoppingCartBeanLocal {

    String customerName;
    String customerId;
    List<String> contents;

//    public void initialize(String person) throws TicketException {
//        if (person == null) {
//            throw new TicketException("Null person not allowed.");
//        } else {
//            customerName = person;
//        }
//
//        customerId = "0";
//        contents = new ArrayList<String>();
//    }

//    public void initialize(String person, String id)
//                 throws TicketException {
//        if (person == null) {
//            throw new TicketException("Null person not allowed.");
//        } else {
//
//            customerName = person;
//        }
//
//        IdVerifier idChecker = new IdVerifier();
//
//        if (idChecker.validate(id)) {
//            customerId = id;
//        } else {
//            throw new TicketException("Invalid id: " + id);
//        }
//
//        contents = new ArrayList<String>();
//    }

    public void addTicket(String title) {
        contents.add(title);
    }

//    public void removeTicket(String title) throws TicketException {
//        boolean result = contents.remove(title);
//        if (result == false) {
//            throw new TicketException(title + " not in cart.");
//        }
//    }

    public List<String> getContents() {
        return contents;
    }

    @Remove
    public void remove() {
        contents = null;
    }

//    @Override
//    public void addBook(String title) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void removeBook(String title) /*throws TicketException*/ {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
