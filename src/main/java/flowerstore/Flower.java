package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter  @Setter @ToString

public class Flower {
    public int price;
//    private double price;
    private double sepalength;
    private int[] color;
    private Flowertype flowertype;

    public Flower() {

    }

    public void setColor(int[] color){

        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(Flowertype flowertype){

        this.flowertype = flowertype;
    }

}


