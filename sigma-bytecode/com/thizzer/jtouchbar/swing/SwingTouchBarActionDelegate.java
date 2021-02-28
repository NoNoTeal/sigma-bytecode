public class com.thizzer.jtouchbar.swing.SwingTouchBarActionDelegate {
    public void SwingTouchBarActionDelegate(javax.swing.Action action, com.thizzer.jtouchbar.item.view.TouchBarButton touchBarButton) {
        invokespecial:Object(Object::<init>, this:SwingTouchBarActionDelegate)
        invokestatic:Action(Objects::requireNonNull, action:Action, ldc:String("action"))
        invokestatic:TouchBarButton(Objects::requireNonNull, touchBarButton:TouchBarButton, ldc:String("touchBarButton"))
        putfield:Action(SwingTouchBarActionDelegate::action, this:SwingTouchBarActionDelegate, action:Action)
        putfield:PropertyChangeListener(SwingTouchBarActionDelegate::propertyChangeListener, this:SwingTouchBarActionDelegate, bind:PropertyChangeListener((event:PropertyChangeEvent) -> {
            if (invokevirtual:boolean(String::equals, ldc:String("enabled"), invokevirtual:String(PropertyChangeEvent::getPropertyName, event:PropertyChangeEvent))) {
                invokevirtual:void(TouchBarButton::fireActionStateChanged, touchBarButton:TouchBarButton)
            }
            
            return()
        }))
        invokeinterface:void(Action::addPropertyChangeListener, getfield:Action(SwingTouchBarActionDelegate::action, this:SwingTouchBarActionDelegate), getfield:PropertyChangeListener(SwingTouchBarActionDelegate::propertyChangeListener, this:SwingTouchBarActionDelegate))
    }
    
    public void destroy() {
        invokeinterface:void(Action::removePropertyChangeListener, getfield:Action(SwingTouchBarActionDelegate::action, this:SwingTouchBarActionDelegate), getfield:PropertyChangeListener(SwingTouchBarActionDelegate::propertyChangeListener, this:SwingTouchBarActionDelegate))
    }
    
    public boolean isOnEDT() {
        return:boolean(invokestatic:boolean(SwingUtilities::isEventDispatchThread))
    }
    
    public java.awt.event.ActionEvent getActionEvent() {
        return:ActionEvent(initobject:ActionEvent(ActionEvent::<init>, this:SwingTouchBarActionDelegate[expected:Object], ldc:int(0), aconstnull:String()))
    }
    
    public void onCall(com.thizzer.jtouchbar.item.view.TouchBarView view) {
        if (invokevirtual:boolean(SwingTouchBarActionDelegate::isOnEDT, this:SwingTouchBarActionDelegate)) {
            invokespecial:void(SwingTouchBarActionDelegate::callAction, this:SwingTouchBarActionDelegate)
        }
        else {
            invokestatic:void(SwingUtilities::invokeLater, invokedynamic:Runnable(run:(Lcom/thizzer/jtouchbar/swing/SwingTouchBarActionDelegate;)Ljava/lang/Runnable;, this:SwingTouchBarActionDelegate))
        }
    }
    
    private void callAction() {
        invokeinterface:void(ActionListener::actionPerformed, getfield:Action[expected:ActionListener](SwingTouchBarActionDelegate::action, this:SwingTouchBarActionDelegate), invokevirtual:ActionEvent(SwingTouchBarActionDelegate::getActionEvent, this:SwingTouchBarActionDelegate))
    }
    
    public boolean isEnabled() {
        return:boolean(invokeinterface:boolean(Action::isEnabled, getfield:Action(SwingTouchBarActionDelegate::action, this:SwingTouchBarActionDelegate)))
    }
    
    private static void lambda$new$0(com.thizzer.jtouchbar.item.view.TouchBarButton touchBarButton, java.beans.PropertyChangeEvent event) {
        if (invokevirtual:boolean(String::equals, ldc:String("enabled"), invokevirtual:String[expected:Object](PropertyChangeEvent::getPropertyName, event:PropertyChangeEvent))) {
            invokevirtual:void(TouchBarButton::fireActionStateChanged, touchBarButton:TouchBarButton)
        }
    }
}
