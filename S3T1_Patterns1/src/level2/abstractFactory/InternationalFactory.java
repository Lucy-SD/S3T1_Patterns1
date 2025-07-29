package level2.abstractFactory;

import level2.abstractProducts.Address;
import level2.abstractProducts.PhoneNumber;

public interface InternationalFactory {
    Address createAddress(String street, int number, String postalCode, String region);
    PhoneNumber createPhoneNumber(String number);
}
