package level2;

import level2.abstractFactory.InternationalFactory;
import level2.addressBook.AddressBook;
import level2.concreteFactories.AndorraFactory;
import level2.concreteFactories.SpainFactory;

public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        InternationalFactory spainFactory = new SpainFactory();
        book.addEntry(spainFactory, "Diagonal", 122, "08012", "Barcelona", "631750234");

        InternationalFactory andorraFactory = new AndorraFactory();
        book.addEntry(andorraFactory, "La Creu", 17, "AD501", "Arinsal", "532147");

        book.displayEntries();

    }
}