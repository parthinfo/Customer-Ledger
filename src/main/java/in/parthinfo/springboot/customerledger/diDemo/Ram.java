package in.parthinfo.springboot.customerledger.diDemo;

import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component("sdCard")
public class Ram
{
    @Id
    @GeneratedValue
    private int rId;
    private String rBrand;
    private int rSize;

    public String getrBrand() {
        return rBrand;
    }

    public void setrBrand(String rBrand) {
        this.rBrand = rBrand;
    }

    public int getrSize() {
        return rSize;
    }

    public void setrSize(int rSize) {
        this.rSize = rSize;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String toString() {
        return "This is new RAM!!!";
    }
}

