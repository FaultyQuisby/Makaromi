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
import javax.persistence.OneToOne;

/**
 *
 * @author cdi308
 */
@Entity
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberTicket;
    
 
    private Float sellPrice;
    private String ticketHolderLastName;
    private String ticketHolderFirstName;
    private String ticketHolderMail;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Seat mySeat;
            
    public Ticket() {
    }

    public Ticket(Pricing pricing, Float sellPrice, String ticketHolderLastName, String ticketHolderFirstName, String ticketHolderMail) {
        this.sellPrice = sellPrice;
        this.ticketHolderLastName = ticketHolderLastName;
        this.ticketHolderFirstName = ticketHolderFirstName;
        this.ticketHolderMail = ticketHolderMail;
    }

    public Long getNumberTicket() {
        return numberTicket;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getTicketHolderLastName() {
        return ticketHolderLastName;
    }

    public void setTicketHolderLastName(String ticketHolderLastName) {
        this.ticketHolderLastName = ticketHolderLastName;
    }

    public String getTicketHolderFirstName() {
        return ticketHolderFirstName;
    }

    public void setTicketHolderFirstName(String ticketHolderFirstName) {
        this.ticketHolderFirstName = ticketHolderFirstName;
    }

    public String getTicketHolderMail() {
        return ticketHolderMail;
    }

    public void setTicketHolderMail(String ticketHolderMail) {
        this.ticketHolderMail = ticketHolderMail;
    }
    
    
    
    

  
}
