Class First{
    public int n1 = 20 ; 
    private int n2 =9999;
    protected int n3 = 1000;

    First(){
        System.out.println("Default constructor of First");
        n1 = 22 ;
        n2 = 100;
        n3 =1000;
    }

    First (int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        System.out.println("In para constructor of first")
    }


}