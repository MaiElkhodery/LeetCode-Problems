import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        int i = 0;
        while (i <arr.length) {
            if (arr[i].equals(".") || arr[i].isEmpty()) {

            } else if (arr[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(arr[i]);
            }
            i++;
        }
        path = "";
        if (stack.isEmpty()) {
            path += "/";
        } else {
            for (String dir : stack) {
                path += "/" + dir;
            }
        }
        return path;
    }
}