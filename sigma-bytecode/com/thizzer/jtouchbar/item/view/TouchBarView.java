public abstract class com.thizzer.jtouchbar.item.view.TouchBarView {
    public void TouchBarView() {
        invokespecial:NativeLinkObject(NativeLinkObject::<init>, this:TouchBarView)
    }
    
    public void update() {
        invokevirtual:void(Observable::setChanged, this:TouchBarView[expected:Observable])
        invokevirtual:void(Observable::notifyObservers, this:TouchBarView[expected:Observable])
    }
}
