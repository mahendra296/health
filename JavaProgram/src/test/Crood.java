
package test;


public class Crood {
    public static void main(String[] args) {
        int i;
        String s="";
        for(i=1;i<=100;i++){
            if(i%3==0 || i%5==0){
           // System.out.println(i);
            s=s+i+",";
            }
            
        }
        
            System.out.println(s);
    }
 
}
