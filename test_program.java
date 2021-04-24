package daxuesheng;





import java. awt.BorderLayout;
import java. awt. Color;
import java. awt. Font;
import java. awt. GridLayout;
import java. awt. event.ActionEvent;
import java. awt. event.ActionListener;
import java.beans.JavaBean;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class test_program extends JFrame
{


    public static void main(String args[])
    {
        try
        {
            test_program frame = new test_program();
            frame.setVisible(true); //��ʾ
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }



public test_program()
{

    super ("大学生互助系统");
setFont(new Font("大学生互助系统",Font.PLAIN,12));
getContentPane().setLayout(null);//���ò��ַ�ʽ
    setBounds(100,100,800,550);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

final JLabel label = new JLabel();

label.setForeground(new Color(0,0,255));
label.setFont(new Font("欢迎使用",Font.BOLD,36));
label.setText("欢迎使用");
label.setBounds(27,10,182,39);
getContentPane().add(label);
final JLabel label_1 = new JLabel();

    label_1.setForeground(new Color(0,0,255));
    label_1.setFont(new Font("����",Font.BOLD,36));
    label_1.setText("大学生互助系统");
    label_1.setBounds(132,68,300,49);
    getContentPane().add(label_1);



    final JButton button = new JButton();
    button.setForeground(new Color(0,0,255));
    button.setFont(new Font("全部",Font.BOLD,22));
    button.setText("全部");
    button.setBounds(29,140,163,39);
    getContentPane().add(button);

    button.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                     waimai WM = new waimai();
                                     WM.setVisible(true);


                                 }
                             }
    );


final JButton button_1 = new JButton();

    button_1.setForeground(new Color(0,0,255));
    button_1.setFont(new Font("咨询问题",Font.BOLD,22));
    button_1.setText("咨询问题");
    button_1.setBounds(220,140,133,39);
    getContentPane().add(button_1);
    button_1.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                     zixun ZX = new zixun();
                                     ZX.setVisible(true);


                                 }
                             }
    );

    final JButton button_2 = new JButton();

    button_2.setForeground(new Color(0,0,255));
    
    button_2.setText("帮助");
    button_2.setBounds(30,450,130,40);
    getContentPane().add(button_2);

    button_2.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {

                                     JOptionPane.showMessageDialog(null,
                                             "��������һ�ûд",
                                             "������",JOptionPane.INFORMATION_MESSAGE);
                                   }
                               }
    );

    final JButton button_3 = new JButton();

    button_3.setForeground(new Color(0,0,255));

    button_3.setText("退出");
    button_3.setBounds(540,450,130,40);
    getContentPane().add(button_3);

    button_3.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {

                                       System.exit(0);
                                   }
                               }
    );
    

    final JButton button_4 = new JButton();

    button_4.setForeground(new Color(0,0,255));
    button_4.setFont(new Font("托人办事",Font.BOLD,22));
    button_4.setText("托人办事");
    button_4.setBounds(380,140,133,39);
    getContentPane().add(button_4);
    button_4.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    banshi BS = new banshi();
                                    BS.setVisible(true);

                                 }
                             }
    );

    
    final JButton button_5 = new JButton();

    button_5.setForeground(new Color(0,0,255));
    button_5.setFont(new Font("买卖交易",Font.BOLD,22));
    button_5.setText("买卖交易");
    button_5.setBounds(540,140,133,39);
    getContentPane().add(button_5);
    button_5.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                     maimai MM = new maimai();
                                   MM.setVisible(true);

                                 }
                             }
    );
    
    final JButton button_6 = new JButton();
    button_6.setForeground(new Color(0,0,255));
    button_6.setFont(new Font("失物招领",Font.BOLD,22));
    button_6.setText("失物招领");
    button_6.setBounds(29,200,163,39);
    getContentPane().add(button_6);

    button_6.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                     shiwuzhaoling SWZL = new shiwuzhaoling();
                                     SWZL.setVisible(true);


                                 }
                             }
    );

    final JButton button_7 = new JButton();

    button_7.setForeground(new Color(0,0,255));
    button_7.setFont(new Font("代取快递",Font.BOLD,22));
    button_7.setText("代取快递");
    button_7.setBounds(220,200,133,39);
    getContentPane().add(button_7);
    button_7.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    kuaidi KD = new kuaidi();
                                   KD.setVisible(true);


                                 }
                             }
    );

    
    final JButton button_8 = new JButton();

    button_8.setForeground(new Color(0,0,255));
    button_8.setFont(new Font("外出拼车",Font.BOLD,22));
    button_8.setText("外出拼车");
    button_8.setBounds(380,200,133,39);
    getContentPane().add(button_8);
    button_8.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    pinche PC = new pinche();
                                    PC.setVisible(true);

                                 }
                             }
    );
    
    
    final JButton button_9 = new JButton();

    button_9.setForeground(new Color(0,0,255));
    button_9.setFont(new Font("兼职招聘",Font.BOLD,22));
    button_9.setText("兼职招聘");
    button_9.setBounds(540,200,133,39);
    getContentPane().add(button_9);
    button_9.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    zhaoping ZP = new zhaoping();
                                     ZP.setVisible(true);

                                 }
                             }
    );
    final JButton button_10 = new JButton();

    button_10.setForeground(new Color(0,0,255));
    button_10.setFont(new Font("发布",Font.BOLD,22));
    button_10.setText("发布");
    button_10.setBounds(300,280,133,50);
    getContentPane().add(button_10);
    button_10.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    // produce_main PM = new produce_main();
                                    // PM.setVisible(true);

                                 }
                             }
    );
    
    final JButton button_11 = new JButton();

    button_11.setForeground(new Color(0,0,255));
    button_11.setFont(new Font("首页",Font.BOLD,22));
    button_11.setText("首页");
    button_11.setBounds(30,350,133,50);
    getContentPane().add(button_11);
    button_11.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    // produce_main PM = new produce_main();
                                    // PM.setVisible(true);

                                 }
                             }
    );
    
    
   
    
    
    final JButton button_12 = new JButton();

    button_12.setForeground(new Color(0,0,255));
    button_12.setFont(new Font("联系人",Font.BOLD,22));
    button_12.setText("联系人");
    button_12.setBounds(200,350,133,50);
    getContentPane().add(button_12);
    button_12.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    // produce_main PM = new produce_main();
                                    // PM.setVisible(true);

                                 }
                             }
    );
    
    
    final JButton button_13 = new JButton();

    button_13.setForeground(new Color(0,0,255));
    button_13.setFont(new Font("校园空间",Font.BOLD,22));
    button_13.setText("校园空间");
    button_13.setBounds(370,350,133,50);
    getContentPane().add(button_13);
    button_13.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                     xiaoyuankongjian XYKJ = new xiaoyuankongjian();
                                     XYKJ.setVisible(true);

                                 }
                             }
    );

    
    final JButton button_14 = new JButton();

    button_14.setForeground(new Color(0,0,255));
    button_14.setFont(new Font("我的",Font.BOLD,22));
    button_14.setText("我的");
    button_14.setBounds(540,350,133,50);
    getContentPane().add(button_14);
    button_14.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     setVisible(false);
                                    // produce_main PM = new produce_main();
                                    // PM.setVisible(true);

                                 }
                             }
    );
}


}
