package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
public  class MyPainter extends JPanel implements MouseListener{
	private int x0 , y0 ,x1 ,y1,x ,y ,w,h;
	private MyMouseAdapter myMouseAdapter;
	public MyPainter(){
		setBackground(Color.yellow);
		addMouseListener(this);
		myMouseAdapter = new MyMouseAdapter(this);
		addMouseListener(myMouseAdapter);
		x0 = y0 =x1 = y1 = -1; 
	}
	
	void setX0(int x0){this.x0=x0;}
	void setY0(int y0){this.y0=y0;}
	void setX1(int x1){this.x1=x1;}
	void setY1(int y1){this.y1=y1;}
	int setX0(){return x0;}
	int setY0(){return y0;}
	
	int setXX(){return x;}
	void setXX(int x){this.x = x;}
	int setYY(){return y;}
	void setYY(int y){this.y = y;}
	int setWW(){return w;}
	void setWW(int w){this.w = w;}
	int setHH(){return h;}
	void setHH(int h){this.h = h;}
    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	//System.out.println("Jason");
    	
    	Graphics2D g2d = (Graphics2D)g;
    	g2d.setStroke(new BasicStroke(4));
    //g2d.setColor(Color.BLUE);
    //g2d.drawLine(0, 0, 200, 200);
    	g2d.setColor(Color.RED);
    	//g2d.drawLine(x0, y0, x1, y1);
    	g2d.drawOval(x,y,w,h);
    	
    	//System.out.println(("paint"));
    	
    }
    void changeLine(int x1,int y1){
    	this.x1 = x1 ; this.y1 = y1;
		int r = Math.abs(x0-this.x1);
		w = h = 2*r ;
		x = x0 - r; 
		y = y0 - r;
		repaint();
    	
    }
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("Clicked");
//		
//	}
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//		
//	}
//	@Override
//	public void mouseExited(MouseEvent e) {
//		
//		
//	}
//	@Override
//	public void mousePressed(MouseEvent e) {
//		x0 = e.getX(); y0 = e.getY();
//		
//	}
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		x1 = e.getX(); y1 = e.getY();
//		int r = Math.abs(x0-x1);
//		w = h = 2*r ;
//		x = x0 - r; 
//		y = y0 - r;
//		repaint();
//		
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class MyMouseAdapter extends MouseAdapter {
	private MyPainter painter;
	public MyMouseAdapter(MyPainter painter){
		this.painter = painter;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setY0(e.getY());
		//x0 = e.getX(); y0 = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		int x1 = e.getX(), y1 = e.getY();
		painter.changeLine(x1, y1);
	}	
	
}


