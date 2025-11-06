package SEE;
import CIE.*;

public class external extends Personal {
    public int externals[]=new int[5];
    public external(String name,String usn,int sem,int[] marks){
        super(usn, name, sem);
        for (int i = 0; i < 5; i++) {
            this.externals[i]=marks[i];
        }
    }

    public int[] getExternalMarks(){
        return externals;
    }

    public void displayExternal(){
        display();
        System.out.println("External Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(externals[i]+" ");
        }
        System.out.println();
    }
}
