package Packaging;

public abstract class Package extends Box {
    private String referenceCode;
    private double unityCost;

    public Package(Object content, String ref_code, double unity_cost) {
        super(content);
        setReferenceCode(ref_code);
        setValue(unity_cost);
    }

    public String getReferenceCode() {
        return referenceCode;
    }
    public double getValue() {
        return unityCost;
    }
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
    public void setValue(double unity_cost) {
        this.unityCost = unity_cost;
    }

    public abstract double getVolume();
}
