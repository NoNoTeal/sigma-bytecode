public class com.thizzer.jtouchbar.common.Color {
    public void Color(java.lang.String nsColorKey) {
        invokespecial:Object(Object::<init>, this:Color)
        putfield:String(Color::_nsColorKey, this:Color, nsColorKey:String)
    }
    
    public void Color(float red, float green, float blue) {
        invokespecial:Color(Color::<init>, this:Color, red:float, green:float, blue:float, ldc:float(1.0f))
    }
    
    public void Color(float red, float green, float blue, float alpha) {
        invokespecial:Object(Object::<init>, this:Color)
        putfield:float(Color::_red, this:Color, red:float)
        putfield:float(Color::_green, this:Color, green:float)
        putfield:float(Color::_blue, this:Color, blue:float)
        putfield:float(Color::_alpha, this:Color, alpha:float)
    }
    
    public java.lang.String getNsColorKey() {
        return:String(getfield:String(Color::_nsColorKey, this:Color))
    }
    
    public void setNsColorKey(java.lang.String nsColorKey) {
        putfield:String(Color::_nsColorKey, this:Color, nsColorKey:String)
    }
    
    public float getRed() {
        return:float(getfield:float(Color::_red, this:Color))
    }
    
    public void setRed(float red) {
        putfield:float(Color::_red, this:Color, red:float)
    }
    
    public float getGreen() {
        return:float(getfield:float(Color::_green, this:Color))
    }
    
    public void setGreen(float green) {
        putfield:float(Color::_green, this:Color, green:float)
    }
    
    public float getBlue() {
        return:float(getfield:float(Color::_blue, this:Color))
    }
    
    public void setBlue(float blue) {
        putfield:float(Color::_blue, this:Color, blue:float)
    }
    
    public float getAlpha() {
        return:float(getfield:float(Color::_alpha, this:Color))
    }
    
    public void setAlpha(float alpha) {
        putfield:float(Color::_alpha, this:Color, alpha:float)
    }
    
    static {
        putstatic:Color(Color::BLACK, initobject:Color(Color::<init>, ldc:String("blackColor")))
        putstatic:Color(Color::DARK_GRAY, initobject:Color(Color::<init>, ldc:String("darkGrayColor")))
        putstatic:Color(Color::LIGHT_GRAY, initobject:Color(Color::<init>, ldc:String("lightGrayColor")))
        putstatic:Color(Color::WHITE, initobject:Color(Color::<init>, ldc:String("whiteColor")))
        putstatic:Color(Color::GRAY, initobject:Color(Color::<init>, ldc:String("grayColor")))
        putstatic:Color(Color::RED, initobject:Color(Color::<init>, ldc:String("redColor")))
        putstatic:Color(Color::GREEN, initobject:Color(Color::<init>, ldc:String("greenColor")))
        putstatic:Color(Color::BLUE, initobject:Color(Color::<init>, ldc:String("blueColor")))
        putstatic:Color(Color::CYAN, initobject:Color(Color::<init>, ldc:String("cyanColor")))
        putstatic:Color(Color::YELLOW, initobject:Color(Color::<init>, ldc:String("yellowColor")))
        putstatic:Color(Color::MAGENTA, initobject:Color(Color::<init>, ldc:String("magentaColor")))
        putstatic:Color(Color::ORANGE, initobject:Color(Color::<init>, ldc:String("orangeColor")))
        putstatic:Color(Color::PURPLE, initobject:Color(Color::<init>, ldc:String("purpleColor")))
        putstatic:Color(Color::BROWN, initobject:Color(Color::<init>, ldc:String("brownColor")))
        putstatic:Color(Color::CLEAR, initobject:Color(Color::<init>, ldc:String("clearColor")))
        putstatic:Color(Color::CONTROL_SHADOW, initobject:Color(Color::<init>, ldc:String("controlShadowColor")))
        putstatic:Color(Color::CONTROL_DARK_SHADOW, initobject:Color(Color::<init>, ldc:String("controlDarkShadowColor")))
        putstatic:Color(Color::CONTROL_COLOR, initobject:Color(Color::<init>, ldc:String("controlColor")))
        putstatic:Color(Color::CONTROL_HIGHLIGHT, initobject:Color(Color::<init>, ldc:String("controlHighlightColor")))
        putstatic:Color(Color::CONTROL_LIGHT_HIGHLIGHT, initobject:Color(Color::<init>, ldc:String("controlLightHighlightColor")))
        putstatic:Color(Color::CONTROL_TEXT, initobject:Color(Color::<init>, ldc:String("controlTextColor")))
        putstatic:Color(Color::CONTROL_BACKGROUND, initobject:Color(Color::<init>, ldc:String("controlBackgroundColor")))
        putstatic:Color(Color::SELECTED_CONTROL, initobject:Color(Color::<init>, ldc:String("selectedControlColor")))
        putstatic:Color(Color::SECONDARY_SELECTED_CONTROL, initobject:Color(Color::<init>, ldc:String("secondarySelectedControlColor")))
        putstatic:Color(Color::SELECTED_CONTROL_TEXT, initobject:Color(Color::<init>, ldc:String("selectedControlTextColor")))
        putstatic:Color(Color::DISABLED_CONTROL_TEXT, initobject:Color(Color::<init>, ldc:String("disabledControlTextColor")))
        putstatic:Color(Color::TEXT, initobject:Color(Color::<init>, ldc:String("textColor")))
        putstatic:Color(Color::TEXT_BACKGROUND, initobject:Color(Color::<init>, ldc:String("textBackgroundColor")))
        putstatic:Color(Color::SELECTED_TEXT, initobject:Color(Color::<init>, ldc:String("selectedTextColor")))
        putstatic:Color(Color::SELECTED_TEXT_BACKGROUND, initobject:Color(Color::<init>, ldc:String("selectedTextBackgroundColor")))
        putstatic:Color(Color::GRID_COLOR, initobject:Color(Color::<init>, ldc:String("gridColor")))
        putstatic:Color(Color::KEYBOARD_FOCUS_INDICATOR, initobject:Color(Color::<init>, ldc:String("keyboardFocusIndicatorColor")))
        putstatic:Color(Color::WINDOW_BACKGROUND, initobject:Color(Color::<init>, ldc:String("windowBackgroundColor")))
        putstatic:Color(Color::UNDERPAGE_BACKGROUND, initobject:Color(Color::<init>, ldc:String("underPageBackgroundColor")))
        putstatic:Color(Color::LABEL, initobject:Color(Color::<init>, ldc:String("labelColor")))
        putstatic:Color(Color::SECONDARY_LABEL, initobject:Color(Color::<init>, ldc:String("secondaryLabelColor")))
        putstatic:Color(Color::TERTIARY_LABEL, initobject:Color(Color::<init>, ldc:String("tertiaryLabelColor")))
        putstatic:Color(Color::QUATERNARY_LABEL, initobject:Color(Color::<init>, ldc:String("quaternaryLabelColor")))
        putstatic:Color(Color::SCROLLBAR, initobject:Color(Color::<init>, ldc:String("scrollBarColor")))
        putstatic:Color(Color::KNOB, initobject:Color(Color::<init>, ldc:String("knobColor")))
        putstatic:Color(Color::SELECTED_KNOB, initobject:Color(Color::<init>, ldc:String("selectedKnobColor")))
        putstatic:Color(Color::WINDOW_FRAME, initobject:Color(Color::<init>, ldc:String("windowFrameColor")))
        putstatic:Color(Color::WINDOW_FRAME_TEXT, initobject:Color(Color::<init>, ldc:String("windowFrameTextColor")))
        putstatic:Color(Color::SELECTED_MENU_ITEM, initobject:Color(Color::<init>, ldc:String("selectedMenuItemColor")))
        putstatic:Color(Color::SELECTED_MENU_ITEM_TEXT, initobject:Color(Color::<init>, ldc:String("selectedMenuItemTextColor")))
        putstatic:Color(Color::HIGHLIGHT, initobject:Color(Color::<init>, ldc:String("highlightColor")))
        putstatic:Color(Color::SHADOW, initobject:Color(Color::<init>, ldc:String("shadowColor")))
        putstatic:Color(Color::HEADER, initobject:Color(Color::<init>, ldc:String("headerColor")))
        putstatic:Color(Color::HEADER_TEXT, initobject:Color(Color::<init>, ldc:String("headerTextColor")))
        putstatic:Color(Color::ALTERNATE_SELECTED_CONTROL, initobject:Color(Color::<init>, ldc:String("alternateSelectedControlColor")))
        putstatic:Color(Color::ALTERNATE_SELECTED_CONTROL_TEXT, initobject:Color(Color::<init>, ldc:String("alternateSelectedControlTextColor")))
        putstatic:Color(Color::SCRUBBER_TEXTURED_BACKGROUND, initobject:Color(Color::<init>, ldc:String("scrubberTexturedBackgroundColor")))
        putstatic:Color(Color::SYSTEM_RED, initobject:Color(Color::<init>, ldc:String("systemRedColor")))
        putstatic:Color(Color::SYSTEM_GREEN, initobject:Color(Color::<init>, ldc:String("systemGreenColor")))
        putstatic:Color(Color::SYSTEM_BLUE, initobject:Color(Color::<init>, ldc:String("systemBlueColor")))
        putstatic:Color(Color::SYSTEM_ORANGE, initobject:Color(Color::<init>, ldc:String("systemOrangeColor")))
        putstatic:Color(Color::SYSTEM_YELLOW, initobject:Color(Color::<init>, ldc:String("systemYellowColor")))
        putstatic:Color(Color::SYSTEM_BROWN, initobject:Color(Color::<init>, ldc:String("systemBrownColor")))
        putstatic:Color(Color::SYSTEM_PINK, initobject:Color(Color::<init>, ldc:String("systemPinkColor")))
        putstatic:Color(Color::SYSTEM_PURPLE, initobject:Color(Color::<init>, ldc:String("systemPurpleColor")))
        putstatic:Color(Color::SYSTEM_GRAY, initobject:Color(Color::<init>, ldc:String("systemGrayColor")))
    }
}
