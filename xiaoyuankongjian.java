package daxuesheng;



import java. awt. Color;
import java. awt. Font;

import java. awt. event.ActionEvent;
import java. awt. event.ActionListener;

import javax.swing.*;

import javax.swing.plaf.FontUIResource;





public class xiaoyuankongjian extends JFrame {

    public static void main(String[] args)
    {

        try {
        	xiaoyuankongjian frame = new xiaoyuankongjian();
            frame.setVisible(true);
        } catch (Exception e)
        {
            e.printStackTrace(); }
    }

    public xiaoyuankongjian() {

        super("校园空间");

        getContentPane().setLayout(null);//���ò��ַ�ʽ
        setBounds(100, 100, 800, 550);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();

        label.setForeground(new Color(0, 0, 255));
        label.setFont(new Font("校园空间", Font.BOLD, 36));
        label.setText("校园空间");
        label.setBounds(330, 20, 252, 44);
        getContentPane().add(label);

        final JButton button_1 = new JButton();
        button_1.setForeground(new Color(0,0,255));
        button_1.setFont(new Font("发动态",Font.BOLD,14));
        button_1.setText("发动态");
        button_1.setBounds(136,90,106,28);
        getContentPane().add(button_1);

        button_1.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {

                                         setVisible(false);
//                                        add A = new add(-1);
//                                         A.setVisible(true);


                                     }
                                 }
        
        
        );
        final JButton button_2 = new JButton();
        button_2.setForeground(new Color(0,0,255));
        button_2.setFont(new Font("发动态",Font.BOLD,14));
        button_2.setText("发动态");
        button_2.setBounds(236,90,106,28);
        getContentPane().add(button_2);

        button_2.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {

                                         setVisible(false);
//                                        add A = new add(-1);
//                                         A.setVisible(true);


                                     }
                                 }
        
        
        );



    }




}