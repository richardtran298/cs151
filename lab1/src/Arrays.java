
public class Arrays {

    int largest = 0;
    int largestIndex;
    int smallest = Integer.MAX_VALUE;
    int smallestIndex;
    
    public int[] swapLargestAndSmallest(int[] a) 
    {
        if (a.length == 1) 
        {
           return a; 
        }    
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
        int temp = a[largestIndex];
        a[largestIndex] = a[smallestIndex];
        a[smallestIndex] = temp;
        
        return a;
    }
    
}
