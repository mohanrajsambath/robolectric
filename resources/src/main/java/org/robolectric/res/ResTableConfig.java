package org.robolectric.res;

public class ResTableConfig {

    /** Layout direction: not specified. */
    public static final int ACONFIGURATION_LAYOUTDIR_ANY  = 0x00;
    /**
     * Layout direction: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#LayoutDirectionQualifier">ldltr</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_LAYOUTDIR_LTR  = 0x01;
    /**
     * Layout direction: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#LayoutDirectionQualifier">ldrtl</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_LAYOUTDIR_RTL  = 0x02;

    /** Screen size: not specified. */
    public static final int ACONFIGURATION_SCREENSIZE_ANY  = 0x00;
    /**
     * Screen size: value indicating the screen is at least
     * approximately 320x426 dp units, corresponding to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenSizeQualifier">small</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENSIZE_SMALL = 0x01;
    /**
     * Screen size: value indicating the screen is at least
     * approximately 320x470 dp units, corresponding to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenSizeQualifier">normal</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENSIZE_NORMAL = 0x02;
    /**
     * Screen size: value indicating the screen is at least
     * approximately 480x640 dp units, corresponding to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenSizeQualifier">large</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENSIZE_LARGE = 0x03;
    /**
     * Screen size: value indicating the screen is at least
     * approximately 720x960 dp units, corresponding to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenSizeQualifier">xlarge</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENSIZE_XLARGE = 0x04;

    /** Screen layout: not specified. */
    public static final int ACONFIGURATION_SCREENLONG_ANY = 0x00;

    /**
     * Screen layout: value that corresponds to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenAspectQualifier">notlong</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENLONG_NO = 0x1;
    /**
     * Screen layout: value that corresponds to the
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#ScreenAspectQualifier">long</a>
     * resource qualifier.
     */
    public static final int ACONFIGURATION_SCREENLONG_YES = 0x2;

    public static final int ACONFIGURATION_SCREENROUND_ANY = 0x00;
    public static final int ACONFIGURATION_SCREENROUND_NO = 0x1;
    public static final int ACONFIGURATION_SCREENROUND_YES = 0x2;

    /** Wide color gamut: not specified. */
    public static final int ACONFIGURATION_WIDE_COLOR_GAMUT_ANY = 0x00;
    /**
     * Wide color gamut: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#WideColorGamutQualifier">no
     * nowidecg</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_WIDE_COLOR_GAMUT_NO = 0x1;
    /**
     * Wide color gamut: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#WideColorGamutQualifier">
     * widecg</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_WIDE_COLOR_GAMUT_YES = 0x2;

    /** HDR: not specified. */
    public static final int ACONFIGURATION_HDR_ANY = 0x00;
    /**
     * HDR: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#HDRQualifier">
     * lowdr</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_HDR_NO = 0x1;
    /**
     * HDR: value that corresponds to
     * <a href="@dacRoot/guide/topics/resources/providing-resources.html#HDRQualifier">
     * highdr</a> resource qualifier specified.
     */
    public static final int ACONFIGURATION_HDR_YES = 0x2;

    public static final int ACONFIGURATION_ORIENTATION_ANY  = 0x0000;
    public static final int ACONFIGURATION_ORIENTATION_PORT = 0x0001;
    public static final int ACONFIGURATION_ORIENTATION_LAND = 0x0002;
    public static final int ACONFIGURATION_ORIENTATION_SQUARE = 0x0003;

    // screenLayout bits for layout direction.
    public static final int MASK_LAYOUTDIR = 0xC0;
    public static final int SHIFT_LAYOUTDIR = 6;
    public static final int LAYOUTDIR_ANY = ACONFIGURATION_LAYOUTDIR_ANY << SHIFT_LAYOUTDIR;
    public static final int LAYOUTDIR_LTR = ACONFIGURATION_LAYOUTDIR_LTR << SHIFT_LAYOUTDIR;
    public static final int LAYOUTDIR_RTL = ACONFIGURATION_LAYOUTDIR_RTL << SHIFT_LAYOUTDIR;

    public static final int SCREENWIDTH_ANY = 0;
    public static final int MASK_SCREENSIZE = 0x0f;
    public static final int SCREENSIZE_ANY = ACONFIGURATION_SCREENSIZE_ANY;
    public static final int SCREENSIZE_SMALL = ACONFIGURATION_SCREENSIZE_SMALL;
    public static final int SCREENSIZE_NORMAL = ACONFIGURATION_SCREENSIZE_NORMAL;
    public static final int SCREENSIZE_LARGE = ACONFIGURATION_SCREENSIZE_LARGE;
    public static final int SCREENSIZE_XLARGE = ACONFIGURATION_SCREENSIZE_XLARGE;

    // screenLayout bits for wide/long screen variation.
    public static final int MASK_SCREENLONG = 0x30;
    public static final int SHIFT_SCREENLONG = 4;
    public static final int SCREENLONG_ANY = ACONFIGURATION_SCREENLONG_ANY << SHIFT_SCREENLONG;
    public static final int SCREENLONG_NO = ACONFIGURATION_SCREENLONG_NO << SHIFT_SCREENLONG;
    public static final int SCREENLONG_YES = ACONFIGURATION_SCREENLONG_YES << SHIFT_SCREENLONG;

    // screenLayout2 bits for round/notround.
    public static final int MASK_SCREENROUND = 0x03;
    public static final int SCREENROUND_ANY = ACONFIGURATION_SCREENROUND_ANY;
    public static final int SCREENROUND_NO = ACONFIGURATION_SCREENROUND_NO;
    public static final int SCREENROUND_YES = ACONFIGURATION_SCREENROUND_YES;

    public static final int MASK_WIDE_COLOR_GAMUT = 0x03;
    public static final int WIDE_COLOR_GAMUT_ANY = ACONFIGURATION_WIDE_COLOR_GAMUT_ANY;
    public static final int WIDE_COLOR_GAMUT_NO = ACONFIGURATION_WIDE_COLOR_GAMUT_NO;
    public static final int WIDE_COLOR_GAMUT_YES = ACONFIGURATION_WIDE_COLOR_GAMUT_YES;

    // colorMode bits for HDR/LDR.
    public static final int MASK_HDR = 0x0c;
    public static final int SHIFT_COLOR_MODE_HDR = 2;
    public static final int HDR_ANY = ACONFIGURATION_HDR_ANY << SHIFT_COLOR_MODE_HDR;
    public static final int HDR_NO = ACONFIGURATION_HDR_NO << SHIFT_COLOR_MODE_HDR;
    public static final int HDR_YES = ACONFIGURATION_HDR_YES << SHIFT_COLOR_MODE_HDR;

    public static final int ORIENTATION_ANY  = ACONFIGURATION_ORIENTATION_ANY;
    public static final int ORIENTATION_PORT = ACONFIGURATION_ORIENTATION_PORT;
    public static final int ORIENTATION_LAND = ACONFIGURATION_ORIENTATION_LAND;
    public static final int ORIENTATION_SQUARE = ACONFIGURATION_ORIENTATION_SQUARE;

    public int mcc;
    public int mnc;
    public int screenLayout;
    public int smallestScreenWidthDp;
    public int screenWidthDp;
    public int screenHeightDp;
    public int screenLayout2;
    public int colorMode;
    public int orientation;
}