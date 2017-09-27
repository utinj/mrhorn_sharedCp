package ifelse;

public class GradeCalcCorrect
{
    public static void main(String[] args)
    {
        int score = 59;
        char letterGrade = '_';
        
        if(score < 60)
            letterGrade = 'F';
        else if(score < 70)
            letterGrade = 'D';
        else if(score < 80)
            letterGrade = 'C';
        else if(score < 90)
            letterGrade = 'B';
        else
            letterGrade = 'A';
        
        System.out.println(letterGrade);

    }
}
