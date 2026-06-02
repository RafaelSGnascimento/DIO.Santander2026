public class App {
    public static void main(String[] args) throws Exception {
        Clock brlclock = new BRLClock();
        brlclock.setHours(17);
        brlclock.setMinutes(0);
        brlclock.setSeconds(0);

        System.out.println("BRL Clock: " + brlclock.getHours() + ":" + brlclock.getMinutes() + ":" + brlclock.getSeconds());
        Clock usClock = new USClock();
        usClock = usClock.convert(brlclock);
        System.out.println("US Clock: " + usClock.getHours() + ":" + usClock.getMinutes() + ":" + usClock.getSeconds() + " " + ((USClock) usClock).getAmPm());
    }
}
