class StandardShippingCalculator implements ShippingCostCalculator {
    
    @Override
    public double calculateShipping(Chair chair) {

        return 15.0 + (chair.getWeight() * 0.1);
    }

    @Override
    public double calculateShipping(Table table) {

        return 25.0 + (table.getWeight() * 0.2);
    }

    @Override
    public double calculateShipping(Sofa sofa) {

        return 35.0 + (sofa.getWeight() * 0.3);
    }
}