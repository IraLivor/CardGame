package cards;

/**
 * Created with IntelliJ IDEA.
 * User: PerkinsE
 * Date: 8/15/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    boolean visible = false;
    public Card()
    {

    }

    public boolean getCardVisibility()
    {
        return visible;
    }

    public void setCardVisibility(boolean status)
    {
        visible = status;
    }
}

