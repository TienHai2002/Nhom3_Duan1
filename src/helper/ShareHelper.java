

package helper;

import model.NhanVien;

public class ShareHelper {

    public static NhanVien user = null;

    public static void clear() {
        ShareHelper.user = null;
    }

    public static boolean isLogin() {
        return ShareHelper.user != null;
    }

    public static boolean isManager() {
        return ShareHelper.isLogin() && user.isVaiTro();
    }
}

