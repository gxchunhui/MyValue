
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
	v1.setValue("�������ַ���String����", new Integer(100));
	String str=v1.getValue1();
	Integer num=v1.getValue2();
	System.out.println("v1����ĵ�һ������Ϊ��"+str+";"+"�ڶ�������Ϊ��"+num);
	Value<Integer,String> v2=new Value<Integer,String>();
	v2.setValue(new Integer(101), "������v2����ĵڶ�������");
	Integer num2=v2.getValue1();
	String str2=v2.getValue2();
	System.out.println("v2����ĵ�һ������Ϊ��"+num2+";"+"�ڶ�������Ϊ��"+str2);
	
	}

}
