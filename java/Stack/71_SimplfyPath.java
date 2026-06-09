import java.util.Stack;

class SimplyPath {

    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        path += "/";
        StringBuilder curr = new StringBuilder();
        for (char ch : path.toCharArray()) {
            if (ch == '/') {
                String part = curr.toString();
                if (part.equals("..")) {
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
                else if (part.equals(".") || part.equals("")) {
                }
                else {
                    st.push(part);
                }

                curr.setLength(0);
            }
            else {
                curr.append(ch);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();

        for (String dir : st) {
            result.append("/").append(dir);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SimplyPath sp = new SimplyPath();

        System.out.println(sp.simplifyPath("/home/"));
        System.out.println(sp.simplifyPath("/../"));
        System.out.println(sp.simplifyPath("/home//foo/"));
        System.out.println(sp.simplifyPath("/a/./b/../../c/"));
    }
}