package sample.designpattern.adapter;

public class AdapterMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Print p = new PrintBanner("Hello Wirld!");

        p.printStrong();
        p.printWeak();

        TestAdapter testAdapter = new TestAdapter("testAdapter!!");

        testAdapter.printParenAndAster();

    }

}
