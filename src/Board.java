import java.awt.*;
public class Board {
    private Cell[][] cellArr;


    public Board(){
        this.cellArr = new Cell[5][5];

    }

    //put random values in cellValues
    private void randomizeBoard(){
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                int color = (int)(Math.random())*(3);
                cellArr[r][c] = new Cell(color,r,c);
            }
        }
    }

    private void draw(Graphics g2,int x,int y){
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {

            }
        }
    }
}
