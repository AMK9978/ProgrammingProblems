import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AMK on 7/28/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Member> arrayList = new ArrayList<>();
        int maxTime = -1;
        int arr[] = new int[100000 + 5];
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            Member member = new Member();
            member.l = l;
            member.r = r;
            arr[r]++;
            if (r > maxTime) {
                maxTime = r;
            }
            arrayList.add(member);
        }
        int tt = 0;
        Collections.sort(arrayList);
        for (int i = maxTime; i > 0; i--) {
            int kk = k;
            if (arrayList.size() == 0) {
                break;
            }
            if (arr[i] != 0) {
                tt += arr[i];
            }
            for (int j = 0; j < arrayList.size(); j++) {

                if (arrayList.get(j).r >= i && arrayList.get(j).l <= i) {
                    kk--;
                    tt--;
                    arrayList.remove(j);
                    j--;
                    if (kk == 0) {
                        break;
                    }
                }else if (tt == 0) {
                    break;
                }

            }
        }
        if (arrayList.size() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static class Member implements Comparable<Member> {
        int l, r;

        @Override
        public int compareTo(Member member) {
            int d = this.r - this.l;
            int dd = member.r - member.l;
            if (this.l > member.l) {
                return -1;
            } else if (this.l < member.l) {
                return 1;
            } else {
                if (this.r > member.r) {
                    return -1;
                } else if (this.r < member.r) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        @Override
        public String toString() {
            return "Member{" +
                    "l=" + l +
                    ", r=" + r +
                    '}';
        }
    }
}
