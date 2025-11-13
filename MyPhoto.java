package sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPhoto extends JFrame{

	//멤버변수
	JLabel lbl,imglbl;
	JButton btn;
	boolean flag=false;
	
	//생성자
	MyPhoto(){
		lbl=new JLabel("가을단풍");
		
		// ImageIcon 객체생성
		setTitle("MyPhoto");
		Font f=new Font("", Font.BOLD,30);
		Color c=new Color(255,187,0);
		lbl=new JLabel("가을단풍",SwingConstants.CENTER);
		lbl.setFont(f);
		lbl.setForeground(c);
		
		//이미지 불러오기
		ImageIcon img1=new ImageIcon("p1.png");
		ImageIcon img2=new ImageIcon("p2.png");
		
		imglbl=new JLabel(img1);
		btn=new JButton("변경");
		btn.setFont(f);
		btn.setForeground(c);
		
		//리스너 등록
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 실행할 코드 작성
				
				
				if(flag==false) {
					imglbl.setIcon(img2);
					flag=true;
				}
				
			}
		});
		
		add(lbl,"North");
		add(imglbl,"Center");
		add(btn,"South");
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPhoto();
	}

}
