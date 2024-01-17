package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MouseListenerAllEx extends JFrame{
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel("No Mouse Event");
    MouseListenerAllEx(){
        this.setTitle("마우스 이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setContentPane(contentPane);
        contentPane.addMouseListener(new MyMouseListener());
        contentPane.addMouseMotionListener(new MyMouseListener());
        contentPane.add(la);
        
        this.setSize(300,300);
        this.setVisible(true);
        contentPane.requestFocus();
    }
    class MyMouseListener implements MouseListener,MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            la.setText("MouseClicked("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            la.setText("MousePressed("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            contentPane.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            contentPane.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setText("MouseDragged("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            la.setText("MouseMoved("+e.getX()+","+e.getY()+")");
        }
        
    }
}
public class JavaApplication18 {

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
    
}

