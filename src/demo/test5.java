package demo;

public class test5 {
	 public static void main(String args[]){
		 int n=123,t,rev=0,r;
		 t=n;
		 while(n>0){
			 r=n%10;
			 rev=rev*10+r;
			 n=n/10;
		 }
			 System.out.println(rev);

}
}