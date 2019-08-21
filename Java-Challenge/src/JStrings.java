class StringManipulation{
    String name = "GokulaKrishnan";
    void stringMethods(){
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(6));
    }

    void printCharacters(){
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}

public class JStrings {
    public static void main(String[] args) {
        StringManipulation obj = new StringManipulation();
        obj.stringMethods();
        obj.printCharacters();
    }
}
/*
indexOf() : Has two overloaded versions. indexOf(char) returns the position where a character occurs in a string, the first time. indexOf(String) returns the starting position where a string occurs within our string, the first time.
lastIndexOf() : Similar in function to indexOf(), but replace "first time" with "final time" in its description.
startsWith() : Returns true if our string starts with the given prefix, false otherwise.
endsWith() : Returns true if our string ends with the given suffix, false otherwise.
isEmpty() : Returns true if our string is empty, false otherwise.
equals() : Returns true if our string is identical to the argument, false otherwise.
equalsIgnoreCase() : Returns true if our string is identical to the argument, ignoring the case of its characters. Will return false otherwise.
 */

