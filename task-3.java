
class Task3{
    public static void main(String[] args) {

        String a = new String("Wow");
        String b = a;
        String c = "a";
        String d = "Wow!";

        boolean b1 = a == b;
        System.out.println("b1 is "+ b1);
        boolean b2 = d.equals(b+ "!");
        System.out.println("b2 is "+ b2);
        boolean b3 = !c.equals(a);
        System.out.println("b3 is "+ b3);

        if (b1 && b2 && b3){
            System.out.println("Success!");
        }else System.out.println("failed");
    }
}