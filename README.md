# Java-fourth
# 2020322062  苗广汉  计G201
## 1.实验目的
+ 1.掌握Java中抽象类和抽象方法的定义;
+ 2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;
+ 3.了解异常的使用方法，并在程序中根据输入情况做异常处理;
## 2.实验内容
+ 1.设计两个管理接口：学生管理接口和教师管理接口。学生接口包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法;
+ 2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性;
+ 3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额;
## 3.实验要求
+ 1.在博士研究生类中实现各个接口定义的抽象方法;
+ 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额;
+ 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义;
+ 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入;
+ 5.根据输入情况，要在程序中做异常处理;
## 4.实验设计
+ 1.设计学生接口，添加缴纳学费，查学费的方法。
```
public interface Student{
		void payFee(int payfee);//缴纳学费
		void checkFee(int number);//查看学费
    }
``` 
+ 2.设计老师接口，添加发放薪水，查询薪水的方法。
```
public interface Teacher{
	void paySalary(int paysalary);//发放薪水
	void checkSalary(int number);//查看薪水
}
```
+ 3.设计博士研究生
```
	@Override
	public void paySalary(int salary) {
		if(salary==0) {
			System.out.println("未发放薪水");
		}
		else if(salary==1) {
			System.out.println("已发放薪水");
		}	
		else {
			System.out.println("输入错误，无法查询");
		}
	}
```
 + 在查询薪水的方法中设置if-else if-else语句，添加形参，若传入的值为1001，则学号为1001的薪水为8000，值为1002，则学号为1002的薪水为9000，其他的值为无法查询
 ```
 	@Override
	public void checkSalary(int number) {
		if(number==1001) {
			System.out.println("薪水为8000");
		}
		else if(number==1002) {
			System.out.println("薪水为9000");
		}	
		else {
			System.out.println("输入错误，无法查询");
		}
	}
 ```
 + 在缴纳学费的方法中设置if-else if-else语句，添加形参，若传入的值为0，则视为未缴纳学费，若值为1，则视为已缴纳学费，其他的值则为无法查询
 ```
 	@Override
	public void payFee(int fee) {
		if(fee==0) {
			System.out.println("未缴纳学费");
		}
		else if(fee==1){
			System.out.println("已缴纳学费");
		}	
		else {
			System.out.println("输入错误，无法查询");
		}
	}
 ```
  + 在查学费的方法中设置if-else if-else语句，添加形参，若传入的值为1001，则学费为6000，若值为1002，则学费为7000，其他的值为无法查询
  ```
  	@Override
	public void checkFee(int number) {
		if(number==1001) {
			System.out.println("学费为6000");
		}
		else if(number==1002){
			System.out.println("学费为7000");
		}	
		else {
			System.out.println("输入错误，无法查询");
		}
	}
  ```
  + 添加test方法，
  ```
  	public void test(int number) throws Exception{//抛出异常
		if(number == 1001 || number == 1002) {
			this.number=number;
			System.out.println("学号是:"+this.number);
		}else {
			throw new Exception("学号必须是1001或者1002。");
		}

}
  ```
  + 5.创建Test类，导入 java.util 包下的bai Scanner 类，用static修饰成员变量tax,在main方法下定义scanner，获得从控制台输入的参数，以及实例化博士研究生。
  ```
  import java.util.Scanner;
  public class Test {
	final double tax=0.10;//个人全月应纳税所得额超过3000元至12000元的部分，税率为%10
	public static void main(String[] args) {
		Doctor d1=new Doctor();
		Scanner scanner = new Scanner(System.in);
  ```
  + 调用博士研究生中的方法，查询缴纳学费，学费多少，发放薪水以及薪水多少。
 ```
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
 ```
 + 输入第一个博士生的
 ```
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
		try {
			System.out.println("请输入第一个博士的学号:");
			d1.number = scanner.nextInt();
			d1.test(d1.number);
			System.out.println("姓名:"+d1.name+" 性别:"+d1.sex+" 年龄:"+d1.age
					+" 每学期学费:"+d1.fee+" 每月薪水:"+d1.salary+
					"应缴纳纳税额为:"+((d1.salary*12)-(d1.fee*2))*tax*12+" 元");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 ```
  + 第二个博士研究生通过第一个博士研究生一样。
 
