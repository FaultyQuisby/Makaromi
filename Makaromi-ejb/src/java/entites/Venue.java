package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    private String urlImg;
    
    @OneToMany(mappedBy = "myvenue")
    private Collection<Representation> representationsve;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address myadd;
    
    
    public Venue() {
        representationsve =new ArrayList();
    }

    public Venue(String name, String type, String urlImg) {
        this();
        this.name = name;
        this.type = type;
        this.urlImg = urlImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Venue{" + "name=" + name + '}';
    }

    

   

   

}