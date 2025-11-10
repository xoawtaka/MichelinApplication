public enum Allergens {
    GLUTEN("(?i)gluten"),
    NUTS("(?i)nuts"),
    SOY("(?i)soy"),
    FISH("(?i)fish"),
    DAIRY("(?i)dairy");

    // make so that allergen excludes specific dishes
    // OR make so that allergens are boolean that get marked on order
    // ^ this would mean that something like 'Allergens: blah blah blah' would be listed on order, 
    // following 'this order will be made without (Allergen)'

}


   /* public Allergens hasAllergy(Scanner input, boolean hasAllergyGluten, boolean hasAllergyNuts, boolean hasAllergySoy,
                              boolean hasAllergyFish, boolean hasAllergyDairy) {
        switch (this) {
            case GLUTEN:
                hasAllergyGluten = true;
                System.out.println("No Gluten");
            case NUTS:
                hasAllergyNuts = true;
                System.out.println("No Nuts");
            case SOY:
                hasAllergySoy = true;
                System.out.println("No Soy");
            case FISH:
                hasAllergyFish = true;
                System.out.println("No Fish");
            case DAIRY:
                hasAllergyDairy = true;
                System.out.println("No Dairy");
        }
        
        return this;
    }*/




// gluten, nuts, soy, fish, dairy