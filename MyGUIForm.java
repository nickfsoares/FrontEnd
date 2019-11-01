import javax.swing.*;

public class MyGUIForm extends JFrame
{
    private JButton myButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;
    public MyGUIForm()
    {
        //This uses the form designer form
        add(rootPanel);
        setTitle("This is my Title");
        setSize(400,500);
    }
}
