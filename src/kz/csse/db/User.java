package kz.csse.db;

public class User {
    private Long id;
    private String  email;
    private String name;
    private String password;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
