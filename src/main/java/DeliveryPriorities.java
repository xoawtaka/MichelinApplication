public enum DeliveryPriorities {
    VIP(0.5),
    PRIORITY(0.75),
    REGULAR(1),
    PACED(1.25);

    private final double timeDeliveryIndicator;

    DeliveryPriorities(double timeDeliveryIndicator) {
        this.timeDeliveryIndicator = timeDeliveryIndicator;
        // todo: guard that timeDeliveryIndicator > 0
        // why: negative or zero breaks multiplier semantics
    }

    public double getTimeDeliveryIndicator() {
        return timeDeliveryIndicator;
    }
    // todo: add optional price impact if rush service costs more
    // why: aligns time and pricing policies
}
// vip, priority, regular, take-your-time
