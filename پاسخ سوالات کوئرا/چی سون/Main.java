import java.util.*;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        Hashtable<String, Element> hashtable = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            String line[] = x.split(" ");
            if (line[1].equals(":=")) {
                line[2] = x.split(":=")[1].trim();
                if (line[2].charAt(0) == '{') {
                    Hash hash = new Hash();
                    hash.name = line[0];
                    //{"2": 1, "1": 4, "4": 5}
                    line[2] = line[2].substring(1, line[2].length() - 1);
                    //"2": 1, "1": 4, "4": 5
                    String vals[] = line[2].split(",");
                    for (String val : vals) {
                        String key = val.split(":")[0].trim();
                        key = key.substring(1, key.length() - 1);
                        String value = val.split(":")[1].trim();
                        hash.hashMap.put(key, Integer.valueOf(value));
                    }
                    hashtable.put(hash.name, hash);
                } else {
                    Listi listi = new Listi();
                    listi.name = line[0];
                    //[1, 2, 3]
                    line[2] = line[2].substring(1, line[2].length() - 1);
                    String vals[] = line[2].split(",");
                    for (String val : vals) {
                        String key = val.trim();
                        listi.arrayList.add(Integer.valueOf(key));
                    }
                    hashtable.put(listi.name, listi);
                }
            } else {
                String req = line[1];
                String name = req.split("\\[")[0];
                String id = req.substring(name.length() + 1, req.length() - 1);
                if (hashtable.get(name) instanceof Listi) {
                    Listi listi = (Listi) hashtable.get(name);
                    System.out.println(listi.arrayList.get(Integer.parseInt(id)));
                } else {
                    Hash hash = (Hash) hashtable.get(name);
                    System.out.println(hash.hashMap.get(id.substring(1, id.length() - 1)));
                }
            }
        }
    }

    static abstract class Element {
        String name;
    }

    static class Listi extends Element {
        ArrayList<Integer> arrayList = new ArrayList<>();
    }

    static class Hash extends Element {
        HashMap<String, Integer> hashMap = new HashMap<>();
    }
}