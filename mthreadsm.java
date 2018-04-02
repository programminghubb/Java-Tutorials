class Oddnum{ 
    defining method which is not synchronized   
    void printoddnum(int n){
    //loop
       for(int i=1;i<=n;i+=2){
               System.out.println(i);
           }  
         try{  
         //sleep method from thread class
          Thread.sleep(500);  
         }catch(Exception e){System.out.println(e);}  
       }  
      
     }  
     //creating class which extends thread
    class Thread1 extends Thread{  
        Oddnum o;
        Thread1(Oddnum o){
            //this keyword to refer current object 
            this.o=o;
        }
        
        public void run(){
        o.printoddnum(10);
        
    }
      
    }  
    class Thread2 extends Thread{    
        Oddnum o;
        Thread2(Oddnum o){
            this.o=o;
        }
        
        public void run(){
        o.printoddnum(20); 
    
    }  
    }  
      
    class ThreadTesting{  
    //main method
    public static void main(String args[]){  
    //Creating object to access Oddnum class
    Oddnum object = new Oddnum();
    //creating thread
    Thread1 t1 = new Thread1(object);  
    Thread2 t2 = new Thread2(object);  
    //starting thread by invoking run()
    t1.start();  
    t2.start();  
    }  
    } 
