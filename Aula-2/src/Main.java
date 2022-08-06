public class Main {
    public static void main(String[] args) throws Exception {
        
        No no1 = new No("content no1");

        No no2 = new No("content no2");
        no1.setNextNo(no2);

        No no3 = new No("content no3");
        no2.setNextNo(no3);

        No no4 = new No("content no4");
        no3.setNextNo(no4);

        // no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getNextNo());
        System.out.println(no2);

        System.out.println("------------------");

        System.out.println(no1);
        System.out.println(no1.getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo().getNextNo());
    }
}
