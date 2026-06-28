package OOP.ClassNObject;

public class AccessModify {
    String text;
    int number;
    float decimal;

    // Setter methods use for setting the value of private variables
    public void setText(String text) {
        this.text = text;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setDecimal(float decimal) {
        this.decimal = decimal;
    }

    // Getter methods use for getting the value of private variables

    public String getText() {
        return text;
    }
    public int getNumber() {
        return number;
    }
    public float getDecimal() {
        return decimal;
    }


    public static void main(String[] args) {
        AccessModify accessModify = new AccessModify();
        accessModify.setText("Hello");
        accessModify.setNumber(10);
        accessModify.setDecimal(3.14f);

        System.out.println("Text: " + accessModify.getText());
        System.out.println("Number: " + accessModify.getNumber());
        System.out.println("Decimal: " + accessModify.getDecimal());
    }

}
