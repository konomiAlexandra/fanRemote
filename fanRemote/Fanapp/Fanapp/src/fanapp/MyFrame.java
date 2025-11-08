/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fanapp;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class MyFrame extends JFrame implements ItemListener{
    private JButton stand1, turn, minus, plus, btn1, btn2, btn3, start;
    private JTextField timer; // field to set timer
    private JComboBox  position, devices; // lists
    private JLabel message1;
    private JToggleButton onoff; // on/ of button
    
    public MyFrame(){
        this.setSize(400, 400);
        this.setTitle("Fan controler");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 

        stand1 = new JButton("Στάσιμος");
        turn = new JButton("Γυρνάει" );
        minus = new JButton("-");
        plus = new JButton("+" );
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        start = new JButton("Start");

        String[] operations = {"Διαλέξτε κατεύθυνση", "Πάνω", "Ευθεία", "Κάτω"};
        position = new JComboBox(operations);
        
        String[] operations2 = {"Συνδεθείτε σε Συσκευή", "Fan 1", "Fan 2", "Fan 3"};
        devices = new JComboBox(operations2);
        
        
        timer = new JTextField();

        message1 = new JLabel("Χρονόμετρο αντίστροφης μέτρησης:");
        
        
        stand1.setBounds(90, 20, 100, 30);
        turn.setBounds(190, 20, 100, 30);
        position.setBounds(125, 55, 120, 30);
        devices.setBounds(115, 90, 150, 30);
        
        message1.setBounds(20, 120, 240, 40);
        timer.setBounds(20, 150, 50, 30);
        
        plus.setBounds(80, 150, 50, 30);
        minus.setBounds(130,150,50,30);
        start.setBounds(180, 150, 100, 30);
        
        btn3.setBounds(130, 230, 100, 30);
        btn2.setBounds(130, 270, 100, 30);
        btn1.setBounds(130, 310, 100, 30);
        

        this.setLayout(null);
        this.add(stand1);
        this.add(turn);
        this.add(minus);
        this.add(plus);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(start);
        this.add(timer);
        this.add(start);
        this.add(position);
        this.add(devices);
        this.add(message1);
        this.add(timer);
        this.add(plus);
        this.add(minus);
        this.setJToggleButton();
        this.setAction();


        
        this.setVisible(true);

    }

    private void setJToggleButton(){
        onoff = new JToggleButton("ON");
        onoff.setBounds(130, 190, 100, 30);
        this.add(onoff);
    }
    
    private void setAction(){
           onoff.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(onoff.isSelected()){
            onoff.setText("OFF");
        }
        else
            onoff.setText("ON");
    }

}
