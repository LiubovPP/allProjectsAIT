package hw18092023;

//В стране XYZ население 14 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность -
// 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели
// рождаемости и смертности постоянны.
public class Population {
    public static void main(String[] args) {
        xyz(140000000,10,8,14);
    }
    public static void xyz(int pop, int years, int death, int birth) {

        for (int i = 1; i <= years; i++) {
            int births = pop * birth / 1000;
            int deaths = pop * death / 1000;
            pop = pop + births - deaths; //pop += births - deaths;
            System.out.println( "Население в " + i + " году "+ pop );
        }
    }
}
