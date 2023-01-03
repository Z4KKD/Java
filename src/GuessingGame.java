import java.util.*;
import javax.swing.JOptionPane;

public class GuessingGame {

    static String favanimal;
    
    GuessingGame()
    {
        
        
            for (int i=5; i>=1; i--)
            {
                System.out.println(i);
            }
            System.out.println("GO!");
            Test you = new Test(null, 0);
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Hello, what is your name? ");
            String name = scanner.nextLine();
            you.name = name;
            int age = 0;
            System.out.println("How old are you? ");
            age = scanner.nextInt();
            scanner.nextLine();
            you.age = age;
            System.out.println();
            System.out.println("Pick a number from 30-50");
            int luck = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            Random lucky = new Random();
            int x = lucky.nextInt(50-30)+30;
            if (x == luck)
            {
                System.out.println("Your got it right! The lucky number was "+x +" and your number was "+luck );
                System.out.println();
            }
            else
            {
                System.out.println("Sorry! The lucky number was "+x +" and your number was "+luck);
                System.out.println();
            }
            System.out.println("What is your favorite food? ");
            String food = scanner.nextLine();
            System.out.println();
            
    
    
            System.out.println("Hello "+name);
            System.out.println("You like "+food);
    
            String[] foods = new String[3];
    
            foods[0] = "Burgers";
            foods[1] = "Pizza";
            foods[2] = food;
    
            System.out.println("Heres a list of my favorite food. \n I added your food to the list");
            for (int i=0; i<foods.length; i++)
            {
                System.out.println(foods[i]);
            }
    
            System.out.println();
            System.out.println("Guess a number from 1-5");
            int pick = scanner.nextInt();
            scanner.nextLine();
    
            switch(pick){
                case 1 : System.out.println("Not even close!");
                break;
                case 2 : System.out.println("Wrong but Almost!");
                break;
                case 3 : System.out.println("So close maybe next time!");
                break;
                case 4 : System.out.println("Great pick four was the number!");
                break;
                case 5 : System.out.println("Little to high, try lower!");
                break;
                default: System.out.println("That was not one of the numbers");
            }
            System.out.println();
    
            System.out.println("Do you want to continue? ");
            String reply = scanner.nextLine();
            String result = reply.toLowerCase();
            
            if (result.equals("yes") || result.equals("y"))
            {
                System.out.println("Awesome!");
                System.out.println();
            } else {
    
                System.exit(0);
            }
    
            System.out.println("Whats your favorite drink? ");
            String drink = scanner.nextLine();
            System.out.println();
            System.out.println("Cool, we made a list of everyones favorites");
    
            ArrayList<String> drinkList = new ArrayList();
            drinkList.add("Water");
            drinkList.add("Juice");
            drinkList.add("Soda");
            drinkList.add(drink);
            for(String i : drinkList){
                System.out.println(i+"\n");
            }
    
            System.out.println("Do you perfer cats or dogs? \n");
            System.out.println("1 = Cats and 2 = Dogs\n");
            int catordog = scanner.nextInt();
            scanner.nextLine();
            Catordog cord;
            String stat;
            if(catordog==1){
                cord = new Cat();
                cord.speak();
                stat = "cat";
            } else if(catordog==2){
                cord = new Dog();
                cord.speak();
                stat = "dog";
            } else{
                cord = new Catordog();
                cord.speak();
                stat = "both are cool";
            }
    
    
    
    
            System.out.println("Whats your favorite animal? \n");
            String animal = scanner.nextLine();
    
            Test ani = new Test(animal);
            ani.animal = animal;
            favanimal = animal;
            
            ObjectPass pass = new ObjectPass();
            pass.fav(ani);
    
            int y = lucky.nextInt(40-18)+18;
    
            System.out.println("If you can have one super power what would it be? ");
            String power = scanner.nextLine();
            System.out.println();
            
            Mutant mutant1 = new Mutant(name,y,power);
            mutant1.good();
            mutant1.talk();
    
            System.out.println(mutant1.toString()); 
    
            System.out.println("\nA mutant is charging you! ");  
            Enemy mutant2 = new Enemy();
            mutant2.bad();
            System.out.println("How do you attack? "); 
            String attack = scanner.nextLine();
            mutant1.setattack(attack);
    
            int z = lucky.nextInt(100);
    
            if(mutant2.x > z)
            {
                System.out.println("\nYou lost and barely escaped with your life!\n"); 
            }
            else
            {
                System.out.println("\nWow nice moves! You won!\n"); 
            }
    
            
    
            //mutant2.copy(mutant1);
    
            scanner.close();
    
            System.out.println("Thankful thats over with \n" + "A box will now open for further questions");
    
            String question = JOptionPane.showInputDialog("Did you enjoy the guessing game?");
            JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "Thank you for your feedback of "+question);
    
            double rate = Double.parseDouble(JOptionPane.showInputDialog("What would you rate this app?"));
            JOptionPane.showMessageDialog(null, "Thanks for your rating of " +rate + "\n Press ok to close");
            
            String[][] stats = {
                { "Name: "+name, " Your lucky number: " + Integer.toString(luck), " The lucky number: " + Integer.toString(x)},
                { "Favorite food picked: " + foods[2], " Favorite drink: " + drink , "Favorite Animal " + animal },
                {"Last number picked: " + Integer.toString(pick) + ".", "Your reply: " + question + ".", "Your rate: " + Double.toString(rate)},
                {"Your super power: "+power+".", "How you used your power: " + attack + ".", "Dogs or cats? You said: "+stat}
                };
                for(int i=0; i<stats.length; i++){
                    System.out.println();
                    for(int j=0; j<stats[i].length; j++){
                        System.out.print(stats[i][j]+" ");}
                    }
        }
    }
    

