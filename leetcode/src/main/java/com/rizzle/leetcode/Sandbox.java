package main.java.com.rizzle.leetcode;

public class Sandbox {

}

interface Message {

  static String getSender(){
    return "";
  };
  String getDestination();
  default String getTextSuper(){
    return "text mane";
  };
}

abstract class BaseMessage implements Message {
  protected String sender;
  protected String dest;
  public BaseMessage(String sn, String dst) {
    sender = sn;
    dest = dst;
  }

  @Override
  public String getDestination(){
    return "";
  }

  abstract String whoDidIt();
}

class CipherMessage extends BaseMessage {

  protected String text;

  public CipherMessage(String sender, String destination, String text) {
    super(sender, destination);
    this.text = this.whoDidIt();
    this.readAllTexts();
    super.getTextSuper();

  }

  @Override
  public String getTextSuper() {
    return text;
  }

  @Override
  String whoDidIt() {
    return "it was me";
  }

  private void readAllTexts(){
    System.out.println(this.getTextSuper());
    System.out.println(this.getDestination());
    System.out.println(this.whoDidIt());
  }
}
