package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    public void test(){
        try {
            ArrayStack arrayStack = new ArrayStack(5);
            arrayStack.push(10);
            arrayStack.push(5);
            arrayStack.push(7);
            arrayStack.push(8);
            arrayStack.push(20);
            //arrayStack.push(30);
            System.out.println(arrayStack.toString());
            //probamos que funciono vaciar y llenar nuevamente la pila
            System.out.println(arrayStack.toString());

        } catch (StackException e) {
            throw new RuntimeException(e);
        }
    }

}