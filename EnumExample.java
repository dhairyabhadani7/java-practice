package JavaPractice;

enum Status{
    PENDING,
    APPROVED,
    REJECTED
}


public class EnumExample {
    public static void main(String[] args) {
        Status currentStatus =Status.PENDING;
        System.out.println("Current Status: " + currentStatus);

        if(currentStatus==Status.PENDING){
                 System.out.println("Request is still pending.");
        }

        for(Status s: Status.values()){
            System.out.println(s);
        }
        
    }
}
