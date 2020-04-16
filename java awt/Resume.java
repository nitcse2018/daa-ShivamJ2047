import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Resume implements ActionListener{
    TextField tf1,tf2,tf3,tf4;
    Choice c1;
    Button b1;
    Resume()
      {
      Frame f = new Frame();
      f.setLayout(new FlowLayout(FlowLayout.LEFT));
      f.add(new Label("Name          :"));
      tf1=new TextField(10);
      f.add(tf1);
      f.add(new Label("Qualification       :"));
      c1 = new Choice();
      c1.addItem("12th");
      c1.addItem("Graduation");
      c1.addItem("Post Graduation");
      c1.addItem("PHD");
      f.add(c1);
      f.add(new Label("Address      :"));
      tf2 = new TextField(10);
      f.add(tf2);
      f.add(new Label("Mobile no.      :"));
      tf3 = new TextField(10);
      f.add(tf3);
      f.add(new Label("hobbies        :"));
      tf4 = new TextField(10);
      f.add(tf4);
      b1=new Button("Submit");
      b1.addActionListener(this);
      f.add(b1);
      f.setSize(255,300);
      f.setVisible(true);
      }
    public void actionPerformed(ActionEvent a){  
      try {
      FileWriter myWriter = new FileWriter("Resume.txt");
      myWriter.write("Name: "+tf1.getText()+"\n");
      myWriter.write("Qualification: "+ c1.getItem(c1.getSelectedIndex())+"\n");
      myWriter.write("Address: "+tf2.getText()+"\n");
      myWriter.write("Mobile no.: "+tf3.getText()+"\n");
      myWriter.write("hobbies: "+tf4.getText());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }  
    }  
    public static void main(String[] args){
        Resume f = new Resume();
    }
}
