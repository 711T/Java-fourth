package Project;
import java.util.Scanner;
public class Test {
	static  double tax=0.10;//����ȫ��Ӧ��˰���ö��3000Ԫ��12000Ԫ�Ĳ��֣�˰��Ϊ%10
	public static void main(String[] args) {
		Doctor d1=new Doctor();
		Scanner scanner = new Scanner(System.in);
		System.out.println("����0��1��ѯ�Ƿ����ѧ��:");
		d1.fee=scanner.nextInt();
		d1.payFee(d1.fee);
		System.out.println("����ѧ�Ų�ѯѧ���Ƕ���:");
		d1.number=scanner.nextInt();
		d1.checkFee(d1.number);
		System.out.println("����0��1��ѯ�Ƿ񷢷�нˮ:");
		d1.salary=scanner.nextInt();
		d1.paySalary(d1.salary);
		System.out.println("����ѧ�Ų�ѯнˮ�Ƕ���:");
		d1.number=scanner.nextInt();
		d1.checkSalary(d1.number);
		System.out.println("----------------------------------------------------");
		System.out.println("�������һ����ʿ������:");
		d1.name=scanner.next();
		System.out.println("�������һ����ʿ���Ա�:");
		d1.sex=scanner.next();
		System.out.println("�������һ����ʿ������:");
		d1.age = scanner.nextInt();
		System.out.println("�������һ����ʿ��ѧ��:");
		d1.fee = scanner.nextInt();
		System.out.println("�������һ����ʿ��нˮ:");
		d1.salary = scanner.nextInt();
		try {//throws�ڴ��������׳����쳣���ڵ��÷�ȥ����
			System.out.println("�������һ����ʿ��ѧ��:");
			d1.number = scanner.nextInt();
			d1.test(d1.number);
			System.out.println("����:"+d1.name+" �Ա�:"+d1.sex+" ����:"+d1.age
					+" ÿѧ��ѧ��:"+d1.fee+" ÿ��нˮ:"+d1.salary+
					"Ӧ������˰��Ϊ:"+((d1.salary*12)-(d1.fee*2))*tax*12+" Ԫ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------");
		Doctor d2=new Doctor();
		System.out.println("������ڶ�����ʿ������:");
		d2.name=scanner.next();
		System.out.println("������ڶ�����ʿ���Ա�:");
		d2.sex=scanner.next();
		System.out.println("������ڶ�����ʿ������:");
		d2.age = scanner.nextInt();
		System.out.println("������ڶ�����ʿ��ѧ��:");
		d2.fee = scanner.nextInt();
		System.out.println("������ڶ�����ʿ��нˮ:");
		d2.salary = scanner.nextInt();
		try {
			System.out.println("������ڶ�����ʿ��ѧ��:");
			d1.number = scanner.nextInt();
			d1.test(d1.number);
			System.out.println("����:"+d1.name+" �Ա�:"+d1.sex+" ����:"+d1.age
					+" ÿѧ��ѧ��:"+d1.fee+" ÿ��нˮ:"+d1.salary+
					"Ӧ������˰��Ϊ:"+((d1.salary*12)-(d1.fee*2))*tax*12+" Ԫ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
