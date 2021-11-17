package exercises_2;

public class Test {
    public static void main(String[] args) {

        BSTfunction bsTfunction = new BSTfunction();

        //dựng lại cây gốc
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 21);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 15);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 39);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 10);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 18);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 23);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 42);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 6);
        bsTfunction.myRoot = bsTfunction.insert(bsTfunction.myRoot, 12);

        //thêm phần tử 34 vào cây gốc của đề bài
        bsTfunction.insert(bsTfunction.myRoot, 34);

        //tìm kiếm một phần tử trong cây
        bsTfunction.serchBST(bsTfunction.myRoot, 18);

        //xóa phần tử có giá trị bằng 10
        bsTfunction.removeBST(bsTfunction.myRoot, 10);




        System.out.println("done");
    }
}
