//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    double doubleinitial = 5000;
    double doubleInterest = 0.17;
    double doubleMonth1 = doubleinitial * doubleInterest + doubleinitial;
    double doubleMonth2 = doubleMonth1 * doubleInterest + doubleMonth1;

    System.out.println("With a initial amount of " + doubleinitial + " and an interest rate of " + doubleInterest + ", the amount due after month 1 is " + doubleMonth1 + " and the amount due after month 2 is " + doubleMonth2);

    }
}