package JavaPractice;

enum Role  {
    ADMIN("High access"),
    USER("Limited access"),
    GUEST("Read only");
    private String description;
    
    Role(String  description){
        this.description=description;
    }
    public String getDescription() {
        return description;
    }

}

public class EnumWithMethods {
  public static void main(String[] args) {
    Role role = Role.ADMIN;
    System.out.println("Role: " + role);
    System.out.println("Description: " + role.getDescription());
  } 
}