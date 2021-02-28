public interface com.thizzer.jtouchbar.scrubber.ScrubberDataSource {
    int getNumberOfItems(com.thizzer.jtouchbar.item.view.TouchBarScrubber p0);
    
    com.thizzer.jtouchbar.scrubber.view.ScrubberView getViewForIndex(com.thizzer.jtouchbar.item.view.TouchBarScrubber p0, long p1);
}
