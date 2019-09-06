import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JPanel implements ActionListener, KeyListener, MouseListener{
//    private static Bricks[][] board;
    private int width = 800, height = 800;

    public Main(int w, int h) {
        setSize(w,h);
//        board = new Bricks[20][20];
//        for (int r = 0; r < board.length; r++) {
//            for (int c = 0; c < board[0].length; c++) {
////                board[r][c] = new Bricks(r,c);
//            }
//        }
    }

    @Override
    public void paintComponent(Graphics g) {

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
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

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
            frame.setPreferredSize(new Dimension(width, height + 24));

            JPanel panel = new Main(width, height);
            panel.setFocusable(true);
            panel.grabFocus();

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
