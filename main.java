
/*OVERLOADING MAIN CLASS*          /*NOTE:it can overload both instance and static members*/
package overloading.statc.instan;   

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent k=new Parent();
		k.Member();
		k.Member(5,6);//passing parameters to instance method by objects
		k.Member(10,7);
		System.out.println(Parent.foo());
		System.out.println(Parent.foo(3,5));//passing paremeters to static  method by class name and print values
		

	}

}
