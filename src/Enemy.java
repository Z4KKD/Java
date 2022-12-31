import java.util.*;

public class Enemy implements Evil {

    Random random = new Random();
    int x = random.nextInt(100);
    

    public void bad()
    {
        System.out.println("This person is evil!");
    }
    
}
