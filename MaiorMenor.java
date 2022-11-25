package laco02;
import java.util.Scanner;

public class casacmg  {

	public static void main(String[] args) {

      Scanner in = new Scanner (System.in);
      
      string zap, insta;
		   
      for (int i=0;i<=10;i++) {
    	  
    	  System.out.println("Passa o zap: ");
    	  zap = in.next();
    	  
    	  System.out.println("Passa o insta: ");
    	   insta = in.next();
    	  
    	  resposta = ("ZapZap: "+zap+' , Insta:'+insta);
    	  
    	  System.out.println("Sua resposta é: "+resposta);
	      
      }
		System.out.println("Passei o zap: "+zap);
		System.out.println("Passei o insta: "+insta);
}
}
