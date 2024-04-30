package default_package2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class GFrame extends JFrame {

    public int life;
    public Container hero;
    public Container villain;
    private List<Villain> villains;
    Hero h;
    Villain v;

    public GFrame() {
        super("GALAGA");
        setSize(800, 600);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        hero = new Container();
        villain = new Container();
        h = new Hero(GFrame.this, v);
        v = new Villain(GFrame.this, h);
        h.setVillain(v);
        villains = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            villains.add(new Villain(this, h));
        }
        addKeyListener(h);
        setFocusable(true);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.move(h);
                hero.die(h);
                hero.shoot(h);
                hero.die(h);

                villain.move(v);
                villain.shoot(v);
                villain.die(v);

                repaint();
            }
        });
        timer.start();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int bottomHeight = 165;
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, getHeight() - bottomHeight, getWidth(), bottomHeight);

        hero.draw(h, g);
        villain.draw(v, g);

        LifeBar(g);
        Score(g);
    }

    private void LifeBar(Graphics g) {
        int barWidth = 150;
        int barHeight = 30;
        int x = 40;
        int y = 40;
        int maxLife = 100;
        int currentLife = h.getLife();

        g.setColor(Color.YELLOW);
        g.drawRect(x, y, barWidth, barHeight);

        int lifeBarWidth = (int) (((double) currentLife / maxLife) * barWidth);

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, lifeBarWidth, barHeight);
    }

    private void Score(Graphics g) {

        int x = getWidth() - 150;
        int y = 60;

        g.setColor(Color.RED);
        g.setFont(new Font("Rockwell", Font.BOLD, 25));

        g.drawString("Score: " + v.getScore(), x, y);

    }
}
