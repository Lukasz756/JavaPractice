public class Infiltration {

    static boolean canFastAttack(boolean knightIsAwake){
        if(knightIsAwake){
            return false;
        }else {
            return true;
        }
    }

    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if(!knightIsAwake&&!archerIsAwake&&!prisonerIsAwake){
            return false;
        }else{
            return true;
        }
    }

    static boolean canSignalPrisoner(boolean archerIsAwake,boolean prisonerIsAwake){
        if(!archerIsAwake&&prisonerIsAwake){
            return true;
        }else {
            return false;
        }
    }

    static boolean canFreePrisoner(boolean archerIsAwake,boolean knightIsAwake, boolean prisonerIsAwake,boolean isDogPresent){
        if(!archerIsAwake&&!knightIsAwake&&prisonerIsAwake&&!isDogPresent){
            return true;
        }else if(!archerIsAwake&&knightIsAwake&&prisonerIsAwake&&isDogPresent){
            return true;
        }else{
            return false;
        }


    }

}
