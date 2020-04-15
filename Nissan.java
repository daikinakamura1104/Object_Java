public class Nissan extends Car{

  String name;
  Integer price;
  Integer capacity;
  Integer speed;

  public Nissan(){
    this.name = "Nissan";
    // 他の車より価格が安い
    this.price = 180;
    this.capacity = 6;
    this.speed = 60;
  }

  public void introduction(){
    System.out.println(name+"車の価格は"+price+"万円です。定員数は"+capacity+"人です。加速は"+speed+"km/hです。");
  }
}