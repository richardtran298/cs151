
public class Arrays {
    
    public static int[] swapLargestAndSmallest(int[] a) 
    {
        int largest = 0;
        int largestIndex = 0;
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int temp;
        
        if (a.length == 1) 
        {
           return a; 
        }    
        else 
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] > largest)
                {
                    largest = a[i];
                    largestIndex = i;
                }
                if (a[i] < smallest)
                {
                    smallest = a[i];
                    smallestIndex = i;
                }
                
            }
            temp = a[largestIndex];
            a[largestIndex] = a[smallestIndex];
            a[smallestIndex] = temp;
            
            return a;
        }
    }
}
