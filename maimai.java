package daxuesheng;



import java. awt. Color;
import java. awt. Font;

import java. awt. event.ActionEvent;
import java. awt. event.ActionListener;

import javax.swing.*;

import javax.swing.plaf.FontUIResource;





public class maimai extends JFrame {

    public static void main(String[] args)
    {

        try {
        	maimai frame = new maimai();
            frame.setVisible(true);
        } catch (Exception e)
        {
            e.printStackTrace(); }
    }

    public maimai() {

        super("������Ϣ��Ŀ");

        getContentPane().setLayout(null);//���ò��ַ�ʽ
        setBounds(100, 100, 400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();

        label.setForeground(new Color(0, 0, 255));
        label.setFont(new Font("����", Font.BOLD, 36));
        label.setText("�����г�");
        label.setBounds(79, 21, 252, 44);
        getContentPane().add(label);

        final JButton button = new JButton();
        button.setForeground(new Color(0,0,255));
        button.setFont(new Font("����",Font.BOLD,14));
        button.setText("���������Ϣ");
        button.setBounds(136,90,106,28);
        getContentPane().add(button);

        button.addActionListener(new ActionListener() {
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
