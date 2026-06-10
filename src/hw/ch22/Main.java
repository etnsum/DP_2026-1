package hw.ch22;
import hw.ch22.command.*;
import hw.ch22.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {

    private MacroCommand history = new MacroCommand();


    private DrawCanvas canvas = new DrawCanvas(400, 400, history);


    private JButton clearButton = new JButton("clear");


    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");

    // Undo 버튼 추가
    private JButton undoButton = new JButton("undo");

    // Redo 버튼 추가
    private JButton redoButton = new JButton("redo");

  
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);


        clearButton.addActionListener(e -> {
            history.clear();  
            canvas.init();      
            canvas.repaint();   
        });


        redButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        });


        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });


        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });

        // Undo 가장 최근에 실행된 명령을 취소함
        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        // Redo 가장 최근에 undo된 명령 복원함
        redoButton.addActionListener(e -> {
            history.redo();
            canvas.repaint();
        });


        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);

        // 버튼 박스에 undo와 redo 버튼 추가
        buttonBox.add(undoButton);
        buttonBox.add(redoButton);

 
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }


    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        Command cmd = new DrawCommand(canvas, e.getPoint());


        history.append(cmd);


        cmd.execute();
    }


    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}