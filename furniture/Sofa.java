class Sofa implements Furniture {
    
    private double weight;
    private String dimensions;
    private String model;

    public Sofa(String model, double weight, String dimensions) {
        this.model = model;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double accept(ShippingCostCalculator calculator) {
        return calculator.calculateShipping(this);
    }
}