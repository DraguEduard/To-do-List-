package classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    JLabel index;
    JTextField taskName;
    JButton done;

    private boolean checked;

    Task()
    {
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(Color.yellow);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskName = new JTextField("");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.yellow);


        this.add(taskName,BorderLayout.CENTER);

        done = new JButton("Gata");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setFocusPainted(false);

        this.add(done,BorderLayout.EAST);

    }

    public void changeIndex(int num)
    {
        this.index.setText(num+"");
        this.revalidate();
    }


    public JButton getDone()
    {
        return done;
    }

    public boolean getState()
    {
        return checked;
    }

    public void changeState()
    {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
        revalidate();
    }
}