class MyChar{
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public Boolean isVowel(){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            return true;
        }
        if (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            return true;
        }

        return false;
    }

    public Boolean isDigit(){
        if (ch >=48 && ch<=57){
            return true;
        }
        return false;
    }

    public boolean isConsonant(){
        if (isAlphabet() && !(isVowel())){
            return true;
        }
        return false;
    }

    public Boolean isAlphabet(){
        if (ch>=97 && ch<=122){
            return true;
        }
        if (ch>=65 && ch<=90){
            return true;
        }
        return false;
    }

    public void printLowerCaseLetter(){
        for(char ch='a';ch<='z';ch++){
            System.out.println(ch);
        }
    }

    public void printUpperCaseLetter(){
        for(char ch='A';ch<='Z';ch++){
            System.out.println(ch);
        }
    }
}
public class CharVowel {
    public static void main(String[] args) {
        MyChar obj = new MyChar('4');
        System.out.println(obj.isVowel());
        System.out.println(obj.isDigit());
        System.out.println(obj.isAlphabet());
        System.out.println(obj.isConsonant());
        obj.printLowerCaseLetter();
        obj.printUpperCaseLetter();

    }
}
