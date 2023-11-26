public class problem1108 {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        problem1108 obj1 = new problem1108();
        System.out.println(obj1.defangIPaddr("1.1.1.1"));
    }
}
