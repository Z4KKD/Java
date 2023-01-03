
public class genericClass <T> {

    T x;

    genericClass(T x)
    {
        this.x = x;
    }

    public T getValue()
    {
        return x;
    }
}
