public class Dog {
        public static int count = 0;
        String name;

        public Dog(String name){
            count++;
            this.name = name;
        } public static int getCount() {
            return count;
    }
    public static void main(String[] args) {

        Dog dog = new Dog("Rex");
        Dog dog2 = new Dog("Mico");

        System.out.println(Dog.getCount());

        Dog dog3 = new Dog("Buddy");

        System.out.println(Dog.getCount());

        System.out.println(dog.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
