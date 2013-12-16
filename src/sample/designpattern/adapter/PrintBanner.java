package sample.designpattern.adapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String banner) {
        super(banner);
    }

    @Override
    public void printStrong() {
        showWithParen();
    }

    @Override
    public void printWeak() {
        showWithAster();
    }
}
