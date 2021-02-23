public class FileTypeDemo{
  public static void main(String[] args){
    String path = "c:\\myfile\\2010\\result.txt.txt";
    int index = path.lastIndexOf("\\");
    String fileName = path.substring(index);
    String newName = fileName.replace(".txt",".java");
    System.out.println(path);
    System.out.println(fileName);
    System.out.println(newName);
  }
}