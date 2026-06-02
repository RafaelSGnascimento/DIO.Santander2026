public final class Manager extends Employee {
    private String login;
    private String password;
    private double bonus;

    public void setLogin(String login) {
        this.login = login;
    }  

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}