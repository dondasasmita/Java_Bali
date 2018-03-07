package part_04.exercise7;

public class StackController {

    public static void main(String[] args) {

        Stack theStack = new Stack(3);

        theStack.push('a');
        theStack.push('b');
        theStack.push('c');

        theStack.pop();

        theStack.displayStack(0);
        theStack.displayStack(1);
        theStack.displayStack(2);

        theStack.push('d');

        theStack.displayStack(0);
        theStack.displayStack(1);
        theStack.displayStack(2);

    }
}
