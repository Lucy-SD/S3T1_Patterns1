package level2.concreteProducts;

import level2.abstractProducts.Address;

public class SpainAddress implements Address {
    private final String street;
    private final int number;
    private final String postalCode;
    private final String city;

    public SpainAddress(String street, int number, String postalCode, String city){
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String getFullAddress() {
        return "Dirección: " + street + " " + number + ".\n" + postalCode + " - " + city + ", España." ;
    }
}
