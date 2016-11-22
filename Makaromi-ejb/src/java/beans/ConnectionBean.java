package beans;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionBean implements Serializable {

    public ConnectionBean() {//bean de connexion 

    }

    public DataSource MaConnexion() {
        InitialContext ic = null;
        DataSource ds = null;
        String adresse = "jdbc/bdd_librairie";
        try {
            ic = new InitialContext();
            ds = (DataSource) ic.lookup(adresse);
        } catch (NamingException ex) {
            System.err.print("Erreur provenant du fichier beanConnexion : " + ex.getMessage() + "\n");
            Logger.getLogger(ConnectionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
    }

}