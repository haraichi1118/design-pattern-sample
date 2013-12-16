package sample.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 監視される生徒　田中
 * @author tsuiki
 *
 */
public class StudentTanaka extends Observable {

    // 生徒の名前
    String studentName = "田中";
    // 状態
    String status = "";

    /**
    * 観察者に通知します。
    * @param オブジェクト
    */
    public void notifyObservers(Object arg) {
        String str = (String) arg;

        // 直前に与えられた引数と同じならそのままリターン
        if (str.equals(status)) {
            return;
        }

        // 状態を設定
        status = str;
        setChanged();

        List<String> param = new ArrayList<String>();
        param.add(studentName);
        param.add(status);

        // 通知
        super.notifyObservers(param);

        clearChanged();
    }

}
