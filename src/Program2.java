interface Program2 {
     float Op(int a, int b) ;

}



class Test{

    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
     static int mul(int a,int b)
    {
        return a*b;
    }
    static float div(float a,float b){
        return a/b;
    }

    public static void main(String[] args) {

        Program2 program1;
        Program2 program2;
        Program2 program3;
        Program2 program4;

        program1=new Test()::add;
        System.out.println("ADDITION " + (int)program1.Op(7,8));

        program2=new Test()::sub;
        System.out.println("SUBTRACTION "+ (int)program2.Op(7,8));

        program3=Test::mul;
        System.out.println("MULTIPLICATION " +(int) program3.Op(7,9));
        program4=Test::div;
        System.out.println("division "+ program4.Op(21,7)) ;


    }


}
