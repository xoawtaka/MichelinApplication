public enum FluidOz {
    OZ_8(8),
    OZ_12(12),
    OZ_16(16),
    OZ_20(20),
    OZ_24(24);

    private final int ounces;

    FluidOz(int ounces) {
        this.ounces = ounces;
        // todo: guard that ounces > 0
        // why: prevents invalid sizes
    }

    public int ounces() {
        return ounces;
    }
}
// 8 oz (shot—expresso, liquor, etc), 12 oz, 16 oz, 20 oz, 24 oz