package entites;

import java.io.Serializable;
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
    
    @ManyToOne
    private Representation representation;
    
    
    
    private int number;
    private String seatMapUrl;
    
    public Seat() {
    }

    public Seat(Representation representation,  int number, String seatMapUrl) {
       
        this.representation = representation;
       
        this.number = number;
        this.seatMapUrl = seatMapUrl;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeatMapUrl() {
        return seatMapUrl;
    }

    public void setSeatMapUrl(String seatMapUrl) {
        this.seatMapUrl = seatMapUrl;
    }

   
    
  

    @Override
    public String toString() {
        return "entites.Seat[ id=" + id + " ]";
    }

}