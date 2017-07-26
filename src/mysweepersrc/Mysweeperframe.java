package mysweeperframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Mysweeperframe extends JFrame implements MouseListener,ActionListener{
	//get screen size
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	int x = 0;
	int y = 0;
	
	
	Initiation ini = new Initiation();
	Sweep sweep = new Sweep();
	
	int[][] allData = new int[18][18];
	
	int[][] trueData = new int[18][18];
	
	int[][] rayData = new int[18][18];
	
	int in = ini.Init(rayData);
	
	
	
	//create window my sweeper
	public Mysweeperframe(){
		
		//create menu
		/*JMenuBar bar;
		JMenu m1;
		JMenuItem begin,option,rank,exit;
		
		bar = new JMenuBar();
		m1 = new JMenu("OPTION");
		begin = new JMenuItem("Begin");
		option = new JMenuItem("Grade");
		rank = new JMenuItem("Ranking");
		exit = new JMenuItem("Exit");
		m1.add(begin);
		m1.add(option);
		m1.add(rank);
		m1.add(exit);
		bar.add(m1);
		this.setJMenuBar(bar);
		*/
		
		
		//set size which depends on size parameter
		this.setSize(500, 500);
		
		//set location
		this.setLocation((width-500)/2, (height-500)/2);
		//set title
		this.setTitle("Sweeper");
		
		this.setVisible(true);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		
		
	}
	
	public void paint(Graphics h){
		
		BufferedImage bi=new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB);
		Graphics h1=bi.createGraphics();
		
		// 绘制背景
		BufferedImage bgImage = null;
		try {
			bgImage = ImageIO.read(new File("C:/Users/lenovo/Pictures/lovewallpaper/11.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h1.drawImage(bgImage,0,0,this);
		
		// draw images
		Image m0 = null;
		try {
			m0 = ImageIO.read(new File("image/none.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m1 = null;
		try {
			m1 = ImageIO.read(new File("image/1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m2 = null;
		try {
			m2 = ImageIO.read(new File("image/2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m3 = null;
		try {
			m3 = ImageIO.read(new File("image/3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m4 = null;
		try {
			m4 = ImageIO.read(new File("image/4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m5 = null;
		try {
			m5 = ImageIO.read(new File("image/5.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m6 = null;
		try {
			m6 = ImageIO.read(new File("image/6.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m7 = null;
		try {
			m7 = ImageIO.read(new File("image/7.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m8 = null;
		try {
			m8 = ImageIO.read(new File("image/8.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m9 = null;
		try {
			m9 = ImageIO.read(new File("image/ray.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image m10 = null;
		try {
			m10 = ImageIO.read(new File("image/10.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//draw main line
		// 输出信息
		h1.setColor(Color.black);
		h1.drawRect(390, 70, 70, 30);
		h1.drawString("开始游戏", 400, 90);
		h1.drawRect(390, 120, 70, 30);
		h1.drawString("游戏设置", 400, 140);
		h1.drawRect(390, 170, 70, 30);
		h1.drawString("游戏说明", 400, 190);
		h1.drawRect(390, 250, 50, 30);
		h1.drawString("关于", 400, 270);
		h1.drawRect(390, 300, 50, 30);
		h1.drawString("认输", 400, 320);		
		h1.drawString("剩余"+18, 120, 60);
		
		for(int i = 0;i<18;i++)
			for(int j=0;j<18;j++)
			{
				switch(allData[i][j]){
				case 0:
					h1.drawImage(m10, i*20+13, j*20+70, this);
					break;
				case 1:
					h1.drawImage(m1, i*20+13, j*20+70, this);
					break;
				case 2:
					h1.drawImage(m2, i*20+13, j*20+70, this);
					break;
				case 3:
					h1.drawImage(m3, i*20+13, j*20+70, this);
					break;
				case 4:
					h1.drawImage(m4, i*20+13, j*20+70, this);
					break;
				case 5:
					h1.drawImage(m5, i*20+13, j*20+70, this);
					break;
				case 6:
					h1.drawImage(m6, i*20+13, j*20+70, this);
					break;
				case 7:
					h1.drawImage(m7, i*20+13, j*20+70, this);
					break;
				case 8:
					h1.drawImage(m8, i*20+13, j*20+70, this);
					break;
				case 9:
					h1.drawImage(m9, i*20+13, j*20+70, this);
					break;
				default:
					h1.drawImage(m0, i*20+13, j*20+70, this);
					break;
				}
			}
				
		// 绘制棋盘
		for(int i=13;i<=375;)
		{
			h1.drawLine(i, 70, i, 430);
			i+=20;
		}
		for(int j=70;j<=430;)
		{
			h1.drawLine(13, j, 373, j);
			j+=20;
		}
		
		
		
		h.drawImage(bi,0,0,this);
	}
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<18;i++)
			for(int j=0;j<18;j++)
			{
				
				trueData[i][j]=sweep.show(i, j, rayData);
			}
			
		
		x = m.getX();
		y = m.getY();
		if(x>=13&&x<=373&&y>=70&&y<=430)
		{
			x = (x-13)/20;
			y = (y-70)/20;
		
		
		
		allData[x][y]=trueData[x][y];
		
		
		//reopen(x,y,trueData,allData);	
		
		
		if(allData[x][y]==9)
		{
			for(int i=0;i<18;i++)
				for(int j=0;j<18;j++)
					allData[i][j]=trueData[i][j];
		}
		
			
		this.repaint();
		
		}
		if(m.getX() >=390&&m.getX()<=470&&m.getY()>=70&&m.getY()<=100)
			{int a = JOptionPane.showConfirmDialog(this, "是否重新开始游戏？");
			if (a==0)
			{for(int i = 0;i<18;i++)
			{
				for(int j= 0;j<18;j++)	
					allData[i][j]=0;
			}
			in = ini.Init(rayData);
			this.repaint();
			
			}
			}
		if(m.getX() >=390&&m.getX()<=470&&m.getY()>=120&&m.getY()<=150)
			JOptionPane.showMessageDialog(this, "游戏设置");
		if(m.getX() >=390&&m.getX()<=470&&m.getY()>=170&&m.getY()<=200)
			JOptionPane.showMessageDialog(this, "双方开始下棋，先连成五子者获胜！");
		if(m.getX() >=390&&m.getX()<=440&&m.getY()>=250&&m.getY()<=280)
			JOptionPane.showMessageDialog(this, "作者：XK");
		if(m.getX() >=390&&m.getX()<=440&&m.getY()>=300&&m.getY()<=330)
			{int r = JOptionPane.showConfirmDialog(this, "是否确认认输？", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION);
			if(r==0)
			{
			JOptionPane.showMessageDialog(this, "认输");
			
			}
			System.exit(0);
			}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void reopen(int x,int y,int t[][],int w[][])
	{
		if(x<1||x>15||y<1||y>15) return;
		else 
		{
			if(t[x][y]==10)
			{
			w[x][y]=10;
			reopen(x-1,y-1,t,w);
			reopen(x-1,y,t,w);
			reopen(x-1,y+1,t,w);
			reopen(x,y-1,t,w);
			reopen(x,y+1,t,w);
			reopen(x+1,y-1,t,w);
			reopen(x+1,y,t,w);
			reopen(x+1,y+1,t,w);
			}
		
		}
		
	}
}
