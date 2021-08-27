package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;
    public static int WIDTH = 160;
    public static int HEIGHT = 120;
    public static int SCALE = 3;

    public BufferredImage layer = new BufferredImage(WIDTH, HEIGHT, BufferredImage.TYPE_INT_RGB);

    public static Player player;
    public static Enemy enemy;
    public static Ball ball;

    public Game() {
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        this.addKeyListener(this);
        player = new Player(100, HEIGHT - 5);
        enemy = new Enemy(100, 0);
        ball = new Ball(100, HEIGHT / 2 - 1)
    }

    
}