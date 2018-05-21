package models;

public class Parcel {
    public int height;
    public int width;
    public int length;
    public int weight;

    public Parcel(int height, int width, int length, int weight) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public int volume(int height, int width, int length){
        return (this.height * this.width * this.length);
    }

    public int costToShip(){

    }
}
