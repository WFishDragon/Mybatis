package pojo;

public class Employ {
    private int cid;
    private String cname;
    private String gender;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
