public class Dividieren implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextInChain(Chain next) {
        this.nextInChain = next;
    }

    @Override
    public void calculateNumbers(int number1, int number2, String how) {
        if(how.equals("div")) {
            System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
        } else {
            System.out.println("Es kann nur add, sub, multi und div eingegeben werden!");
        }
    }
}
