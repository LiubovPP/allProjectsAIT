package homework_Lesson57.gender;
//Задача 3.(*) Реализовать enum, отражающий современное виденье на гендерный состав
// в коллективе компании.
public enum Gender {

        ONE("MALE"),TWO("FEMALE"), THREE ("NON_BINARY"), FOUR("GENDERQUEER"),
        FIVE("GENDERFLUID"), SIX ("OTHER");


        private String Gender;

        Gender(String gender) {
                Gender = gender;
        }

        public String getGender() {
                return Gender;
        }
}
