/**
 * a_027_parameter
 */
public class a_027_parameter {

    public static void main(String[] args) {
        /*
         parameter are nothing but values passed to a function by the user

         different types of parameters are
            1.positional
            2.keyword
            3.default
            4.variable length
        
        1.positional
            consider void add(int a,int b)
            now we are calling add(5,7)
            here 5 assigns to a
            here 7 assigns to b
            it will assign based on position

        2.keyword
            consider void add(int a,int b)
            now we are calling add(5,7)
            here 5 assigns to a
            here 7 assigns to b

            now we are calling add(7,5)
            here 7 assigns to a
            here 5 assigns to b

            in the above both arguements are of same data type so no problem
            if consider add(int a,double b)
            we have to pass add(5,5.3D)
            now 5 assigns to a
            now 5.3 assigns to b

            if we call like add(5.3D,5)
            it will show us error because double cannot be assigned to int
            so we call like (b=5.3D,a=5) or (a=5,b=5.5D)
        
        3.default

            for some methods we have default for some parameters like getvotedId

            people can get voterId only if they are above 18 means 19 age is minimum

            19 is default some user may apply in 20,21 and later

            so for age we can set 19 as default if user want to override they can also do that

            void getVoterId(String name,int age=19)

            getVoterId("sakthi"); here i am passing only the name which means age is 19
            getVoterId("sakthi",21) here i am passing both name and age name="sakthi" age=21
            getVoterId(age=21,name="sakthi") here i am passing both name and age name="sakthi" age=21

        
         */
    }
}