package kk.practise.EffectiveJava第三版.优先考虑类型安全的异构容器;

/**
 * @author kangkai on 2018/2/28.
 */
public class TestFav {

    public static void main(String[] args) {

        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");

        f.putFavorite(Integer.class, 0xcafebabe);

        f.putFavorite(Class.class, Favorites.class);

        f.putFavorite(Class.class, String.class);

        String favoriteString = f.getFavorite(String.class);

        int favoriteInteger = f.getFavorite(Integer.class);

        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString,

                favoriteInteger, favoriteClass.getName());
    }

}
