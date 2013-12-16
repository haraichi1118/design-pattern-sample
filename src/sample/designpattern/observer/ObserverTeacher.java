package sample.designpattern.observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 監視する人　先生
 * @author tsuiki
 *
 */
public class ObserverTeacher implements Observer {

    @SuppressWarnings("unchecked")
    @Override
    public void update(Observable o, Object arg) {

        List<String> str = (List<String>) arg;
        System.out.println("私は先生(observer)です。生徒の" + str.get(0) + "さんの健康状態を検知したよ。" + str.get(1));
    }

}
