class Circle
{
  public Circle ()
    {
      radius = 10;
      color ="Red";
      count++;
    }

    //parameterized constuctor
    public Circle(double r, String c)
    {
      radius = r;
      color = c;
      count++;
    }
    public double getRadius()
    {
      return radius;
    }

    public String getColor()
    {
      return color;
    }
  
}
