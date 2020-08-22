package brunocordioli072.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CountCharacters extends Frame implements ActionListener {
    Label inputLabel, countLabel;
    TextField inputText, countText;
    Button count, close;

    public CountCharacters() {
        ArrayList<Component> components = createComponents();
        addComponents(components);

        setSize(200, 200);
        setTitle("Counter");
        setLayout(new FlowLayout());

        count.addActionListener(this);
        close.addActionListener(this);

    }

    public ArrayList<Component> createComponents () {
        ArrayList<Component> components = new ArrayList<>();

        inputLabel = new Label("Input");
        inputText = new TextField(11);
        components.add(inputLabel);
        components.add(inputText);

        countLabel = new Label("Count");
        countText = new TextField(11);
        components.add(countLabel);
        components.add(countText);

        count = new Button("Count");
        close = new Button("Close");
        components.add(count);
        components.add(close);

        return components;
    }

    public void addComponents (ArrayList<Component> components) {
        for (int i = 0; i < components.size(); i++) {
            add(components.get(i));
        }
    }

    public void actionPerformed(ActionEvent ae) { 
        String text = "";
        Integer countNumber;
        try {
            text = inputText.getText();
        } catch (NumberFormatException e) {
            inputText.setText("Invalid input");
        }
        if (ae.getSource() == count) {
            countNumber = text.length();
            countText.setText(String.valueOf(countNumber));
        }
        if (ae.getSource() == close) {
            setVisible(false);
        }
    }
}
