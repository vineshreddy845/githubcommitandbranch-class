class Class {
  public void str() {
    System.out.println("hello");
  }

  static void simbha() {
    System.out.println("hi simbha---");
  }
  int vineeth(int y)
  {
    return y;
  } 
  public static void main(String args[]) {
    Class obj = new Class();
    obj.str();
    simbha();
    System.out.println(obj.vineeth(2));
  }
}
