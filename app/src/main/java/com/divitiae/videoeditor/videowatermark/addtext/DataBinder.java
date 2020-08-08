package com.divitiae.videoeditor.videowatermark.addtext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBinder {
    private static HashMap<String, Typeface> a = new HashMap<>();
    public static ArrayList<StickerData> stickerList = new ArrayList<>();
    public static int stickerValue;

    public static Typeface getTypeface(String str, Context context) {
        Typeface typeface = (Typeface) a.get(str);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), str);
                a.put(str, typeface);
            } catch (Exception unused) {
                return null;
            }
        }
        return typeface;
    }

    public static ArrayList<Integer> fetchTextStickerColor() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(Color.parseColor("#ffffff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#000000")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffebee")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffcdd2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ef9a9a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e57373")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ef5350")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f44336")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e53935")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d32f2f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c62828")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b71c1c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff8a80")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff5252")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff1744")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d50000")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fce4ec")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f8bbd0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f48fb1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f06292")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ec407a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e91e63")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d81b60")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c2185b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ad1457")));
        arrayList.add(Integer.valueOf(Color.parseColor("#880e4f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff80ab")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff4081")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f50057")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c51162")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f3e5f5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e1bee7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ce93d8")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ba68c8")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ab47bc")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9c27b0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#8e24aa")));
        arrayList.add(Integer.valueOf(Color.parseColor("#7b1fa2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#6a1b9a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4a148c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ea80fc")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e040fb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d500f9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#aa00ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ede7f6")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d1c4e9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b39ddb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9575cd")));
        arrayList.add(Integer.valueOf(Color.parseColor("#7e57c2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#673ab7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#5e35b1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#512da8")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4527a0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#311b92")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b388ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#7c4dff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#651fff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#6200ea")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e8eaf6")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c5cae9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9fa8da")));
        arrayList.add(Integer.valueOf(Color.parseColor("#7986cb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#5c6bc0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#3f51b5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#3949ab")));
        arrayList.add(Integer.valueOf(Color.parseColor("#303f9f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#283593")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1a237e")));
        arrayList.add(Integer.valueOf(Color.parseColor("#8c9eff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#536dfe")));
        arrayList.add(Integer.valueOf(Color.parseColor("#3d5afe")));
        arrayList.add(Integer.valueOf(Color.parseColor("#304ffe")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e3f2fd")));
        arrayList.add(Integer.valueOf(Color.parseColor("#bbdefb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#90caf9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#64b5f6")));
        arrayList.add(Integer.valueOf(Color.parseColor("#42a5f5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#2196f3")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1e88e5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1976d2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1565c0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#0d47a1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#82b1ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#448aff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#2979ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#2962ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e1f5fe")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b3e5fc")));
        arrayList.add(Integer.valueOf(Color.parseColor("#81d4fa")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4fc3f7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#29b6f6")));
        arrayList.add(Integer.valueOf(Color.parseColor("#03a9f4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#039be5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#0288d1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#0277bd")));
        arrayList.add(Integer.valueOf(Color.parseColor("#01579b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#80d8ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#40c4ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00b0ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#0091ea")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e0f7fa")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b2ebf2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#80deea")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4dd0e1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#26c6da")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00bcd4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00acc1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#0097a7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00838f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#006064")));
        arrayList.add(Integer.valueOf(Color.parseColor("#84ffff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#18ffff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00e5ff")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00b8d4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e0f2f1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b2dfdb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#80cbc4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4db6ac")));
        arrayList.add(Integer.valueOf(Color.parseColor("#26a69a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#009688")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00897b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00796b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00695c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#004d40")));
        arrayList.add(Integer.valueOf(Color.parseColor("#a7ffeb")));
        arrayList.add(Integer.valueOf(Color.parseColor("#64ffda")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1de9b6")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00bfa5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e8f5e9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c8e6c9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#a5d6a7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#81c784")));
        arrayList.add(Integer.valueOf(Color.parseColor("#66bb6a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4caf50")));
        arrayList.add(Integer.valueOf(Color.parseColor("#43a047")));
        arrayList.add(Integer.valueOf(Color.parseColor("#388e3c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#2e7d32")));
        arrayList.add(Integer.valueOf(Color.parseColor("#1b5e20")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b9f6ca")));
        arrayList.add(Integer.valueOf(Color.parseColor("#69f0ae")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00e676")));
        arrayList.add(Integer.valueOf(Color.parseColor("#00c853")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f1f8e9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#dcedc8")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c5e1a5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#aed581")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9ccc65")));
        arrayList.add(Integer.valueOf(Color.parseColor("#8bc34a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#7cb342")));
        arrayList.add(Integer.valueOf(Color.parseColor("#689f38")));
        arrayList.add(Integer.valueOf(Color.parseColor("#558b2f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#33691e")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ccff90")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b2ff59")));
        arrayList.add(Integer.valueOf(Color.parseColor("#76ff03")));
        arrayList.add(Integer.valueOf(Color.parseColor("#64dd17")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f9fbe7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f0f4c3")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e6ee9c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#dce775")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d4e157")));
        arrayList.add(Integer.valueOf(Color.parseColor("#cddc39")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c0ca33")));
        arrayList.add(Integer.valueOf(Color.parseColor("#afb42b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9e9d24")));
        arrayList.add(Integer.valueOf(Color.parseColor("#827717")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f4ff81")));
        arrayList.add(Integer.valueOf(Color.parseColor("#eeff41")));
        arrayList.add(Integer.valueOf(Color.parseColor("#c6ff00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#aeea00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fffde7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fff9c4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fff59d")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fff176")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffee58")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffeb3b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fdd835")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fbc02d")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f9a825")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f57f17")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffff8d")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffff00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffea00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffd600")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fff8e1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffecb3")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffe082")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffd54f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffca28")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffc107")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffb300")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffa000")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff8f00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff6f00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffe57f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffd740")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffc400")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffab00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fff3e0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffe0b2")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffcc80")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffb74d")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffa726")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff9800")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fb8c00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f57c00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ef6c00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e65100")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffd180")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffab40")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff9100")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff6d00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fbe9e7")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffccbc")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ffab91")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff8a65")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff7043")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff5722")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f4511e")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e64a19")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d84315")));
        arrayList.add(Integer.valueOf(Color.parseColor("#bf360c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff9e80")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff6e40")));
        arrayList.add(Integer.valueOf(Color.parseColor("#ff3d00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#dd2c00")));
        arrayList.add(Integer.valueOf(Color.parseColor("#efebe9")));
        arrayList.add(Integer.valueOf(Color.parseColor("#d7ccc8")));
        arrayList.add(Integer.valueOf(Color.parseColor("#bcaaa4")));
        arrayList.add(Integer.valueOf(Color.parseColor("#a1887f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#8d6e63")));
        arrayList.add(Integer.valueOf(Color.parseColor("#795548")));
        arrayList.add(Integer.valueOf(Color.parseColor("#6d4c41")));
        arrayList.add(Integer.valueOf(Color.parseColor("#5d4037")));
        arrayList.add(Integer.valueOf(Color.parseColor("#4e342e")));
        arrayList.add(Integer.valueOf(Color.parseColor("#3e2723")));
        arrayList.add(Integer.valueOf(Color.parseColor("#fafafa")));
        arrayList.add(Integer.valueOf(Color.parseColor("#f5f5f5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#eeeeee")));
        arrayList.add(Integer.valueOf(Color.parseColor("#e0e0e0")));
        arrayList.add(Integer.valueOf(Color.parseColor("#bdbdbd")));
        arrayList.add(Integer.valueOf(Color.parseColor("#9e9e9e")));
        arrayList.add(Integer.valueOf(Color.parseColor("#757575")));
        arrayList.add(Integer.valueOf(Color.parseColor("#616161")));
        arrayList.add(Integer.valueOf(Color.parseColor("#424242")));
        arrayList.add(Integer.valueOf(Color.parseColor("#212121")));
        arrayList.add(Integer.valueOf(Color.parseColor("#eceff1")));
        arrayList.add(Integer.valueOf(Color.parseColor("#cfd8dc")));
        arrayList.add(Integer.valueOf(Color.parseColor("#b0bec5")));
        arrayList.add(Integer.valueOf(Color.parseColor("#90a4ae")));
        arrayList.add(Integer.valueOf(Color.parseColor("#78909c")));
        arrayList.add(Integer.valueOf(Color.parseColor("#607d8b")));
        arrayList.add(Integer.valueOf(Color.parseColor("#546e7a")));
        arrayList.add(Integer.valueOf(Color.parseColor("#455a64")));
        arrayList.add(Integer.valueOf(Color.parseColor("#37474f")));
        arrayList.add(Integer.valueOf(Color.parseColor("#263238")));
        return arrayList;
    }
}
