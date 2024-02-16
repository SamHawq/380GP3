package edu.ucalgary.oop;

import org.junit.*;
public class Supply {
    private String type;
    private int quantity;

    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Supply otherSupply = (Supply) obj;
        return quantity == otherSupply.quantity && type.equals(otherSupply.type);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + quantity;
        return result;
    }
}
