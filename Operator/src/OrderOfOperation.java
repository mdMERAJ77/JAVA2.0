public class OrderOfOperation {
    public static void main(String[] args) {
        System.out.println(9/3*3);      // B,O,D,M,A,S {'Bracket()' 'Order[root,square]' 'Divide/' 'Multiply*' 'Add+' 'Subtract-'}
        System.out.println(9/3/3);    // Here Same Operator Then Solve Left to Right

        System.out.println(9/(3/3));  // first priority Bracket()
        System.out.println(9/(5-2));

        System.out.println("\n");

        System.out.println(9/3*6/6);
        System.out.println(9/3*2/6);
    }
}