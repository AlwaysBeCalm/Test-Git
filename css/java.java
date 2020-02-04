public class java {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("Java2");
        int x = 10;
        System.out.println(x);
        int y = 20;
        int xx = 20;
        //this is a comment
        System.out.println(xx);
        System.out.println(y);
        // this is a comment
        int yy = 20;
        System.out.println(yy);
    }

    int add(int a, int b){
        return a+b;
    }

    class table{
        double height;
        double lenght;
        double width;
        String color;

        table(){
            
        }
        table(double a, double b, double c, String d){
           this.setHeight(a);
        }

        void setHeight(double a){
            this.height = a;
        }
    }
}