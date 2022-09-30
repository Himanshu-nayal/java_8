@FunctionalInterface
interface Program {
    boolean greater(int a,int b);
}
@FunctionalInterface
interface Increment{
   int findGreatest(int numb);

}
@FunctionalInterface
interface Concat
{
     String Con(String a,String b);
}
interface Upper{
String upperCase(String str);
}

class test {
    public static void main(String[] args) {
        Program program = (int a,int b)-> {
            if (a > b)
                return true;

            return false;
        };

       Increment ic=(int a)->
       {
           return  a=a+1;
       };

       Concat cat=(String s1,String s2)->{
           return s1+ " "+ s2;

       };
       Upper upr=(String s4)->{
           return s4.toUpperCase();
       };
        System.out.println(ic.findGreatest(2));
        System.out.println(cat.Con("himanshu","nayal"));

        System.out.println(program.greater(13,5));
        System.out.println(upr.upperCase("Amit"));


    }


        }

