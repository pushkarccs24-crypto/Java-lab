interface Innernotify {
    abstract void sendNotification(String msg);
    default void prepareAndSend(String msg){
        format(msg);
    }
    private void format(String msg){
        System.out.println("This is private!");
    }
    
}

class email implements Innernotify{
    public void prepareAndSend(String msg){
        System.out.println("Alert from email");
    }

}

class sms implements Innernotify{
     public void prepareAndSend(String msg){
        System.out.println("Alert from sms");
    }
}

public class notify {
    public static void main(String[] args) {
        System.out.println("Enter a message to be notified");
    }
}
