
package sess10_datetimeapi_enums;

/**
 * Enumeration to rep the four suits in a deck of playing cards.
 * The four suits are:
 * 1. HEARTS
 * DIAMONDS
 * CLUBS
 * SPADES
 * 
 * @author pc
 */
public enum CardSuit
{
    //=====================================
    // 2. card Suits
    //=====================================
    HEARTS("hearts", "Red"),
    DIAMONDS("Diamonds","Red"),
    CLUBS("Clubs", "Black"),
    SPADES("Spades", "Black");
    
    //=====================================
    // 2. card Suits feilds
    //=====================================
    
    private String suitsName;
    private String colour;
    
    //=====================================
    // Constructor
    //=====================================

    private CardSuit(String suitsName, String colour)
    {
        this.suitsName = suitsName;
        this.colour = colour;
    }

    //=====================================
    // Getter & Setters
    //=====================================

    
    public String getSuitsName()
    {
        return suitsName;
    }

    public void setSuitsName(String suitsName)
    {
        this.suitsName = suitsName;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    @Override
    public String toString()
    {
        return String.format("Suit Details" +
                 "\n" + "_".repeat(55) +
                 "\nSuit: %s" +
                 "\nColour: %s" +
                "\n" + "_".repeat(55), suitsName,colour);
    }
    
    //main method begins program execution
    public static void main(String[]args)
    {
        //Loop throuth all suits in the enumeration and display information
        System.out.println("Demonstarting the four suits in  standard deck of "
        + "Playing cards:\n");
        for (CardSuit suit: CardSuit.values())
            System.out.println(suit);  //Display information about each suit
        
        //Example of how to get a specific suit by name
        System.out.println("\nAccessing a specific suit (e.g, Hearts):");
        CardSuit heartSuit =CardSuit.valueOf("HEARTS");
        System.out.println("Specific suit: " + heartSuit.getSuitsName() +
        ", Colour: " + heartSuit.getColour());
    
    }
    
}
