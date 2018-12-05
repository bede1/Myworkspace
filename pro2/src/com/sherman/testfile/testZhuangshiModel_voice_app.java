package com.sherman.testfile;
/**
 * 调用装饰模式下的voice及其放大器
 * @author pc
 *
 */
public class testZhuangshiModel_voice_app {
	public static void main(String[] args)
	{
		testZhuangshiModel_voice v = new testZhuangshiModel_voice();
		v.say();
		testZhuangshiModel_amplifier am = new testZhuangshiModel_amplifier(v);
		am.say();
		
	}

}
