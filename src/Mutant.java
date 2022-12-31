public class Mutant extends Human implements Hero {

    String power;
    private String attack;

    Mutant(String name, int age, String power){
        super(name,age);
        this.power = power;

    }
    
    public String toString(){
        return super.toString()+"My power is "+this.power;
    }

    void talk()
    {
        System.out.println("The mutant is speaking ");
    }
    public String getattack()
    {
        return attack;
    }
    public void setattack(String attack)
    {
        this.attack = attack;
        System.out.println("You attack with "+attack);
    }

    public void good()
    {
        System.out.println("This person is a hero!");
    }

    //public void copy(Mutant x)
    //{
        //this.setattack(x.getattack());
    //}

    
}