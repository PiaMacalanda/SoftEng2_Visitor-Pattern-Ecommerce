class ExpressShippingCalculator implements ShippingCostCalculator {
    
    @Override
    public double calculateShipping(Chair chair) {
        return 25.0 + (chair.getWeight() * 0.15);
    }

    @Override
    public double calculateShipping(Table table) {
        return 40.0 + (table.getWeight() * 0.25);
    }

    @Override
    public double calculateShipping(Sofa sofa) {
        return 60.0 + (sofa.getWeight() * 0.4);
    }
}