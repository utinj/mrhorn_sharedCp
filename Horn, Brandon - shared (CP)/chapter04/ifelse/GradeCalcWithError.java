package ifelse;

public class GradeCalcWithError
{
    public static void main(String[] args)
    {
        int score = 70;
        char letterGrade = '_';
        
        if(score < 60)
            letterGrade = 'F';
        
        if(score < 70)
            letterGrade = 'D';
        
        if(score < 80)
            letterGrade = 'C';
        
        if(score < 90)
            letterGrade = 'B';
        else
            letterGrade = 'A';
        
        System.out.println(letterGrade);

    }
}
