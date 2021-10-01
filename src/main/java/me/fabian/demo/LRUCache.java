package me.fabian.demo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 使用LinkedHashMap实现LRU算法(accessOrder为false的实现方式)
 * LinkedHashMap默认的accessOrder为false，也就是会按照插入顺序排序，
 * 所以在插入新的键值对时，总是添加在队列尾部，
 * 如果是访问已存在的键值对，或者是put操作的键值对已存在，那么需要将键值对先移除再添加。
 *
 * @author fabian
 * @date 2021-10-01 18:16
 */
public class LRUCache {
    int capacity;
    Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        //先删除旧的位置，再放入新位置
        Integer value = map.remove(key);
        map.put(key, value);
        return value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
            return;
        }
        //超出capacity，删除最久没用的,利用迭代器，删除第一个
        if (map.size() > capacity) {
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }
}


/**
 * 使用LinkedHashMap实现LRU算法(accessOrder为true的实现方式
 * 如果是将accessOrder设置为true，get和put已有键值对时就不需要删除key了
 */
class LRUCache2 {
    int capacity;
    LinkedHashMap<Integer, Integer> linkedHashMap;

    LRUCache2(int capacity) {
        this.capacity = capacity;
        linkedHashMap = new LinkedHashMap<Integer, Integer>(16, 0.75f, true);
    }

    public int get(int key) {
        Integer value = linkedHashMap.get(key);
        return value == null ? -1 : value;
    }

    public void put(int key, int val) {
        Integer value = linkedHashMap.get(key);
        linkedHashMap.put(key, val);
        if (linkedHashMap.size() > capacity) {
            linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
        }
    }
}