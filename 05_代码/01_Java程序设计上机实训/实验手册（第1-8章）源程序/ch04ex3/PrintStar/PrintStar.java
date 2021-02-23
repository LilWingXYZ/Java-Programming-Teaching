public class PrintStar {
  public static void main(String[] args) {
    int[][] snow=new int[5][];
    for(int i=0;i<snow.length  ;i++)
      snow[i]=new int[2*i+1];
    for(int i=0;i<snow.length;i++){
      for(int j=0;j<snow[i].length;j++){
        snow[i][j]='*';
      }
    }
    int n = 1;
    for(int i=0;i<snow.length;i++){
      for(int k=0;k<snow.length-i+n;k++){
        System.out.print(" ");
      }
      for(int j=0;j<snow[i].length;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
