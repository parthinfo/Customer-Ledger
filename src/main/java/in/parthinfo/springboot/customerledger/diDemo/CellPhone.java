package in.parthinfo.springboot.customerledger.diDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CellPhone {

    private int cId;
    private String cBrand;
    private String cModel;

    @Autowired
    @Qualifier("sdCard")
    private Ram cRam;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcBrand() {
        return cBrand;
    }

    public void setcBrand(String cBrand) {
        this.cBrand = cBrand;
    }

    public String getcModel() {
        return cModel;
    }

    public void setcModel(String cModel) {
        this.cModel = cModel;
    }

    public Ram getcRam() {
        return cRam;
    }

    public void setcRam(Ram cRam) {
        this.cRam = cRam;
    }

    public String toString() {
        return "Phone with id=" + cId + ", Brand=" + cBrand + ", Model=" + cModel + ".";
    }

    public String show() {
        return "New Phone object created.";
    }

}
