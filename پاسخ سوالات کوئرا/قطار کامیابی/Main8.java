import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tak_tak_go = Math.abs(b-a);
        int start_point_1 = 0 ,start_point_2 =0;
        if (a>=0){
            start_point_1 = a + k - Math.abs(a%k);
            start_point_2 = a - Math.abs(a%k);
        }else{
            start_point_1 = a - a%k;
            start_point_2 = a -(k + a%k);
        }
        int end_point_1 = 0 ,end_point_2 =0;
        if (b>=0){
            end_point_1 = b + k - Math.abs(b%k);
            end_point_2 = b - Math.abs(b%k);
        }else{
            end_point_1 = b - b%k;
            end_point_2 = b -(k + b%k);
        }
        int oo1 = Math.abs(start_point_1-end_point_1);
        int oo2 = Math.abs(start_point_2-end_point_1);
        int oo3 = Math.abs(start_point_2-end_point_2);
        int oo4 = Math.abs(start_point_1-end_point_2);
        int arr [] = new int[4];
        arr[0] = oo1;
        arr[1] = oo2;
        arr[2] = oo3;
        arr[3] = oo4;
        int s1,s2,e1,e2;
        Arrays.sort(arr);
        if (arr[0] == oo1){
            s1 = start_point_1;
            e1 = end_point_1;
            s2 = start_point_2;
            e2 = end_point_2;
        }else if (arr[0] == oo2){
            s1 = start_point_2;
            e1 = end_point_1;
            s2 = start_point_1;
            e2 = end_point_2;
        }else if (arr[0] == oo3){
            s1 = start_point_2;
            s2 = start_point_1;
            e1 = end_point_2;
            e2 = end_point_1;
        }else {
            s1 = start_point_1;
            s2 = start_point_2;
            e1 = end_point_2;
            e2 = end_point_1;
        }
        int d1 = Math.abs(a-s1) + Math.abs(b-e1) + Math.abs(e1-s1)/k;
        int d2 = Math.abs(a-s1) + Math.abs(b-e2) + Math.abs(e2-s1)/k;
        int d3 = Math.abs(a-s2) + Math.abs(b-e1) + Math.abs(e1-s2)/k;
        int d4 = Math.abs(a-s2) + Math.abs(b-e2) + Math.abs(e2-s2)/k;
        int arr2[] = new int[4];
        arr2[0] = d1;
        arr2[1] = d2;
        arr2[2] = d3;
        arr2[3] = d4;
        Arrays.sort(arr2);
        if (arr2[0] < tak_tak_go){
            System.out.println(arr2[0]);
        }else{
            System.out.println(tak_tak_go);
        }

//        int point;
//        if (a<0||b<0){
//            if (a<0&&b<0){
//                if (-a>-b){
//                    int re = -a%k;
//                    point = a - (k-re);
//                }
//            }
//        }


    }
}
