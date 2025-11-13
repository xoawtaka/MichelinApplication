public class DrinkPricing {

    private DrinkPricing() {
    }

    public static double scaledPrice(double basePriceFor80z, FluidOz size) {
        double sizeFactor = (double) size.ounces() / 8;
        double idk = basePriceFor80z * sizeFactor;
        return (double) Math.round(idk * 100) / 100;
    }
}

