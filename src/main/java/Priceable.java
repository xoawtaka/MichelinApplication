public interface Priceable {
    double getPrice();
    // todo: ensure implementations never return negative values
    // why: negative price corrupts totals and discounts logic
}

// this will be the interface that will provide a price