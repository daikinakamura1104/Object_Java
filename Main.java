public class Main{
  public static void main(String[] args) {
    // インスタンス作成
    Car car = new Car();
    Honda honda = new Honda();
    Nissan nissan = new Nissan();
    Ferrari ferrari = new Ferrari();

    // 各車の性能
    // honda.introduction();
    // Carクラスのアクセル処理、ブレーキ処理を継承。
    // honda.accelerator();
    // nissan.introduction();
    // ferrari.introduction();

    // フェラーリ、リフトアップ・リフトダウン
    // ferrari.height();
    // ferrari.liftup();
    // ferrari.liftdown();

    // ランダム生成
    honda.create();
    honda.calculation();
  }
}