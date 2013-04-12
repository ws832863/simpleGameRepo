import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class SimpleTest extends BasicGame {

	public SimpleTest() {
		super("SimpleTest");
	}

	public SimpleTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new SimpleTest());
			app.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		g.drawString("Hello, Slick world!", 0, 100);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

}
