public class com.thizzer.jtouchbar.item.PopoverTouchBarItem {
    public void PopoverTouchBarItem(java.lang.String identifier) {
        invokespecial:TouchBarItem(TouchBarItem::<init>, this:PopoverTouchBarItem, identifier:String)
    }
    
    public com.thizzer.jtouchbar.item.view.TouchBarView getCollapsedRepresentation() {
        return:TouchBarView(getfield:TouchBarView(PopoverTouchBarItem::_collapsedRepresentation, this:PopoverTouchBarItem))
    }
    
    public void setCollapsedRepresentation(com.thizzer.jtouchbar.item.view.TouchBarView collapsedRepresentation) {
        putfield:TouchBarView(PopoverTouchBarItem::_collapsedRepresentation, this:PopoverTouchBarItem, collapsedRepresentation:TouchBarView)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
    
    public com.thizzer.jtouchbar.common.Image getCollapsedRepresentationImage() {
        return:Image(getfield:Image(PopoverTouchBarItem::_collapsedRepresentationImage, this:PopoverTouchBarItem))
    }
    
    public void setCollapsedRepresentationImage(com.thizzer.jtouchbar.common.Image collapsedRepresentationImage) {
        putfield:Image(PopoverTouchBarItem::_collapsedRepresentationImage, this:PopoverTouchBarItem, collapsedRepresentationImage:Image)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
    
    public java.lang.String getCollapsedRepresentationLabel() {
        return:String(getfield:String(PopoverTouchBarItem::_collapsedRepresentationLabel, this:PopoverTouchBarItem))
    }
    
    public void setCollapsedRepresentationLabel(java.lang.String collapsedRepresentationLabel) {
        putfield:String(PopoverTouchBarItem::_collapsedRepresentationLabel, this:PopoverTouchBarItem, collapsedRepresentationLabel:String)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
    
    public com.thizzer.jtouchbar.JTouchBar getPopoverTouchBar() {
        return:JTouchBar(getfield:JTouchBar(PopoverTouchBarItem::_popoverTouchBar, this:PopoverTouchBarItem))
    }
    
    public void setPopoverTouchBar(com.thizzer.jtouchbar.JTouchBar popoverTouchBar) {
        putfield:JTouchBar(PopoverTouchBarItem::_popoverTouchBar, this:PopoverTouchBarItem, popoverTouchBar:JTouchBar)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
    
    public com.thizzer.jtouchbar.JTouchBar getPressAndHoldTouchBar() {
        return:JTouchBar(getfield:JTouchBar(PopoverTouchBarItem::_pressAndHoldTouchBar, this:PopoverTouchBarItem))
    }
    
    public void setPressAndHoldTouchBar(com.thizzer.jtouchbar.JTouchBar pressAndHoldTouchBar) {
        putfield:JTouchBar(PopoverTouchBarItem::_pressAndHoldTouchBar, this:PopoverTouchBarItem, pressAndHoldTouchBar:JTouchBar)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
    
    public void showPopover() {
        invokestatic:void(JTouchBarJNI::callObjectSelector, invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:PopoverTouchBarItem[expected:NativeLinkObject]), ldc:String("showPopover"), ldc:boolean(1))
    }
    
    public void dismissPopover() {
        invokestatic:void(JTouchBarJNI::callObjectSelector, invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:PopoverTouchBarItem[expected:NativeLinkObject]), ldc:String("dismissPopover"), ldc:boolean(1))
    }
    
    public java.lang.Boolean isShowsCloseButton() {
        return:Boolean(getfield:Boolean(PopoverTouchBarItem::_showsCloseButton, this:PopoverTouchBarItem))
    }
    
    public void setShowsCloseButton(java.lang.Boolean showsCloseButton) {
        putfield:Boolean(PopoverTouchBarItem::_showsCloseButton, this:PopoverTouchBarItem, showsCloseButton:Boolean)
        invokevirtual:void(TouchBarItem::update, this:PopoverTouchBarItem[expected:TouchBarItem])
    }
}
