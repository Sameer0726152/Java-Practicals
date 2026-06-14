public class multithreadedchat
{
    static class Chatuser extends Thread
    {
        private String[] messages;
        Chatuser(String name, int priority, String[] messages)
        {
            setName(name);
            setPriority(priority);
            this.messages = messages;
        }

        public void run()
        {
            for(String message : messages)
            {
                System.out.println(getName() + ": " + message + "\n");
                try
                {
                    Thread.sleep(1000);
                }catch(InterruptedException e)
                {
                    System.out.println(getName() + " was interrupted");
                }
            }
            System.out.println(getName() + "Left the chat");
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        Chatuser Alice = new Chatuser("Alice", Thread.MAX_PRIORITY, new String[]{"Hi everyone!", "How are you all doing?", "I have to go now, bye!"});
        Chatuser Bob = new Chatuser("Bob", Thread.NORM_PRIORITY, new String[]{"Hello Alice!", "I'm doing well, thanks for asking.", "See you later!"});
        Chatuser Charlie = new Chatuser("Charlie", Thread.MIN_PRIORITY, new String[]{"Hey Alice!", "I'm good, how about you?", "Catch you later!"});
        Alice.start();
        Thread.sleep(500);
        Bob.start();
        Thread.sleep(500);
        Charlie.start();
        Thread.sleep(500);
        System.out.println(Alice.isAlive());
        System.out.println(Bob.isAlive());
        System.out.println(Charlie.isAlive());
        Alice.join();
        Bob.join();
        Charlie.join();
        System.out.println("Everyone offline");
        System.out.println(Alice.isAlive());
        System.out.println(Bob.isAlive());
        System.out.println(Charlie.isAlive());
    }
}