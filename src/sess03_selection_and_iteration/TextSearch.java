package sess03_selection_and_iteration;

/**
 *java program to search for some text in a paragraph using a while loop.
 * @author pc
 */
public class TextSearch
{
    //main method begins program execution
    public static void main(String[] args)
    {
        //paragraph  to search text within
        String paragraph = "When you apply styles,"
   + " your headings change to match the new theme. "
   + "Save time in Word with new buttons that show up where you need them. "
   + "To change the way a picture fits in your document, click it and a button for layout options appears next to it. "
   + "When you work on a table, click where you want to add a row or a column, and then click the plus sign. "
   + "Reading is easier, too, in the new Reading view."
   + "You can collapse parts of the document and focus on the text you want.";
      //word/text to search for
      String textToSearch = "document";
      boolean found = false; //Variable to indicate whether the text has been found or not
      int index = 0;
      //Use a while loop to search for the text
      while(index < paragraph.length())
      {
          //Check if the substring matches the text to search
          if (index +textToSearch.length() <= paragraph.length()
                  && paragraph.substring(index, index + textToSearch.length()).
                  equals(textToSearch))
          {
              found = true;
              break; //Exist the loop when the text is found
          }
          index++; //Increment the index to check the next character  
      }
      
      // Output the results
      if (found)
      {
          System.out.println("The text/word '" + textToSearch +"' was found"
          + "at index" + index);
      }
      else
          System.out.println("Unfortunately the text/word '" +textToSearch
          + "' was not found in the paragraph.");   
    }
}
