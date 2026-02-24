package springcore;

public class BeanLifeCycle {
	
	public void postConstruct()
	{
		System.out.println("invoke after creation");
	}
  public void preDestroy()
  {
	  System.out.println("destoryed");
  }
  public void test()
  {
	  System.out.println("test");
  }
}
