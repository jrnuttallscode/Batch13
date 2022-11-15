package com.program;

public class StaticMethodDemo {

	public static void main(String[] args) {

			//instance method

			//public return_type method_name(parameters) {}

			public int instanceMethod() {

				int a = 10;

				int b = 20;

				int sum = a + b;

				return sum;

			}

			public int instanceMethod1() {

				double PI = 3.142;

				int r = 7287383;

				double area = PI * r * r;

				//return has to be last line of your method

				//the value you return should be smaller or same as return_type defined in the

				//method definition

				return r;

				//System.out.println(); //should not write it here


			}

//			public static void main(String[] args) {
//
//				StaticMethodDemo obj = new StaticMethodDemo();
//
//				int a = 200;
//
//				int sum = a + obj.instanceMethod();//
//
//				System.out.println(sum);
//
//
//
//				int a1 = 100;
//
//				//return type a be same or higher memory datatype but cannot be lower
//
//				double s = a1 + obj.instanceMethod1();
//
//				System.out.println(s); //
//
//			}
//		}
	}
}


//public class StaticMethodDemo {
//
//	 //instance method
//
//	 //public return_type method_name(parameters) {}
//
//	 public int instanceMethod(int a , int b  ) {
//
//	int sum = a + b;
//
//	 return sum;
//
//	 
//
//	}
//
//	 public static void main(String[] args) {
//
//	 StaticMethodDemo obj = new StaticMethodDemo();
//
//	 int a1 = obj.instanceMethod(65765,655);
//
//	 int a2 = obj.instanceMethod(3328647,34326);
//
//	 int a3 = obj.instanceMethod(543534,4324);
//
//	 int a4 = obj.instanceMethod(245,4);
//
//	 int a5 = obj.instanceMethod(2,2);
//
//	}
//
//}