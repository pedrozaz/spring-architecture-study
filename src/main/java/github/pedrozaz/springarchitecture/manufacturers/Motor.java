package github.pedrozaz.springarchitecture.manufacturers;

public class Motor {
    private String model;
    private Integer horses;
    private Integer cylinders;
    private Double liters;
    private MotorType type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorses() {
        return horses;
    }

    public void setHorses(Integer horses) {
        this.horses = horses;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }

    public MotorType getType() {
        return type;
    }

    public void setType(MotorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", horses=" + horses +
                ", cylinders=" + cylinders +
                ", liters=" + liters +
                ", type=" + type +
                '}';
    }
}
