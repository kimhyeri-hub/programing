package sec02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewer2 extends JFrame{
	JButton btnprev, btnnext,btnFirst, btnLast;
	ImageIcon[] image;
	JLabel imageLabel, captionLabel;
	int cnt;
	
	ImageViewer2(){
		setTitle("랜선으로 떠나는 여행");
		Font f=new Font("", Font.BOLD,30);
		
		
		JPanel panel=new JPanel();
		btnprev=new JButton("<<");
		btnnext=new JButton(">>");
		btnFirst=new JButton("|<");
		btnLast=new JButton(">|");
		
		btnFirst.setFont(f);
		btnLast.setFont(f);
		btnprev.setFont(f);
		btnnext.setFont(f);
		
		image=new ImageIcon[4];
		
		panel.setBackground(Color.pink);
		
		//이미지로딩
		for(int i=0;i<image.length;i++) {
			String path="image/img"+i+".png";
			image[i]=new ImageIcon(path);
		}
		
		//처음이미지
		cnt=0;
		imageLabel=new JLabel(image[cnt]);
	
		//내부클래스로 리스너 구현
		class First implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				cnt=0;
				imageLabel.setIcon(image[0]);
			}
		}
		
		class Last implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				int size=image.length-1;
				JOptionPane.showMessageDialog(null,"마지막으로 이동","경고",JOptionPane.WARNING_MESSAGE);
				imageLabel.setIcon(image[size]);
			}
		}
		
		//이전버튼
		class Preview implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(cnt>0)
					cnt--;
				else
					JOptionPane.showMessageDialog(null,"이전그림없음","경고",JOptionPane.WARNING_MESSAGE);
				imageLabel.setIcon(image[cnt]);
			}
		}
		
		//다음버튼
		class Next implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(cnt<image.length-1) 
					cnt++;
				else
					JOptionPane.showMessageDialog(null,"다음그림없","경고",JOptionPane.WARNING_MESSAGE);
				 
					
				imageLabel.setIcon(image[cnt]);
			}
		}
		
		//리스너 등록
		btnFirst.addActionListener(new First());
		btnprev.addActionListener(new Preview());
		btnnext.addActionListener(new Next());
		btnLast.addActionListener(new Last());
		
		//컴포넌트 부착
		add(imageLabel,"Center");
		panel.add(btnFirst);
		panel.add(btnprev);
		panel.add(btnnext);
		panel.add(btnLast);
		add(panel,"South");
		setSize(500,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImageViewer2();

	}

}
