import javax.swing.JOptionPane;

public class InputDemo4{
  String str = "两数之和是：";
  float number1,number2;
  public InputDemo4(){
    number1 = Float.parseFloat(JOptionPane.showInputDialog("请输入一个实数："));    
    number2 = Float.parseFloat(JOptionPane.showInputDialog("请输入一个实数："));
    str = str + (number1+number2);
    JOptionPane.showMessageDialog(null,str);
  }
  public static void main(String[] args){
    InputDemo4 ct = new InputDemo4();
    System.exit(0);
  }
}