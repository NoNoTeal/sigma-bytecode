public class com.thizzer.jtouchbar.item.view.TouchBarButton {
    public void TouchBarButton() {
        invokespecial:TouchBarView(TouchBarView::<init>, this:TouchBarButton)
        putfield:int(TouchBarButton::_imagePosition, this:TouchBarButton, ldc:int(6))
        putfield:TouchBarButton$ButtonType(TouchBarButton::_type, this:TouchBarButton, getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_LIGHT))
    }
    
    public java.lang.String getTitle() {
        return:String(getfield:String(TouchBarButton::_title, this:TouchBarButton))
    }
    
    public void setTitle(java.lang.String title) {
        putfield:String(TouchBarButton::_title, this:TouchBarButton, title:String)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public java.lang.String getAlternateTitle() {
        return:String(getfield:String(TouchBarButton::_alternateTitle, this:TouchBarButton))
    }
    
    public void setAlternatTitle(java.lang.String alternateTitle) {
        putfield:String(TouchBarButton::_alternateTitle, this:TouchBarButton, alternateTitle:String)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.common.Image getImage() {
        return:Image(getfield:Image(TouchBarButton::_image, this:TouchBarButton))
    }
    
    public void setImage(com.thizzer.jtouchbar.common.Image image) {
        putfield:Image(TouchBarButton::_image, this:TouchBarButton, image:Image)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.common.Image getAlternateImage() {
        return:Image(getfield:Image(TouchBarButton::_alternateImage, this:TouchBarButton))
    }
    
    public void setAlternateImage(com.thizzer.jtouchbar.common.Image alternateImage) {
        putfield:Image(TouchBarButton::_alternateImage, this:TouchBarButton, alternateImage:Image)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public int getImagePosition() {
        return:int(getfield:int(TouchBarButton::_imagePosition, this:TouchBarButton))
    }
    
    public void setImagePosition(int imagePosition) {
        putfield:int(TouchBarButton::_imagePosition, this:TouchBarButton, imagePosition:int)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.common.Color getBezelColor() {
        return:Color(getfield:Color(TouchBarButton::_bezelColor, this:TouchBarButton))
    }
    
    public void setBezelColor(com.thizzer.jtouchbar.common.Color bezelColor) {
        putfield:Color(TouchBarButton::_bezelColor, this:TouchBarButton, bezelColor:Color)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.item.view.action.TouchBarViewAction getAction() {
        return:TouchBarViewAction(getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton))
    }
    
    public void setAction(com.thizzer.jtouchbar.item.view.action.TouchBarViewAction action) {
        putfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton, action:TouchBarViewAction)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType getType() {
        return:TouchBarButton$ButtonType(getfield:TouchBarButton$ButtonType(TouchBarButton::_type, this:TouchBarButton))
    }
    
    public void setType(com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType type) {
        putfield:TouchBarButton$ButtonType(TouchBarButton::_type, this:TouchBarButton, type:TouchBarButton$ButtonType)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public int getButtonType() {
        return:int(invokevirtual:int(Enum<E>::ordinal, getfield:TouchBarButton$ButtonType[expected:Enum<TouchBarButton$ButtonType>](TouchBarButton::_type, this:TouchBarButton)))
    }
    
    public boolean getAllowsMixedState() {
        return:boolean(getfield:boolean(TouchBarButton::_allowsMixedState, this:TouchBarButton))
    }
    
    public void setAllowsMixedState(boolean allowsMixedState) {
        putfield:boolean(TouchBarButton::_allowsMixedState, this:TouchBarButton, allowsMixedState:boolean)
        invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
    }
    
    public void setNextState() {
        invokestatic:void(JTouchBarJNI::callObjectSelector, invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:TouchBarButton[expected:NativeLinkObject]), ldc:String("setNextState"), ldc:boolean(1))
    }
    
    public int getState() {
        return:int(invokestatic:int(JTouchBarJNI::callIntObjectSelector, invokevirtual:long(NativeLinkObject::getNativeInstancePointer, this:TouchBarButton[expected:NativeLinkObject]), ldc:String("state")))
    }
    
    public void trigger() {
        if (cmpeq:boolean(getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton), aconstnull:TouchBarViewAction())) {
            return:void()
        }
        
        invokeinterface:void(TouchBarViewAction::onCall, getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton), this:TouchBarButton[expected:TouchBarView])
    }
    
    public boolean isEnabled() {
        return:boolean(logicalor:boolean(cmpeq:boolean(getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton), aconstnull:TouchBarViewAction()), invokeinterface:boolean(TouchBarViewAction::isEnabled, getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton))))
    }
    
    public void fireActionStateChanged() {
        if (cmpne:boolean(getfield:TouchBarViewAction(TouchBarButton::_action, this:TouchBarButton), aconstnull:TouchBarViewAction())) {
            invokevirtual:void(TouchBarView::update, this:TouchBarButton[expected:TouchBarView])
        }
    }
}
