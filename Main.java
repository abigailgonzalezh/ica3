//Abigail Gonzalez Hidalgo A00819967
//Oscar Cañongo Vergara A01730443
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Main extends JPanel{

    public void paintComponent(Graphics a){
        super.paintComponent(a);

        int r=0,g=0,b=255;

        for(int i = 0; i<1000; i++){
            for(int j = 0; j<200; j++){
                a.setColor(new Color(r,g,b));
                a.drawLine(i,j,i,j); 
            }
        }
    }
    public static void main(String[] args) {
        
        Main panel = new Main();  //instancia un objeto de la misma clase
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1000, 500); //tamano panel 1000x600
		application.setVisible(true); //para que se vea
    }
}