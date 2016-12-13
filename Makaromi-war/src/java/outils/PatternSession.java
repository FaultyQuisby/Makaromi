package outils;


import beans.ShoppingCartBeanLocal;
import entites.UserReg;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class PatternSession implements Serializable {
    
    
    private UserReg user;
    private boolean isconnect;
    private String ipClient;
    private int nbConnexion;
    private ShoppingCartBeanLocal shoppingCartBean;

    public PatternSession() {
    init();   
    shoppingCartBean = lookupShoppingCartBeanLocal();
    }
    private void init(){
        isconnect=false;
    }

    public String getIpClient() {
        return ipClient;
    }

    public void setIpClient(String ipClient) {
        this.ipClient = ipClient;
    }

    public int getNbConnexion() {
        return nbConnexion;
    }

    public void setNbConnexion(int nbConnexion) {
        this.nbConnexion = nbConnexion;
    }

    public UserReg getUser() {
        return user;
    }

    public void setUser(UserReg user) {
        this.user = user;
    }

    public ShoppingCartBeanLocal getShoppingCartBean() {
        return shoppingCartBean;
    }

//    public Collection<LigneCommande> getMaListe() {
//        return maListe;
//    }
//
//    public void setMaListe(Collection<LigneCommande> maListe) {
//        this.maListe = maListe;
//    }

    private ShoppingCartBeanLocal lookupShoppingCartBeanLocal() {
        try {
            Context c = new InitialContext();
            return (ShoppingCartBeanLocal) c.lookup("java:global/Makaromi/Makaromi-ejb/ShoppingCartBean!beans.ShoppingCartBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
   

    public boolean isIsconnect() {
        return isconnect;
    }

    public void setIsconnect(boolean isconnect) {
        this.isconnect = isconnect;
    }
}
