import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main1 {

    public static void main(String[] args) {
        //默认不显示，只是在内存中显示的
        Frame frame = new Frame();
        //设置宽和高
        frame.setSize(800, 600);
        //设置显示
        frame.setVisible(true);
        //不能改变大小
        frame.setResizable(false);
        //设置在应用窗口的标题
        frame.setTitle("tack war");

        //添加一个window的监听器
        frame.addWindowListener(new WindowAdapter() {
            //监听windowClosing事情，点击右上角x
            @Override
            public void windowClosing(WindowEvent e) {
                //系统退出
                System.exit(0);
            }
        });
    }

}
