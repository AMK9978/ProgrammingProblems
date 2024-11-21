

import java.util.*;

public class Test{

    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner(System.in);

        StringBuilder sb =new StringBuilder();

        String s = input.next();
        Stack <Character> stack =new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '=')
                try {
                    stack.pop();
                }catch (EmptyStackException ignored ){}

            else
                stack.push(c);
        }

        for (char c:stack) {
            sb.append(c);
        }

        System.out.println(sb.toString());

        

    }
    
}

