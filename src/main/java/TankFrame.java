import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.lang.invoke.SwitchPoint;
import java.text.AttributedCharacterIterator;

public class TankFrame extends Frame {

    int x= 200;
    int y = 200;

    public TankFrame(){
        //默认不显示，只是在内存中显示的
        //设置宽和高
        setSize(800, 600);
        //设置显示
        setVisible(true);
        //不能改变大小
        setResizable(false);
        //设置在应用窗口的标题
        setTitle("tack war");

        //添加键盘调用方法
        this.addKeyListener(new MyKeyListener());

        //添加一个window的监听器
        addWindowListener(new WindowAdapter() {
            //监听windowClosing事情，点击右上角x
            @Override
            public void windowClosing(WindowEvent e) {
                //系统退出
                System.exit(0);
            }
        });
    }

    // 会先把背景清一遍 系统递给你的一只画笔
    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x, y, 50, 50);
//        x += 10;
        //y += 10;
    }

    class MyKeyListener extends KeyAdapter{


        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        //键盘按下时使用
        @Override
        public void keyPressed(KeyEvent e) {
            //获取用户输入的键值
            int key = e.getKeyCode();
            //判断用户输入的键值
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
            }


            //必须对其进行重画
//            x += 200;
            //进行重画
//            repaint();
            System.out.println("keyPressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //获取用户输入的键值
            int key = e.getKeyCode();
            //判断用户输入的键值
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
            }
            System.out.println("keyReleased");
        }
    }

}
