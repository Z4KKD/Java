public class MyThread extends Thread{

    /* Test threads
    @Override 
    public void run(){
        if(this.isDaemon())
        {
            System.out.println("Test is running and is daemon");
        }
        else{
        System.out.println("Test is running"); }
    }
    */   
    @Override
    public void run(){

         for(int i = 10;i>0;i--){
            System.out.println("Thread #1: "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Thread #1 is finished");
    }
      
}