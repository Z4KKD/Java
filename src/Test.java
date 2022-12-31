public class Test {
    String name;
    String animal;
    int age;

    Test(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    Test(String animal)
    {
        this.animal = animal;
    }

    void youwon()
    {
        System.out.println(this.name+" Correct! You finished! ");
    }
    void youlost()
    {
        System.out.println(this.name+" failed the last question! ");
    }
    
}
