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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numberTicket;
    @ManyToOne
    private int princingId;
    @ManyToOne
    private int orderId;
    private Float priceSell;
    private Float taxe;
    private String nameTicketHolder;
    private String firstNameTicketHolder;
    private String emailAdressTicketHolder;
    @OneToOne
    private int seatId;

    public Ticket(int princingId, int orderId, Float priceSell, String nameTicketHolder, String firstNameTicketHolder, String emailAdressTicketHolder, int seatId) {
        this.princingId = princingId;
        this.orderId = orderId;
        this.priceSell = priceSell;
        this.nameTicketHolder = nameTicketHolder;
        this.firstNameTicketHolder = firstNameTicketHolder;
        this.emailAdressTicketHolder = emailAdressTicketHolder;
        this.seatId = seatId;
    }

    public Long getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(Long numberTicket) {
        this.numberTicket = numberTicket;
    }

    public int getPrincingId() {
        return princingId;
    }

    public void setPrincingId(int princingId) {
        this.princingId = princingId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Float getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Float priceSell) {
        this.priceSell = priceSell;
    }

    public Float getTaxe() {
        return taxe;
    }

    public void setTaxe(Float taxe) {
        this.taxe = taxe;
    }

    public String getNameTicketHolder() {
        return nameTicketHolder;
    }

    public void setNameTicketHolder(String nameTicketHolder) {
        this.nameTicketHolder = nameTicketHolder;
    }

    public String getFirstNameTicketHolder() {
        return firstNameTicketHolder;
    }

    public void setFirstNameTicketHolder(String firstNameTicketHolder) {
        this.firstNameTicketHolder = firstNameTicketHolder;
    }

    public String getEmailAdressTicketHolder() {
        return emailAdressTicketHolder;
    }

    public void setEmailAdressTicketHolder(String emailAdressTicketHolder) {
        this.emailAdressTicketHolder = emailAdressTicketHolder;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numberTicket != null ? numberTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.numberTicket == null && other.numberTicket != null) || (this.numberTicket != null && !this.numberTicket.equals(other.numberTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.TicketBean[ numberTicket=" + numberTicket + " ]";
    }
    
}
