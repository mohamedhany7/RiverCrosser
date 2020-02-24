package rivercrosser;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Farmer implements ICrosser {
    
    String str;
    BufferedImage [] image = new BufferedImage[2];
    int weight,flag;
    
    
    public Farmer(int weight,int flag) {
        try {
        image [0] = ImageIO.read(new File(url+"farmer.png"));
        image [1] = ImageIO.read(new File(url+"farmer.png"));
    } catch (IOException e) {
        }
        this.weight = weight;
        this.flag = flag;
    }
    
    @Override
    public boolean canSail() {
        return true;
    }

    @Override
    public int getEatingRank() {
        return -2;
    }

    @Override
	public BufferedImage[] getImages() {
            return image;
	}
        
    @Override
    public ICrosser makecopy() {
        Farmer f = new Farmer(weight,flag);
        return f;

    }

    @Override
    public void setLabeltobeshown() {
        if (flag == 0) 
        str = "Farmers can sail,can't be eaten or eats";
        else str = "Farmers can sail & have weight of " + weight + "Kg";
    }

    @Override
    public String getLabelToBeShown() {
        return str;
    }

    @Override
    public double getweight() {
        return weight;
    }
}
