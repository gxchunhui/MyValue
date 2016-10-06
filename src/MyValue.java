
class Value<T,U> {
	private T value1;
	private U value2;
	public void setValue(T newValue1,U newValue2)
	{
		this.value1=newValue1;
		this.value2=newValue2;
	}
	public T getValue1()
	{
		return this.value1;
	}
    public U getValue2() 
	{
		return this.value2;
	}
}
public class MyValue
{
public static void main(String[] args)
{
	Value<String,Integer> v1=new Value<String,Integer>();
	v1.setValue("这里是字符串String类型", new Integer(100));
	String str=v1.getValue1();
	Integer num=v1.getValue2();
	System.out.println("v1对象的第一个参数为："+str+";"+"第二个参数为："+num);
	Value<Integer,String> v2=new Value<Integer,String>();
	v2.setValue(new Integer(101), "这里是v2对象的第二个参数");
	Integer num2=v2.getValue1();
	String str2=v2.getValue2();
	System.out.println("v2对象的第一个参数为："+num2+";"+"第二个参数为："+str2);
	
	}

}
