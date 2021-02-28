public class com.thizzer.jtouchbar.item.GroupTouchBarItem {
    public void GroupTouchBarItem(java.lang.String identifier) {
        invokespecial:TouchBarItem(TouchBarItem::<init>, this:GroupTouchBarItem, identifier:String)
    }
    
    public void GroupTouchBarItem(java.lang.String identifier, com.thizzer.jtouchbar.item.view.TouchBarView view) {
        invokespecial:TouchBarItem(TouchBarItem::<init>, this:GroupTouchBarItem, identifier:String, view:TouchBarView)
    }
    
    public com.thizzer.jtouchbar.JTouchBar getGroupTouchBar() {
        if (cmpeq:boolean(getfield:JTouchBar(GroupTouchBarItem::_groupTouchBar, this:GroupTouchBarItem), aconstnull:JTouchBar())) {
            putfield:JTouchBar(GroupTouchBarItem::_groupTouchBar, this:GroupTouchBarItem, initobject:JTouchBar(JTouchBar::<init>))
        }
        
        return:JTouchBar(getfield:JTouchBar(GroupTouchBarItem::_groupTouchBar, this:GroupTouchBarItem))
    }
    
    public void setGroupTouchBar(com.thizzer.jtouchbar.JTouchBar groupTouchBar) {
        putfield:JTouchBar(GroupTouchBarItem::_groupTouchBar, this:GroupTouchBarItem, groupTouchBar:JTouchBar)
    }
    
    public boolean isPrefersEqualWidths() {
        return:boolean(getfield:boolean(GroupTouchBarItem::_prefersEqualWidths, this:GroupTouchBarItem))
    }
    
    public void setPrefersEqualWidths(boolean prefersEqualWidths) {
        putfield:boolean(GroupTouchBarItem::_prefersEqualWidths, this:GroupTouchBarItem, prefersEqualWidths:boolean)
    }
    
    public float getPreferredItemWidth() {
        return:float(getfield:float(GroupTouchBarItem::_preferredItemWidth, this:GroupTouchBarItem))
    }
    
    public void setPreferredItemWidth(float preferredItemWidth) {
        putfield:float(GroupTouchBarItem::_preferredItemWidth, this:GroupTouchBarItem, preferredItemWidth:float)
    }
}
