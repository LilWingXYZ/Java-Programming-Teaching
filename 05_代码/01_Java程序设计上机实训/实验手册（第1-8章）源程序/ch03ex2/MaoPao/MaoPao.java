public class MaoPao{
  static void sort(int num[]){
    for(int i=0;i<num.length;i++){
      for(int j=i+1;j<num.length;j++){
        if(num[i]>num[j]){
          int temp;
          temp = num[i];num[i] = num[j];num[j] = temp;
        }
      }
    }
  }
  public static void main(String[] args){
    int num[] = {2,45,23,12,5,34,65,46,34,28};
    sort(num);
    for(int i=0;i<num.length;i++)
      System.out.print(num[i] + "\t");
  }
}