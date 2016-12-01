package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;


@Entity
public class Representation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "representation")
    private ArrayList<Seat> seats;
    
    @OneToOne
    private Venue venue;
    
    private int maxCapacity;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rDate;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date rTime;

    public Representation() {
    }

    public Representation(Long id, ArrayList<Seat> seats, Venue venue, int maxCapacity, Date rDate, Date rTime) {
        this.id = id;
        this.seats = seats;
        this.venue = venue;
        this.maxCapacity = maxCapacity;
        this.rDate = rDate;
        this.rTime = rTime;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representation)) {
            return false;
        }
        Representation other = (Representation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Representation[ id=" + id + " ]";
    }

}