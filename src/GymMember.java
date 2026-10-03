public class GymMember {

    private int id;
    private String name;
    private int age;
    private String phone;
    private String plan;
    private int duration;

    public GymMember() {
    }

    public GymMember(String name, int age, String phone, String plan, int duration) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.plan = plan;
        this.duration = duration;
    }

    public GymMember(int id, String name, int age, String phone, String plan, int duration) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.plan = plan;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getPlan() {
        return plan;
    }

    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}