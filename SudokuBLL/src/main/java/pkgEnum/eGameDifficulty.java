package pkgEnum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);
	private final int dif;

	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	private eGameDifficulty(int dif) {
		this.dif = dif;
	}

	public int getDifficulty() {
		return dif;
	}
	
	static {
		for(eGameDifficulty d1: eGameDifficulty.values()) {
			lookup.put(d1.getDifficulty(), d1);
		}
	}

	@Override
	public String toString() {
		return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
	}

	public static eGameDifficulty get(String strName) {
		for(eGameDifficulty e:eGameDifficulty.values()) {
			System.out.println(e.name().toUpperCase());
			if (e.name().toUpperCase().equals(strName.toUpperCase())) {
				return e;
			}
		}
		return null;
	}

	public static eGameDifficulty get(int dif) {
		Iterator i = lookup.entrySet().iterator();
		eGameDifficulty eGD = null;

		while(i.hasNext()) {
			Map.Entry pair = (Map.Entry) i.next();
			eGameDifficulty enumDifficulty = (eGameDifficulty) pair.getValue();
			int difVal = (int) pair.getKey();
			if(dif > difVal) {
				e = enumDifficulty;
			}
		}
		return e;
	}
}
