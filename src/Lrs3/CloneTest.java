package Lrs3;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/25 21:52
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("凌瑞松",50000);
        original.setHireDay(1998,04,05);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(1998,07,21);
        System.out.println("原始="+original);
        System.out.println("复制="+copy);
    }
}
