package Array.src.Array;

public class Main {

    public static void main(String[] args) {

        int test[] = new int[3];//تعريف المصفوفة ثم اسناد قيم لعناصرها
        test[0] = 5;
        test[1] = 10;
        test[2] = 15;// آخر عنصر في المصفوفة أقل من الطول بواحد لانه يبدأ من صفر
        System.out.println(test[2]);
        System.out.println("The last element of the Array = " + test[test.length - 1]);//لاحضار العنصر الأخير في المصفوفة

        String[] name = {"Deema", " Maqadma"};// طريقة أخرى لتعريف المصفوفة بسرد عناصرها
        System.out.print(name[0]);
        System.out.print(name[1]);
        System.out.print("\n");
        System.out.println("The size if array = " + name.length);//لمعرفة طول المصفوفة نستخدم .length

        int num[] = {96, 98, 95, 94, 93};
        for (int i = 0; i < num.length; i++) { // الحلقة ليمر على كل عناصر المصفوفة
            System.out.print(num[i] + " ,"); // لطباعة عناصر المصفوفة
        }
        System.out.println("\b");  //لحذف الفاصلة الأخيرة

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];  // لجمع عناصر المصفوفة
        }
        System.out.println(" The Sum of the Array = " + sum);
        System.out.println("The Avg = " + Avg_Array(num)); // نستدعي الميثود لتنفذ
        int TheMax = Max_Array(num);
        System.out.println(" The Max = " + TheMax);
        //===================================================================
        //   Two dimentional Array 
        int row = 3;
        int col = 3;
        int[][] numm = new int[row][col]; // انشاء مصفوفة ثم اسناد القيم
        numm[0][0] = 6;
        numm[0][1] = 8;
        numm[0][2] = 4;
//    
        int nummm[][] = {{2, 3}, {5, 6}};  //انشاء واعلان المصفوفة والفاصلة تفصل بين الصفوف وكل مجموعة داخلية تمثل صف وبداخلها عناصر الأعمدة
        // nested for Loop to print the two dimentional Array
        for (int i = 0;
                i < nummm.length;
                i++) {  //طول المصفوفة يمثل عدد الصفوف 
            for (int j = 0; j < nummm[i].length; j++) {  // طول كل صف يمثل عدد الأعمدة داخل هذا الصف
                System.out.print(nummm[i][j] + " ,");   // لطباعة الصفوف والذي يمثل مصفوفة 
            }
            System.out.println("\b");  //ليطبع الصفوف ( المصفوفات ) تحت بعض 
        }

        //===================================================================
        int summ = 0;
        for (int o = 0;
                o < numm[0].length;
                o++) {  // لاحضار مجموع عناصر الصف الأول
            summ += numm[0][o];
        }

        System.out.println(
                "The sum of row 1 = " + summ);
        // في حال احضار المتوسط للصف نعمل نفس الكود ونضيف في جملة الطباعة مكان sum نضع  sum/numm[0].length
        //===================================================================
        for (int r = 0;
                r < numm.length;
                r++) //لطباعة عناصر القطر الرئيسي
        {
            System.out.print(numm[r][r] + " ,");
        }
        System.out.println(
                "\b");

        for (int a = 0, b = numm.length - 1; a < numm.length; a++, b--) {   //   لاحضار العنصر الأخير في الصفnumm.length-1 لطباعة عناصر القطر العكسي
            System.out.print(numm[a][b] + " ,");
            System.out.println("\b");
        }

    }

    //===================================================================
    public static double Avg_Array(int[] array) {  // ميثود ترجع قيمة المعدل
        int sum = 0;
        for (int i : array) // المتغير يلف على كل عناصر المصفوفة  i
        {
            sum += i;
        }
        return sum / array.length;
    }

    //===================================================================
    public static int Max_Array(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i; // هنا يمثل العنصر نفسه داخل المصفوفةi 
            }
        }
        return max;

    }

}
