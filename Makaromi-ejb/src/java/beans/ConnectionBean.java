package beans;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


@Singleton
@Startup
public class ConnectionBean implements Serializable {

    public ConnectionBean() {//bean de connexion 

    }

    public DataSource MyConnection() {
        InitialContext ic = null;
        DataSource ds = null;
        String adresse = "jdbc/bdd_makaromi"; // faire attention à bien créer le pool sous ce nom.
        try {
            ic = new InitialContext();
            ds = (DataSource) ic.lookup(adresse);
        } catch (NamingException ex) {
            System.err.print("ConnectionBean error : " + ex.getMessage() + "\n");
            Logger.getLogger(ConnectionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
    }

}