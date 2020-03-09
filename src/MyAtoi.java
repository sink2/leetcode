import java.util.LinkedList;
import java.util.List;

public class MyAtoi {
    public static int myAtoi(String str) {
        if (str.length() < 1) return 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if (c == ' ' && list.size() ==0 ) continue;
            if (list.size() == 0 && (c == '-' || c == '+')) {
                list.add(c == '-' ? -1 : 1);
            } else if (c >= '0' && c <= '9') {
                if (list.size() == 0) {
                    list.add(1);
                }
                list.add(Integer.parseInt(String.valueOf(c)));
            } else {
                break;
            }
        }
        if (list.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0) > 0 ? "" : "-");
            for (int i = 1;i < list.size();i++) {
                sb.append(list.get(i));
            }
            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception e) {
                if (list.get(0) > 0) return Integer.MAX_VALUE;
                return Integer.MIN_VALUE;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
