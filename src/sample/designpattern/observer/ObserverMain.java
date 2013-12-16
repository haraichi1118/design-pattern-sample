package sample.designpattern.observer;

/**
 * observerパターンのメイン処理
 * @author tsuiki
 *
 */
public class ObserverMain {

    public static void main (String[] args) {

       //監視される人を生成
        StudentTanaka tanaka = new StudentTanaka();
        StudentSuzuki suzuki = new StudentSuzuki();

        //監視者を追加
        ObserverTeacher observer = new ObserverTeacher();

        tanaka.addObserver(observer);
        suzuki.addObserver(observer);

        //監視者に通知
        tanaka.notifyObservers("元気");
        suzuki.notifyObservers("風邪気味");

        // 状態が変化したら通知されるようになっている
        tanaka.notifyObservers("元気");
        suzuki.notifyObservers("元気");

    }
}
