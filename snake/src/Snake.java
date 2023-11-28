import javax.swing.*;
import java.io.FileReader;

public class Snake {
    public static void main(String[] args) {
        int boardWidth=600;                                             //pencerenin genişliği+uzunlugu
        int boardHeight=boardWidth;
        JFrame frame=new JFrame("Snake");
        frame.setVisible(true);                                          //pencerenin opsiyonları
        frame.setResizable(false);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SnakeGame snakeGame =new SnakeGame(boardHeight,boardWidth);      //thislediğimiz pencereyi cağırdık
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();


    }

}