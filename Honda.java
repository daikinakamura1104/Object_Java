import java.util.ArrayList;
import java.util.Random;

public class Honda extends Car{

  String name;
  Integer price;
  Integer capacity;
  Integer speed;
  ArrayList <Integer>prices  = new ArrayList<>();

  

  public Honda(){
    this.name = "Honda";
    // ランダム数の生成を行う時はRandomクラスを使う
    this.price = 200;
    // 他の車より定員数が多い
    this.capacity = 8;
    this.speed = 60;
  }

  public void introduction(){
    System.out.println(name+"車の価格は"+price+"万円です。定員数は"+capacity+"人です。加速は"+speed+"km/hです。");
  }

  public void create(){
    final Random rnd = new Random();
    Integer num = rnd.nextInt(20);
    // rndはインデックス0から生成されるので、1を足して数を整える。
    Integer correctnum = num + 1;
    System.out.println(name+"車を"+correctnum+"台ランダム数生成しました。");
    for (int i = 0; i <= num; i++){
      prices.add((int) rnd.nextInt(80) + 190);
    }
  }

  public void calculation(){
    // 合計金額を求める。
    int sum = 0;
    int size = prices.size();
    for(int i = 0; i < size; i++){
      Integer tmp = prices.get(i);
      sum += tmp.intValue();
    }
    System.out.println("合計金額は"+sum+"万円です。");
    // 平均金額を求める。
    int avg = sum / prices.size();
    System.out.println("平均金額は"+avg+"万円です。");
  }
}