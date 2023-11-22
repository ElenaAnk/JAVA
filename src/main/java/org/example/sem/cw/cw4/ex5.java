package org.example.sem.cw.cw4;

import java.util.Stack;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath()= "+ simplifyPath("/home/"));
        System.out.println("simplifyPath()= "+ simplifyPath("/../"));
        System.out.println("simplifyPath()= "+ simplifyPath("/home//foo/"));

    }
    public static String simplifyPath(String path) {
        String result = "";
        Stack<String>stack=new Stack<>();
        String[] tokens = path.split("/");
        for (String elem : tokens) {
            if (elem.equals("..")){
                if (!stack.isEmpty()){
                stack.pop();}
            }else if(!elem.equals(".")&&!elem.isEmpty()){
                stack.push(elem);
            }
        }
        if (stack.isEmpty())return "/";
        while (!stack.isEmpty()){
            result="/"+ stack.pop()+result;
        }
        return result;

    }
}
