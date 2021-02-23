import java.io.*;

public class FileOperation{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String sdir = "test";
      String sfile;
      File Fdir1 = new File(sdir);
      if(Fdir1.exists() && Fdir1.isDirectory()){
        System.out.println("There is a directory " + sdir + " exist.");
        for(int i=0;i<Fdir1.list().length;i++)
          System.out.println((Fdir1.list())[i]);
        File Fdir2 = new File("test\\temp");
        if(!Fdir2.exists())
          Fdir2.mkdir();
        System.out.println();
        System.out.println("Now the new list after create a new dir:");
        for(int i=0;i<Fdir1.list().length;i++)
          System.out.println((Fdir1.list())[i]);
        System.out.println();
        System.out.println("Enter a file name in this directory:");
        sfile = br.readLine();
        File Ffile = new File(Fdir1,sfile);
        if(Ffile.isFile()){
          System.out.println("File " + Ffile.getName() + " in Path " + Ffile.getPath() + " is " + Ffile.length() + " in length.");
        }
        else
          System.out.println("The file not't exist!");
      }
      else
        System.out.println("the directory doesn't exist!"); 
    }
    catch(IOException e){
      System.out.println(e.toString());
    }
  }
}