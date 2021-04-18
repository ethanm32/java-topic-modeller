# java-topic-modeller
Java topic modeller assignment

There are three classes utilised in this assignment. They are 


**Topic Gui
   - This class creates the GUI. The layout of the GUI is altered in this class.
   - There are 2 buttons, a text field, a text area and 4 panels created.
   - The action performed methods are in this class.The actions performed are clicking two buttons and also entering text.
   - There are also methods that convert the Array lists containing each document to normal arrays
  

**Topic Methods
  - This class contains most of the methods for this program.
  - It contains a remove stop words method which removes all stopwords and returns the new array list
  - It contains a method that gets the top ten most frequent words in each document.This piece of code was written with help from this link: 
    https://www.youtube.com/watch?v=cupg2TGIkyM
  - It contains a method that checks how many words are in common in the two most frequent lists and returns a percentage.
  - The class also contains two methods that display details for the user in a text area.


**Control 
 - This class simply runs the GUI for the program
