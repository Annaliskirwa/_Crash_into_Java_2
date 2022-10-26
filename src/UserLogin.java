public class UserLogin {
    private String name;
    private Long id;
    private String loginDate;
    private String loginDuration;

//    Constructor
    public UserLogin(String name, Long id, String loginDate, String loginDuration) {
        this.name = name;
        this.id = id;
        this.loginDate = loginDate;
        this.loginDuration = loginDuration;
    }

//    Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginDuration() {
        return loginDuration;
    }

    public void setLoginDuration(String loginDuration) {
        this.loginDuration = loginDuration;
    }

//    to string

    @Override
    public String toString() {
        return name + " " + id + " " + loginDate + "\t" + loginDuration +"\n\n";
    }
}
