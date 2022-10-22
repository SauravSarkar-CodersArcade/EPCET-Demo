package javaEnum;

public class EnumExample {
    enum Priority{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Priority p1 = Priority.HIGH;
        Priority p2 = Priority.MEDIUM;
        Priority p3 = Priority.LOW;

        System.out.println("The bug/defect has " + p1 + " priority.");
        // for (enum_name var : enum_name.values){
        // statements......
        // }
        for (Priority type : Priority.values()){
            System.out.println(type);
        }
    }
}
