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
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Venue myvenue;
    
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Seat> messeat;
    
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Pricing> tarifs;
     
    private Float tax;
    
    
    public Representation() {
        this.messeat= new ArrayList();
        this.tarifs = new ArrayList();
    }
   
    public Representation(Venue myvenue) {
        this.messeat= new ArrayList();
        tarifs = new ArrayList();
        this.myvenue = myvenue;
    }

    public Representation( int maxCapacity, Date rDate, Date rTime) {
        this.messeat= new ArrayList();
        tarifs = new ArrayList();
        this.maxCapacity = maxCapacity;
        this.rDate = rDate;
        this.rTime = rTime;
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

    public Collection<Pricing> getTarifs() {
        return tarifs;
    }

    public void setTarifs(Collection<Pricing> Tarifs) {
        this.tarifs = Tarifs;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

}