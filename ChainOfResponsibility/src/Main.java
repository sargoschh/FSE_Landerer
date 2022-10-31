public class Main {
    public static void main(String[] args) {
        Chain chain1 = new Addieren();
        Chain chain2 = new Subtrahieren();
        Chain chain3 = new Multiplizieren();
        Chain chain4 = new Dividieren();

        chain1.setNextInChain(chain2);
        chain2.setNextInChain(chain3);
        chain3.setNextInChain(chain4);

        chain1.calculateNumbers(5,4,"null");

    }
}