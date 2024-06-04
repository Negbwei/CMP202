public class MyStack {
    public static void main(String[] args) {
        Stack mystack = new Stack(5);
        mystack.push(6);
        mystack.push(6);
        mystack.push(6);
        mystack.pop();

        mystack.printAll();
    }
}
