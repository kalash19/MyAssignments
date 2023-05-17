public class SingletonInheritanceCheck {
    private static SingletonInheritanceCheck instance;

    private SingletonInheritanceCheck() {}

    public static SingletonInheritanceCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonInheritanceCheck.class) {
                if (instance == null) {
                    instance = new SingletonInheritanceCheck();
                }
            }
        }
        return instance;
    }
}

     class Assignment2Q1 {
        public static void main(String[] args) {
            SingletonInheritanceCheck singleton = SingletonInheritanceCheck.getInstance();
            System.out.println(singleton);

            //  compilation error
            // ChildSingleton childSingleton = new ChildSingleton();
        }
    }


