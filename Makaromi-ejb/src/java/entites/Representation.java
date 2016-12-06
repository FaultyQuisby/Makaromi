package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


@Entity
public class Representation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy ="representation")
    private ArrayList<Seat> seats;
    
   
    
    private int maxCapacity;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rDate;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date rTime;

    public Representation() {
    }

    public Representation(ArrayList<Seat> seats, int maxCapacity, Date rDate, Date rTime) {
     
        this.seats = seats;
       
        this.maxCapacity = maxCapacity;
        this.rDate = rDate;
        this.rTime = rTime;
    }
    
    public Long getId() {
        return id;
    }

 

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Date getDate() {
        return rDate;
    }

    public void setDate(Date rDate) {
        this.rDate = rDate;
    }

    public Date getTime() {
        return rTime;
    }

    public void setTime(Date rTime) {
        this.rTime = rTime;
    }

   
    
  

    @Override
    public String toString() {
        return "entites.Representation[ id=" + id + " ]";
    }

}