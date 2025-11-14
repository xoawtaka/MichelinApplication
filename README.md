Michelin Star Plaza

A Multi-Cuisine, Fully Customizable Java Restaurant Order Engine

Michelin Star Plaza is a modular, extensible Java console application that simulates a full fine-dining ordering workflow.
It supports multiple cuisines, category-based menus, user customizations, allergens, delivery priority options, and clean UI output.

The project emphasizes modern Java techniques such as records, LinkedHashMap, Optional, streams, separation of concerns, and immutable domain modeling.

⸻

Features

Multi-Cuisine Support

The user may choose from:
	•	FrenchCuisine
	•	JapaneseCuisine
	•	AmericanCuisine
	•	MediterraneanCuisine

Each cuisine seeds its own menu, preparation timing, and items.

Category-Organized Menus

Menus are automatically organized and displayed using the CourseCategories enum:
DRINKS
APPETIZERS
SALADS
MAIN_COURSE
SIGNATURES
CHEF_SPEC
DESSERT


Generic Dish Customization System

Every dish supports a full suite of customizations. These are stored externally and applied without modifying core domain classes.

Current customization options:
	•	Portion size (Regular, Large, Family)
	•	Spice level (Mild, Medium, Hot, Extra Hot)
	•	Protein temperature (Rare → Well-done)
	•	Bread/base options (White, Wheat, Brioche, Sourdough, Lettuce Wrap)
	•	Cheese options
	•	Sauce handling (Normal, Extra, On Side, None)
	•	Side choices (Fries, Salad, Vegetables, Rice)
	•	Free-text notes (e.g., “cut in half”, “extra crispy”)

Customizations are stored using:

// Map<CustomerOrder, String> customNotes

which keeps them decoupled from the domain model.

Allergen-Aware Ordering

Supported allergens:
	•	gluten
	•	nuts
	•	soy
	•	fish
	•	dairy
	•	egg
	•	sesame

All user allergen entries are aggregated using Optional-based reduction and printed in summary form.

Delivery Priority Engine

Each priority level affects preparation time:

VIP - 0.5x
PRIORITY - 0.75x
REGULAR — 1x
PACED 1.25x

Preparation Time Calculation

Prep time is computed using:
ceil( Σ(categoryUnits × quantity)
      × restaurant.unitMinutes
      × deliveryFactor )


Category “units” come from CourseCategories and simulate workload weighting.

Order Summary Output

Users receive:
	•	Item details and quantities
	•	All customizations
	•	Total price
	•	Estimated prep time
	•	Allergy notes

All formatting handled through MichelinAppUi.

⸻

Architecture Overview:
src/
 ├─ MainMichelinDisplay.java          // Application runner, selection flow, customization pipeline
 ├─ MichelinAppUi.java                // Console UI, formatting, structured presentation
 ├─ Restaurant.java                   // Abstract base class for cuisines
 ├─ MenuItem.java                     // Immutable menu item representation
 ├─ CourseCategories.java             // Course enum with prep multipliers
 ├─ DeliveryPriorities.java           // Priority enum with time factor
 ├─ Allergens.java                    // Allergen enum and parsing
 │
 ├─ cuisines/
 │   ├─ FrenchCuisine.java
 │   ├─ JapaneseCuisine.java
 │   ├─ AmericanCuisine.java
 │   └─ MediterraneanCuisine.java
 │
 └─ util/ (helpers)


Key Java Concepts Used

Records

CustomerOrder is implemented as a Java record.
Records provide:
	•	Immutability
	•	Auto-generated equals(), hashCode(), and toString()
	•	Perfect semantics for representing value-based data
	•	Strong suitability as Map keys

LinkedHashMap

Used for storing customization notes:

// Map<CustomerOrder, String> customNotes = new LinkedHashMap<>();
^^ 
LinkedHashMap ensures:
	•	Predictable iteration order
	•	Clean, stable output in the summary
	•	Same runtime performance as HashMap


Optional

Used for clean, null-safe allergy aggregation.

Java Streams

Used throughout for:
	•	Category sorting
	•	Total price computation
	•	Time estimation
	•	Allergen reduction

Static Architecture

A single customization ledger is stored using:
// private static Map<CustomerOrder, String> customNotes;
 
Extending the Application

Add a New Cuisine
	1.	Create a new class extending Restaurant.
	2.	Seed the new cuisine’s menu using addToMenu().
	3.	Add the cuisine to the list in MainMichelinDisplay.

No changes needed in any other classes.

Add a New Customization Option

Modify only the customization helper inside MainMichelinDisplay.
Core models remain untouched.

⸻

Possible Future Enhancements
	•	Price adjustments based on customization choices
	•	Printable receipt format
	•	Persisted order history
	•	JavaFX or Swing GUI
	•	JSON-driven menu loading
	•	API layer for a web-based interface

⸻

Author

Jonathan Ward

