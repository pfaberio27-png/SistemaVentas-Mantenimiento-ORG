package service;

public class DescuentoVIP implements IDescuentoStrategy {
    public double aplicar(double monto) {
        return monto * 0.20;
    }

}
