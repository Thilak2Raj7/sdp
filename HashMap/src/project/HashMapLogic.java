//$Id$
package project;

import java.util.HashMap;
import java.util.Map;

public class HashMapLogic {

	public void checkString(String inputString1) throws UserException {
		if (inputString1.isEmpty() || inputString1 == null) {
			throw new UserException("String should not be null or empty");
		}

	}

	public Map<Object, Object> createMap() {

		Map<Object, Object> map = new HashMap<>();
		return map;
	}

	public int getSize(Map<Object, Object> map) {

		return map.size();
	}

	public Map<Object, Object> addString(Map<Object, Object> stringMap, String key, String value) {
		stringMap.put(key, value);
		return stringMap;

	}

	public boolean checkKey(Map<Object, Object> map1, String key) {

		return map1.containsKey(key);
	}

	public boolean checkValue(Map<Object, Object> map1, String value) {
		return map1.containsValue(value);
	}

	public Object getValue(Map<Object, Object> map1, String key) {
		if (checkKey(map1, key)) {
			return map1.get(key);

		} else {
			return "Key is not present in the map";
		}
	}

	public Map<Object, Object> replaceValue(Map<Object, Object> map, String key, String value1) {
		Object value = getValue(map, key);
		map.replace(key, value, value1);
		return map;
	}

	public Map<Object, Object> removeKey(Map<Object, Object> map, String key) {
		checkKey(map, key);
		map.remove(key);
		return map;

	}

	public Map<Object, Object> replace(Map<Object, Object> map, String key, String value1) {
		checkKey(map, key);
		map.replace(key, value1);
		return map;
	}

	public Map<Object, Object> newMap(Map<Object, Object> map) {
		Map<Object, Object> map1 = createMap();
		map1.putAll(map);
		return map1;
	}

	public Map<Object, Object> remove(Map<Object, Object> map) {
		map.clear();
		return map;
	}

	public Map<Object, Object> putIfAbsent(Map<Object, Object> map, String key, String value) {
		map.putIfAbsent(key, value);
		return map;
	}

	public Map<Object, Object> getDefaultValue(Map<Object, Object> map, String key, String value) {
		map.getOrDefault(key, value);
		return map;
	}
}
