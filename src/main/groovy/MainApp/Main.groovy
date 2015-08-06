package MainApp
/**
 * Created by christopherdiebold on 8/5/15.
 */
class Main {

    static void main(String[] args) {
        printMenu()
    }




    def static printMenu()
    {
        def menu = ' 0 - exit \n ' << '1 - rent a movie \n ' << '2 - return a movie \n ' << '3 - foo \n ' << '4 - bar \n '
        print(menu)
    }
}

