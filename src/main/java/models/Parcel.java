package models;

public class Parcel {
    public int height;
    public int width;
    public int length;
    public int weight;
    public int volume;


    public Parcel(int height, int width, int length, int weight, int volume) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.volume = height * width * length;

    }

    public int costToShip(String speed){
        if (speed.equals("Standard")){
            if (this.volume <= 1000 && this.weight <= 100){
                return this.volume / 100;
            } else if (this.volume >= 1000 && this.weight <= 100){
                return this.volume / 50;
            } else if (this.volume <= 1000 && this.weight >= 100) {
                return this.volume / 33;
            } else{
                return this.volume / 25;
            }
        } else {
            if (this.volume <= 1000 && this.weight <= 100){
                return this.volume / 50;
            } else if (this.volume >= 1000 && this.weight <= 100){
                return this.volume / 33;
            } else if (this.volume <= 1000 && this.weight >= 100) {
                return this.volume / 25;
            } else{
                return this.volume / 10;
            }
        }
    }
}
