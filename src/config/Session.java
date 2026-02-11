package config;

public class Session {
    private static Session instance;
    private int id;
    private String name;
    private String email;
    private String userType;

    private Session() {}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public int getUserId() { return id; }
   
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
   
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }
    
    public void setUserData(String name, String email, String userType, String userId) {
        this.name = name;
        this.email = email;
        this.userType = userType;
        try {
            this.id = Integer.parseInt(userId);
        } catch (NumberFormatException e) {
            this.id = 0;
        }
    }
    
    public void clearSession() {
        this.id = 0;
        this.name = "";
        this.email = "";
        this.userType = "";
    }
}