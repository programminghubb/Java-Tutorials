class Oddnum{  
     //defining synchronized method
    synchronized void printoddnum(int n){ 
       for(int i=1;i<=n;i+=2){
               System.out.println(i);
           }  
         try{  
          Thread.sleep(500);  
         }catch(Exception e){System.out.println(e);}  
       }  
      
     }  
    class Thread1 extends Thread{  
        Oddnum o;
        Thread1(Oddnum o){
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
    public static void main(String args[]){  
    Oddnum object = new Oddnum(); 
    Thread1 t1 = new Thread1(object);  
    Thread2 t2 = new Thread2(object);  
    t1.start();  
    t2.start(); 
    }  
    }  
