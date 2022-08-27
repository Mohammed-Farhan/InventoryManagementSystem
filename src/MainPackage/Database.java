package MainPackage;

import java.io.Serializable;

/**
 *
 * @author sadiq
 */
public class Database implements Serializable {
    
    int itemcode;
    String itemname;
    float mrp;
    int quantity;

    public Database(int itemcode, String itemname, float mrp, int quantity) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.mrp = mrp;
        this.quantity = quantity;
    }

    public int getItemcode() {
        return itemcode;
    }

    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}