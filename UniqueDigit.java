@author TalhaMarghoob


public class Unik {
    public static void main(String[] args)
    {
        Unik obj= new Unik();
        Uni(22344566);
    }
    private static void Uni( int input)
    {
        int count=0,temp=0;
        int[] arr=new int[10];
        while(input!=0)
        {
            temp=input%10;
            arr[temp]++;
            input=input/10;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
                count++;
        }

        System.out.print(count);
    }


}
