
package DesignPattern.ProducerConsumerPatternUsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



//Producer Class in java
public class ProducerConsumerPatternUsingBlockingQueue {

    public static void main(String args[]){
  
        int queueSize=10;
     //Creating shared object
     BlockingQueue sharedQueue = new ArrayBlockingQueue(queueSize); //LinkedBlockingQueue();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer(sharedQueue));
     Thread consThread = new Thread(new Consumer(sharedQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
    }
 
}
class Producer implements Runnable {

    private final BlockingQueue sharedQueue;

    public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
        //System.out.println(sharedQueue.size());
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
               // System.out.println("Check Produced :");
            } catch (InterruptedException ex) {
                System.out.println("Error is Producer");
            }
        }
    }

}

//Consumer Class in Java
class Consumer implements Runnable{

    private final BlockingQueue sharedQueue;

    public Consumer (BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
    @Override
    public void run() 
    {
        while(true){
            try {
                //if()
                System.out.println("Consumed: "+ sharedQueue.take());
               // System.out.println("Check Consumer :");
            } catch (InterruptedException ex) {
                System.out.println("Error is Consumer");
            }
           
            if(sharedQueue.isEmpty())
                break;
            
        //System.out.println("Check Consumer :");
        
        }
    }
  
  
}


//You see Producer Thread  produced number and Consumer thread consumes it 
//in FIFO order because blocking queue allows elements to be accessed in FIFO.




//Read more: http://javarevisited.blogspot.com/2012/02/producer-consumer-design-pattern-with.html#ixzz2tgeCfcxo
