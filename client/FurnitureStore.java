class FurnitureStore {
    public static void main(String[] args) {

        Furniture diningChair = new Chair("Dining Chair", 5.0, "18x20x35");
        Furniture officeChair = new Chair("Office Chair", 12.0, "24x26x42");
        Furniture diningTable = new Table("Dining Table", 45.0, "72x36x30");
        Furniture coffeeTable = new Table("Coffee Table", 20.0, "48x24x18");
        Furniture sectionalSofa = new Sofa("Sectional Sofa", 85.0, "120x84x36");
        Furniture loveSeat = new Sofa("Love Seat", 40.0, "60x36x36");

        ShippingCostCalculator standardShipping = new StandardShippingCalculator();
        ShippingCostCalculator expressShipping = new ExpressShippingCalculator();
        ShippingCostCalculator economyShipping = new EconomyShippingCalculator();

        System.out.println("🚛Standard Shipping Costs");
        printShippingCost(diningChair, standardShipping);
        printShippingCost(diningTable, standardShipping);
        printShippingCost(sectionalSofa, standardShipping);

        System.out.println("\n🚚Express Shipping Costs");
        printShippingCost(officeChair, expressShipping);
        printShippingCost(coffeeTable, expressShipping);
        printShippingCost(loveSeat, expressShipping);

        System.out.println("\n🛻Economy Shipping Costs");
        printShippingCost(diningChair, economyShipping);
        printShippingCost(coffeeTable, economyShipping);
        printShippingCost(loveSeat, economyShipping);

        // Comparing shipping options for the same item
        System.out.println("\n💲Shipping Comparison for Dining Table");
        System.out.printf("🚛Standard: ₱%.2f\n", diningTable.accept(standardShipping));
        System.out.printf("🚚Express: ₱%.2f\n", diningTable.accept(expressShipping));
        System.out.printf("🛻conomy: ₱%.2f\n", diningTable.accept(economyShipping));
    }

    private static void printShippingCost(Furniture item, ShippingCostCalculator calculator) {
        String itemType = item.getClass().getSimpleName();
        String itemModel = "";
        
        if (item instanceof Chair) {
            itemModel = ((Chair) item).getModel();
        } else if (item instanceof Table) {
            itemModel = ((Table) item).getModel();
        } else if (item instanceof Sofa) {
            itemModel = ((Sofa) item).getModel();
        }
        
        System.out.printf("%s (%s): ₱%.2f\n", 
                          itemType, 
                          itemModel,
                          item.accept(calculator));
    }
}