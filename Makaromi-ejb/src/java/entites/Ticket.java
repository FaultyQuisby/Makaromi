package entites;

import java.io.Serializable;
import javax.persistence.CascadeType;
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

    public int getNumberTicket() {
        return numberTicket;
    }

    public Float getSellPrice() {
        return sellPrice;
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
    
    
}
