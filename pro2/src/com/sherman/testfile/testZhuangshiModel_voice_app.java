package com.sherman.testfile;
/**
 * ����װ��ģʽ�µ�voice����Ŵ���
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
