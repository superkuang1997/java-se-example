package annotation;

public class anno_02 {
    @myAnno1(age = 18, person = Student.S1, anno = @otherAnno, arr = {1, 2, 3})
    public void show01() {

    }

    @myAnno2(100)
    public void show02() {

    }
}
