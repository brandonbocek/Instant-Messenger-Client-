import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args){
		Client charlie;
		//this IP address means local host
		//but it can be different to work beyond this computer
		charlie = new Client("127.0.0.1");
		charlie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		charlie.startRunning();
	}
}
