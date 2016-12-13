package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;


@Entity
public class Representation implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 
    private int maxCapacity;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rDate;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date rTime;
    
    @ManyToOne
    private Venue myvenue;
    
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Seat> messeat;
    
    @ManyToOne
    private Event event;
    
    
    public Representation() {
    }
   
    public Representation(Venue myvenue) {
        this.myvenue = myvenue;
    }

    public Representation( int maxCapacity, Date rDate) {
        
        this.maxCapacity = maxCapacity;
        this.rDate = rDate;
    }
    
    public Long getId() {
        return id;
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

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public Venue getMyvenue() {
        return myvenue;
    }

    public void setMyvenue(Venue myvenue) {
        this.myvenue = myvenue;
    }

    public Collection<Seat> getMesseat() {
        return messeat;
    }

    public void setMesseat(Collection<Seat> messeat) {
        this.messeat = messeat;
    }

    public void add(Representation r1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Object getVenue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getMyVenue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}