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
    
    
    
    private String numberSeat;

    
    public Seat() {
    }

    public Seat(String numberSeat) {       
        this.numberSeat = numberSeat;
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

    public String getNumberSeat() {
        return numberSeat;
    }

    public void setNumber(String numberSeat) {
        this.numberSeat = numberSeat;
    }

   

   
    
  

    @Override
    public String toString() {
        return "entites.Seat[ id=" + id + " ]";
    }

}