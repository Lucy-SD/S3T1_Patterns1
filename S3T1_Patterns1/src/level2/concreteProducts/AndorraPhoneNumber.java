package level2.concreteProducts;

import level2.abstractProducts.PhoneNumber;

public class AndorraPhoneNumber implements PhoneNumber {
    private final String number;

    public AndorraPhoneNumber(String number) {
        if(!number.matches("\\d{6}")) throw new IllegalArgumentException
                ("Un número telefónico de Andorra debe tener 6 dígitos.");
        this.number = number;
    }
    public String getFullPhoneNumber() {
        return "Número de teléfono: +376 " + number + ".\n";
    }
}
