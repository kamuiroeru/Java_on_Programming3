class GCsample1{
    public static void main(String[] args){
        while(true){
            String s = new String("abcde");
            for(int i=0; i<1000; i++){
                s = s + "abcde";
            }
            System.out.println(Runtime.getRuntime().freeMemory());
        }
    }
}

class GCsample2{
    public static void main(String[] args){
        while(true){
            for(int i=0; i<10; i++){
                String s = new String("abcde");
                for(int j=0; j<1000; j++){
                    s = s + "abcde";
                }
                System.out.println(Runtime.getRuntime().freeMemory());
            }
            System.gc();
            System.out.println(Runtime.getRuntime().freeMemory() + "AlterGC");
        }
    }
}