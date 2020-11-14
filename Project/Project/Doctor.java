package Project;

public class Doctor implements Student,Teacher{
	
	String name;
	String sex;
	int age;
	int fee;//每学期学费
	int salary;//每月薪水
	int number;//学号
	
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
	
	public void test(int number) throws Exception{//使用throws在代码这抛出异常，在调用方去捕获处理
		if(number == 1001 || number == 1002) {
			this.number=number;
			System.out.println("学号是:"+this.number);
		}else {
			throw new Exception("学号必须是1001或者1002。");
		}

}
}
