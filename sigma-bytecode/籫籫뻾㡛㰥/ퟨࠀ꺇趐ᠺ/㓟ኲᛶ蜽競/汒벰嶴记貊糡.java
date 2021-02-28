public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1 {
    public void \u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1(int p0, java.awt.Rectangle p1, java.awt.font.GlyphVector p2, int p3, \u59ec\u8413\u97e6\uc229\u3776.\ubded\u516c\u839e\u1833\u8df4\ub32d p4) {
        var_8_6F : GlyphMetrics
        var_9_77 : int
        var_10_88 : int
        var_11_9D : int
        var_12_A3 : int
        var_13_121 : int
        var_14_128 : int
        var_15_12F : int
        var_16_136 : int
        var_17_13F : int
        
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
            invokespecial:Object(Object::<init>, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1)
            putfield:int(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u59ec\u62da\u2dcc\u72f1\ubded\u0a06, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, p0:int)
            var_8_6F = invokevirtual:GlyphMetrics(GlyphVector::getGlyphMetrics, p2:GlyphVector, p3:int)
            var_9_77 = f2i:int(invokevirtual:float(GlyphMetrics::getLSB, var_8_6F:GlyphMetrics))
            
            if (cmpgt:boolean(var_9_77:int, ldc:int(0))) {
                var_9_77 = and:int(ldc:int(10712), ldc:int(-11737))
            }
            
            var_10_88 = f2i:int(invokevirtual:float(GlyphMetrics::getRSB, var_8_6F:GlyphMetrics))
            
            if (cmpgt:boolean(var_10_88:int, ldc:int(0))) {
                var_10_88 = and:int(ldc:int(3153), ldc:int(-3410))
            }
            
            var_11_9D = sub:int(sub:int(getfield:int(Rectangle::width, p1:Rectangle), var_9_77:int), var_10_88:int)
            var_12_A3 = getfield:int(Rectangle::height, p1:Rectangle)
            
            if (cmpgt:boolean(var_11_9D:int, ldc:int(0))) {
                if (cmpgt:boolean(var_12_A3:int, ldc:int(0))) {
                    var_13_121 = invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc246\u7d52\u8d98\u156b\u8350\u47c2, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                    var_14_128 = invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u3bc9\u7e3f\u8df4\u1833\u7006\u67e9, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                    var_15_12F = invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u494c\u97e6\ub113\u6c56\ud36e\u67e9, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                    var_16_136 = invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6fb0\ub171\u8d90\u4179\u51b2\u3e2a, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d)
                    var_17_13F = xor:int(ldc:int(576), ldc:int(577))
                    putfield:short(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u983f\u12cb\u6c56\u6198\u718f\ud217, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, i2s:short(add:int(add:int(add:int(var_11_9D:int, var_16_136:int), var_14_128:int), var_17_13F:int)))
                    putfield:short(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u527a\ub171\u6fb0\u9af2\u34df\u71f1, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, i2s:short(add:int(add:int(add:int(var_12_A3:int, var_13_121:int), var_15_12F:int), var_17_13F:int)))
                    putfield:short(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u71f1\u5654\u3bc9\ucb79\u965f\u7873, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, i2s:short(sub:int(add:int(invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u4e72\u5140\u0800\u7873\ub18d\u071d, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d), getfield:int(Rectangle::y, p1:Rectangle)), var_13_121:int)))
                }
            }
            
            putfield:Shape(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\uc31c\ud12e\u5f50\ufcaf\u5245\u61a4, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, invokevirtual:Shape(GlyphVector::getGlyphOutline, p2:GlyphVector, p3:int, i2f:float(add:int(neg:int(getfield:int(Rectangle::x, p1:Rectangle)), invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u6fb0\ub171\u8d90\u4179\u51b2\u3e2a, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d))), i2f:float(add:int(neg:int(getfield:int(Rectangle::y, p1:Rectangle)), invokevirtual:int(\ubded\u516c\u839e\u1833\u8df4\ub32d::\uc246\u7d52\u8d98\u156b\u8350\u47c2, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d)))))
            putfield:boolean(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u9a18\uc9f6\ub70c\uff55\u5bc4\u6fb0, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, ternaryop:int[expected:boolean](invokevirtual:boolean(Font::canDisplay, invokevirtual:Font(\ubded\u516c\u839e\u1833\u8df4\ub32d::\u71ae\u3dd3\u71f1\u62da\u8c8a\u62da, p4:\ubded\u516c\u839e\u1833\u8df4\ub32d), i2c:char(p0:int)), and:int(ldc:int(2860), ldc:int(-3885)), xor:int(ldc:int(-26112), ldc:int(-26111))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7c6b\u92ff\u3e75\u7bad\u34df\u9255() {
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
            return:int(getfield:int(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u59ec\u62da\u2dcc\u72f1\ubded\u0a06, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u759a\uceb8\u718f\u12cb\u4ab3\ub6ab() {
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
            return:boolean(getfield:boolean(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u9a18\uc9f6\ub70c\uff55\u5bc4\u6fb0, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public int \ub18d\u7043\uc7fe\u5db4\ubff1\u4f52() {
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
            return:int(getfield:short[expected:int](\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u983f\u12cb\u6c56\u6198\u718f\ud217, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public int \u97b7\ua068\ubefe\ua61f\u6cfe\u183a() {
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
            return:int(getfield:short[expected:int](\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u527a\ub171\u6fb0\u9af2\u34df\u71f1, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public java.awt.Shape \u385b\ub1b9\u3d64\ub19c\ud171\u8bb0() {
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
            return:Shape(getfield:Shape(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\uc31c\ud12e\u5f50\ufcaf\u5245\u61a4, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public void \u647c\ufcaf\ub32d\ub8be\ub19c\u36d3(java.awt.Shape p0) {
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
            putfield:Shape(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\uc31c\ud12e\u5f50\ufcaf\u5245\u61a4, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, p0:Shape)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c \u59ec\ufcaf\ua6bd\u6435\u0a06\uff55() {
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
            return:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(getfield:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u4975\u6198\u516c\ubcb0\u7049\u4f4a, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    public void \u7c6b\uae5d\ub18d\u8df4\u873d\ubcb0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c p0) {
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
            putfield:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c(\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u4975\u6198\u516c\ubcb0\u7049\u4f4a, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u446c\ub171\u4c04\u40a9\u98a4\u8308() {
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
            return:int(getfield:short[expected:int](\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1::\u71f1\u5654\u3bc9\ucb79\u965f\u7873, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u51fa\u8cae\u836c\uc246\u8709(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_617 : int
        
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
        var_3_60C = and:int(ldc:int(-798295641), ldc:int(-1720734749))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\ubcb0\u5db4\u8bb0\u8c8a\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
            var_3_60C = and:int(var_3_60C:int, ldc:int(-261292719))
        }
        else {
            var_3_60C = and:int(var_3_60C:int, ldc:int(-1740698179))
            var_5_85 = and:int(ldc:int(-16721), ldc:int(16720))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12644), ldc:int(-12645)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_60C:int, ldc:int(-1795261458))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(2080), ldc:int(2081)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1), ldc:int(8241)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_60C = and:int(var_3_DA:int, ldc:int(-1874904596))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(16902), ldc:int(16903)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-189281916))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1407206854))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(529938244))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1291936280))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0774)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-871134348))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(407402786))
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1257469317))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-25494545))
                        var_11_EB = and:int(ldc:int(-32395), ldc:int(27786))
                        goto(Label_1441)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(366499329))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1039862800))
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(415894802))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1770694166))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1863700997))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0774)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1263891810))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1433026797))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-2085145089))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1209115627))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(2135780046))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1225900553))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0774:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-506494700))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1101971255))
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(2135545403))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-344918029))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1225074259))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(12363), ldc:int(17425))
                                goto(Label_1044)
                            }
                        }
                    }
                    
                    Label_0892:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-655851296))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-2051482275))
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-92182532))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1548131201))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1333789265))
                        var_11_EB = and:int(ldc:int(-9503), ldc:int(9482))
                    }
                    
                    Label_1044:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(2034797588))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(9784860))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1805999162))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1371611267))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-243606032))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1299)
                            }
                        }
                    }
                    
                    Label_1163:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1215441807))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1376829234))
                            goto(Label_1044)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(27983047))
                            goto(Label_0774)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1575670077))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1320305338))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-222680079))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1441)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1299:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1065648707))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-428896406))
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1483749222))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-166295038))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1117827580))
                        loopcontinue()
                    }
                    
                    var_3_60C = and:int(var_3_60C:int, ldc:int(-1116841563))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1441:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_617 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1452:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-403075243))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-179575658))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-97539138))
                        var_17_617 = add:int(var_16_119:int, xor:int(ldc:int(10753), ldc:int(10752)))
                        looporswitchbreak()
                    }
                    
                    var_3_60C = and:int(var_3_60C:int, ldc:int(664411195))
                }
                
                var_3_60C = and:int(var_3_60C:int, ldc:int(-223356435))
                
                if (cmple:boolean(var_5_85 = var_17_617:int, sub:int(var_6_8C:int, and:int(ldc:int(529), ldc:int(24641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_60C = and:int(var_3_60C:int, ldc:int(-15869598))
            goto(Label_0106)
        }
    }
}
