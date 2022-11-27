public class Door {
    int width;
    int height;
    boolean open;

    public door(int width, int height, boolean open) {
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor(){
        this.open = open;
        System.out.println("Opening door");
    }
    public void closeDoor(){
        this.open = false;
        System.out.println("Closing door");
    }
    public void printOpen(){
        System.out.println("The door is " + this.open);
    }
    public int calculateSurface(){
        int surface = this.width * this.height;
        System.out.println(surface);
    }
}
