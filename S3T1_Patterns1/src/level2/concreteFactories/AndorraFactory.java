package level2.concreteFactories;

import level2.abstractFactory.InternationalFactory;
import level2.abstractProducts.Address;
import level2.abstractProducts.PhoneNumber;
import level2.concreteProducts.AndorraAddress;
import level2.concreteProducts.AndorraPhoneNumber;

public class AndorraFactory implements InternationalFactory {

    @Override
    public Address createAddress(String street, int number, String postalCode, String parish) {
        return new AndorraAddress(street, number, postalCode, parish);
    }
    public PhoneNumber createPhoneNumber(String number) {
        return new AndorraPhoneNumber(number);
    }
}