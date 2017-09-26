package lazyEvaluation;

public class LazyEvaluation
{

    public static void main(String[] args)
    {
        String name = "Brandon";
        //             0123456
        
        if(name.length() >= 10 && name.charAt(9) == '.')
        {
            System.out.println("happiness");
        }
    }

}
