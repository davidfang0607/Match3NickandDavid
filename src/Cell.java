import java.awt.*;
public class Cell {
    //private boolean exist;
    private int cellValue;
    private int[][] cellValues;
    private int x,y;
    private int width;

    public Cell(int cellValue, int x, int y){
        //exist = true;
        this.cellValue = cellValue;
        this.x = x;
        this.y = y;
        cellValues = new int[5][5];
        width = 60;

    }

    public void draw(Graphics g2, int x, int y){
        if(cellValue == 1){
            g2.setColor(Color.red);
            g2.drawRect(x,y,width,width);
        }

        if(cellValue == 2){
            g2.setColor(Color.green);
            g2.drawRect(x,y,width,width);
        }

        if(cellValue == 3){
            g2.setColor(Color.blue);
            g2.drawRect(x,y,width,width);
        }

    }


}
