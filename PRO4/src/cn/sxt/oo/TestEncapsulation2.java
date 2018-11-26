package cn.sxt.oo;
/**
 * 测试封装
 * @author pc
 *
 */
import cn.sxt.oo2.Human;
public class TestEncapsulation2 {
	public static void main(String[]args) {
		cn.sxt.oo2.Human h = new cn.sxt.oo2.Human();
		//h.age = 12;  //Human 中age为私有，所以报错
		h.name = "sherman";  //
				
	}

}
