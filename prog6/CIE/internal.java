package CIE;

public class internal extends Personal {
    public int[] internals=new int[5];
    public internal(String name,String usn,int sem,int[] internals){
        super(usn, name, sem);
        for(int i=0;i<5;i++){
            this.internals[i]=internals[i];
        }
    }

    public int[] getInternalMarks() {
        return internals;
    }
    
    public void displayInternal() {
        display();
        System.out.print("Internal Marks: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(internals[i] + " ");
        }
        System.out.println();
    }
}

