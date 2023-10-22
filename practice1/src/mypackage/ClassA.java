package mypackage;

public class ClassA {
    private int privateFieldA;
    int packagePrivateFieldA;
    protected int protectedFieldA;
    public int publicFieldA;

    void packagePrivateMethodA() {
        System.out.println("Package-private method in ClassA");
    }
}

class ClassB {
    void accessMembersOfClassA() {
        ClassA objA = new ClassA();

        // Access members of ClassA from ClassB
        System.out.println(objA.packagePrivateFieldA);
        System.out.println(objA.protectedFieldA);
        System.out.println(objA.publicFieldA);
        objA.packagePrivateMethodA();
    }
}


// this is to understand how commit is done