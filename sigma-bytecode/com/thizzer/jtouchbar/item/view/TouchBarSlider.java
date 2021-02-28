public class com.thizzer.jtouchbar.item.view.TouchBarSlider {
    public void TouchBarSlider() {
        invokespecial:TouchBarView(TouchBarView::<init>, this:TouchBarSlider)
    }
    
    public com.thizzer.jtouchbar.slider.SliderActionListener getActionListener() {
        return:SliderActionListener(getfield:SliderActionListener(TouchBarSlider::_actionListener, this:TouchBarSlider))
    }
    
    public void setActionListener(com.thizzer.jtouchbar.slider.SliderActionListener actionListener) {
        putfield:SliderActionListener(TouchBarSlider::_actionListener, this:TouchBarSlider, actionListener:SliderActionListener)
    }
    
    public double getMinValue() {
        return:double(getfield:double(TouchBarSlider::_minValue, this:TouchBarSlider))
    }
    
    public void setMinValue(double minValue) {
        putfield:double(TouchBarSlider::_minValue, this:TouchBarSlider, minValue:double)
        invokevirtual:void(TouchBarView::update, this:TouchBarSlider[expected:TouchBarView])
    }
    
    public double getMaxValue() {
        return:double(getfield:double(TouchBarSlider::_maxValue, this:TouchBarSlider))
    }
    
    public void setMaxValue(double maxValue) {
        putfield:double(TouchBarSlider::_maxValue, this:TouchBarSlider, maxValue:double)
        invokevirtual:void(TouchBarView::update, this:TouchBarSlider[expected:TouchBarView])
    }
}
