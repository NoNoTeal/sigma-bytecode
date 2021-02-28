public interface net.minecraft.util.text.IFormattableTextComponent {
    net.minecraft.util.text.IFormattableTextComponent setStyle(net.minecraft.util.text.Style p0);
    
    net.minecraft.util.text.IFormattableTextComponent appendString(java.lang.String string) {
        return:IFormattableTextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, this:IFormattableTextComponent, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, string:String)))
    }
    
    net.minecraft.util.text.IFormattableTextComponent append(net.minecraft.util.text.ITextComponent p0);
    
    net.minecraft.util.text.IFormattableTextComponent modifyStyle(java.util.function.UnaryOperator<net.minecraft.util.text.Style> modifyFunc) {
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, this:IFormattableTextComponent, checkcast:Style(net.minecraft.util.text.Style.class, invokeinterface:Style(Function<Style, Style>::apply, modifyFunc:UnaryOperator<Style>[expected:Function<Style, Style>], invokeinterface:Style(ITextComponent::getStyle, this:IFormattableTextComponent[expected:ITextComponent]))))
        return:IFormattableTextComponent(this:IFormattableTextComponent)
    }
    
    net.minecraft.util.text.IFormattableTextComponent mergeStyle(net.minecraft.util.text.Style style) {
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, this:IFormattableTextComponent, invokevirtual:Style(Style::mergeStyle, style:Style, invokeinterface:Style(ITextComponent::getStyle, this:IFormattableTextComponent[expected:ITextComponent])))
        return:IFormattableTextComponent(this:IFormattableTextComponent)
    }
    
    net.minecraft.util.text.IFormattableTextComponent mergeStyle(net.minecraft.util.text.TextFormatting[] formats) {
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, this:IFormattableTextComponent, invokevirtual:Style(Style::createStyleFromFormattings, invokeinterface:Style(ITextComponent::getStyle, this:IFormattableTextComponent[expected:ITextComponent]), formats:TextFormatting[]))
        return:IFormattableTextComponent(this:IFormattableTextComponent)
    }
    
    net.minecraft.util.text.IFormattableTextComponent mergeStyle(net.minecraft.util.text.TextFormatting format) {
        invokeinterface:IFormattableTextComponent(IFormattableTextComponent::setStyle, this:IFormattableTextComponent, invokevirtual:Style(Style::applyFormatting, invokeinterface:Style(ITextComponent::getStyle, this:IFormattableTextComponent[expected:ITextComponent]), format:TextFormatting))
        return:IFormattableTextComponent(this:IFormattableTextComponent)
    }
}
