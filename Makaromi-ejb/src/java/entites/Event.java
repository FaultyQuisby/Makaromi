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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
    private String synopsis;
    private String comment;
    
  
    

    public Event() {
    }
    
    
    public Event(String name, String imgURL, Date startDate, Date endDate, String synopsis, String comment) {
        this();
        this.name = name;
        this.imgURL = imgURL;
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

    public void add(Event e1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(Event e1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
   

   

}