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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @Id
    private String name;
   
    @ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Section section;
    
    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection <Artist> artists;
    
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection <Representation> representationsev;
    
    private String imgURL;
    private float price;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
    private String synopsis;
    private String comment;

    public Event() {
        this.artists = new ArrayList();
        this.representationsev = new ArrayList();
    }

    public Event(Section section, String name) {
        this.representationsev = new ArrayList();
        this.artists = new ArrayList();
        this.section = section;
        this.name = name;
    }
    
 
    public Event( ArrayList<Representation> representations, Section section, String name, String imgURL, float price, Date startDate, Date endDate, String synopsis, String comment) {
        this.representationsev = new ArrayList();
        this.artists = new ArrayList();
        this.section = section;
        this.name = name;
        this.imgURL = imgURL;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.synopsis = synopsis;
        this.comment = comment;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

  
    public Collection <Artist> getArtists() {
        return artists;
    }

    public void setArtists(Collection <Artist> artists) {
        this.artists = artists;
    }

    public Collection <Representation> getRepresentationsev() {
        return representationsev;
    }

    public void setRepresentationsev(Collection <Representation> representationsev) {
        this.representationsev = representationsev;
    }

   
    
   
   

   

}