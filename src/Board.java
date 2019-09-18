import java.awt.*;
public class Board {
    private Cell[][] cellArr;
    private int widthBoard;
    private int x,y;
    private int pressedRow, pressedCol;
    private int r1,c1,r2,c2;


    public Board(){
        this.cellArr = new Cell[10][10];
        randomizeBoard();
        pressedCol = -1;
        pressedRow = -1;
        this.r1 = r1;
        this.r2 = r2;
        this.c1 = c1;
        this.c2 = c2;
    }

    //put random values in cellValues
    private void randomizeBoard(){
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                int colorNum = (int)(Math.random()*6)+1;
                cellArr[r][c] = new Cell(colorNum);
            }
        }
    }

//    private boolean check3InRow(){
//        for (int r = 0; r < 10; r++) {
//            for (int c = 0; c < 10; c++) {
//                if (cellArr[r][c].cellValue =
//            }
//        }
//        return false; //liygiuyxsf
//    }


    public void swap(int r1, int c1, int r2, int c2){
        int temp = cellArr[r1][c1].cellValue;
        cellArr[r1][c1].cellValue = cellArr[r2][c2].cellValue;
        cellArr[r2][c2].cellValue = temp;
    }



    public void draw(Graphics g2){
        Graphics2D g = (Graphics2D)(g2);

        //draws the cell
        for (int r = 0; r < cellArr.length; r++) {
            for (int c = 0; c < cellArr[0].length; c++) {
                cellArr[r][c].draw(g2,100+c*60,100+r*60);
//                System.out.println("draw " + r + c);
            }
        }

        //draws the lines
        BasicStroke stroke = new BasicStroke(5);
        g.setStroke(stroke);
        g.setColor(Color.black);

        for (int c = 0; c < cellArr.length+1; c++) {
            g.drawLine(100+c*60,100,100+c*60,700);
        }
        for (int r = 0; r < cellArr.length+1; r++) {
            g.drawLine(100,100+60*r,700,100+60*r);
        }
    }
}
