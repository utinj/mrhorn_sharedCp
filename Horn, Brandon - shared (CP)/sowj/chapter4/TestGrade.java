package chapter4;
/**
 * The TestGrade class determines a letter grade
 * based on a numeric test score.
 */

public class TestGrade
{
   private int score;

   /**
    * The constructor accepts an argument that 
    * is stored in the score field.
    */

   public TestGrade(int s)
   {
      score = s;
   }

   /**
    * The setScore method accepts an argument   
    * that is stored in the score field.
    */

   public void SetScore(int s)
   {
      score = s;
   }

   /**
    * The getScore method returns the score field.
    */

   public int getScore()
   {
      return score;
   }

   /**
    * The getLetterGrade method determines and
    * returns the letter grade.
    */

   public char getLetterGrade()
   {
      char grade;

      if (score < 60)
         grade = 'F';
      else if (score < 70)
         grade = 'D';
      else if (score < 80)
         grade = 'C';
      else if (score < 90)
         grade = 'B';
      else if (score <= 100)
         grade = 'A';
      else                // Invalid score
         grade = '?';

      return grade;
   }
}
