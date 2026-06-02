public final class BRLClock extends Clock {
    @Override
    public Clock convert(Clock clock) {
        int hours = clock.getHours();
        int minutes = clock.getMinutes();
        int seconds = clock.getSeconds();

        BRLClock brlClock = new BRLClock();
        brlClock.setHours(hours);
        brlClock.setMinutes(minutes);
        brlClock.setSeconds(seconds);

        return brlClock;
    }
}
