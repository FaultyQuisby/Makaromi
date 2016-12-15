package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Venue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String name;
    private String type;
    
    @OneToMany(mappedBy = "myvenue")
    private Collection<Representation> representationsve;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address myadd;
    
    private String seatMapUrl;//plan des places
    
    
    
    public Venue() {
        representationsve = new ArrayList();
    }

    public Venue(String name, String type, String urlImg) {
        this();
        this.name = name;
        this.type = type;
        this.urlImg = urlImg;
    }

    public Venue(String name,String type, String MapUrl, Address myadd) {
        representationsve = new ArrayList();
        this.seatMapUrl = MapUrl;
        this.name = name;
        this.myadd = myadd;
        this.type= type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public Collection<Representation> getRepresentationsve() {
        return representationsve;
    }

    public void setRepresentationsve(Collection<Representation> representationsve) {
        this.representationsve = representationsve;
    }

    public Address getMyadd() {
        return myadd;
    }

    public void setMyadd(Address myadd) {
        this.myadd = myadd;
    }

    public String getSeatMapUrl() {
        return seatMapUrl;
    }

    public void setSeatMapUrl(String seatMapUrl) {
        this.seatMapUrl = seatMapUrl;
    }

    public void setRepresentationsve(Collection<Representation> representationsve) {
        this.representationsve = representationsve;
    }

    public Address getMyadd() {
        return myadd;
    }

    public void setMyadd(Address myadd) {
        this.myadd = myadd;
    }

    public void add(Venue v1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}