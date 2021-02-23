import java.io.*;

public class ReadFile{
  public static void main(String[] args)throws Exception{
    String filename,s,t;
    int n = 0;
    long leng,filepoint;
    RandomAccessFile file = new RandomAccessFile("text.txt","rw");
    leng = file.length();
    t = args[1];
    //以下循环语句完成将从选项行接受到的数字字符转换成整数类型
    for(int i=0;i<t.length();i++)
      n = 10*n + (int)(t.charAt(i)-48);
    //将文件指针向前移动最后n个字符，请注意这里为何要将长整型转换为整型
    file.skipBytes((int)(leng-n));
    filepoint = file.getFilePointer();
    while(filepoint<leng){
      s = file.readUTF();   //读取内容并赋值给变量s
      System.out.println(s);
      filepoint = file.getFilePointer();
    }
    file.close();
  }
}