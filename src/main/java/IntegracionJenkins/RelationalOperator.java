package IntegracionJenkins;

public class RelationalOperator {

    /**
     * Function to know if one number is greater than another
     * @param num1
     * @param num2
     * @return true if num1 is greater than num2, false otherwise
     */
    public boolean isGreater(int num1, int num2) {
        return num1 > num2;
    }

    /**
     * Function to know if one number is less than another
     * @param num1
     * @param num2
     * @return true if num1 is less than num2, false otherwise
     */
    public boolean isLess(int num1, int num2) {
        return num1 < num2;
    }

    
    public boolean goodWidth(final int object_width, final int min_width, final int max_width){
        if (isGreater(object_width, min_width) && isLess(object_width, max_width)) {
            return true;
        } else {
            return false;
        }
    }

    
    public boolean goodHeight(final int object_height, final int min_height, final int max_height){
        if (isGreater(object_height, min_height) && isLess(object_height, max_height)) {
            return true;
        } else {
            return false;
        }
    }
}
