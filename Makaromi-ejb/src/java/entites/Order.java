/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author cdi308
 */
@Entity
public class Order implements Serializable {
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
    private User user;
    private int ipAddressRegistredUser;
    @OneToOne
    private Payment payment;

    public Order(Status status, Address addressBil, Address addressDel, User registredUser) {
        this.status = status;
        this.addressBil = addressBil;
        this.addressDel = addressDel;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIpAddressRegistredUser() {
        return ipAddressRegistredUser;
    }

    public void setIpAddressRegistredUser(int ipAddressRegistredUser) {
        this.ipAddressRegistredUser = ipAddressRegistredUser;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
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
