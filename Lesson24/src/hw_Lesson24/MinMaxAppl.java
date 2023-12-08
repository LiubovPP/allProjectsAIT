package hw_Lesson24;

public class MinMaxAppl {
    public static void main(String[] args) {
        //Задача 4.(*) Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных
        //типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов
        //основной функции main.

        if (args.length == 0){ //
            System.out.println("All MIN and MAX");
            // вставить все остальное
        }
        for (int i = 0; i < args.length; i++) {
            double maxSize = 0;
            double minSize = 0;
            switch (args[i]) { // пример через switch

                case "byte": {
                    maxSize = Byte.MAX_VALUE;
                    minSize = Byte.MIN_VALUE;
                    break;
                }
                case "short": {
                    maxSize = Short.MAX_VALUE;
                    minSize = Short.MIN_VALUE;
                    break;
                }
                case "char": {
                    maxSize = Character.MAX_VALUE;
                    minSize = Character.MIN_VALUE;
                    break;
                }
                case "int": {
                    maxSize = Integer.MAX_VALUE;
                    minSize = Integer.MIN_VALUE;
                    break;
                }
                case "long": {
                    maxSize = Long.MAX_VALUE;
                    minSize = Long.MIN_VALUE;
                    break;
                }

                case "float": {
                    maxSize = Float.MAX_VALUE;
                    minSize = Float.MIN_VALUE;
                    break;
                }
                case "double": {
                    maxSize = Double.MAX_VALUE;
                    minSize = Double.MIN_VALUE;
                    break;
                }
                default:
                    System.out.println("Invalid type");
            }
            System.out.println("Type: " + args[i] + ":\t min value = " + minSize + " max value = " + maxSize);

// через if
//            if ("byte".equals(args[i])) {
//                maxSize = Byte.MAX_VALUE;
//                minSize = Byte.MIN_VALUE;
//            } else if ("short".equals(args[i])) {
//                maxSize = Short.MAX_VALUE;
//                minSize = Short.MIN_VALUE;
//            } else if ("char".equals(args[i])) {
//                maxSize = Character.MAX_VALUE;
//                minSize = Character.MIN_VALUE;
//            } else if ("int".equals(args[i])) {
//                maxSize = Integer.MAX_VALUE;
//                minSize = Integer.MIN_VALUE;
//            } else if ("long".equals(args[i])) {
//                maxSize = Long.MAX_VALUE;
//                minSize = Long.MIN_VALUE;
//            } else if ("float".equals(args[i])) {
//                maxSize = Float.MAX_VALUE;
//                minSize = Float.MIN_VALUE;
//            } else if ("double".equals(args[i])) {
//                maxSize = Double.MAX_VALUE;
//                minSize = Double.MIN_VALUE;
//            } else {
//                System.out.println("Invalid type");
//                continue;
//            }
//
//            System.out.println("Type: " + args[i] + ":\t min value = " + minSize + " max value = " + maxSize);
//        }
//    }
        }
    }
}
