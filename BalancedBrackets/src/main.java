import java.util.Stack;

public class main {

    public static void main(String[] args){


        System.out.println(validParen("("));
        System.out.println(validParen("(){}[]"));


    }


    public static boolean validParen(String input){

       Stack<Character>stack=new Stack<>();
       for(int i=0;i<input.length()-1;i++){
           if(input.charAt(i)=='(' ||
              input.charAt(i)=='{' ||
              input.charAt(i)=='['){
                stack.push(input.charAt(i));
           }
           if(stack.isEmpty())
               return false;
           char character;
           switch (input.charAt(i)){
               case ')':
                   character=stack.pop();
                   if(character=='{' || character=='[')
                       return false;
                   break;
               case ']':
                   character=stack.pop();
                   if(character=='(' || character=='{')
                       return false;
                   break;
               case '}':
                   character=stack.pop();
                   if(character=='(' || character=='[')
                       return false;
                   break;
           }
       }
       return (stack.isEmpty());
    }
}
