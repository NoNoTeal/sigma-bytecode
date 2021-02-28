public class com.thizzer.jtouchbar.item.TouchBarItem {
    public void TouchBarItem(java.lang.String identifier) {
        invokespecial:TouchBarItem(TouchBarItem::<init>, this:TouchBarItem, identifier:String, aconstnull:TouchBarView())
    }
    
    public void TouchBarItem(java.lang.String identifier, com.thizzer.jtouchbar.item.view.TouchBarView view) {
        invokespecial:TouchBarItem(TouchBarItem::<init>, this:TouchBarItem, identifier:String, view:TouchBarView, ldc:boolean(0))
    }
    
    public void TouchBarItem(java.lang.String identifier, com.thizzer.jtouchbar.item.view.TouchBarView view, boolean customizationAllowed) {
        invokespecial:NativeLinkObject(NativeLinkObject::<init>, this:TouchBarItem)
        putfield:String(TouchBarItem::_identifier, this:TouchBarItem, identifier:String)
        putfield:boolean(TouchBarItem::_customizationAllowed, this:TouchBarItem, customizationAllowed:boolean)
        invokevirtual:void(TouchBarItem::setView, this:TouchBarItem, view:TouchBarView)
    }
    
    public java.lang.String getIdentifier() {
        return:String(getfield:String(TouchBarItem::_identifier, this:TouchBarItem))
    }
    
    public void setIdentifier(java.lang.String identifier) {
        putfield:String(TouchBarItem::_identifier, this:TouchBarItem, identifier:String)
        invokevirtual:void(TouchBarItem::update, this:TouchBarItem)
    }
    
    public com.thizzer.jtouchbar.item.view.TouchBarView getView() {
        return:TouchBarView(getfield:TouchBarView(TouchBarItem::_view, this:TouchBarItem))
    }
    
    public void setView(com.thizzer.jtouchbar.item.view.TouchBarView view) {
        putfield:TouchBarView(TouchBarItem::_view, this:TouchBarItem, view:TouchBarView)
        
        if (cmpne:boolean(getfield:TouchBarView(TouchBarItem::_view, this:TouchBarItem), aconstnull:TouchBarView())) {
            invokevirtual:void(Observable::deleteObservers, getfield:TouchBarView[expected:Observable](TouchBarItem::_view, this:TouchBarItem))
            invokevirtual:void(Observable::addObserver, getfield:TouchBarView[expected:Observable](TouchBarItem::_view, this:TouchBarItem), this:TouchBarItem[expected:Observer])
        }
        
        invokevirtual:void(TouchBarItem::update, this:TouchBarItem)
    }
    
    public java.lang.String getCustomizationLabel() {
        return:String(getfield:String(TouchBarItem::_customizationLabel, this:TouchBarItem))
    }
    
    public void setCustomizationLabel(java.lang.String customizationLabel) {
        putfield:String(TouchBarItem::_customizationLabel, this:TouchBarItem, customizationLabel:String)
        invokevirtual:void(TouchBarItem::update, this:TouchBarItem)
    }
    
    public boolean isCustomizationAllowed() {
        return:boolean(getfield:boolean(TouchBarItem::_customizationAllowed, this:TouchBarItem))
    }
    
    public void setCustomizationAllowed(boolean customizationAllowed) {
        putfield:boolean(TouchBarItem::_customizationAllowed, this:TouchBarItem, customizationAllowed:boolean)
        invokevirtual:void(TouchBarItem::update, this:TouchBarItem)
    }
    
    public void update(java.util.Observable observable, java.lang.Object obj) {
        invokevirtual:void(TouchBarItem::update, this:TouchBarItem)
    }
    
    public void update() {
        invokespecial:void(TouchBarItem::updateNativeInstance, this:TouchBarItem)
    }
    
    private void updateNativeInstance() {
        if (cmpeq:boolean(invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:TouchBarItem[expected:NativeLinkObject]), ldc:long(0L))) {
            return:void()
        }
        
        invokestatic:void(JTouchBarJNI::updateTouchBarItem, invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:TouchBarItem[expected:NativeLinkObject]))
    }
}
