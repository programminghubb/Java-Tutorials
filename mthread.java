// Creating class which extends Thread class
class AreaSquare extends Thread
{    
//  run method to create thread
    public void run()
    {   
        //defining array of lengths
        int[] len = {5,6,7,8,9};
        // defining loop to iterate array
        for (int i = 0; i< len.length; i++ )
        {
        //calculating area
             int area = len[i] * len[i];
        //sleep method to pause execution of thread
        try{
            
             sleep(100);
        }
        catch(Exception e)
        {
         
        }   
      System.out.println("Area is " + area);
        }
    }
    
}

class PeriSquare extends Thread
{    
    public void run()
    {
        int[] len = {5,6,7,8,9};
        for (int i = 0; i< len.length; i++ )
        {
         int perimeter = 4 * len[i];
         try
         {
            
             sleep(100);
         }
         catch(Exception e)
         {
           

         }  
          System.out.println("Perimeter is " + perimeter); 
        }
    }
}

class ThreadTesting
{
    // main method
    public static void main(String args[])
    {
        //initializing created thread
        new AreaSquare().start();
        new PeriSquare().start();
    }
} 
