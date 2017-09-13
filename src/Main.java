public class Main {

    public static void main(String[] args) {
	// write your code here
        Backpack b1 = new Backpack(2,3,4);
        Backpack b2 = new Backpack(3,2,4);

        System.out.println(Backpack.getTotalNotebooks());
        System.out.println(Backpack.getTotalPencils());
        System.out.println(Backpack.getTotalPens());
    }
}
