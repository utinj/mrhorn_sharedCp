package wordSearch;

import java.awt.Color;

public class Letter
{
    private char letter;
    private boolean isSelected;
    private boolean isCorrect;

    /**
     * Constructs a letter with the specified value
     * @throws IllegalArgumentException if letter is not in the range A - Z
     */
    public Letter(char letter)
    {
        if(Character.getType(letter) != Character.UPPERCASE_LETTER)
            throw new IllegalArgumentException();

        this.letter = letter;
        isSelected = false;
        isCorrect = false;
    }
    
    public String getText()
    {
        return "" + letter;
    }
    
    public Color getColor()
    {
        if(isSelected)
            return Color.RED;
        else if(isCorrect)
            return Color.BLUE;
        else
            return Color.WHITE;
    }
    
    public boolean isSelected()
    {
        return isSelected;
    }
    
    public void toggleIsSelected()
    {
        isSelected = ! isSelected;
    }
    
    public void markCorrect()
    {
        isCorrect = true;
    }
}