package a20221104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a5355 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int testcase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testcase; i++) {
            String[] inputArr = br.readLine().split(" ");
            final double initVal = Double.parseDouble(inputArr[0]);
            final List<String> ops = Arrays.stream(inputArr).skip(1).collect(Collectors.toList());
            sb.append(solution(initVal, ops)).append("\n");
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        System.out.print(sb);
    }

    private static String solution(double initVal, List<String> ops) {
        double pVal = initVal;

        for (String op : ops) {
            switch (op) {
                case "@": {
                    pVal *= 3;
                    break;
                }
                case "%": {
                    pVal += 5;
                    break;
                }
                case "#": {
                    pVal -= 7;
                    break;
                }
                default:
                    break;
            }
        }
        return String.format("%.2f", ((double) Math.round(pVal * 100) / 100));
    }
}