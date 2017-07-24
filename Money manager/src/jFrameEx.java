import javax.swing.JFrame;

 

public class jFrameEx {

 public static void main(String[] args) {

  // 화면 호출

  new JFrameSample();

 }

}

 

 

class JFrameSample extends JFrame {

 public JFrameSample() {

  // x눌려서 프로그램이 종료되도록 설정

  this.setDefaultCloseOperation(EXIT_ON_CLOSE); 

  // x,y,width,height 그려질 x,y좌표 그리고 넓이와 높이

  this.setBounds(200, 200, 1000, 750);

  // 프로그램 제목

  this.setTitle("월별 가계부");

  // 보여지도록 설정

  this.setVisible(true);

 }

}