package rivercrosser;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Herbivorus implements ICrosser {
    
    String str;
    BufferedImage [] image = new BufferedImage[2];
    int x;
    
    public Herbivorus(int x) {
        switch (x){
            case 1: {try {
                            image [0] = ImageIO.read(new File(url+"goat.png"));
                            image [1] = ImageIO.read(new File(url+"goat.png"));
                        } catch (IOException e) {
                        }
                    }break;
            case 2: {try {
                            image [0] = ImageIO.read(new File(url+"sheep.png"));
                            image [1] = ImageIO.read(new File(url+"sheep.png"));
                        } catch (IOException e) {
                        }
                    }break;
    }
        this.x = x; 
    }

    @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public int getEatingRank() {
        return 1;
    }

    @Override
	public BufferedImage[] getImages() {
		return image;
	}
    @Override
    public ICrosser makecopy() {
        Herbivorus h = new Herbivorus(x);
        return h;
    }

    @Override
    public void setLabeltobeshown() {
        str = "Harbivorus can't sail,can be eaten by carnivorus but eats plants";
    }

    @Override
    public String getLabelToBeShown() {
        return str;
    }

    @Override
    public double getweight() {
        return 20.0;
    }

}
