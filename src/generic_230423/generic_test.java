package generic_230423;
class GenericClass<T>{
    private T xyz;

    GenericClass(T t){
        this.xyz =  t;
    }
    T getXyz(){
        return xyz;

    }
}
public class generic_test {
    class GenericClass<T>{
        private T xyz;

        GenericClass(T t){
            this.xyz =  t;
        }
        T getXyz(){
            return xyz;

        }
    }


    public static void main(String[] args){
        generic_test test= new generic_test();
        generic_test.GenericClass<String> s=test.new GenericClass<String>("abc");
        generic_test.GenericClass<Integer> y=test.new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(y.getXyz());

    }
}
