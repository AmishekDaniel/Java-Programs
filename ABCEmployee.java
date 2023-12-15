public class ABCEmployee implements EmployeeRules,FamilyRules
{
	public static void main(String[] args)
	{
		ABCEmployee abc = new ABCEmployee();
		abc.maintainhours();
		abc.dress();
	    FamilyRules father = new ABCEmployee();
		father.eattogether();
	}
	public void maintainhours()
	{
		System.out.println("40 hours");
	}
    public void relocate()
	{
		System.out.println("other city");
	}
    public void report()
	{
		System.out.println("Manager");
	}
    public void dress()
	{
		System.out.println("Neatly");
	}
	public void takecareparents()
	{
		
	}
    public void helpmembers()
	{
	}
    public void eattogether()
	{
		
	}
    public void enjoy()
	{
		
	}
	
}