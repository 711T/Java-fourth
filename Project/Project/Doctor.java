package Project;

public class Doctor implements Student,Teacher{
	
	String name;
	String sex;
	int age;
	int fee;//ÿѧ��ѧ��
	int salary;//ÿ��нˮ
	int number;//ѧ��
	
	@Override
	public void paySalary(int salary) {
		if(salary==0) {
			System.out.println("δ����нˮ");
		}
		else if(salary==1) {
			System.out.println("�ѷ���нˮ");
		}	
		else {
			System.out.println("��������޷���ѯ");
		}
	}

	@Override
	public void checkSalary(int number) {
		if(number==1001) {
			System.out.println("нˮΪ8000");
		}
		else if(number==1002) {
			System.out.println("нˮΪ9000");
		}	
		else {
			System.out.println("��������޷���ѯ");
		}
		
	}

	@Override
	public void payFee(int fee) {
		if(fee==0) {
			System.out.println("δ����ѧ��");
		}
		else if(fee==1){
			System.out.println("�ѽ���ѧ��");
		}	
		else {
			System.out.println("��������޷���ѯ");
		}
	}

	@Override
	public void checkFee(int number) {
		if(number==1001) {
			System.out.println("ѧ��Ϊ6000");
		}
		else if(number==1002){
			System.out.println("ѧ��Ϊ7000");
		}	
		else {
			System.out.println("��������޷���ѯ");
		}
	}
	
	public void test(int number) throws Exception{//ʹ��throws�ڴ������׳��쳣���ڵ��÷�ȥ������
		if(number == 1001 || number == 1002) {
			this.number=number;
			System.out.println("ѧ����:"+this.number);
		}else {
			throw new Exception("ѧ�ű�����1001����1002��");
		}

}
}
