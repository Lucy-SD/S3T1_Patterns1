package level2.concreteFactories;

import level2.abstractFactory.InternationalFactory;
import level2.abstractProducts.Address;
import level2.abstractProducts.PhoneNumber;
import level2.concreteProducts.SpainAddress;
import level2.concreteProducts.SpainPhoneNumber;

public class SpainFactory implements InternationalFactory {

    public Address createAddress(String street, int number, String postalCode, String city) {
        return new SpainAddress(street, number, postalCode, city);
    }
    public PhoneNumber createPhoneNumber(String number) {
        return new SpainPhoneNumber(number);
    }
}
