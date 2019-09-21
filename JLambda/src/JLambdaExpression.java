interface Drawable{
    public void draw();
}
public class JLambdaExpression {
    public static void main(String[] args) {
        int width =10;
        Drawable d2=()->{
            System.out.println("Drawable:"+width);
        };
        d2.draw();
    }
}
