package com.sherman.testfile;
/**
 * ���������Ŵ���
 * *������
 * ������֮��Ĺ�ϵ
 * 1������:�β�|�ֲ�����
 * 2������:����
 * 		�ۺ�:���� �����벿�� ��һ�µ��������� ������
 *      ���:���� �����벿�� һ�µ���������  �������
 * 3���̳�:�������ϵ
 * 4��ʵ��: �ӿ���ʵ�����ϵ
 * @author pc
 *
 */
public class testZhuangshiModel_amplifier {
	private testZhuangshiModel_voice voice;
	public testZhuangshiModel_amplifier() {
		
	}
	public testZhuangshiModel_amplifier(testZhuangshiModel_voice voice) {
		super();
		this.voice = voice;
		
	}
	public void say() {
		System.out.println(voice.getVoice()*1000);
	}
	
}
