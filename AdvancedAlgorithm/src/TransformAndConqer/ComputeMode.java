
package TransformAndConqer;

import java.util.Arrays;

public class ComputeMode {

    public static int mode(int[] arr) {
        Arrays.sort(arr); // ترتيب المصفوفة
        int mode = arr[0], maxCount = 1, count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; // نفس الرقم السابق → زيد العدّاد
            } else {
                count = 1; // رقم جديد → أعد ضبط العدّاد
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i]; // تحديث القيمة الأكثر تكرارًا
            }
        }
        return mode;
    }

}
