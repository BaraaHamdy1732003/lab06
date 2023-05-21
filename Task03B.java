//lab06 1 c)
public class Task03B {
    public static void main(String[] args) {

        MyFunction f = (x )->{
            double s= 0.0;
            for (int  k=1;k<=100;k++){
                s+=Math.pow(x/(Math.PI*k)-1.0,2.0);
            }
            return s;
        } ;

        MyFunction []myFunction= {Math::cos,
                Task01::fb,
                (x) -> (-Math.pow(x / Math.PI, 2.0) - 2.0 * x + 5.0 * Math.PI),
                 f,
            new MyFunction() {
                @Override
                public double func(double x) {
                    if (x < 0) {
                        return 0.25 * Math.sin(x) * Math.sin(x) + 1.0;
                    }

                    return 0.5 * Math.cos(x) - 1.0;
                }
                }
        };


        for (int i = 0; i <5 ; i++) {
           tabFunc (-2.0*Math.PI,2.0*Math.PI,Math.PI/6.0,Math::cos);
            System.out.println("---------------");

        }

    }

    public static double fb(double x){
        return 2.0*Math.sqrt(Math.abs(x-1.0))+1.0;
    }
    public static void tabFunc(double a, double b, double dx,MyFunc f){
        for (double x= a; x<b+dx;x+=dx){
            System.out.println(" x = "+x+"\t f(x) = "+f.func(x) );
        }
    }

};









