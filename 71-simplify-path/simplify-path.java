import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) {
                continue;
            } else {
                al.add(arr[i]);
            }
        }
        String[] str = new String[al.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = al.get(i);
        }
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(str[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        for (String folder : st) {
            sb.append("/");
            sb.append(folder);
        }

        if (sb.length() == 0) {
            return "/";
        }
        return sb.toString();
    }
}