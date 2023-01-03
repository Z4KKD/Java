public class myRun implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0;i<10;i++){
            System.out.println("Thread #2: "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Thread #2 is finished");
    }
    
}
