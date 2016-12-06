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
    
    @OneToMany(mappedBy = "myvenue")
    private Collection<Representation> representationsve;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Address myadd;
    
    
    public Venue() {
        representationsve =new ArrayList();
    }

    public Venue(String name) {
        representationsve = new ArrayList();
        this.name = name;
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