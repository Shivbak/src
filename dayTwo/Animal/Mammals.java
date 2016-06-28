package dayTwo.Animal;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by student on 28-Jun-16.
 */
public class Mammals extends Animal{

    private String Name;
    private boolean BackBone;
    private boolean Birth;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isBackBone() {
        return BackBone;
    }

    public void setBackBone(boolean backBone) {
        BackBone = backBone;
    }

    public boolean isBirth() {
        return Birth;
    }

    public void setBirth(boolean birth) {
        Birth = birth;
    }

    public Mammals(String Name,boolean BackBone,boolean Birth, String type)
    {
        super(type);
        this.Name = Name;

        this.BackBone = BackBone;
        this.Birth = Birth;

    }

    @Override
    public String toString()
    {
        return "Name : " + Name + " Type : " + Type + " BackBone : " + BackBone + " Give Birth : " + Birth;
    }
}
