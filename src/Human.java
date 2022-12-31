public abstract class Human {

    String name;
    int percent;

    Human(String name, int percent){
        this.name = name;
        this.percent = percent;
    }

    public String toString(){
        return "My name is "+this.name + "\n" + "My power is at "+this.percent+"%" + "\n";
    }

    abstract void talk();
    
}
