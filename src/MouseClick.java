//Program to draw a Polygon and Fill it using Mouse Interface

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 * Created by Devashish Katoriya on 15/3/17.
 */
public class MouseClick extends Applet implements MouseListener,MouseMotionListener {

    private int n,xx[],yy[];
    private static final int LIMIT = 30;

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);

        setBackground(Color.WHITE);

        xx = new int[LIMIT];
        yy = new int[LIMIT];
        n = 0;

    }

    public void mouseClicked(MouseEvent m)
    {
        xx[n]=m.getX();
        yy[n]=m.getY();
        n++;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        setBackground(Color.WHITE);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public  void paint(Graphics g)
    {
        if(n>=2)
        {
            g.drawPolygon(xx,yy,n);
            g.fillPolygon(xx,yy,n);
        }

    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent mouseEvent) {

    }
}
