public class a1 {
    public static void main(String[] args) {
    
        Thread myThread = new Thread(() -> {
        
            System.out.println("Running thread task...");
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        myThread.setName("MyThread");
        myThread.start();

      
        System.out.println("Thread Name: " + myThread.getName());
        System.out.println("Thread ID: " + myThread.getId());
      System.out.println("Is thread alive? " + myThread.isAlive());
        
        try {
            myThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Is thread alive after task completion? " + myThread.isAlive());
    }
}
