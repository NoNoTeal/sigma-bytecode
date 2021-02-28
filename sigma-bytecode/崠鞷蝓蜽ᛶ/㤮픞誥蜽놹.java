public final class \u5d20\u97b7\u8753\u873d\u16f6.\u392e\ud51e\u8aa5\u873d\ub1b9 {
    public void \u392e\ud51e\u8aa5\u873d\ub1b9() {
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
            invokespecial:Object(Object::<init>, this:\u392e\ud51e\u8aa5\u873d\ub1b9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.util.Optional<net.minecraft.util.text.ITextComponent> p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(1492425877), ldc:int(1467530975))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, p1:Optional))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-688874298))
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, and:int[expected:boolean](ldc:int(2370), ldc:int(-2371)))
            }
            else {
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, xor:int[expected:boolean](ldc:int(774), ldc:int(775)))
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u0c95\ub113\u6bb9\ub1b9\u3776\u34df, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokevirtual:ITextComponent(Optional<ITextComponent>::get, p1:Optional<ITextComponent>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<net.minecraft.util.text.ITextComponent> \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        stack_82_0 : Optional<ITextComponent> [generated]
        
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
            var_2_5F = and:int(ldc:int(2025234835), ldc:int(-1261456645))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-398526290))
                stack_82_0 = invokestatic:Optional<ITextComponent>(Optional<T>::empty)
            }
            else {
                stack_82_0 = invokestatic:Optional<ITextComponent>(Optional<T>::of, invokevirtual:ITextComponent(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uc910\uf94d\u5140\u40a9\u3a62\ubded, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            }
            
            return:Optional<ITextComponent>(stack_82_0:Optional<ITextComponent>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<net.minecraft.util.text.ITextComponent> \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.util.Optional<net.minecraft.util.text.ITextComponent> p0) {
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
            return:Optional<ITextComponent>(p0:Optional<ITextComponent>)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.lang.Object p0) {
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
            return:Object(invokevirtual:Optional<ITextComponent>[expected:Object](\u392e\ud51e\u8aa5\u873d\ub1b9::\u99f7\ub18d\uc2bd\ub113\u7043\u3d64, this:\u392e\ud51e\u8aa5\u873d\ub1b9, checkcast:Optional(java.util.Optional.class, p0:Object[expected:Optional<ITextComponent>])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            return:Object(invokevirtual:Optional<ITextComponent>[expected:Object](\u392e\ud51e\u8aa5\u873d\ub1b9::\ub32d\u071d\ucef1\u6cfe\u718f\u9a18, this:\u392e\ud51e\u8aa5\u873d\ub1b9, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.lang.Object p1) {
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
            invokevirtual:void(\u392e\ud51e\u8aa5\u873d\ub1b9::\u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9, this:\u392e\ud51e\u8aa5\u873d\ub1b9, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:Optional(java.util.Optional.class, p1:Object[expected:Optional<ITextComponent>]))
            return:void()
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
    
    public void \u965f\u8aa5\u416d\u8aa5\u92ee\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_60C = and:int(ldc:int(2107332277), ldc:int(-203497938))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\ud51e\u8aa5\u873d\ub1b9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
            var_3_60C = and:int(var_3_60C:int, ldc:int(1184119624))
        }
        else {
            var_3_60C = and:int(var_3_60C:int, ldc:int(-155525235))
            var_5_85 = and:int(ldc:int(2512), ldc:int(-18929))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24088), ldc:int(20503)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60C:int, ldc:int(2019415607))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(24581), ldc:int(1867)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(640), ldc:int(641)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60C = and:int(var_3_D2:int, ldc:int(1778382596))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1100), ldc:int(1101)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(4594717))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1678273857))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1557334561))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1939330733))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1235220452))
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-294232169))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1708012741))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1408895757))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1734115285))
                        var_11_E3 = and:int(ldc:int(15876), ldc:int(-16005))
                        goto(Label_1442)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-633014927))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(26154512))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1280363726))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-283845098))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-719878168))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-311599555))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1905626218))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(2080337458))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1116187767))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1729591045))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1004413742))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(856987154))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(671507738))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-514391615))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1010055618))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1905884814))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2083), ldc:int(2082))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1521758821))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-926415317))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1910213509))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-228527036))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(2144291252))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-1703231556))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1704220223))
                        var_11_E3 = and:int(ldc:int(-14926), ldc:int(12877))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1179122904))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1831079251))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(38316651))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-784583079))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-421628250))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(474657585))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(518453393))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(233936787))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1264796326))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(1116836719))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(11198018))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60C = and:int(var_3_60C:int, ldc:int(-250883697))
                            loopcontinue()
                        }
                        
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-476282914))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1442)
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-1983078978))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(642524613))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(658466831))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1638565080))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-689607099))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1568024190))
                        loopcontinue()
                    }
                    
                    var_3_60C = and:int(var_3_60C:int, ldc:int(1630789599))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1442:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_617 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1453:
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(126661897))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-2020879623))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(-298028820))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60C = and:int(var_3_60C:int, ldc:int(1861574397))
                        var_17_617 = add:int(var_16_111:int, xor:int(ldc:int(-32767), ldc:int(-32768)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60C = and:int(var_3_60C:int, ldc:int(1935570693))
                
                if (cmple:boolean(var_5_85 = var_17_617:int, sub:int(var_6_8C:int, and:int(ldc:int(6309), ldc:int(16385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60C:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
