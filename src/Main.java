import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  int[] ar =new int[5];
  Scanner s=new Scanner(System.in);
  // input:
        for( int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
  // calculation:
  int sum=0;   int  min=ar[0];int max=ar[0];int even=0;int odd=0;
  double avg;

        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
            if(ar[i]<min)
                min=ar[i];
            if (ar[i]>max)
                max=ar[i];
            if(ar[i]%2==0)
                even++;
            else
                odd++;
        }
        avg=(double) sum/ar.length;
        System.out.print("SUM:"+sum+", AVG:"+avg+", MIN:"+min+" ,MAX:"+max+" ,EVEN:"+even+" ,ODD:"+odd);
        // reverse the array
        System.out.println("  reverse: ");
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+", ");
        }


        }
    }


