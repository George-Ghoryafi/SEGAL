public class Player {
    public static void main(String[] args) throws Exception {
        Thread1 objA = new Thread1();
        Thread2 objB = new Thread2();
        objA.start();
        try {
            Thread.sleep(400);
        } catch (Exception e) {
        }
        objB.start();
        
    }
}