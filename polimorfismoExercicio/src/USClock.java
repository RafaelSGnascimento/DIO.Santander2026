public final class USClock extends Clock {
    @Override
    public Clock convert(Clock clock) {
        int hours = clock.getHours();
        int minutes = clock.getMinutes();
        int seconds = clock.getSeconds();

        USClock usClock = new USClock();
        usClock.setHours(hours);
        usClock.setMinutes(minutes);
        usClock.setSeconds(seconds);

        return usClock;
    }
    private String amPm;
    public String getAmPm() {
        return amPm;
    }
    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }

    @Override
    public void setHours(int hours) {
        if (hours >= 12 || "AM".equals(getAmPm())) {
            this.setAmPm("PM");
            super.setHours(hours - 12);
        } else {
            this.setAmPm("AM");
            super.setHours(hours);
        }
    }
}
