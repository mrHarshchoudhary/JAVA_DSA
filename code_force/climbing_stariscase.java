package code_force;
public class climbing_stariscase {
  
  public static int count(int n){
    //if start with 0 step then   base case 0 and 1 only 
    //dp[0] = 1; 
   // dp[1] = 1; 
    int []arr=new int[n+1];
    if(n<=0)return 0;
    if(n==1)return 1;
    if(n==2)return 2;
    arr[1]=1;
    arr[2]=2;
    for(int i=3;i<=n;i++){
      arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n];
  }
 public static void main(String[] args) {
  int n=3;
  int key=count(n);
  System.out.println("the number of way to step:" + key);
 }
}
