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

        //Car
        int[] carstructurex = {689,681,687,698,708,716,785,830,881,953,981,988,982,974,970,961,939,912,875,835,812,794,777,764,751,729,713,699,691};
        int[] carstructurey = {348,356,367,367,367,367,367,367,367,367,367,359,349,341,322,297,267,246,234,232,237,244,260,276,290,293,300,315,332};
        a.setColor(new Color(255,204,0));
        a.drawPolygon(carstructurex, carstructurey, 29);
        a.fillPolygon(carstructurex, carstructurey, 29);

        //Left wheel
        a.setColor(new Color(0,0,0));
        a.drawOval(729, 351, 60, 60);
        a.fillOval(729, 351, 60, 60);
        a.setColor(new Color(204,204,179));
        a.drawOval(745, 365, 30, 30);
        a.fillOval(745, 365, 30, 30);
        //Right wheel
        a.setColor(new Color(0,0,0));
        a.drawOval(897, 351, 60, 60);
        a.fillOval(897, 351, 60, 60);
        a.setColor(new Color(204,204,179));
        a.drawOval(910, 365, 30, 30);
        a.fillOval(910, 365, 30, 30);

        //Left window
        int [] x1 = {836,836,806,791,780,772};
        int [] y1 = {291,244,251,263,276,291};
        a.setColor(new Color(230,255,255));
        a.drawPolygon(x1,y1,6);
        a.fillPolygon(x1,y1,6);
        //Right window
        int [] x2 = {851,898,944,933,918,888,852};
        int [] y2 = {291,291,291,277,265,249,243};
        a.setColor(new Color(230,255,255));
        a.drawPolygon(x2,y2,7);
        a.fillPolygon(x2,y2,7);

        //Handle
        a.setColor(new Color(230,255,255));
        a.drawOval(814,305,20,10);
        a.fillOval(814,305,20,10);

        //Dog
        int[] headx = {175,188,196,210,213,212,209,203,192,188,177,169,169,171,174,170,179};
        int[] heady = {323,323,334,334,347,357,366,376,376,373,370,366,360,353,342,331,320};
        a.setColor(new Color(191,128,64));
        a.drawPolygon(headx, heady, 17);
        a.fillPolygon(headx, heady, 17);
        //Ear
        int[] earx = {169,171,174,172,168,161,152,140,134,139,136,143,142,149,162};
        int[] eary = {325,331,342,353,360,367,371,368,357,354,343,343,334,335,325};
        a.setColor(new Color(77, 51, 25));
        a.drawPolygon(earx,eary,15);
        a.fillPolygon(earx,eary,15);


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