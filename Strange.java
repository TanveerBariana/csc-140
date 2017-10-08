
public class Strange{
   public static void main(String args[]){
      
      for(long i= 1000; i<= 100000; i= i+ 1000){
         long startTime = System.currentTimeMillis();
         strange(i);
         long endTime = System.currentTimeMillis();
         long t = endTime - startTime;
         System.out.println(i); 
      }
   }
   public static void strange(long n){
      long n2; 
      if(n< 3){
         return;
      } else{
         strange(n/3);
         strange(n/3);
         n2= n*n;
      }
      
      for(long i=0; i< n2; i++){
      }
   }
}