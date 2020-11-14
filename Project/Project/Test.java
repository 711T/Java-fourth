package Project;
import java.util.Scanner;
public class Test {
	static  double tax=0.10;//个人全月应纳税所得额超过3000元至12000元的部分，税率为%10
	public static void main(String[] args) {
		Doctor d1=new Doctor();
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入0或1查询是否缴纳学费:");
		d1.fee=scanner.nextInt();
		d1.payFee(d1.fee);
		System.out.println("输入学号查询学费是多少:");
		d1.number=scanner.nextInt();
		d1.checkFee(d1.number);
		System.out.println("输入0或1查询是否发放薪水:");
		d1.salary=scanner.nextInt();
		d1.paySalary(d1.salary);
		System.out.println("输入学号查询薪水是多少:");
		d1.number=scanner.nextInt();
		d1.checkSalary(d1.number);
		System.out.println("----------------------------------------------------");
		System.out.println("请输入第一个博士的名字:");
		d1.name=scanner.next();
		System.out.println("请输入第一个博士的性别:");
		d1.sex=scanner.next();
		System.out.println("请输入第一个博士的年龄:");
		d1.age = scanner.nextInt();
		System.out.println("请输入第一个博士的学费:");
		d1.fee = scanner.nextInt();
		System.out.println("请输入第一个博士的薪水:");
		d1.salary = scanner.nextInt();
		try {//throws在代码这里抛出的异常，在调用方去处理
			System.out.println("请输入第一个博士的学号:");
			d1.number = scanner.nextInt();
			d1.test(d1.number);
			System.out.println("姓名:"+d1.name+" 性别:"+d1.sex+" 年龄:"+d1.age
					+" 每学期学费:"+d1.fee+" 每月薪水:"+d1.salary+
					"应缴纳纳税额为:"+((d1.salary*12)-(d1.fee*2))*tax*12+" 元");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------");
		Doctor d2=new Doctor();
		System.out.println("请输入第二个博士的名字:");
		d2.name=scanner.next();
		System.out.println("请输入第二个博士的性别:");
		d2.sex=scanner.next();
		System.out.println("请输入第二个博士的年龄:");
		d2.age = scanner.nextInt();
		System.out.println("请输入第二个博士的学费:");
		d2.fee = scanner.nextInt();
		System.out.println("请输入第二个博士的薪水:");
		d2.salary = scanner.nextInt();
		try {
			System.out.println("请输入第二个博士的学号:");
			d1.number = scanner.nextInt();
			d1.test(d1.number);
			System.out.println("姓名:"+d1.name+" 性别:"+d1.sex+" 年龄:"+d1.age
					+" 每学期学费:"+d1.fee+" 每月薪水:"+d1.salary+
					"应缴纳纳税额为:"+((d1.salary*12)-(d1.fee*2))*tax*12+" 元");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
