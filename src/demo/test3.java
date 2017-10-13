package demo;

public class test3 {
	 public static void main(String args[]){
		 int n=1441,t,rev=0,r;
		 t=n;
		 while(n>0){
			 r=n%10;
			 rev=rev*10+r;
			 n=n/10;
		 }
	 if(t==rev){
		 System.out.println("it is palindrome");
	 }
	 else{
		 System.out.println("not a palindrome");
	 }
	 }
	 
}
