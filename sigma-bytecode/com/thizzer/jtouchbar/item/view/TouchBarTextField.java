public class com.thizzer.jtouchbar.item.view.TouchBarTextField {
    public void TouchBarTextField() {
        invokespecial:TouchBarView(TouchBarView::<init>, this:TouchBarTextField)
    }
    
    public java.lang.String getStringValue() {
        return:String(getfield:String(TouchBarTextField::_stringValue, this:TouchBarTextField))
    }
    
    public void setStringValue(java.lang.String stringValue) {
        putfield:String(TouchBarTextField::_stringValue, this:TouchBarTextField, stringValue:String)
        invokevirtual:void(TouchBarView::update, this:TouchBarTextField[expected:TouchBarView])
    }
}
