package aabed;


class Sample{
	
}
public class BootstrapClassLoaderDemo {

	public static void main(String[] args) {

		System.out.println("Super class for Platform class Loader :");
		System.out.println(Sample.class.getClassLoader().getParent());
	    System.out.println("----------------------");
	    System.out.println(String.class.getClassLoader());
	    System.out.println(Integer.class.getClassLoader());
	
	}

}
