package sec02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewer extends JFrame{
	JButton btnprev, btnnext;
	ImageIcon[] image;
	JLabel imageLabel;
	int cnt;
	
	ImageViewer(){
		setTitle("랜선으로 떠나는 여행");
		Font f=new Font("", Font.BOLD,30);
		
		JPanel panel=new JPanel();
		btnprev=new JButton("<<");
		btnnext=new JButton(">>");
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
		class Preview implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(cnt>0)
					cnt--;
				else
					JOptionPane.showMessageDialog(null,"이전그림없음","경고",JOptionPane.WARNING_MESSAGE);
				imageLabel.setIcon(image[cnt]);
			}
		}
		
		class Next implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(cnt<3) {
				cnt++;
				JOptionPane.showMessageDialog(null,"다음그림없","경고",JOptionPane.WARNING_MESSAGE);
				} 
					
				imageLabel.setIcon(image[cnt]);
			}
		}
		
		//리스너 등록
		btnprev.addActionListener(new Preview());
		btnnext.addActionListener(new Next());
		
		//컴포넌트 부착
		add(imageLabel,"Center");
		panel.add(btnprev);
		panel.add(btnnext);
		add(panel,"South");
		setSize(500,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImageViewer();

	}

}
