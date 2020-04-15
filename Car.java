public class Car {
  
  String msg_accelerator;
  String msg_brake;

  public Car(){
    this.msg_accelerator = "アクセルを踏みました。";
    this.msg_brake = "ブレーキを踏みました。";
  }

  public void accelerator(){
    System.out.println(msg_accelerator);
  }

  public void brake(){
    System.out.println(msg_brake);
  }

}