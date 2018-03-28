//creating class which implements Runnable interface
class AreaSquare implements Runnable
{    
    //run method to create thread
    public void run()
    {   
        int[] len = {5,6,7};
        for (int i = 0; i< len.length; i++ )
        {
         int area = len[i] * len[i];    
                 System.out.println("Area is " + area);
        }
        }
}    

class PeriSquare implements Runnable
{    
    public void run()
    {
        int[] len = {7,8,9};
        for (int i = 0; i< len.length; i++ )
        {
         int perimeter = 4 * len[i];    
                 System.out.println("Perimeter is " + perimeter); 
        }
    }
}

class ThreadTesting
{
    //main method
    public static void main(String args[])
    {
        //creating class object
        AreaSquare a = new AreaSquare();
        //thread object
        Thread thread1 = new Thread(a);
        //invoking run method
        thread1.start();
        
        PeriSquare b = new PeriSquare();
        Thread thread2 = new Thread(b);
        thread2.start();
       
    }
}   
