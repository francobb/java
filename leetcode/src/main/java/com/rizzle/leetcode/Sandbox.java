package main.java.com.rizzle.leetcode;

public class Sandbox {

}

interface Message {


//  protected String sender;
//  protected String dest;

  static String getSender(){
    return "";
  };
  String getDestination();
  String getText();
}

abstract class BaseMessage implements Message {
  protected String sender;
  protected String dest;
  public BaseMessage(String sn, String dst) {
    sender = sn;
    dest = dst;
  }
  static String getSender(){
    return "";
  };

  @Override
  public String getDestination(){
    return "";
  }
}

class CipherMessage extends BaseMessage {

  protected String text;

  public CipherMessage(String sender, String destination, String text) {
    super(sender, destination);
//    this.text = CryptoUtils.encrypt(text); // just an example, suppose it's OK
  }

  @Override
  public String getText() {
    return text;
  }
}
