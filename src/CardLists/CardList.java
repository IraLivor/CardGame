package CardLists;

import cards.Card;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: PerkinsE
 * Date: 8/15/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CardList implements List {

   private List list;

    public CardList()
   {

   }

    private List newArrayList() {

        list = newArrayList();

        return list;
    }

    public int countCards()
    {
        int cardCount=0;
        cardCount=list.size();
        return cardCount;
    }

    public void removeAtPosition(int position)
    {
        list.remove(position);
    }

    public void addAtPosition(Card card, int position)
    {
        list.add(position, card);
    }

    public void transfer(Card card, CardList cardlist)
    {

    }

}
