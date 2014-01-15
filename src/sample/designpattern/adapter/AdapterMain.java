package sample.designpattern.adapter;

/**
 * 【Adapterパターン】
 * 
 * Adapterパターンは、インタフェースに互換性の無いクラス同士を組み合わせることを目的としたパターンです。
 * これまで利用していたメソッドと同じ機能を、よりすぐれた形で提供するメソッドを持つクラスの存在を知ったとします。
 * しかし、このすぐれたメソッドは、これまで利用していたメソッドとは異なるインタフェースを持つため、
 * 乗り換えるとなると多大な変更を余儀なくされる場合があります。
 * こんなとき、この2つのメソッドのインタフェースの違いを吸収してやる Adapterを準備することで、
 * 少ない変更で新しいメソッドに乗り換えることができるのです。
 * 
 * @author tsuiki_kenji
 *
 */
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
