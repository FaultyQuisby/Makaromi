package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@NamedQuery(name="queryMAJTicketsOrder", query="update Ticket t set t.orders = :paramOrder")
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    private Status status;

    @NotNull
    @ManyToOne
    private Address addressBil;

    @NotNull
    @ManyToOne
    private Address addressDel;

    @NotNull
    @ManyToOne
    private UserReg user;
    
    private String ipAddressRegistredUser;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Payment payment;

    @OneToMany(mappedBy="orders")
    private Collection<Ticket> ticketsOrder;
    
    public Orders() {
    }
    
     public Orders(Status status, Address addressBil, Address addressDel,
                 UserReg user, String ipAddressRegistredUser, Payment payment,
                 Collection<Ticket> ticketsOrder) {
        this();
        this.status = status;
        this.addressBil = addressBil;
        this.addressDel = addressDel;
        this.user = user;
        this.ipAddressRegistredUser = ipAddressRegistredUser;
        this.payment = payment;
        this.ticketsOrder = ticketsOrder;
    }        

    public Orders(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Object getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void add(Orders o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Address getAddressBil() {
        return addressBil;
    }
    public void setAddressBil(Address addressBil) {
        this.addressBil = addressBil;
    }
    public Address getAddressDel() {
        return addressDel;
    }
    public void setAddressDel(Address addressDel) {
        this.addressDel = addressDel;
    }
    public Object getTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public UserReg getUser() {
        return (UserReg) user;
    }
    public void setUser(UserReg user) {
        this.user = user;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Collection<Ticket> getTicketsOrder() {
        return ticketsOrder;
    }
    public void setTicketsOrder(Collection<Ticket> ticketsOrder) {
        this.ticketsOrder = ticketsOrder;
    }
    public Object getUserReg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "beans.orderBean[ id=" + id + " ]";
    }
}
