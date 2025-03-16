class EconomyShippingCalculator implements ShippingCostCalculator {
    
    @Override
    public double calculateShipping(Chair chair) {
        return Math.max(10.0, chair.getWeight() * 0.08);
    }

    @Override
    public double calculateShipping(Table table) {
        return Math.max(15.0, table.getWeight() * 0.15);
    }

    @Override
    public double calculateShipping(Sofa sofa) {
        return Math.max(20.0, sofa.getWeight() * 0.25);
    }
}