import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JPanel implements ActionListener, KeyListener, MouseListener{
//    private static Bricks[][] board;
    private int width = 800, height = 800;
    private Board board;
    private Point point;
    private int pressedRow, pressedCol;
    private int releasedRow, releasedCol;

    public Main(int w, int h) {
        setSize(w,h);
        board = new Board();
        addMouseListener(this);

        pressedCol = -1;
        pressedRow = -1;

        releasedRow = -1;
        releasedCol = -1;

//        board = new Bricks[20][20];
//        for (int r = 0; r < board.length; r++) {
//            for (int c = 0; c < board[0].length; c++) {
////                board[r][c] = new Bricks(r,c);
//            }
//        }

        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int x= mouseEvent.getX();
        int y= mouseEvent.getY();

        pressedCol = (x/60) - 2;
        pressedRow = (y/60) - 2;

        System.out.println(pressedCol+","+pressedRow);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int x= mouseEvent.getX();
        int y= mouseEvent.getY();

        releasedCol = (x/60) - 2;
        releasedRow = (y/60) - 2;


        board.swap(pressedRow,pressedCol,releasedRow,releasedCol);
        System.out.println(releasedRow+","+ releasedCol);

        Point rc;
        if((rc = board.check()) != null){
            int row = rc.x;
            int col = rc.y;


        }
        System.out.println(board.check());

        repaint();
    }


    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }


    public static void main(String[] args) {
            JFrame frame = new JFrame("Match 3!!!");
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            int width = 800;
            int height = 800;
            frame.setPreferredSize(new Dimension(width, height));

            JPanel panel = new Main(width, height);
            panel.setFocusable(true);
            panel.grabFocus();

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
