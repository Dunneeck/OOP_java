package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

  private List<StudentGroup> steamStud;
    private int numberGroup;
    public static int idTemp;
    private final int id;


    public StudentSteam(List<StudentGroup> steamStud, int numberGroup){
        this.steamStud = steamStud;
        this.numberGroup = numberGroup;
        id = idTemp++;
    }


    public List<StudentGroup> getSteamStud() {
        return steamStud;
    }


    public void setSteamStud(List<StudentGroup> steamStud) {
        this.steamStud = steamStud;
    }


    public int getNumberGroup() {
        return numberGroup;
    }


    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }


    public int getId() {
        return id;
    }

    @Override
    public Iterator<StudentGroup> iterator(){
        return new Iterator<StudentGroup>() 
        {
            private int counter;

            @Override
            public boolean hasNext(){
                return counter<steamStud.size();
            }

            public StudentGroup next(){
                if(!hasNext()){
                    return null;
                }
                return steamStud.get(counter++);
            }
            
        };
    }






}
