package level2.concreteProducts;

import level2.abstractProducts.Address;

public class AndorraAddress implements Address {
    private final String street;
    private final int number;
    private final String postalCode;
    private final String parish;

    public AndorraAddress(String street, int number, String postalCode, String parish) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.parish = parish;
    }

    @Override
    public String getFullAddress() {
        return "Dirección: " + street + " " + number + ".\n" + postalCode + " - " + parish + ", Andorra.";
    }
}

