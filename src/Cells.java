import java.awt.*;
public class Cells {
    //private boolean exist;
    private int cellValue;
    private int[][] cellValues;

    public Cells(){
        //exist = true;
        cellValues = new int[5][5];

    }

    //put random values in cellValues
    private int[][] randomizeBoard(){
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                cellValue = (int)(Math.random()*3);
                cellValues[r][c] = cellValue;
            }
        }
        return cellValues;
    }

    private boolean check3InRow(){
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
//                if cellValues[r][c]
            }
        }
        return false; //liygiuyxsf
    }

    public void draw(Graphics g2, int x, int y){
        
    }


}
