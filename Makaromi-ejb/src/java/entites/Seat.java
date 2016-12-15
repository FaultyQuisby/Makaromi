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
public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Representation representation;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Ticket myTicket;
            
    private String number;
    private String categorie;
   
    public Seat() {
    }

    public Seat(Representation representation,  String number) {
       
        this.representation = representation;
        this.number = number;   
    }
    
    public Long getId() {
        return id;
    }

   

    public Representation getRepresentation() {
        return representation;
    }

    public void setRepresentation(Representation representation) {
        this.representation = representation;
    }

    public Ticket getMyTicket() {
        return myTicket;
    }

    public void setMyTicket(Ticket myTicket) {
        this.myTicket = myTicket;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Seat{" + "representation=" + representation + ", myTicket=" + myTicket + ", number=" + number + ", categorie=" + categorie + '}';
    }

   

   
   
    
  

   

}