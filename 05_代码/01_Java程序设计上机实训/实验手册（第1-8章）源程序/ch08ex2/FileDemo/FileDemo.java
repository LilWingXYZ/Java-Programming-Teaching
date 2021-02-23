import java.io.*;

public class FileDemo{
  public static void printAllFile(File f){
    System.out.println(f.getName());
    //isDirectory()测试此抽象路径名表示的文件时否是一个目录，是 返回true否返回false
    if(f.isDirectory()){
      //listFile()返回一个抽象路径名数组，这些路径名表示的目录中的文件
      File[] f1 = f.listFiles();
      int len = f1.length;
      for(int i=0;i<len;i++)
        printAllFile(f1[i]);
    }
  }
  public static void deleteAllFile(File f){
    if(f.isFile())
      f.delete();
    else{
      File[] f1 = f.listFiles();
      int len = f1.length;
      for(int i=0;i<len;i++)
        deleteAllFile(f1[i]);
     // f.delete();
    }
  }
  public static void main(String[] args){
    File f1 = new File("book");
    printAllFile(f1);
    File f2 = new File("test");
    deleteAllFile(f2);
  }
}