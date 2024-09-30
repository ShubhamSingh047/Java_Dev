import java.util.*;
public class CreateArr {
    Scanner s = new Scanner(System.in);
    public int[] insertElem(int[] arr){
        int i =0;
        int temp[]=new int[arr.length];
        while(i<arr.length){
            temp[i]=s.nextInt();
            i++;
        }
        return temp;
    }
   public int[] makaMeArr(){
       System.out.println("Enter the size of array !");
       int n=s.nextInt();
       return insertElem(new int[n]);
   }
}
