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
    @ManyToOne
    @NotNull
    private int statusID;
    @ManyToOne
    @NotNull
    private int adressBil;
    @ManyToOne
    @NotNull
    private int adressDel;
    @ManyToOne
    @NotNull
    private int registredUserId;
    private int ipAdressRegistredUser;
    @OneToOne
    private int paymentId;

    public Order(int statusID, int adressBil, int adressDel, int registredUserId) {
        this.statusID = statusID;
        this.adressBil = adressBil;
        this.adressDel = adressDel;
        this.registredUserId = registredUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getAdressBil() {
        return adressBil;
    }

    public void setAdressBil(int adressBil) {
        this.adressBil = adressBil;
    }

    public int getAdressDel() {
        return adressDel;
    }

    public void setAdressDel(int adressDel) {
        this.adressDel = adressDel;
    }

    public int getRegistredUserId() {
        return registredUserId;
    }

    public void setRegistredUserId(int registredUserId) {
        this.registredUserId = registredUserId;
    }

    public int getIpAdressRegistredUser() {
        return ipAdressRegistredUser;
    }

    public void setIpAdressRegistredUser(int ipAdressRegistredUser) {
        this.ipAdressRegistredUser = ipAdressRegistredUser;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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
