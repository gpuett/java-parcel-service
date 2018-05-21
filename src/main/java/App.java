import models.Parcel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){

        boolean programRunning = true;
        while(programRunning){
            System.out.println("Welcome to EPS, the Epicodus Postal Service. What type of shipping would you like to use today: Standard of Expedited?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String shippingType = bufferedReader.readLine();
                System.out.println("Great! Now we will gather the dimensions of your parcel. What is the height of the package in inches?");
                int inputHeight = Integer.parseInt(bufferedReader.readLine());
                System.out.println("What is the width of the package?");
                int inputWidth = Integer.parseInt(bufferedReader.readLine());
                System.out.println("What is the length of the package?");
                int inputLength = Integer.parseInt(bufferedReader.readLine());
                System.out.println("What is the weight of the package in pounds?");
                int inputWeight = Integer.parseInt(bufferedReader.readLine());
                int inputVolume = inputHeight*inputWidth*inputLength;
                Parcel userParcel = new Parcel(inputHeight, inputWidth, inputLength, inputWeight, inputVolume);
                int userPrice = userParcel.costToShip(shippingType);
                System.out.println("Okay, the price to ship will be:");
                System.out.println("$" + userPrice);
                programRunning = false;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
