package Packaging;

public class RectangularPackage extends Package {
    public double base_area;
    public double height;

    public RectangularPackage(Object content, String ref_code, double unity_cost, double base_area, double height) {
        super(content, ref_code, unity_cost);
        setBase_area(base_area);
        setHeight(height);
    }

    public double getBase_area() {
        return base_area;
    }
    public double getHeight() {
        return height;
    }
    public void setBase_area(double base_area) {
        this.base_area = base_area;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return base_area * height;
    }
}
