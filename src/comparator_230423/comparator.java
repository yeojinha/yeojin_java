package comparator_230423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
class PhysExamSearch{
    static class PhysData{
        private String name;
        private int height;
        private double vision;

        public PhysData(String name, int height, double vision){
            this.height=height;
            this.name=name;
            this.vision=vision;
        }

        public void printDetail(){
            System.out.println("Height: "+this.height);
            System.out.println("Name  : "+this.name);
            System.out.println("Vision: "+this.vision);
        }

        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysData>{
            public int compare (PhysData d1, PhysData d2){
                return d1.height> d2.height? 1:
                        (d1.height< d2.height) ?-1:0;
            }
        }

    }
    public static void main(String[] args) throws IOException {
//        Scanner stdIn = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        PhysData[] x= {
                new PhysData("하여진",161,0.1),
                new PhysData("하여진1",162,0.2),
                new PhysData("하여진2",163,0.3),
                new PhysData("하여진3",164,0.4),
                new PhysData("하여진4",165,0.5),
                new PhysData("하여진5",166,0.6)
        };
        System.out.println("Height you're looking for: ");
        int  height = Integer.parseInt(br.readLine());
        int idx = Arrays.binarySearch(x, new PhysData("",height,0.0),PhysData.HEIGHT_ORDER);


        if(idx<0){
            System.out.println("There is no you're looking for");
        }else{
            System.out.println("["+idx+"] has been found");
//            System.out.println("Data: "+x[idx].printDetail());
            x[idx].printDetail();
        }
    }

}
