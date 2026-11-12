package javafundamentals;

public class Instsncvaluse {
// byte is the 1byte=8bits 2^7
// The menimum byte valu is -128 to127 	
	byte b=127;
	byte b1=(byte)128;
	byte b2=(byte)250;
// short is 2 bytes=16 bits 2^15
// short -32768 to 32767	
    short s=32767;
    short s1=(short)32768;
    short s2=b2;
// int is 4 bytes = 32 bits 2^31
// int -2147483648 to 2147483648
    
    int i=20;
    int i1=757756777;
    int i2=(int)8764664876982687L;
 // the value is out of range int take long L
    
 // long is 8bytes =64bits 2^63   
    long l=726826647L;
    long l1=984639879328563988L;
 // float is 4byte= 32bits   
    float f=5.10F;
    float f1=75457254255.8347756352F;
    float f2=7254664864186476484876476874868F;
  //double is 8bytes = 64bits  
    double d=56.876688D;
    double d1=527862754726.862868D;
    
  //char is 2bytes=32bits
    char c='a';
    char c1=67;
    char c2='\u0046';
    char c3='\u0020';
   //boolean 1bit
    boolean boo=true;
    
    public static void main(String[]args) {
    	
    	 Instsncvaluse j1 =new Instsncvaluse();
    	 
    	 System.out.println("byte b:"+j1.b);
    	 System.out.println("byte b1:"+j1.b1);
    	 System.out.println("byte b2:"+j1.b2);
    	 System.out.println("short s:"+j1.s);
    	 System.out.println("short s1:"+j1.s1);
    	 System.out.println("short s2:"+j1.s2);
    	 
		 if(j1.boo) {
    	      
    		 System.out.println("good morning !");
		 }
    	 }
    }
    
    
    

