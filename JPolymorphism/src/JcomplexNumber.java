public class JcomplexNumber {
    double real, img;
    JcomplexNumber(double r, double i ){
        this.real = r;
        this.img = i;
    }

    public static JcomplexNumber sum(JcomplexNumber c1, JcomplexNumber c2){
        JcomplexNumber temp = new JcomplexNumber(0,0);
        temp.real = c1.real+c2.real;
        temp.img = c1.img+c2.img;
        return temp;
    }

    public static void main(String args[]){
        JcomplexNumber c1 = new JcomplexNumber(5.5, 4);
        JcomplexNumber c2 = new JcomplexNumber(1.2, 3.5);
        JcomplexNumber temp = sum(c1,c2);
        System.out.printf("sum is: "+ temp.real +" + " + temp.img +"i");
    }

}
