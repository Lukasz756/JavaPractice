import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class RobotName {
    public List<String> getRobotNames(int numberOfUniqueRobotNames){
        List<String> stringList = new ArrayList<>();
        Random randomGenerator = new Random();
        for(int i=0;i<numberOfUniqueRobotNames;){
            String newName = "XB"+randomGenerator.nextInt(10)+randomGenerator.nextInt(10)+randomGenerator.nextInt(10);

            if(i==0){
                stringList.add(newName);
                i++;
            }else{

            }
            if(stringList.contains(newName)){

            }else{
                stringList.add(newName);
                i++;
            }

        }

        return stringList;
    }
}
