package day04;

public class Member {
    private String name;
    private Long ID;
    private String password;

    public Member(String name, Long ID, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public Member() {

    }

    public String getName() {
        return name;
    }

    public Long getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
