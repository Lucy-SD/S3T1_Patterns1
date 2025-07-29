package level2.concreteProducts;

import level2.abstractProducts.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber {

    private final String number;

    public SpainPhoneNumber(String number) {
        if(!number.matches("\\d{9}")) throw new IllegalArgumentException
                ("Los números de teléfono españoles deben tener 9 dígitos.");
        this.number = number;
    }

    @Override
    public String getFullPhoneNumber() {
        return "Número de teléfono: +34 " + number + ".\n";
    }
}
