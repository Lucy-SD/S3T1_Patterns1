package level2.addressBook;

import level2.abstractFactory.InternationalFactory;
import level2.abstractProducts.Address;
import level2.abstractProducts.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private static class Entry {
        private final Address address;
        private final PhoneNumber phone;

        public Entry(Address address, PhoneNumber phone) {
            this.address = address;
            this.phone = phone;
        }
    }

    private final List<Entry> entries = new ArrayList<>();

    public void addEntry(InternationalFactory factory, String street, int number,
                         String postalCode, String region, String phoneNumber){
        Address address = factory.createAddress(street, number, postalCode, region);
        PhoneNumber phone = factory.createPhoneNumber(phoneNumber);
        entries.add(new Entry(address, phone));
    }

    public void displayEntries() {
        for (Entry entry : entries) {
            System.out.println(entry.address.getFullAddress());
            System.out.println(entry.phone.getFullPhoneNumber());
        }
    }
}
