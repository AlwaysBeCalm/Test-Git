class java {
    public static void main(String[] args) {

        table t1 = new table(100, 200, 50, "brown");

        System.out.println("Hello Java");
        System.out.println("Java2");
        int x = 10;
        System.out.println(x);
        int y = 20;
        int xx = 20;
        //this is a comment
        System.out.println(y);
        // this is a comment
        //now this file is ignored
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
    }
}