import java.awt.*;
public class Cell {
    //private boolean exist;
    private int cellValue;
    private int[][] cellValues;
    private int x,y;

    public Cell(int cellValue, int x, int y){
        //exist = true;
        this.cellValue = cellValue;
        this.x = x;
        this.y = y;
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
        if(cellValue == 1){

        }

    }


}
