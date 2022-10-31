public class Subtrahieren implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain next) {
        this.nextInChain = next;
    }

    @Override
    public void calculateNumbers(int number1, int number2, String how) {
        if(how.equals("sub")) {
            System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
        } else {
            this.nextInChain.calculateNumbers(number1, number2, how);
        }
    }
}
