public class TestGenerator {
    public static void main(String[] args) {
        println("@Test");
        println("void test(){");
        println("double[][] input = {");
        println(generateTest());
        println("};");
        println("int[] solution = {,};");
        println("test(input, solution);");
        println("}");
    }

    private static String generateTest(){
        int x = (int)(Math.random()*10)+1;
        int y = (int)(Math.random()*10)+1;
        StringBuilder output = new StringBuilder();
        int maxVal = Integer.MIN_VALUE;
        int[] index = {};
        for(int x1=0; x1<x;x1++){
            output.append("{");
            for(int y1=0;y1<y;y1++){
                int put = (int)(Math.random() * 1000) - 500;
                if(put>maxVal){
                    maxVal=put;
                    index = new int[]{x1,y1};
                }
                output.append(put);
                if(y1+1<y){
                    output.append(",");
                }
            }
            output.append("}");
            if(x1+1<x){
                output.append(",\r\n");
            }
        }
        return output.toString() + "//Max Value is " + maxVal + " at (" + index[0] + ", " + index[1] + ")";
    }

    private static void println (String input){
        System.out.println(input);
    }
    private static void print (String input){
        System.out.print(input);
    }
}
