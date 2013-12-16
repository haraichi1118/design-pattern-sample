package sample.designpattern.adapter;

public class Banner {

    // 表示文字
    private String showString;

    public Banner(String banner) {
        this.showString = banner;
    }

    /**
     * 括弧で挟んで表示
     */
    public void showWithParen() {
        System.out.println("showWithParen# (" + showString + ")");
    }

    /**
     * アスタリスクで挟んで表示
     */
    public void showWithAster() {
        System.out.println("showWithAster# *" + showString + "*");
    }

}
