package beans;

import entites.Ticket;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
public class ShoppingCartBean implements ShoppingCartBeanLocal {

    List<Ticket> content;

    @Override
    public void initialize() {
        content = new ArrayList<>();
    }

    @Override
    public void initialize(List<Ticket> content) {
        this.content = content;
    }

    @Override
    public void addTicket(Ticket t) {
        content.add(t);
    }

    @Override
    public void removeTicket(Ticket t) throws Exception {
        boolean result = content.remove(t);
        if (result == false) {
            throw new Exception("this ticket is not in cart.");
        }
    }

    @Override
    public Collection<Ticket> getContent() {
        return content;
    }

    @Override
    public String getCartPrice() {
        Float prixTotal = 0F;
        if (!(this.getContent().isEmpty())) {
            for (Ticket t : this.getContent()) {
                if (t.getSellPrice() != null) {
                    prixTotal += (Float.parseFloat(t.getSellPrice()));
                }
            }
        }

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.FRENCH);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("0.00", otherSymbols);
        df.setRoundingMode(RoundingMode.HALF_UP);

        //System.out.println(df.format(prixTotal));
        return df.format(prixTotal);
    }

   
    @Remove
    @Override
    public void remove() {
        content = null;
    }
}
