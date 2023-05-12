package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
    JFrame frame = new JFrame("window");
    JButton Physics = new JButton("Physics");
    JLabel PhyFormulas = new JLabel("Physics formulas");
//    JTextField textField = new JTextField();

    public void mainUI(){
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
        
        frame.add(PhyFormulas);
        frame.add(Physics);
        
//        frame.add(textField);

        Physics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhysicsUI();
            }
        });
    }
    JFrame frameNew = new JFrame("Window");
    JButton kineticEnergy =new JButton("Kinetic Energy");
    JButton potentialEnergy =new JButton("Potential Energy");
    JButton perimeterOfRectangle =new JButton("Perimeter of a rectangle");
    JButton perimeterOfSquare =new JButton("Perimeter of a square");
    JButton perimeterOfTriangle =new JButton("Perimeter of a triangle");
    JLabel text = new JLabel(" Pick the action you would like to perform");
//    JTextField textField= new JTextField();

    public void PhysicsUI() {
        frameNew.setSize(300, 300);
        frameNew.setLayout(new GridLayout(8, 1));
        frameNew.setVisible(true);

        frameNew.add(text);
        frameNew.add(kineticEnergy);
        frameNew.add(potentialEnergy);
        frameNew.add(perimeterOfRectangle);
        frameNew.add(perimeterOfSquare);
        frameNew.add(perimeterOfTriangle);
        

        kineticEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathsUI2();
            }
        });

        potentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathsUI3();
            }
        });
        perimeterOfRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathsUI4();
            }
        });
        perimeterOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathsUI5();
            }
        });
        perimeterOfTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mathsUI6();
            }
        });
    }
    JFrame frameA = new JFrame("Window");

    JLabel textA1 = new JLabel("  ENTER Mass:");
    JLabel textA2 = new JLabel("  ENTER Velocity:");
    JTextField textFieldlen= new JTextField();
    JTextField textFieldbre= new JTextField();
    JButton calculateA=new JButton("calculate");


    public void mathsUI2()
    {
        frameA.setSize(300,300);
        frameA.setLayout(new GridLayout(3,1));
        frameA.setVisible(true);
//        frameA.add(textFieldbre);


        frameA.add(textA1);
        frameA.add(textFieldlen);
        frameA.add(textA2);
        frameA.add(textFieldbre);
        frameA.add(calculateA);


        calculateA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Geometry myObj=new Geometry();
                float answer=myObj.Energy(Float.parseFloat(textFieldlen.getText()),Float.parseFloat(textFieldbre.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }

    JFrame frameB = new JFrame("Window");

    JLabel textB1 = new JLabel("  ENTER Mass:");
    JLabel textB2 = new JLabel("  ENTER Gravity:");
    JLabel textB3 = new JLabel("  ENTER Height:");
    JTextField textFieldleng= new JTextField();
    JTextField textFieldwid= new JTextField();
    JTextField textFieldHei = new JTextField();
    JButton calculateB=new JButton("calculate");


    public void mathsUI3()
    {
        frameB.setSize(300,300);
        frameB.setLayout(new GridLayout(3,1));
        frameB.setVisible(true);


        frameB.add(textB1);
        frameB.add(textFieldleng);
        frameB.add(textB2);
        frameB.add(textFieldwid);
        frameB.add(textB3);
        frameB.add(textFieldHei);
        frameB.add(calculateB);


        calculateB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Geometry myObj=new Geometry();
                float answer=myObj.PEnergy(Float.parseFloat(textFieldleng.getText()),Float.parseFloat(textFieldwid.getText()),Float.parseFloat(textFieldHei.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }
    JFrame frameC = new JFrame("Window");

    JLabel textC1 = new JLabel("  ENTER Mass:");
    JLabel textC2 = new JLabel("  ENTER Acceleration:");
    JTextField textFieldlength= new JTextField();
    JTextField textFieldwidth= new JTextField();
    JButton calculateC=new JButton("calculate");


    public void mathsUI4()
    {
        frameC.setSize(300,300);
        frameC.setLayout(new GridLayout(3,1));
        frameC.setVisible(true);


        frameC.add(textC1);
        frameC.add(textFieldlength);
        frameC.add(textC2);
        frameC.add(textFieldwidth);
        frameC.add(calculateC);


        calculateC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Geometry myObj=new Geometry();
                float answer=myObj.Force(Float.parseFloat(textFieldlength.getText()),Float.parseFloat(textFieldwidth.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }

    JFrame frameD = new JFrame("Window");

    JLabel textD1 = new JLabel("  ENTER Force:");
    JLabel textD2 = new JLabel("  ENTER Mass:");
    JTextField textFieldlengthOn1= new JTextField();
    JTextField textFieldlengthOn2= new JTextField();
    JButton calculateD=new JButton("calculate");


    public void mathsUI5()
    {
        frameD.setSize(300,300);
        frameD.setLayout(new GridLayout(5,1));
        frameD.setVisible(true);


        frameD.add(textD1);
        frameD.add(textFieldlengthOn1);
        frameD.add(textD2);
        frameD.add(textFieldlengthOn2);
        frameD.add(calculateD);


        calculateD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Geometry myObj=new Geometry();
                float answer=myObj.Acceleration(Float.parseFloat(textFieldlengthOn1.getText()),Float.parseFloat(textFieldlengthOn2.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }

    JFrame frameE = new JFrame("Window");

    JLabel textE1 = new JLabel("  ENTER Force:");
    JLabel textE2 = new JLabel("  ENTER Distance:");

    JTextField textFieldlengthE= new JTextField();
    JTextField textFieldBreadthE= new JTextField();
    JButton calculateE=new JButton("calculate");


    public void mathsUI6()
    {
        frameE.setSize(300,300);
        frameE.setLayout(new GridLayout(4,1));
        frameE.setVisible(true);


        frameE.add(textE1);
        frameE.add(textFieldlengthE);
        frameE.add(textE2);
        frameE.add(textFieldBreadthE);
        frameE.add(calculateE);


        calculateE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Geometry myObj=new Geometry();
                float answer=myObj.WorkDone(Float.parseFloat(textFieldlengthE.getText()),Float.parseFloat(textFieldBreadthE.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }
}

