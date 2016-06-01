package gradeCalculator;

public class GradeCalculator
{
    /**
     * Returns the rounded average (0 <= average <= 100) for the given scores
     * and available total points.
     * 
     * Note: Use Math.round to calculate the rounded average. Cast the return value to an int.
     * 
     * @param scores the scores
     * Precondition: scores.length > 0 &&
     *                  0 <= the sum of the elements in scores <= availablePoints
     * 
     * @param availablePoints the total number of available points
     * Precondition: availablePoints > 0
     * 
     * @return the rounded average for the given scores and available total points
     */
    public static int scoresToAverage(int[] scores, int availablePoints)
    {
        return -1; // TODO: implement
    }
    
    /**
     * Returns the letter grade associated with the given average.
     * @param average the average
     * @return the letter graded associated with the given average
     */
    public static String averageToLetterGrade(int average)
    {
        LetterGrade[] grades = {
                new LetterGrade("A+", 97), new LetterGrade("A", 93), new LetterGrade("A-", 90),
                new LetterGrade("B+", 87), new LetterGrade("B", 83), new LetterGrade("B-", 80),
                new LetterGrade("C+", 77), new LetterGrade("C", 73), new LetterGrade("C-", 70),
                new LetterGrade("D+", 67), new LetterGrade("D", 63), new LetterGrade("D-", 60) };
        
        return null; // TODO: implement
    }
    
    public static String scoresToLetterGrade(int[] scores, int availablePoints)
    {
        return averageToLetterGrade(scoresToAverage(scores, availablePoints));
    }
    
    /**
     * Returns the minimum score (0 <= score <= 100) required on the final
     * assignment to earn the desired average, or -1 if no such score exists.
     * 
     * @param scores the scores
     * Precondition: scores.length > 0 &&
     *                  0 <= the sum of the elements in scores <= availablePoints &&
     *                  scores[scores.length - 1] == 0
     * 
     * @param availablePoints the number of available points, including the final assignment
     * Precondition: availablePoints > 0
     * 
     * @param desiredAverage the desired average
     * Precondition: 0 <= desiredAverage <= 100
     * 
     * @return the minimum score required on the final assignment or -1
     */
    public static int minScoreForAverage(int[] scores, int availablePoints, int desiredAverage)
    {
        return -1; // TODO: implement
    }
}
