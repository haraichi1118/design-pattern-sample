package sample.designpattern.observer;

/**
 * 【observerパターン】
 * 
 * あるインスタンスの状態が変化した際に、そのインスタンス自身が、「観察者」に状態の変化を「通知」する仕組みです。
 * 例えば、飛行機の搭乗券について考えて見ましょう。
 * 飛行機の搭乗券を購入した人がキャンセルする必要に駆られた場合、航空会社に連絡してキャンセルする旨を伝えます。
 * 各搭乗者を管理しているのは「航空会社」で、キャンセルを伝えるのは「搭乗者」となっています。
 * 「搭乗者」は、チケットが欲しくなったり、いらなくなったりしたら「航空会社」に連絡します。
 * ごく当たり前のことですが、このような仕組みによって、航空会社は全てのユーザを常に観察する必要からのがれられるのです。
 * 
 * このように、状態が変化する方が「通知」をする仕組みを持つことで、観察者は常に観察しなければいけない状態から開放されます。
 * 
 * @author tsuiki_kenji
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
