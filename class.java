class Class {
  public void str() {
    System.out.println("hello");
  }

  static void simbha() {
    System.out.println("hi simbha---");
  }

  int vinesh(int x) {
    return x;
  }

  public static void main(String args[]) {
    // int x;
    Class obj = new Class();
    obj.str();
    simbha();
    System.out.println(obj.vinesh(2));
  }
}
