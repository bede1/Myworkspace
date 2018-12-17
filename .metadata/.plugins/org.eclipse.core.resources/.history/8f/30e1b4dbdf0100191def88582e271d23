package com.sherman.testthread.pro;
/**
 * Ö´ÐÐ
 * @author Auser
 *
 */
public class PlayerAndWatcher {
	public static void main(String[] args) {
		Movie m = new Movie();
		Player p1 = new Player(m);
		Watcher w1 = new Watcher(m);
		Thread thd1 = new Thread(p1);
		Thread thd2 = new Thread(w1);
		thd1.start();
		thd2.start();
	}
}
