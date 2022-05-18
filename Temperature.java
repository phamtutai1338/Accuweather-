package jdbcdemo.Accuweather;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Temperature {
    private double value;
    private String unit;
    private long unitType;

    public Temperature(double value, String unit, long unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getUnitType() {
        return unitType;
    }

    public void setUnitType(long unitType) {
        this.unitType = unitType;
    }
}