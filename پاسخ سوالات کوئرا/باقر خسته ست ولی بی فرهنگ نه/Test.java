import java.util.*;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int time = 0;               // keep track of spending time on the path
        int delay = 0;
        int d = 0 , r = 0, g = 0, masafat = 0;


        for (int i = 0; i < n; i++) {       // number of lights
//            for (int j = 1; j <= 3; j++) {  // number of parameters per light
//                if (j == 1){
            d = sc.nextInt();
            r = sc.nextInt();
            g = sc.nextInt();

            time += Math.abs(d - masafat);
            masafat = d;

            while (time % (r + g) < r) {
                time++;
            }
        }

        time += Math.abs(l - masafat);


//                    if (i==0)
//                        time = d;
//                    else {
//                        d = Math.abs(d - preLight);
//                        time += d;
//                    }
//                }
//                else if (j == 2){

//                     if (i==0 & time < r) {
//                         delay += Math.abs(time - r);
//                         time += delay;
//                     }
//                     else if (i == 0 & time >= r)
//                         continue;
//                     else if ( time < (r+d)) {
//                         delay += Math.abs(time - (r+d));
//                         time += delay;
//                     }
//                }
//                else{
//                    preLight = d;
//                }
//            }
//            if (i>1)
//                time = Math.abs(time-d);
//        }

        System.out.println(time);


        sc.close();
    }

}