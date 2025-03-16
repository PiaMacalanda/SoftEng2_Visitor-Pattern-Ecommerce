interface ShippingCostCalculator {
    
    double calculateShipping(Chair chair);
    double calculateShipping(Table table);
    double calculateShipping(Sofa sofa);
}