package selectionprg;
class Demo
{
  String Carname;
  int ModelYear;
  Demo(String Carname,int ModelYear)
  {
    this.Carname = Carname;
    this.ModelYear = ModelYear;
    System.out.println("CONSTRUCTOR");
  }
}
public class constructor
{
  public static void main(String[] args)
  {
    Demo d = new Demo ("Thar" , 1927);
    System.out.println(d.Carname);
    System.out.println(d.ModelYear);
  }
}
