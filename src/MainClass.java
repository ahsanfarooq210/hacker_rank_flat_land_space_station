import java.util.Arrays;

public class MainClass
{
  public static void main(String[] args)
  {
    int arr[]={0 ,4};
    int n=5;
    System.out.println(flatlandSpaceStations(n,arr));
  }
  static int flatlandSpaceStations(int n, int[] c)
  {
    if(n==c.length)
    {
      return 0;
    }

    int arr[]=new int[n];
    int min=Integer.MAX_VALUE;
    boolean flag=true;
    for(int i=0;i<n;i++)
    {
      min=Integer.MAX_VALUE;
      for (int j=0;j<c.length;j++)
      {
        flag=true;
        if(i==c[j])
        {
          flag=false;
          break;
        }
        else
        {
          if(Math.abs(c[j]-i)<min)
          {
            min=Math.abs(c[j]-i);
          }
        }
      }
      if (flag!=false)
      arr[i]=min;
    }

    int ans=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>ans)
      {
        ans=arr[i];
      }
    }


    return ans;
  }
}
