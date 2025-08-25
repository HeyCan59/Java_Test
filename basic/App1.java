class Test{
    public static void main(String[] args) {
        Test.talk("hi");
        System.out.println(BasicMath1.add(3, 4));
    }
    static void talk(String content){
        System.out.println(content);
    }
}

class BasicMath1{
    static int add(int n1,int n2){
        int result=n1+n2;
        return result;
    }
}