class Abc  
{
	int x;
	Abc(int a)
	{
		a=x;
	}
	public void reference(int k)
	{
		System.out.println(k);
		System.out.println(k);
	}
}
class test
{
	public static void main(String[] args) 
	{
		Abc t=new Abc();
		t.x=71;
        t.reference(11);
	}
}
