package sample.model;

public class Contato {

    private String wpp;
    private String email;
    private String twitter;

    public String getWpp() {
        return wpp;
    }

    public void setWpp(String wpp) {
        this.wpp = wpp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "\nWpp: " + wpp +
                "\nEmail: " + email +
                "\nTwitter: " + twitter;
    }
}
