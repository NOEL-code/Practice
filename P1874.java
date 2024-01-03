import java.io.*;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int last_value = 0;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > last_value) {
                for (int j = last_value + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = value;
            } else {
                if (stack.peek() != value) {
                    bw.write("NO");
                    possible = false;
                    break;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        if(possible) {
            bw.write(sb.toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
