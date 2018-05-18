import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        if ((null == note) || "".equals(note)) return; //when the notes are empty or the note.equals " "
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Print a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void printNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    public void printAll(){ 
        System.out.println(notes);
    }
    
    public void getAll()
    {
        for(String strings : notes){
            System.out.println(strings += "\n");
        }
    }
    
    public String getAllNumbered()
    {
        String string = " ";
        for(int i=0; i<notes.size(); i++){
            string += i+1 + notes.get(i) + "\n";
        }
        return string;
    }
    //if it prints out it's with a space, as a return value it also returns the \n
    
    public String getNotesWith(String searchString)
    {
        String string = " ";
        for(String strings : notes){
            if(strings.contains(searchString)){ 
              string += strings + "\n";
            }
        }
        return string;
    }
    //so far it recognises the string but doesn't return it properly
    //changed variable in for statement, prints out correctly
    //returns \n as well, Julia says it doesn't matter, teacher said it as well in tutorium apparently
   public void removeNote(String searchString){
        Iterator<String> it = notes.iterator();
        String string = " ";
        for(String strings : notes){           
            if(strings.contains(searchString)){
                   it.remove(); 
            } 
        }
}
//look up iterator, error when method is called   
    
    //return notes.size();
         //for-each loop, System.out.println(note); EX.2
}
