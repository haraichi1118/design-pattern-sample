package sample.designpattern.adapter;

public class TestAdapter extends Banner {

    public TestAdapter(String banner) {
        super(banner);
    }

    /**
     * 括弧とアスタリスクを両方表示する
     */
    public void printParenAndAster() {
        System.out.println("testAdaper3#printParenAndAster ");
        showWithParen();
        showWithAster();
    }

}
