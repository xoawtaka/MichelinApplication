public enum CourseCategories {
    DRINKS(0.1),
    APPETIZERS(0.25),
    SALADS(0.25),
    MAIN_COURSE(1),
    SIGNATURES(1.25),
    CHEF_SPEC(2),
    DESSERT(1);

    private final double timeIndicatorUnit;

    CourseCategories(double timeIndicatorUnit) {
        this.timeIndicatorUnit = timeIndicatorUnit;
        // todo: guard that timeIndicatorUnit > 0
        // why: zero/negative units break time estimation math
    }
    public double getTimeIndicatorUnit() {
        return timeIndicatorUnit;
    }
    // todo: priceMultiplier if category should affect price
    // why: keeps pricing logic colocated with category semantics
}

// ordersize — drinks (0.1), appetizers (0.25), salads (0.25), main course (1), signatures (1.25), chef spec. vip options (2) (subscription requisite), dessert (1)

// drinks, appetizers, salads, main course, signatures, chef spec. vip options? (subscription requisite), dessert