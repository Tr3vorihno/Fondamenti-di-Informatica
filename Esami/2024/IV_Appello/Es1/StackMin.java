
//Nome:
//Cognome:
//Matricola:
//Postazione:
/*
* Completare i metodi push(int value), pop() e getMin() della classe StackMin che estenda la funzionalità dello stack
* per includere un metodo getMin() che restituisca il valore minimo nello stack in tempo O(1).
*/


import java.util.Stack;

class StackMin {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public StackMin() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        
        if(stack.isEmpty()){
            stack.push(value);
            
        }else{
            while( !stack.isEmpty() && stack.peek()<value ){
                int j = stack.pop();
                minStack.push(j);
            }
            stack.push(value);
            while(!minStack.isEmpty()){
                stack.push(minStack.pop());
            }
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int getMin() {// controlla in fine
       return stack.peek();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

