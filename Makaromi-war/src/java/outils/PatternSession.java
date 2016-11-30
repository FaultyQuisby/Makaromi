package outils;

import entites.Client;
import entites.LigneCommande;
import java.io.Serializable;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import metiers.GestionPanierLocal;

public class PatternSession implements Serializable {
    
    private GestionPanierLocal gestionPanier;
    
    private Collection<LigneCommande> maListe;    
    private Client user;
    private String ipClient;
    private int nbConnexion;

    public PatternSession() {
        gestionPanier = lookupGestionPanierLocal();
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

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    public GestionPanierLocal getGestionPanier() {
        return gestionPanier;
    }

    public Collection<LigneCommande> getMaListe() {
        return maListe;
    }

    public void setMaListe(Collection<LigneCommande> maListe) {
        this.maListe = maListe;
    }

    private GestionPanierLocal lookupGestionPanierLocal() {
        try {
            Context c = new InitialContext();
            return (GestionPanierLocal) c.lookup("java:global/magasin-v02/magasin-v02-ejb/GestionPanier!metiers.GestionPanierLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
   
}
