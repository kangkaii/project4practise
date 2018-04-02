package kk.practise.EffectiveJava第三版.优先考虑类型安全的异构容器;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author kangkai on 2018/2/28.
 */
public class Favorites_fork {

    /*Favorites实例是类型安全的：当你请求一个字符串时它永远不会返回一个整数。
    它也是异构的：与普通Map不同，所有的键都是不同的类型。
    因此，我们将Favorites称为类型安全异构容器（typesafe heterogeneous container.）*/
    private Map<Class<?>,Object> favorites = new HashMap<>();

    public <T> void put(Class<T> type,T instance) {
        favorites.put(Objects.requireNonNull(type),instance);
    }

    public <T> T get(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
