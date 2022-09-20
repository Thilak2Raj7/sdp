//$Id$
package project;

import java.util.HashMap;
import java.util.Map;

public class HashMapLogic {

	Map<Object, Object> map = new HashMap<>();

	public void checkString(String inputString1) throws UserException {
		if (inputString1.isEmpty() || inputString1 == null) {
			throw new UserException("String should not be null or empty");
		}

	}

	public Map<Object, Object> createMap() {
		return new HashMap<Object, Object>();
	}

	public int getSize(Map<Object, Object> map) {

		return map.size();
	}

	public Map<Object, Object> addString(String key, String value) throws UserException {
		checkString(key);
		checkString(value);
		map.put(key, value);
		return map;

	}

	public boolean checkKey(String key) throws UserException {
		checkString(key);
		return map.containsKey(key);
	}

	public boolean checkValue(String value) throws UserException {
		checkString(value);
		return map.containsValue(value);
	}

	public Object getValue(String key) throws UserException {
		if (checkKey(key)) {
			return map.get(key);

		} else {
			return "Key is not present in the map";
		}
	}

	public Map<Object, Object> replaceValue(String key, String value, String value1) throws UserException {
		checkString(key);
		checkString(value1);
		checkString(value);
		map.replace(key, value, value1);
		return map;
	}

	public Map<Object, Object> removeKey(String key) throws UserException {
		checkKey(key);
		map.remove(key);
		return map;

	}

	public Map<Object, Object> replace(String key, String value1) throws UserException {
		checkKey(key);
		map.replace(key, value1);
		return map;
	}

	public Map<Object, Object> newMap() {
		Map<Object, Object> map1 = createMap();
		map1.putAll(map);
		return map1;
	}

	public Map<Object, Object> remove() {
		map.clear();
		return map;
	}

	public Map<Object, Object> putIfAbsent(String key, String value) throws UserException {
		checkString(key);
		checkString(value);
		map.putIfAbsent(key, value);
		return map;
	}

	public Object getDefaultValue(String key, String value) throws UserException {
		checkString(key);
		checkString(value);

		return map.getOrDefault(key, value);

	}
}
