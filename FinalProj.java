import javax.swing.JFrame;
class FinalProj {
    public static void main (String [] args)
    {
        //Creating JFrame and setting size and starting point
        Gui project = new Gui();
        project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project.setSize(375,390);
        project.setResizable(false);
        project.pack();
        project.setLocationRelativeTo(null);
        project.setVisible(true);

    }
}
