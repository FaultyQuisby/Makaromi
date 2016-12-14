package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int numberTicket;
    
    @ManyToOne
    private Pricing pricing;
    
    @OneToOne
    private Seat seat;
    
    private int sellPrice;
    private float price;
    private Float tax;
    private String ticketHolderLastName;
    private String ticketHolderFirstName;
    private String ticketHolderMail;
    
    //@ManyToOne
    //private Orders order;

    public Ticket() {
    }

    public Ticket(int numberTicket, int sellPrice, Float tax, String ticketHolderLastName, String ticketHolderFirstName, String ticketHolderMail) {
        this.numberTicket = numberTicket;
        this.pricing = pricing;
        this.seat = seat;
        this.sellPrice = sellPrice;
        this.tax = tax;
        this.ticketHolderLastName = ticketHolderLastName;
        this.ticketHolderFirstName = ticketHolderFirstName;
        this.ticketHolderMail = ticketHolderMail;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
//    public int getSellPrice() {
//        this.processSellPrice();
//        return sellPrice;
//    }

//    public void processSellPrice() {
//        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.FRENCH);
//        otherSymbols.setDecimalSeparator('.');
//        otherSymbols.setGroupingSeparator(',');
//        DecimalFormat df = new DecimalFormat("0.00", otherSymbols);
//        df.setRoundingMode(RoundingMode.HALF_UP);
//        float tempPrice = this.getPrice();
//        
//        if(!(this.getPricing() == null)){
//            switch(this.getPricing().getName()) {
//                case "A" :
//                    tempPrice += ((30 / 100) * tempPrice) + (this.getTax() * tempPrice);
//                    break;
//                case "B":
//                    tempPrice += ((20 / 100) * tempPrice) + (this.getTax() * tempPrice);
//                    break;
//                case "C" :
//                    tempPrice += ((10 / 100) * tempPrice) + (this.getTax() * tempPrice);
//                    break;
//                default:
//                    break;
//            }
//        }
//        
//        this.sellPrice = df.format(tempPrice);
//    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
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
    
//    public Orders getOrders() {
//        return order;
//    }
//    
//    public void setOrders(Orders order) {
//        this.order = order;
//    }
    
    
    

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (numberTicket != null ? numberTicket.hashCode() : 0);
//        return hash;
//    }

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Ticket)) {
//            return false;
//        }
//        Ticket other = (Ticket) object;
//        return !((this.numberTicket == null && other.numberTicket != null) || (this.numberTicket != null && !this.numberTicket.equals(other.numberTicket)));
//    }

    @Override
    public String toString() {
        return "beans.TicketBean[ numberTicket=" + numberTicket + " ]";
    }
    
}
