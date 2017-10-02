package randomNumbers;

public class RandomNumbers
{
    /*
     * This demo shows how to generate random numbers
     * using Math.random() without Processing. The
     * demo using Processing is in the processing
     * source folder in this same repository.
     */
    
    public static void main(String[] args)
    {

//        double r = Math.random(); // 0.0 <= r < 1.0
//        System.out.println(r);
        
        // want: 0.0 <= r < 10.0
//        double r = Math.random() * 10; // have: 0.0 <= r < 10.0
//        System.out.println(r);
        
        // want: 5.0 <= r < 10.0
//        double r = Math.random() * 5 + 5; // have: 5.0 <= r < 10.0
//        System.out.println(r);
        
        // want: 6 <= r <= 10
//        int r = (int) (Math.random() * 5 + 6) ; // have: 6 <= r <= 10
//        System.out.println(r);
    }
}