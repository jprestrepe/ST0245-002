/*
 * @author Mauricio Toro, Juan Pablo Restrepo, Juan José Sánchez
 * @version 2
 */

import java.util.*;

public class Taller8{
 
    public static int polaca (String string){
        Stack<Integer> numbers = new Stack<Integer>();
        String[] data = string.split(" ");
        for(String item : data){
                int res = 0;
                int temp;
                    switch(item){
                        case "+":
                            temp = numbers.pop();
                            res = numbers.pop() + temp;
                            numbers.push(res);
                            break;
                        case "-": 
                            temp = numbers.pop();
                            res = numbers.pop() - temp;
                            numbers.push(res);
                            break;
                        case "*":   
                            temp = numbers.pop();
                            res = numbers.pop() * temp;
                            numbers.push(res);
                            break;
                        case "/": 
                            temp = numbers.pop();
                            res = numbers.pop() / temp;
                            numbers.push(res);
                            break; 
                        default:
                            int num = Integer.parseInt(item);
                            numbers.push(num);
                    }
        }
        return numbers.pop();
    }
	
    public static Stack<Integer> inversa(Stack<Integer> stack){
        Stack<Integer>  a = new Stack<Integer>();
        while(!stack.empty()){
            a.push(stack.pop());
        } 
        return a;
    }
    
    public static void cola (Queue<String> queue){
        while(queue.peek() != null){
            System.out.println("Atiendo a "+queue.poll());
        }
    } 
}
