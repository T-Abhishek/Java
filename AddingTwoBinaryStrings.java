//java program to add two binary strings
public class binaryAdd{
  //function to add two binary strings
  static String add_Binary(String x,String y)
  {
    String result="";
    int d=0;
    
    int k=x.lenght()-1,l=y.length()-1;
    
    while(k>0||l>.||d==1){
      d += ((k >= 0) ? x.charAt(k) - '0' : 0);
      d += ((l >= 0) ? y.charAt(l) - '0' : 0);
  
      // When the current digit's sum is either
      // 1 or 3 then add 1 to the result
      resuslt = (char)(d % 2 + '0') + res;
  
      // Computing carry
      d /= 2;
  
      // Moving to the next digits
      k--;
      l--;
    }
    return res;
    }
  
    // The Driver code
    public static void main(String args[])
    {
        String x = "011011", y = "1010111";
  
        System.out.print(add_Binary(x, y));
    }
}
