public class ExceptionTest{
  public static void main(String[] args){
    for(int i=0;i<4;i++){
      int k;
      try{
        switch(i){
          case 1:int zero = 0;
                 k = 911/zero;
                 break;
          case 2:int b[] = null;
                 k = b[0];
                 break;
          case 3:int c[] = new int[2];
                 k = c[9];
                 break;
          case 4:char ch = "abc".charAt(99);
                 break;
        }
      }
      catch(Exception e){
        System.out.println("\nTestcase #" + i + "\n");
        System.out.println(e);
      }
    }
  }
}