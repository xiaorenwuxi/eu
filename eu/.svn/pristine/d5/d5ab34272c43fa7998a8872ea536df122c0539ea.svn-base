package com.youxuan.eu.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
@Controller
@RequestMapping("/randomcontroller")
public class Randomcontroller {
	
	public static final int WIDTH=120;
	public static final int HEIGHT=25;
	@RequestMapping("image")
	
	public void  verify(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		
		//设置背景颜色
		setBackGround(g);
		
		//设置边框
		setBorder(g);
		
		//画干扰线
		drawRandomline(g);
		 
		//生成随机数字
		String a =drawRandomNum((Graphics2D)g);
		
		
		//返回浏览器
		response.setContentType("image/jpeg");
		response.setHeader("Pragma", "No-cache"); 
	    response.setHeader("Cache-Control", "No-cache"); 
	    response.setDateHeader("Expires", 0); 
		request.getSession().setAttribute("code",a);
	 
		//ImageIO.write(image,"jpeg",response.getOutputStream());
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream()); 
		encoder.encode(image);
		
	}
	private String drawRandomNum(Graphics2D g) {
		g.setColor(Color.RED);
		g.setFont(new Font("宋体" , Font.BOLD,20));
		StringBuffer sb = new StringBuffer();
		String base="123456789abcdefghijklmnpqrstuvwxyz";
		//常用中文验证
		//String base = "\u96d5\u864e\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765\u4ed6\u8fd9\u4e0a\u7740\u4e2a\u5730\u5230\u5927\u91cc\u8bf4\u5c31\u53bb\u5b50\u5f97\u4e5f\u548c\u90a3\u8981\u4e0b\u770b\u5929\u65f6\u8fc7\u51fa\u5c0f\u4e48\u8d77\u4f60\u90fd\u628a\u597d\u8fd8\u591a\u6ca1\u4e3a\u53c8\u53ef\u5bb6\u5b66\u53ea\u4ee5\u4e3b\u4f1a\u6837\u5e74\u60f3\u751f\u540c\u8001\u4e2d\u5341\u4ece\u81ea\u9762\u524d\u5934\u9053\u5b83\u540e\u7136\u8d70\u5f88\u50cf\u89c1\u4e24\u7528\u5979\u56fd\u52a8\u8fdb\u6210\u56de\u4ec0\u8fb9\u4f5c\u5bf9\u5f00\u800c\u5df1\u4e9b\u73b0\u5c71\u6c11\u5019\u7ecf\u53d1\u5de5\u5411\u4e8b\u547d\u7ed9\u957f\u6c34\u51e0\u4e49\u4e09\u58f0\u4e8e\u9ad8\u624b\u77e5\u7406\u773c\u5fd7\u70b9\u5fc3\u6218\u4e8c\u95ee\u4f46\u8eab\u65b9\u5b9e\u5403\u505a\u53eb\u5f53\u4f4f\u542c\u9769\u6253\u5462\u771f\u5168\u624d\u56db";
		int x=10;
		for(int i = 0 ; i<4; i++){
			int degree = new Random().nextInt()%30;
			String ch =base.charAt(new Random().nextInt(base.length()))+ "";
			sb.append(ch);
			g.rotate(degree*Math.PI/180, x, 20);
			g.drawString(ch, x, 20);
			g.rotate(-degree*Math.PI/180, x, 20);
			x+=30;
		}
		return sb.toString();
	}
	private void drawRandomline(Graphics g) {
		g.setColor(Color.GREEN);
		for(int i=0; i<5;i++){
			int x1 = new Random().nextInt(WIDTH);
			int y1 = new Random().nextInt(HEIGHT);
			int x2 = new Random().nextInt(WIDTH);
			int y2 = new Random().nextInt(HEIGHT);
			g.drawLine(x1, y1, x2, y2);
		}
		
	}
	private void setBorder(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect(1, 1, WIDTH-2, HEIGHT-2);
	}
	private void setBackGround(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
}
