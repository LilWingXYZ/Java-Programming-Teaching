import javax.swing.*;

public class StringTest{
  String string1,string2,string3,string4;
  byte[] byte1 = {72,101,108,111,32,110,101,119,32,87,111,114,108,100};
  char[] char2 = {'H','e','l','l','o',' ','n','e','w',' ','W','o','r','l','d'};
  public StringTest(){
    string1 = new String();
    string2 = new String(byte1,6,6);
    string3 = new String(char2,0,5);
    string4 = JOptionPane.showInputDialog("Input a String:");

    System.out.println();
    System.out.println("String1:" + string1);
    System.out.println("String2:" + string2);
    System.out.println("String3:" + string3);
    System.out.println("String4:" + string4);
  }
  public static void main(String[] args){
    StringTest st = new StringTest();
    System.exit(0);
  }
}