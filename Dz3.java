import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dz3 {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList <Integer>();
     
        number.add(12);
        number.add(9);
        number.add(72);
        number.add(33);
        number.add(36);
     
        System.out.println(number);
     
        for (int i=0;i<number.size();i++){      
            int even=number.get(i)%2;       
             if (even==0){
                 number.remove(i);
             }    
         }
     
         Collections.sort(number);
         System.out.println(number);
     
      }
}