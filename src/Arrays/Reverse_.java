package Arrays;

public class Reverse_ {

	public static void main(String[] args) {
	   String s="khurshid";
	   String result="";
	   char[] arr=s.toCharArray();
	   for(int i=0;i<arr.length;i++) {
		   result=arr[i]+result;   
	   }
	   System.out.println(result);

	}

}
