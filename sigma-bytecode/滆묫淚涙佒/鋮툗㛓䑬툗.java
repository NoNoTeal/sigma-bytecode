public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ee\ud217\u36d3\u446c\ud217 {
    public static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ee\ud217\u36d3\u446c\ud217 \u5140\u6b0d\u5f50\u76bc\u1187\uafe7(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u12b2\u4bc8\ub1b9\u516c\u61a4 p0) {
        var_1_5F : int
        var_1_AE : int
        var_3_C1 : JFrame
        var_1_C6 : int
        var_4_CF : \u92ee\ud217\u36d3\u446c\ud217
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(-58768335), ldc:int(-579358919))
            
            loop {
                try {
                    while (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-125938603))
                            invokestatic:void(UIManager::setLookAndFeel, invokestatic:String(UIManager::getSystemLookAndFeelClassName))
                        }
                        
                        Label_0121:
                        
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Block_65)
                        }
                    }
                    
                    goto(Label_0148)
                    Block_65:
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-638133217))
                }
                catch (java.lang.Exception stack_93_0) {
                }
                
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1246706581))
                    goto(Label_0121)
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_AE = and:int(var_1_5F:int, ldc:int(-545599739))
            var_3_C1 = initobject:JFrame(JFrame::<init>, loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), and:int(ldc:int(17052), ldc:int(-17054))))
            var_1_C6 = and:int(var_1_AE:int, ldc:int(1551293327))
            var_4_CF = initobject:\u92ee\ud217\u36d3\u446c\ud217(\u92ee\ud217\u36d3\u446c\ud217::<init>, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4)
            
            loop {
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0867)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0656)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0575)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0481)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(256)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-514483680))
                    goto(Label_0383)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(1)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-310910919))
                    invokevirtual:void(JFrame::setDefaultCloseOperation, var_3_C1:JFrame, xor:int(ldc:int(35), ldc:int(33)))
                }
                
                Label_0282:
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(256)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-817849565))
                    goto(Label_0867)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(8)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(484854687))
                    goto(Label_0656)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(886547641))
                    goto(Label_0575)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(1205638647))
                    goto(Label_0481)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(1711471377))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-814314637))
                    invokevirtual:Component(Container::add, var_3_C1:JFrame[expected:Container], var_4_CF:\u92ee\ud217\u36d3\u446c\ud217[expected:Component])
                }
                
                Label_0383:
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0867)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(1614438504))
                    goto(Label_0656)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-1693449366))
                    goto(Label_0575)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(128)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-282394320))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(198059594))
                        goto(Label_0282)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(959411441))
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-285527509))
                    invokevirtual:void(Window::pack, var_3_C1:JFrame[expected:Window])
                }
                
                Label_0481:
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-162824138))
                    goto(Label_0867)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(2050442171))
                    goto(Label_0656)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(256)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(1406457148))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(-97474165))
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-872792741))
                    invokevirtual:void(Window::setLocationRelativeTo, var_3_C1:JFrame[expected:Window], checkcast:Component(java.awt.Component.class, aconstnull:Component()))
                }
                
                Label_0575:
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0867)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-1011031850))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(-461350240))
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-629471867))
                    invokevirtual:void(Window::setVisible, var_3_C1:JFrame[expected:Window], xor:int[expected:boolean](ldc:int(-32767), ldc:int(-32768)))
                }
                
                Label_0656:
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(512)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(56202183))
                    goto(Label_0867)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(512)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(1473546304))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(-898347052))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0481)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(8)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(779963817))
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0282)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(512)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(-445597478))
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-646529843))
                    invokevirtual:void(Window::addWindowListener, var_3_C1:JFrame[expected:Window], initobject:\u8709\u4bc8\u385b\u960f\ubb2b(\u8709\u4bc8\u385b\u960f\ubb2b::<init>, var_4_CF:\u92ee\ud217\u36d3\u446c\ud217, var_3_C1:JFrame, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4))
                }
                
                Label_0765:
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(181949550))
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(1537392532))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(256)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(757983951))
                        goto(Label_0481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_C6 = and:int(var_1_C6:int, ldc:int(-483681415))
                        goto(Label_0282)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-327787609))
                    invokevirtual:void(\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\ube23\u946b\u67d0\u8413\u3e75, var_4_CF:\u92ee\ud217\u36d3\u446c\ud217, invokedynamic:Runnable(run:(Ljavax/swing/JFrame;)Ljava/lang/Runnable;, var_3_C1:JFrame))
                }
                
                Label_0867:
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(64068231))
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0656)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(2109866538))
                    goto(Label_0575)
                }
                
                if (cmpeq:boolean(and:int(var_1_C6:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0481)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(512)), ldc:int(0))) {
                    var_1_C6 = and:int(var_1_C6:int, ldc:int(-92700567))
                    goto(Label_0383)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0282)
                }
                
                if (cmpne:boolean(and:int(var_1_C6:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_C6 = and:int(var_1_C6:int, ldc:int(-621514624))
            }
            
            invokevirtual:void(\u92ee\ud217\u36d3\u446c\ud217::\ub70c\ube23\u98a4\uc2bd\u624e\u8c8a, var_4_CF:\u92ee\ud217\u36d3\u446c\ud217)
            return:\u92ee\ud217\u36d3\u446c\ud217(var_4_CF:\u92ee\ud217\u36d3\u446c\ud217)
        }
        
        goto(Label_0006)
    }
    
    private void \u92ee\ud217\u36d3\u446c\ud217(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u12b2\u4bc8\ub1b9\u516c\u61a4 p0) {
        var_4_EF : Exception
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:JComponent(JComponent::<init>, this:\u92ee\ud217\u36d3\u446c\ud217)
            putfield:Collection<Runnable>(\u92ee\ud217\u36d3\u446c\ud217::\u62da\u836c\u8753\u5bc4\u4bc8\u8350, this:\u92ee\ud217\u36d3\u446c\ud217, invokestatic:ArrayList[expected:Collection<Runnable>](Lists::newArrayList))
            putfield:AtomicBoolean(\u92ee\ud217\u36d3\u446c\ud217::\u1187\ubf56\u8258\u7bad\u69d9\u8640, this:\u92ee\ud217\u36d3\u446c\ud217, initobject:AtomicBoolean(AtomicBoolean::<init>))
            putfield:\u12b2\u4bc8\ub1b9\u516c\u61a4(\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\uc238\u51b2\uc7fe\u7d52\u8df4, this:\u92ee\ud217\u36d3\u446c\ud217, p0:\u12b2\u4bc8\ub1b9\u516c\u61a4)
            invokevirtual:void(JComponent::setPreferredSize, this:\u92ee\ud217\u36d3\u446c\ud217[expected:JComponent], initobject:Dimension(Dimension::<init>, xor:int(ldc:int(385), ldc:int(727)), xor:int(ldc:int(345), ldc:int(185))))
            invokevirtual:void(Container::setLayout, this:\u92ee\ud217\u36d3\u446c\ud217[expected:Container], initobject:BorderLayout[expected:LayoutManager](BorderLayout::<init>))
            
            try {
                invokevirtual:void(Container::add, this:\u92ee\ud217\u36d3\u446c\ud217[expected:Container], invokespecial:JComponent[expected:Component](\u92ee\ud217\u36d3\u446c\ud217::\u965f\u3504\u3d64\uc4d2\u760c\uc3e3, this:\u92ee\ud217\u36d3\u446c\ud217), loadelement:String[expected:Object](getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), and:int(ldc:int(77), ldc:int(2705))))
                invokevirtual:void(Container::add, this:\u92ee\ud217\u36d3\u446c\ud217[expected:Container], invokespecial:JComponent[expected:Component](\u92ee\ud217\u36d3\u446c\ud217::\ua61f\u3776\uc238\u74b1\ub8be\u3c25, this:\u92ee\ud217\u36d3\u446c\ud217), loadelement:String[expected:Object](getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), xor:int(ldc:int(16553), ldc:int(16555))))
            }
            catch (java.lang.Exception var_4_EF) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u92ee\ud217\u36d3\u446c\ud217::\u8308\u6b5f\u8709\u3bd6\u4e72\u7bad), loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), xor:int(ldc:int(-15869), ldc:int(-15872))), var_4_EF:Exception[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\ube23\u946b\u67d0\u8413\u3e75(java.lang.Runnable p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:boolean(Collection<Runnable>::add, getfield:Collection<Runnable>(\u92ee\ud217\u36d3\u446c\ud217::\u62da\u836c\u8753\u5bc4\u4bc8\u8350, this:\u92ee\ud217\u36d3\u446c\ud217), p0:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private javax.swing.JComponent \ua61f\u3776\uc238\u74b1\ub8be\u3c25() {
        var_3_70 : JPanel
        var_4_7C : \u0c95\u6ec6\u9af2\u3bd6\u8d98
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_70 = initobject:JPanel(JPanel::<init>, initobject:BorderLayout[expected:LayoutManager](BorderLayout::<init>))
            var_4_7C = initobject:\u0c95\u6ec6\u9af2\u3bd6\u8d98(\u0c95\u6ec6\u9af2\u3bd6\u8d98::<init>, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\uc238\u51b2\uc7fe\u7d52\u8df4, this:\u92ee\ud217\u36d3\u446c\ud217))
            invokeinterface:boolean(Collection<Runnable>::add, getfield:Collection<Runnable>(\u92ee\ud217\u36d3\u446c\ud217::\u62da\u836c\u8753\u5bc4\u4bc8\u8350, this:\u92ee\ud217\u36d3\u446c\ud217), invokedynamic:Runnable(run:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\u4ab3\ub83f\u718f\ucb79\u120d/\u0c95\u6ec6\u9af2\u3bd6\u8d98;)Ljava/lang/Runnable;, var_4_7C:\u0c95\u6ec6\u9af2\u3bd6\u8d98))
            invokevirtual:void(Container::add, var_3_70:JPanel[expected:Container], var_4_7C:\u0c95\u6ec6\u9af2\u3bd6\u8d98[expected:Component], loadelement:String[expected:Object](getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), xor:int(ldc:int(20485), ldc:int(20481))))
            invokevirtual:void(Container::add, var_3_70:JPanel[expected:Container], invokespecial:JComponent[expected:Component](\u92ee\ud217\u36d3\u446c\ud217::\u6d99\u5fe1\u3bc9\u47c2\uae87\u8d98, this:\u92ee\ud217\u36d3\u446c\ud217), loadelement:String[expected:Object](getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), and:int(ldc:int(6405), ldc:int(1075))))
            invokevirtual:void(JComponent::setBorder, var_3_70:JPanel[expected:JComponent], initobject:TitledBorder[expected:Border](TitledBorder::<init>, initobject:EtchedBorder[expected:Border](EtchedBorder::<init>), loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), xor:int(ldc:int(-16116), ldc:int(-16119)))))
            return:JComponent(var_3_70:JPanel[expected:JComponent])
        }
        
        goto(Label_0006)
    }
    
    private javax.swing.JComponent \u6d99\u5fe1\u3bc9\u47c2\uae87\u8d98() {
        var_4_7A : JScrollPane
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_7A = initobject:JScrollPane(JScrollPane::<init>, initobject:\ucef1\u64ab\u40a9\u416d\ufe34[expected:Component](\ucef1\u64ab\u40a9\u416d\ufe34::<init>, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\uc238\u51b2\uc7fe\u7d52\u8df4, this:\u92ee\ud217\u36d3\u446c\ud217)), ldc:int(22), ldc:int(30))
            invokevirtual:void(JComponent::setBorder, var_4_7A:JScrollPane[expected:JComponent], initobject:TitledBorder[expected:Border](TitledBorder::<init>, initobject:EtchedBorder[expected:Border](EtchedBorder::<init>), loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), and:int(ldc:int(24710), ldc:int(1855)))))
            return:JComponent(var_4_7A:JScrollPane[expected:JComponent])
        }
        
        goto(Label_0006)
    }
    
    private javax.swing.JComponent \u965f\u3504\u3d64\uc4d2\u760c\uc3e3() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ub70c\ube23\u98a4\uc2bd\u624e\u8c8a() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(Thread::start, getfield:Thread(\u92ee\ud217\u36d3\u446c\ud217::\u8389\u4f4a\u7c6b\u4e72\ud12e\ubcb0, this:\u92ee\ud217\u36d3\u446c\ud217))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub102\ub8be\u4179\u156b\u965f\u0b8e() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (logicalnot:boolean(invokevirtual:boolean(AtomicBoolean::getAndSet, getfield:AtomicBoolean(\u92ee\ud217\u36d3\u446c\ud217::\u1187\ubf56\u8258\u7bad\u69d9\u8640, this:\u92ee\ud217\u36d3\u446c\ud217), xor:int[expected:boolean](ldc:int(258), ldc:int(259))))) {
                invokespecial:void(\u92ee\ud217\u36d3\u446c\ud217::\u72f1\u5f50\u7006\u6c52\u7af6\u7af6, this:\u92ee\ud217\u36d3\u446c\ud217)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u72f1\u5f50\u7006\u6c52\u7af6\u7af6() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:void(Iterable<Object>::forEach, getfield:Collection<Runnable>[expected:Iterable<Object>](\u92ee\ud217\u36d3\u446c\ud217::\u62da\u836c\u8753\u5bc4\u4bc8\u8350, this:\u92ee\ud217\u36d3\u446c\ud217), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9937\ucfaf\u9033\u183a\u873d\u4492(javax.swing.JTextArea p0, javax.swing.JScrollPane p1, java.lang.String p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void lambda$\u3c25\u98a4\u9af2\u97b7\u4e72\uf9c5$2(javax.swing.JTextArea p0, javax.swing.JScrollPane p1, java.lang.String p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u92ee\ud217\u36d3\u446c\ud217::\u9937\ucfaf\u9033\u183a\u873d\u4492, this:\u92ee\ud217\u36d3\u446c\ud217, p0:JTextArea, p1:JScrollPane, p2:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub32d\u6c56\u3e75\u3c25\uc3e3\u3d64$1(javax.swing.JTextArea p0, javax.swing.JScrollPane p1) {
        var_3_61 : int
        var_5_77 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(691284635), ldc:int(-440600357))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1212864257))
                
                if (cmpeq:boolean(var_5_77 = invokestatic:String(QueueLogAppender::getNextLogEvent, loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), xor:int(ldc:int(2070), ldc:int(2079)))), aconstnull:String())) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u92ee\ud217\u36d3\u446c\ud217::\u9937\ucfaf\u9033\u183a\u873d\u4492, this:\u92ee\ud217\u36d3\u446c\ud217, p0:JTextArea, p1:JScrollPane, var_5_77:String)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4179\u7c6b\ud217\ub113\u67d0\ud158$0(javax.swing.JTextField p0, java.awt.event.ActionEvent p1) {
        var_5_69 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_69 = invokevirtual:String(String::trim, invokevirtual:String(JTextComponent::getText, p0:JTextField[expected:JTextComponent]))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_69:String))) {
                invokevirtual:void(\u12b2\u4bc8\ub1b9\u516c\u61a4::\u4d85\ub19c\u4179\u97b7\u72f1\u4cd9, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4(\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\uc238\u51b2\uc7fe\u7d52\u8df4, this:\u92ee\ud217\u36d3\u446c\ud217), var_5_69:String, invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u88c5\ud171\ub113\u6435\ud51e::\u8413\ub70c\u183a\ub171\u5140\u759a, getfield:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e](\u92ee\ud217\u36d3\u446c\ud217::\u8c8a\uc238\u51b2\uc7fe\u7d52\u8df4, this:\u92ee\ud217\u36d3\u446c\ud217)))
            }
            
            invokevirtual:void(JTextComponent::setText, p0:JTextField[expected:JTextComponent], loadelement:String(getstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7), and:int(ldc:int(2062), ldc:int(362))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.concurrent.atomic.AtomicBoolean access$000(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ee\ud217\u36d3\u446c\ud217 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:AtomicBoolean(getfield:AtomicBoolean(\u92ee\ud217\u36d3\u446c\ud217::\u1187\ubf56\u8258\u7bad\u69d9\u8640, p0:\u92ee\ud217\u36d3\u446c\ud217))
        }
        
        goto(Label_0006)
    }
    
    public static void access$100(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u92ee\ud217\u36d3\u446c\ud217 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u92ee\ud217\u36d3\u446c\ud217::\u72f1\u5f50\u7006\u6c52\u7af6\u7af6, p0:\u92ee\ud217\u36d3\u446c\ud217)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_328 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_33B_0 : byte[] [generated]
        stack_389_0 : byte[] [generated]
        stack_407_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_2C3 : byte[]
        var_4_2C4 : int
        expr_9F : int [generated]
        var_5_314 : int
        var_3_319 : byte[]
        var_4_31A : int
        var_0_37F : int
        expr_389 : byte [generated]
        stack_3D2_2 : byte [generated]
        stack_3AF_0 : byte [generated]
        expr_D6 : int [generated]
        expr_10D : int [generated]
        var_3_3F5 : byte[]
        var_4_3F6 : int
        expr_40A : byte [generated]
        var_3_13A : String
        expr_142 : String[] [generated]
        expr_14C : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_328 = and:int(ldc:int(-1188098090), ldc:int(-130328616))
            expr_68 = var_2_6C = stack_9D_0 = stack_9F_0 = stack_D4_0 = stack_D6_0 = stack_10B_0 = stack_10D_0 = stack_12E_0 = stack_33B_0 = stack_389_0 = stack_407_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FMacrm6uKNyiYISfDij0Erh6gIkSNG64im6s+cy4epLAhw4OnIkSHp6avijemoySqn6MqPI0briKbqI00o6Yro50lJKETtq0mGBotoCobq6QVK64im62LPhkSNKWqG6ejGi8sphidsZ6qphMrLaU4A=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_2C3 = newarray:byte[](byte.class, expr_70:int)
                var_4_2C4 = expr_70:int
                
                loop {
                    var_0_328 = and:int(var_0_328:int, ldc:int(-11071504))
                    var_4_2C4 = add:int(var_4_2C4:int, ldc:int(-1))
                    storeelement:byte(var_3_2C3:byte[], var_4_2C4:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_2C4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_2C4:int, and:int(ldc:int(1169), ldc:int(6147)))), ldc:int(5)), and:int(ldc:int(16591), ldc:int(7)))))
                    
                    if (cmpne:boolean(var_4_2C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_D4_0 = stack_D6_0 = stack_10B_0 = stack_10D_0 = stack_12E_0 = stack_33B_0 = stack_389_0 = stack_407_0 = var_3_2C3:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_328:int, ldc:int(32)), ldc:int(0))) {
                    var_0_328 = and:int(var_0_328:int, ldc:int(386435693))
                    goto(Label_0274)
                }
                
                if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0164)
                }
                
                var_0_328 = and:int(var_0_328:int, ldc:int(-1205116936))
                expr_9F = arraylength:int(stack_9F_0:byte[])
                
                if (cmpeq:boolean(expr_9F:int, ldc:int(0))) {
                    goto(Label_0164)
                }
                
                var_5_314 = expr_9F:int
                var_3_319 = newarray:byte[](byte.class, expr_9F:int)
                var_4_31A = expr_9F:int
                Label_0796:
                
                while (cmpne:boolean(and:int(var_0_328:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_328 = and:int(var_0_328:int, ldc:int(-1191501862))
                    var_4_31A = add:int(var_4_31A:int, ldc:int(-1))
                    storeelement:byte(var_3_319:byte[], var_4_31A:int, add:byte(loadelement:byte(stack_33B_0:byte[], var_4_31A:int), ldc:byte(124)))
                    
                    if (cmpne:boolean(var_4_31A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9F_0 = stack_9D_0 = stack_D4_0 = stack_D6_0 = stack_10B_0 = stack_10D_0 = stack_12E_0 = stack_33B_0 = stack_389_0 = stack_407_0 = var_3_319:byte[]
                    goto(Label_0164)
                }
                
                var_0_328 = and:int(var_0_328:int, ldc:int(1631627886))
                Label_0874:
                
                while (cmpeq:boolean(and:int(var_0_328:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_37F = and:int(var_0_328:int, ldc:int(-98322437))
                    var_4_31A = add:int(var_4_31A:int, ldc:int(-1))
                    expr_389 = stack_3D2_2 = loadelement(stack_389_0, var_4_31A)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_31A:int, ldc:int(1)), neg:int(var_5_314:int)), ldc:int(0))) {
                        stack_3D2_2 = stack_3AF_0 = add:byte(expr_389:byte, loadelement:byte(var_3_319:byte[], add:int(var_4_31A:int, ldc:int(1))))
                        goto(Label_0959)
                    }
                    
                    Label_0918:
                    
                    if (cmpeq:boolean(and:int(var_0_37F:int, ldc:int(1024)), ldc:int(0))) {
                        var_0_37F = and:int(var_0_37F:int, ldc:int(-209974514))
                    }
                    else {
                        var_0_37F = and:int(var_0_37F:int, ldc:int(-10262565))
                        stack_3D2_2 = stack_3AF_0 = add:byte(expr_389:byte, ldc:byte(1))
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_0_37F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    var_0_328 = and:int(var_0_37F:int, ldc:int(-52998153))
                    storeelement:byte(var_3_319:byte[], var_4_31A:int, stack_3D2_2:byte)
                    
                    if (cmpne:boolean(var_4_31A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9F_0 = stack_9D_0 = stack_D4_0 = stack_D6_0 = stack_10B_0 = stack_10D_0 = stack_12E_0 = stack_33B_0 = stack_389_0 = stack_407_0 = var_3_319:byte[]
                    goto(Label_0219)
                }
                
                var_0_328 = and:int(var_0_328:int, ldc:int(892661756))
                goto(Label_0796)
                Label_0164:
                
                if (cmpne:boolean(and:int(var_0_328:int, ldc:int(8)), ldc:int(0))) {
                    var_0_328 = and:int(var_0_328:int, ldc:int(1510339592))
                    goto(Label_0274)
                }
                
                if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_328 = and:int(var_0_328:int, ldc:int(-681938385))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_328 = and:int(var_0_328:int, ldc:int(-1115475971))
                    expr_D6 = arraylength:int(stack_D6_0:byte[])
                    
                    if (cmpne:boolean(expr_D6:int, ldc:int(0))) {
                        var_5_314 = expr_D6:int
                        var_3_319 = newarray:byte[](byte.class, expr_D6:int)
                        var_4_31A = expr_D6:int
                        goto(Label_0874)
                    }
                }
                
                Label_0219:
                
                if (cmpne:boolean(and:int(var_0_328:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(256)), ldc:int(0))) {
                        var_0_328 = and:int(var_0_328:int, ldc:int(-1310493136))
                        goto(Label_0164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_328 = and:int(var_0_328:int, ldc:int(781408844))
                        loopcontinue()
                    }
                    
                    var_0_328 = and:int(var_0_328:int, ldc:int(-1198274573))
                    expr_10D = arraylength:int(stack_10D_0:byte[])
                    
                    if (cmpne:boolean(expr_10D:int, ldc:int(0))) {
                        var_3_3F5 = newarray:byte[](byte.class, expr_10D:int)
                        var_4_3F6 = expr_10D:int
                        
                        loop {
                            var_0_328 = and:int(var_0_328:int, ldc:int(-1150564360))
                            var_4_3F6 = add:int(var_4_3F6:int, ldc:int(-1))
                            expr_40A = xor:byte(loadelement:byte(stack_407_0:byte[], var_4_3F6:int), ldc:byte(99))
                            storeelement:byte(var_3_3F5:byte[], var_4_3F6:int, or:int(and:int(shl:int(expr_40A:byte, xor:int(ldc:int(76), ldc:int(72))), ldc:int(-16)), and:int(shr:int(expr_40A:byte[expected:int], and:int(ldc:int(8198), ldc:int(36))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_3F6:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_9F_0 = stack_9D_0 = stack_D4_0 = stack_D6_0 = stack_10B_0 = stack_10D_0 = stack_12E_0 = stack_33B_0 = stack_389_0 = stack_407_0 = var_3_3F5:byte[]
                    }
                }
                
                Label_0274:
                
                if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0219)
                }
                
                if (cmpne:boolean(and:int(var_0_328:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0164)
                }
                
                if (cmpne:boolean(and:int(var_0_328:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_142 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3116), ldc:int(204)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(37), ldc:int(41)))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(258), ldc:int(264)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(5068), ldc:int(-5072)), and:int(ldc:int(-31465), ldc:int(25312))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(12353), ldc:int(16419)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(18714), ldc:int(-31519)), and:int(ldc:int(262), ldc:int(710))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(6855), ldc:int(35)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(25734), ldc:int(2671)), xor:int(ldc:int(42), ldc:int(53))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(689), ldc:int(697)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(159), ldc:int(2143)), xor:int(ldc:int(66), ldc:int(105))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(1945), ldc:int(-18330)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-22514), ldc:int(-22491)), xor:int(ldc:int(16543), ldc:int(16548))))
            storeelement:String(expr_142:String[], and:int(ldc:int(16395), ldc:int(3675)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(26), ldc:int(33)), and:int(ldc:int(16453), ldc:int(8573))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(20516), ldc:int(11735)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-28648), ldc:int(-28579)), xor:int(ldc:int(179), ldc:int(249))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(8587), ldc:int(8589)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(28850), ldc:int(28920)), xor:int(ldc:int(17031), ldc:int(17110))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(-28647), ldc:int(-28656)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(24689), ldc:int(4447)), and:int(ldc:int(10097), ldc:int(4325))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(25639), ldc:int(279)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(70), ldc:int(39)), and:int(ldc:int(13054), ldc:int(2406))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(6656), ldc:int(6661)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(16486), ldc:int(12526)), xor:int(ldc:int(181), ldc:int(222))))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(12816), ldc:int(12818)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(22635), ldc:int(235)), and:int(ldc:int(16495), ldc:int(1919))))
            putstatic:String[](\u92ee\ud217\u36d3\u446c\ud217::\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7, expr_14C:String[])
            putstatic:Font(\u92ee\ud217\u36d3\u446c\ud217::\u839e\u64f2\u8d90\ufcaf\u40a9\u8753, initobject:Font(Font::<init>, loadelement:String(expr_142:String[], and:int(ldc:int(21067), ldc:int(3211))), and:int(ldc:int(29376), ldc:int(-31681)), ldc:int(12)))
            putstatic:Logger(\u92ee\ud217\u36d3\u446c\ud217::\u8308\u6b5f\u8709\u3bd6\u4e72\u7bad, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u392e\ub113\uc9f6\u92ff\ubcb0\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_679 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_684 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_679 = and:int(ldc:int(-420973663), ldc:int(1836996520))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ee\ud217\u36d3\u446c\ud217[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(-16884941))
            var_5_81 = and:int(ldc:int(-4706), ldc:int(4705))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20539), ldc:int(20538)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_679:int, ldc:int(1736195936))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(4611), ldc:int(1065)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(23061), ldc:int(1473)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_679 = and:int(var_3_D0:int, ldc:int(2113598392))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(4201), ldc:int(26369)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(806807600))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1092718249))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1506549257))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-32548631))
                        goto(Label_0931)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-662199154))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-633010594))
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-2039355934))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-420724958))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0563)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1630528185))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(2012789731))
                            var_11_E1 = and:int(ldc:int(4790), ldc:int(-15295))
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0563:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1030016445))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(2105032483))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0656:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1819147125))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1530723121))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1362513540))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-272163172))
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-483994442))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(715709969))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1701378863))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1751800659))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1514469624))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1989172849))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(2125172715))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(58522878))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-446160913))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(16388), ldc:int(16389))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0931:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-424161037))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1572048909))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-538499825))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1005085657))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1105264524))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-152119496))
                        var_11_E1 = and:int(ldc:int(-11030), ldc:int(10773))
                    }
                    
                    Label_1097:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1711454961))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1748966604))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1400637248))
                            goto(Label_0931)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1201903684))
                            goto(Label_0656)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1938811109))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1813576472))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-2078612152))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-185853014))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1384)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1251124623))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-314024755))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-329450671))
                            goto(Label_1097)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0931)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(64)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1017782222))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1178355330))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1978594297))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1384:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1196137184))
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1960405979))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(244319090))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(498132650))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1822349776))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(512)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1738422165))
                        loopcontinue()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(-169050128))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_684 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1942481212))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1670035254))
                        goto(Label_0931)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-280220378))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-636148772))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1962769259))
                        var_17_684 = add:int(var_16_10F:int, and:int(ldc:int(18519), ldc:int(1801)))
                        looporswitchbreak()
                    }
                }
                
                var_3_679 = and:int(var_3_679:int, ldc:int(-9748483))
                
                if (cmple:boolean(var_5_81 = var_17_684:int, sub:int(var_6_88:int, and:int(ldc:int(9219), ldc:int(197))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
