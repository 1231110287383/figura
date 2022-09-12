public abstract class figura {
    private String color;

    public figura(String color) { //constructor
        this.color = color;
    }

    public String getColor() { //metodo getter
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
