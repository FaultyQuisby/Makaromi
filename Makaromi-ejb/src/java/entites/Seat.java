package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Representation representation;
    
    @ManyToOne
    private Category categorySeat;
    
    private String numberSeat;
    
    @ManyToOne
    private Status status;

    
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

    public Category getCategorySeat() {
        return categorySeat;
    }

    public void setCategorySeat(Category categorySeat) {
        this.categorySeat = categorySeat;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "entites.Seat[ id=" + id + " ]";
    }

    public void add(Seat se1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}