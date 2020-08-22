package brunocordioli072.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator extends Frame implements ActionListener {
    Label valueLabel1, valueLabel2, resultLabel;
    TextField valueText1, valueText2, resultText;
    Button add, sub, multi, div, mod, reset, close;

    public Calculator() {
        ArrayList<Component> components = createComponents();
        addComponents(components);

        setSize(200, 200);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        reset.addActionListener(this);
        close.addActionListener(this);

    }
    public ArrayList<Component> createComponents () {
        ArrayList<Component> components = new ArrayList<>();

        valueLabel1 = new Label("Value 1");
        valueText1 = new TextField(11);
        components.add(valueLabel1);
        components.add(valueText1);

        valueLabel2 = new Label("Value 2");
        valueText2 = new TextField(11);
        components.add(valueLabel2);
        components.add(valueText2);

        resultLabel = new Label("Result");
        resultText = new TextField(11);
        components.add(resultLabel);
        components.add(resultText);

        add = new Button("Add");
        sub = new Button("Sub");
        multi = new Button("Multi");
        div = new Button("Div");
        mod = new Button("Mod");
        reset = new Button("Reset");
        close = new Button("Close");
        components.add(add);
        components.add(sub);
        components.add(multi);
        components.add(div);
        components.add(mod);
        components.add(reset);
        components.add(close);

        return components;
    }

    public void addComponents (ArrayList<Component> components) {
        for (int i = 0; i < components.size(); i++) {
            add(components.get(i));
        }
    }

    public void actionPerformed(ActionEvent ae) {
        double a = 0, b = 0, r = 0;
        try {
            a = Double.parseDouble(valueText1.getText());
        } catch (NumberFormatException e) {
            valueText1.setText("Invalid input");
        }
        try {
            b = Double.parseDouble(valueText2.getText());
        } catch (NumberFormatException e) {
            valueText2.setText("Invalid input");
        }
        if (ae.getSource() == add) {
            r = a + b;
            resultText.setText(String.valueOf(r));
        }
        if (ae.getSource() == sub) {
            r = a - b;
            resultText.setText(String.valueOf(r));
        }
        if (ae.getSource() == multi) {
            r = a * b;
            resultText.setText(String.valueOf(r));
        }
        if (ae.getSource() == div) {
            r = a / b;
            resultText.setText(String.valueOf(r));
        }
        if (ae.getSource() == mod) {
            r = a % b;
            resultText.setText(String.valueOf(r));
        }
        if (ae.getSource() == reset) {
            valueText1.setText("0");
            valueText2.setText("0");
            resultText.setText("0");
        }
        if (ae.getSource() == close) {
            setVisible(false);
        }
    }
}