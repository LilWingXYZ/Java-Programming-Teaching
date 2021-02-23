import javax.swing.JOptionPane;

public class StringExe{
  public static void main(String[] args){
    String s1,s2,s3,s4,output;
    s1 = new String("您好!");
    s2 = new String("再见!");
    s3 = new String("祝您长寿!");
    s4 = new String("祝您长寿!");
    output = "s1 = " + s1 + "\ns2 =" + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
    //
    if(s1.equals("您好!"))
      output += "s1的内容是\"您好!\"\n";
    else
      output += "s1不是\"您好!\"\n";
    //
    if(s1 == "您好!")
      output += "s1引用地址同于\"您好!\"\n";
    else
      output += "s1引用地址不同于\"您好!\"\n";
    //
    if(s3.equalsIgnoreCase(s4))
      output += "s3排序同于s4\n";
    else
      output += "s3排序不同于s4\n";
    //
    output += "\ns1.compareTo(s2) is " + s1.compareTo(s2) + 
              "\ns2.compareTo(s1) is " + s2.compareTo(s1) + 
              "\ns1.compareTo(s1) is " + s1.compareTo(s1) +              "\ns3.compareTo(s4) is " + s3.compareTo(s4) + 
              "\ns4.compareTo(s3) is " + s4.compareTo(s3) +  
              "\n\n"; 
    if(s3.regionMatches(0,s4,0,5))
      output += "s3与s4前5个字符匹配\n";
    else
      output += "s3与s4前5个字符不匹配\n";
    JOptionPane.showMessageDialog(null,output,"显示字符串类得构造方法",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}