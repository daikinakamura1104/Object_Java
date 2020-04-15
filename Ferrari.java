public class Ferrari extends Car{

  String name;
  Integer price;
  Integer capacity;
  Integer speed;
  Integer height;
  Integer liftupheight;
  Double liftupspeed;

  public Ferrari(){
    this.name = "Ferrari";
    // 他の車より価格が高い
    this.price = 1000;
    // 他の車より定員数が少ない
    this.capacity = 2;
    // 他の車よりスピードが早い
    this.speed = 120;
    this.height = 80;
  }

  public void introduction(){
    System.out.println(name+"車の価格は"+price+"万円です。定員数は"+capacity+"人です。加速は"+speed+"km/hです。");
  }

  public void height()  {
    System.out.println(name+"車のリフトアップ前の車高は"+height+"cmです。加速は"+speed+"km/hです。");
  }

  public void liftup(){
    // リフトアップ後の車高と加速性能
    this.liftupheight = height + 4;
    this.liftupspeed = speed * 0.8;
    // double型をint型に変換できるようにする。
    System.out.println(name+"車はリフトアップを行いました。高さは"+liftupheight+"cmに変わります。加速は"+liftupspeed+"km/hに変わります。");
  }

  public void liftdown(){
    if(liftupheight != null){
      System.out.println("リフトダウンを行いました。");
    }else{
      System.out.println("リフトアップを行っていないため、リフトダウンはできません。");
    }
  }
}