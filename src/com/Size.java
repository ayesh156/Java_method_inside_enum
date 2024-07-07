package com;

enum Size {
    
    XS{
        @Override
        void getDesc() {
            System.out.println("This is XS");
        }
        
    },
    S{
        @Override
        void getDesc() {
             System.out.println("This is S");
        }
        
    },
    M,L,XL,XXL;
    
    void getDesc(){
        switch(this){
            case XS:
                System.out.println("This is XS");
                break;
             case S:
                System.out.println("This is S");
                break;
            case M:
                System.out.println("This is M");
                break;
            case L:
                System.out.println("This is L");
                break;
            case XL:
                System.out.println("This is XL");
                break;
        }
    }
    
}
