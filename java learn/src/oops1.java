class oops1{
     // state or field
  int gear;

  // behavior or method
  public void braking() {
    System.out.println("Working of Braking");
  }
    public static void main(String[] args) {
        oops1 bicycle=new oops1();
        bicycle.braking();
        bicycle.gear=6;
        System.out.println();
    }
}