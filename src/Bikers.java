class bikers {
    public static  void main(String[] args){

        float b1=20,b2=30,b3=40, b4=50, b5=60,average;

        average= (b1+b2+b3+b4+b5)/5;
        System.out.println("Average "+ average);
        if( b1>average)
            System.out.println( "b1 qualifed");
        if( b2>average)
            System.out.println( "b2 qualifed");
        if( b3>average)
            System.out.println( "b3 qualifed");
        if( b4>average)
            System.out.println( "b4 qualifed");
        if( b5>average)
            System.out.println( "b5 qualifed");
        else
            System.out.println("no one qualified");

    }
}
