public class com.thizzer.jtouchbar.JTouchBar {
    public void JTouchBar() {
        invokespecial:Object(Object::<init>, this:JTouchBar)
    }
    
    public java.lang.String getCustomizationIdentifier() {
        return:String(getfield:String(JTouchBar::_customizationIdentifier, this:JTouchBar))
    }
    
    public void setCustomizationIdentifier(java.lang.String customizationIdentifier) {
        putfield:String(JTouchBar::_customizationIdentifier, this:JTouchBar, customizationIdentifier:String)
    }
    
    public java.lang.String getPrincipalItemIdentifier() {
        return:String(getfield:String(JTouchBar::_principalItemIdentifier, this:JTouchBar))
    }
    
    public void setPrincipalItemIdentifier(java.lang.String principalItemIdentifier) {
        putfield:String(JTouchBar::_principalItemIdentifier, this:JTouchBar, principalItemIdentifier:String)
    }
    
    public java.util.List<com.thizzer.jtouchbar.item.TouchBarItem> getItems() {
        if (cmpeq:boolean(getfield:List<TouchBarItem>(JTouchBar::_items, this:JTouchBar), aconstnull:List<TouchBarItem>())) {
            putfield:List<TouchBarItem>(JTouchBar::_items, this:JTouchBar, initobject:ArrayList<TouchBarItem>[expected:List<TouchBarItem>](ArrayList<E>::<init>))
        }
        
        return:List<TouchBarItem>(getfield:List<TouchBarItem>(JTouchBar::_items, this:JTouchBar))
    }
    
    public void setItems(java.util.List<com.thizzer.jtouchbar.item.TouchBarItem> items) {
        putfield:List<TouchBarItem>(JTouchBar::_items, this:JTouchBar, items:List<TouchBarItem>)
    }
    
    public void addItem(com.thizzer.jtouchbar.item.TouchBarItem touchBarItem) {
        invokeinterface:boolean(List<TouchBarItem>::add, invokevirtual:List<TouchBarItem>(JTouchBar::getItems, this:JTouchBar), touchBarItem:TouchBarItem)
    }
    
    public void show(java.awt.Component c) {
        invokestatic:void(JTouchBarJNI::setTouchBar0, invokestatic:long(AWTUtils::getViewPointer, c:Component), this:JTouchBar)
    }
    
    public void show(long window) {
        invokestatic:void(JTouchBarJNI::setTouchBar0, window:long, this:JTouchBar)
    }
    
    public void hide(java.awt.Component c) {
        if (cmpeq:boolean(c:Component, aconstnull:Component())) {
            return:void()
        }
        
        invokestatic:void(JTouchBarJNI::setTouchBar0, invokestatic:long(AWTUtils::getViewPointer, c:Component), aconstnull:JTouchBar())
    }
    
    public void hide(long window) {
        invokestatic:void(JTouchBarJNI::setTouchBar0, window:long, aconstnull:JTouchBar())
    }
}
