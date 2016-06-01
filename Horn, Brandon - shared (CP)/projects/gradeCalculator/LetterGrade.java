package gradeCalculator;

public class LetterGrade
{
    private final String letter;
    private final double minAverage;
    
    public LetterGrade(String letter, double minAverage)
    {
        this.letter = letter;
        this.minAverage = minAverage;
    }
    
    public String getLetter()
    {
        return letter;
    }
    
    public double getMinAverage()
    {
        return minAverage;
    }
}
