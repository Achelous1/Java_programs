import javax.swing.JFrame;

 

public class jFrameEx {

 public static void main(String[] args) {

  // ȭ�� ȣ��

  new JFrameSample();

 }

}

 

 

class JFrameSample extends JFrame {

 public JFrameSample() {

  // x������ ���α׷��� ����ǵ��� ����

  this.setDefaultCloseOperation(EXIT_ON_CLOSE); 

  // x,y,width,height �׷��� x,y��ǥ �׸��� ���̿� ����

  this.setBounds(200, 200, 1000, 750);

  // ���α׷� ����

  this.setTitle("���� �����");

  // ���������� ����

  this.setVisible(true);

 }

}