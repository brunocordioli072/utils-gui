package brunocordioli072.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends Frame implements ActionListener {
    Button calculator, countCharacters, close;

    public Main() {
        ArrayList<Component> components = createComponents();
        addComponents(components);

        setSize(200, 200);
        setTitle("My Software");
        setLayout(new FlowLayout());

        calculator.addActionListener(this);
        countCharacters.addActionListener(this);
        close.addActionListener(this);
    }

    public ArrayList<Component> createComponents () {
        ArrayList<Component> components = new ArrayList<>();

        calculator = new Button("Calculator");
        countCharacters = new Button("Count Characters");
        close = new Button("Close");

        components.add(calculator);
        components.add(countCharacters);
        components.add(close);

        return components;
    }

    public void addComponents (ArrayList<Component> components) {
        for (int i = 0; i < components.size(); i++) {
            add(components.get(i));
        }
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == calculator) {
            Calculator calC = new Calculator();
            calC.setVisible(true);
            calC.setLocation(100,300);
        }
        if (ae.getSource() == countCharacters) {
            CountCharacters counter = new CountCharacters();
            counter.setVisible(true);
            counter.setLocation(100,300);
        }
        if (ae.getSource() == close) {
            System.exit(0);
        }
    }
}
