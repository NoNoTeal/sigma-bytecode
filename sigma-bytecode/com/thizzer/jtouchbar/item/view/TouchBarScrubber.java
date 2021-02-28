public class com.thizzer.jtouchbar.item.view.TouchBarScrubber {
    public void TouchBarScrubber() {
        invokespecial:TouchBarView(TouchBarView::<init>, this:TouchBarScrubber)
    }
    
    public int getMode() {
        return:int(getfield:int(TouchBarScrubber::_mode, this:TouchBarScrubber))
    }
    
    public void setMode(int mode) {
        putfield:int(TouchBarScrubber::_mode, this:TouchBarScrubber, mode:int)
        invokevirtual:void(TouchBarView::update, this:TouchBarScrubber[expected:TouchBarView])
    }
    
    public boolean getShowsArrowButtons() {
        return:boolean(getfield:boolean(TouchBarScrubber::_showsArrowButtons, this:TouchBarScrubber))
    }
    
    public void setShowsArrowButtons(boolean showsArrowButtons) {
        putfield:boolean(TouchBarScrubber::_showsArrowButtons, this:TouchBarScrubber, showsArrowButtons:boolean)
        invokevirtual:void(TouchBarView::update, this:TouchBarScrubber[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.common.Color getBackgroundColor() {
        return:Color(getfield:Color(TouchBarScrubber::_backgroundColor, this:TouchBarScrubber))
    }
    
    public void setBackgroundColor(com.thizzer.jtouchbar.common.Color backgroundColor) {
        putfield:Color(TouchBarScrubber::_backgroundColor, this:TouchBarScrubber, backgroundColor:Color)
        invokevirtual:void(TouchBarView::update, this:TouchBarScrubber[expected:TouchBarView])
    }
    
    public int getSelectionOverlayStyle() {
        return:int(getfield:int(TouchBarScrubber::_selectionOverlayStyle, this:TouchBarScrubber))
    }
    
    public void setSelectionOverlayStyle(int selectionOverlayStyle) {
        putfield:int(TouchBarScrubber::_selectionOverlayStyle, this:TouchBarScrubber, selectionOverlayStyle:int)
        invokevirtual:void(TouchBarView::update, this:TouchBarScrubber[expected:TouchBarView])
    }
    
    public int getSelectionBackgroundStyle() {
        return:int(getfield:int(TouchBarScrubber::_selectionBackgroundStyle, this:TouchBarScrubber))
    }
    
    public void setSelectionBackgroundStyle(int selectionBackgroundStyle) {
        putfield:int(TouchBarScrubber::_selectionBackgroundStyle, this:TouchBarScrubber, selectionBackgroundStyle:int)
        invokevirtual:void(TouchBarView::update, this:TouchBarScrubber[expected:TouchBarView])
    }
    
    public com.thizzer.jtouchbar.scrubber.ScrubberActionListener getActionListener() {
        return:ScrubberActionListener(getfield:ScrubberActionListener(TouchBarScrubber::_actionListener, this:TouchBarScrubber))
    }
    
    public void setActionListener(com.thizzer.jtouchbar.scrubber.ScrubberActionListener actionListener) {
        putfield:ScrubberActionListener(TouchBarScrubber::_actionListener, this:TouchBarScrubber, actionListener:ScrubberActionListener)
    }
    
    public com.thizzer.jtouchbar.scrubber.ScrubberDataSource getDataSource() {
        return:ScrubberDataSource(getfield:ScrubberDataSource(TouchBarScrubber::_dataSource, this:TouchBarScrubber))
    }
    
    public void setDataSource(com.thizzer.jtouchbar.scrubber.ScrubberDataSource dataSource) {
        putfield:ScrubberDataSource(TouchBarScrubber::_dataSource, this:TouchBarScrubber, dataSource:ScrubberDataSource)
    }
}
