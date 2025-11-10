public enum FluidOz {
    OZ_8(8),
    OZ_12(12),
    OZ_16(16),
    OZ_20(20),
    OZ_24(24);

    private final int ounces;

    FluidOz(int ounces) {
        this.ounces = ounces;
    }

    public int ounces() {
        return ounces;
    }

    public int toMilliliters() {
        return (int) Math.round(ounces * 29.5735);
    }
}
// 8 oz (shot—expresso, liquor, etc), 12 oz, 16 oz, 20 oz, 24 oz