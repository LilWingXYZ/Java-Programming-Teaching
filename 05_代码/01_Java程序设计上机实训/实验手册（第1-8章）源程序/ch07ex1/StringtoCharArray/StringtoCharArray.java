public class StringtoCharArray{
  public static void main(String[] args){
    String b = "abcdef";
    b = b.concat("123456");
    int i = b.length();
    System.out.println(i);
    char a[] = b.toCharArray();  //将b的字符转换为数组
    for(int j=0;j<i;j++)
      System.out.print(a[j] + "\t");
    System.out.println();
    for(int j=0;j<i;j++)
      System.out.print(b.charAt(j) + "\t");
  }
}