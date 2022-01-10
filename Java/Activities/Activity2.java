package activities;

public class Activity2 {

    public boolean checkSumof10Is30(int[]a)
    {
        int sum=0;
        for(int b:a)
        {
            if(b==10)
                sum=sum+b;
        }
        if(sum==30)
            return true;
        else
            return false;
    }

    public static void main(String[]args)
    {

        Activity2 act2=new Activity2();
        int[]arr={10,77,10,54,-11,10};
      boolean result=act2.checkSumof10Is30(arr);
      System.out.println(result);


    }

}
