package AutomationCourse;

public class CarWithEnum {
    private String carName;
    private TypeCar type;
    private String color;
    private Integer doorCount;

    public CarWithEnum(String carName, TypeCar type, String color, Integer doorCount) {
        this.carName = carName;
        this.type = type;
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public String getCarName() {
        return carName;
    }

    public TypeCar getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    @Override
    public String toString() {
        return "CarWithEnum{" +
                "carName='" + carName + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }
}
