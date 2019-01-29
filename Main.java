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

        //Sky
        for(int i = 0; i<1000; i++){
            for(int j = 0; j<300; j++){
                
                a.setColor(new Color(r,g,b));
                a.drawLine(i,j,i,j);
            }
        }

        //House
        int[] roofx = {45,217,398,403,405,215,38,40};
        int[] roofy = {218,164,210,204,195,146,198,209};
        a.setColor(new Color(255,0,0));
        a.drawPolygon(roofx, roofy, 8);
        a.fillPolygon(roofx,roofy,8);

        int[] wallx = {65,65,65,236,327,380,380,380,375,325,217,135,76};
        int[] wally = {220,282,362,362,362,362,290,215,205,192,164,190,209};
        a.setColor(new Color(255,206,153));
        a.drawPolygon(wallx,wally,13);
        a.fillPolygon(wallx,wally,13);

        int[] window1x = {93,204,204,93};
        int[] window1y = {219,219,286,286};
        a.setColor(new Color(77,40,0));
        a.drawPolygon(window1x, window1y, 4);
        a.fillPolygon(window1x, window1y, 4);

        int[] window2x = {101,192,192,101};
        int[] window2y = {229,229,274,274};
        a.setColor(new Color(255,255,255));
        a.drawPolygon(window2x, window2y, 4);
        a.fillPolygon(window2x, window2y, 4);

        int[] doorx = {236,236,328,328,283};
        int[] doory = {361,247,247,361,361};
        a.setColor(new Color(77,40,0));
        a.drawPolygon(doorx, doory, 5);
        a.fillPolygon(doorx, doory, 5);

        a.setColor(new Color(255,255,0));
        a.drawOval(308,296,10,10);
        a.fillOval(308,296,10,10);
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