public class PP73 {
    public static void main(String[] args) {
        Address charlesSchoolAddress = new Address("3946 Leisure Lane", "Pismo Beach", "CA", 93449);
        Address charlesHomeAddress = new Address("3378 Liberty Avenue", "Santa Ana", "CA", 92701);
        Student charles = new Student("Charles", "Wood", charlesHomeAddress, charlesSchoolAddress);
        charles.setTestScore(1, 16);
        charles.setTestScore(2, 14);
        charles.setTestScore(3, 20);
        System.out.println(charles.toString());
    }
}