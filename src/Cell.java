import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Cell {
    //private boolean exist;
    public int cellValue;
//    private int x,y;
    private int width;
    private static BufferedImage blue, green, orange, purple, red, yellow;

    static{
        try{
            blue = ImageIO.read(new File("res/" + "blue bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            red = ImageIO.read(new File("res/" + "red bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            yellow = ImageIO.read(new File("res/" + "yellow bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            orange = ImageIO.read(new File("res/" + "orange bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            purple = ImageIO.read(new File("res/" + "purple bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            green = ImageIO.read(new File("res/" + "green bauble.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Cell(int cellValue){//}, int x, int y){
        //exist = true;
        this.cellValue = cellValue;
//        this.x = x;
//        this.y = y;
        width = 60;

    }

    public void draw(Graphics g2, int x, int y){
        if(cellValue == 1){
//            g2.setColor(Color.red);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(red, x, y, null);
        }

        if(cellValue == 2){
//            g2.setColor(Color.green);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(blue, x, y, null);
        }

        if(cellValue == 3){
//            g2.setColor(Color.blue);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(green, x, y, null);
        }

        if(cellValue == 4){
//            g2.setColor(Color.pink);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(purple, x, y, null);
        }

        if(cellValue == 5){
//            g2.setColor(Color.yellow);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(yellow, x, y, null);
        }

        if(cellValue == 6){
//            g2.setColor(Color.orange);
//            g2.fillRect(x,y,width,width);
            g2.drawImage(orange, x, y, null);
        }

    }


}
