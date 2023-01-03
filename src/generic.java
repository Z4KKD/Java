public class generic {
    

    generic()
    {   

        genericClass<Integer> myInt = new genericClass<>(3);
        genericClass<Double> myDouble = new genericClass<>(7.37);
        genericClass<Character> myChar = new genericClass<>('$');
        genericClass<String> myString = new genericClass<>("Test");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());




       /* Print out a list of arrays
       Integer[] intA = {1, 2, 3, 4, 5}; 
        Double[]  douA = {5.5, 4.4, 3.3, 2.2};
        Character[] chaA = {'T','E','S','T'};
        String[] strA = {"T","I","M","E"};
        
        displayArray(intA);
        displayArray(douA);
        displayArray(chaA);
        displayArray(strA);
    }
    public static <T> void displayArray(T[] array)
    {
        for(T x : array)
        {
            System.out.print(x+" ");
        }
            System.out.println();
    }
    */
    }
}
