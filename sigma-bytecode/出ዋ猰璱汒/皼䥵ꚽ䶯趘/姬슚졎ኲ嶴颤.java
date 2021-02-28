public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 {
    public void \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(int p0, io.netty.buffer.ByteBuf p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p2) {
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
            invokespecial:Object(Object::<init>, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            putfield:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\u156b\u7873\ub1b9\u16f6\uc910, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, xor:int[expected:boolean](ldc:int(257), ldc:int(256)))
            putfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:int(-1))
            putfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, initobject:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(LinkedList<E>::<init>))
            putfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, initobject:ArrayList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](ArrayList<E>::<init>))
            putfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:int)
            putfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p1:ByteBuf)
            putfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u3c25\u0b8e\u67d0\u385b\ud4fe\u6ec6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p2:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \u120d\u51b2\u071d\u071d\u5140\u0800(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0, int p1) {
        var_3_154 : int
        var_5_67 : int
        var_6_72 : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>
        var_7_133 : \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>
        
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
        var_3_154 = and:int(ldc:int(-2079445531), ldc:int(-815638171))
        var_5_67 = and:int(ldc:int(16919), ldc:int(-16920))
        var_6_72 = invokeinterface:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::iterator, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        
        loop {
            if (cmpne:boolean(and:int(var_3_154:int, ldc:int(131072)), ldc:int(0))) {
                var_3_154 = and:int(var_3_154:int, ldc:int(-949589659))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_72:Iterator)) {
                    var_7_133 = checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::next, var_6_72:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))
                    
                    if (cmpeq:boolean(invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_7_133:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>), p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)) {
                        if (cmpeq:boolean(var_5_67:int, p1:int)) {
                            return:T(invokevirtual:T(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, T>::\u7bad\u071d\u2dcc\u69d9\u3504\u36d3, var_7_133:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>))
                        }
                        
                        var_3_154 = and:int(var_3_154:int, ldc:int(-1492128385))
                        inc:int(var_5_67, ldc:int(1))
                    }
                    
                    var_3_154 = and:int(var_3_154:int, ldc:int(-1774764563))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_154:int, ldc:int(536870912)), ldc:int(0))) {
                athrow(invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, initobject:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::<init>, initobject:ArrayIndexOutOfBoundsException[expected:Throwable](ArrayIndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(-14069), ldc:int(5812)))), invokevirtual:String(\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(17017), ldc:int(257)))), p1:int)))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(68), ldc:int(70))), invokevirtual:String[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(29195), ldc:int(3075))), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(13092), ldc:int(1101))), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4e72\u52d3\ub8be\u67e9\u8753\u516c, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(26501), ldc:int(4119))), getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            }
        }
    }
    
    public boolean \u0a06\ub113\u6198\u392e\u64ab\u965f(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, int p1) {
        var_3_5F : int
        var_5_67 : int
        var_6_72 : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>
        var_3_DD : int
        
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
        var_3_5F = and:int(ldc:int(67147949), ldc:int(-1267033105))
        var_5_67 = and:int(ldc:int(-10455), ldc:int(10448))
        var_6_72 = invokeinterface:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::iterator, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(32768)), ldc:int(0))) {
                var_3_DD = and:int(var_3_5F:int, ldc:int(-842535045))
            }
            else {
                var_3_DD = and:int(var_3_5F:int, ldc:int(-1548747345))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_72:Iterator)) {
                    if (cmpeq:boolean(invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::next, var_6_72:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))), p0:\u1833\ud171\u8350\ubded\u34df\uc9f6)) {
                        if (cmpeq:boolean(var_5_67:int, p1:int)) {
                            return:boolean(and:int[expected:boolean](ldc:int(16405), ldc:int(10817)))
                        }
                        
                        var_3_DD = and:int(var_3_DD:int, ldc:int(449444269))
                        inc:int(var_5_67, ldc:int(1))
                    }
                    
                    var_3_5F = and:int(var_3_DD:int, ldc:int(-1986268177))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_DD:int, ldc:int(33554432)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(18324), ldc:int(-22421)))
            }
            
            var_3_5F = and:int(var_3_DD:int, ldc:int(-21299582))
        }
    }
    
    public boolean \u7049\u59ec\u6ec6\ud171\u3bc9\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, int p1) {
        var_3_D4 : int
        var_5_67 : int
        var_6_70 : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>
        
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
        var_3_D4 = and:int(ldc:int(235589980), ldc:int(256710783))
        var_5_67 = and:int(ldc:int(-3691), ldc:int(3682))
        var_6_70 = invokevirtual:Iterator<Object>(AbstractSequentialList<Object>::iterator, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:AbstractSequentialList<Object>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        
        loop {
            if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(16)), ldc:int(0))) {
                var_3_D4 = and:int(var_3_D4:int, ldc:int(530922109))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_70:Iterator)) {
                    if (cmpeq:boolean(invokevirtual:Class(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4d85\u4179\u92ff\u4d85\u3c25\u8d90, checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::next, var_6_70:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))))), invokevirtual:Class(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4d85\u4179\u92ff\u4d85\u3c25\u8d90, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6))) {
                        if (cmpeq:boolean(var_5_67:int, p1:int)) {
                            return:boolean(and:int[expected:boolean](ldc:int(2049), ldc:int(4455)))
                        }
                        
                        var_3_D4 = and:int(var_3_D4:int, ldc:int(-820586406))
                        inc:int(var_5_67, ldc:int(1))
                    }
                    
                    var_3_D4 = and:int(var_3_D4:int, ldc:int(-1368974342))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(33554432)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-7509), ldc:int(7504)))
            }
        }
    }
    
    public void \u6435\ub1b9\u88c5\u4c04\u72f1\u8df4(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0, int p1, T p2) {
        var_4_14E : int
        var_6_6A : int
        var_7_75 : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>
        var_8_12A : \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>
        
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
        var_4_14E = and:int(ldc:int(21088712), ldc:int(2142104537))
        var_6_6A = and:int(ldc:int(-16704), ldc:int(16447))
        var_7_75 = invokeinterface:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::iterator, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_14E:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_14E = and:int(var_4_14E:int, ldc:int(1842310556))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_7_75:Iterator)) {
                    var_8_12A = checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::next, var_7_75:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))
                    
                    if (cmpeq:boolean(invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_8_12A:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>), p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)) {
                        if (cmpeq:boolean(var_6_6A:int, p1:int)) {
                            invokevirtual:void(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, T>::\u4cd9\u6435\u3bd6\uc238\u6fb0\u8258, var_8_12A:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, T>, p2:T)
                            return:void()
                        }
                        
                        var_4_14E = and:int(var_4_14E:int, ldc:int(832956857))
                        inc:int(var_6_6A, ldc:int(1))
                    }
                    
                    var_4_14E = and:int(var_4_14E:int, ldc:int(661473081))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_4_14E:int, ldc:int(8)), ldc:int(0))) {
                athrow(invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, initobject:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::<init>, initobject:ArrayIndexOutOfBoundsException[expected:Throwable](ArrayIndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(3079), ldc:int(-3112)))), invokevirtual:String(\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(10306), ldc:int(10307)))), p1:int)))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(19), ldc:int(14726))), invokevirtual:String[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(7), ldc:int(23171))), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(-16374), ldc:int(-16370))), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4e72\u52d3\ub8be\u67e9\u8753\u516c, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))))
            }
        }
    }
    
    public T \u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0) {
        var_2_15E : int
        stack_16C_0 : T [generated]
        var_4_171 : Exception
        var_4_1C9 : \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>
        var_2_1CF : int
        var_5_1D8 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Void>
        
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
        var_2_15E = and:int(ldc:int(-115903478), ldc:int(-1625719634))
        
        loop {
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0310)
            }
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(64)), ldc:int(0))) {
                var_2_15E = and:int(var_2_15E:int, ldc:int(415832800))
                goto(Label_0242)
            }
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0209)
            }
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(256)), ldc:int(0))) {
                var_2_15E = and:int(var_2_15E:int, ldc:int(-543940770))
            }
            else {
                var_2_15E = and:int(var_2_15E:int, ldc:int(-1416116775))
                
                if (cmpne:boolean(p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u516c\u839e\u9033\u5bc4\uc2bd\ub1b9))) {
                    if (invokevirtual:boolean(AbstractCollection<E>::isEmpty, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:AbstractCollection<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))) {
                        goto(Label_0209)
                    }
                    
                    looporswitchbreak()
                }
            }
            
            Label_0152:
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0310)
            }
            
            if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0242)
            }
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(128)), ldc:int(0))) {
                var_2_15E = and:int(var_2_15E:int, ldc:int(-1228900122))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(2048)), ldc:int(0))) {
                    return:T(aconstnull:T())
                }
                
                loopcontinue()
            }
            
            Label_0209:
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0310)
            }
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(8)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_15E = and:int(var_2_15E:int, ldc:int(-1007846305))
            }
            
            Label_0242:
            
            if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(64)), ldc:int(0))) {
                var_2_15E = and:int(var_2_15E:int, ldc:int(562139049))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_15E = and:int(var_2_15E:int, ldc:int(299810505))
                    goto(Label_0209)
                }
                
                if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(2048)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_15E = and:int(var_2_15E:int, ldc:int(-343024391))
                invokestatic:Object(Preconditions::checkNotNull, getfield:ByteBuf[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), loadelement:String[expected:Object](getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(18951), ldc:int(190))))
            }
            
            try {
                Label_0310:
                
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpne:boolean(and:int(var_2_15E:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0209)
                }
                
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_15E = and:int(var_2_15E:int, ldc:int(-978825704))
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_2_15E:int, ldc:int(128)), ldc:int(0))) {
                    var_2_15E = and:int(var_2_15E:int, ldc:int(-610013734))
                    stack_16C_0 = invokevirtual:T(\u8389\u494c\u527a\u8753\ub1b9\u8640<T>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<T>], getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
                    var_2_15E = and:int(var_2_15E:int, ldc:int(-788179201))
                    return:T(stack_16C_0:T)
                }
                
                loopcontinue()
            }
            catch (java.lang.Exception var_4_171) {
                athrow(invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, initobject:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::<init>, var_4_171:Exception[expected:Throwable]), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(34), ldc:int(18638))), invokevirtual:String[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(-7166), ldc:int(-7162))), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4e72\u52d3\ub8be\u67e9\u8753\u516c, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(-32762), ldc:int(-32765))), getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            }
            
            looporswitchbreak()
        }
        
        var_4_1C9 = checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokevirtual:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::poll, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
        var_2_1CF = and:int(var_2_15E:int, ldc:int(-1208750341))
        var_5_1D8 = checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<java.lang.Void>.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_4_1C9:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, Object>))
        
        loop {
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0959)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-676605883))
                goto(Label_0893)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0800)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0734)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(524288)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(131002208))
                goto(Label_0644)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(128)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(2040077712))
            }
            else {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-1961008054))
                
                if (invokevirtual:boolean(Object::equals, var_5_1D8:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>[expected:Object], p0:\u1833\ud171\u8350\ubded\u34df\uc9f6[expected:Object])) {
                    goto(Label_0800)
                }
            }
            
            Label_0554:
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0959)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0893)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(128)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(1255817381))
                goto(Label_0800)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(65536)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(774788902))
                goto(Label_0734)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(1024)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(1126542723))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-202779078))
                
                if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokevirtual:Class<? extends \u1833\ud171\u8350\ubded\u34df\uc9f6<Void>>[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>::\u4d85\u4179\u92ff\u4d85\u3c25\u8d90, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>), invokevirtual:Class<? extends \u1833\ud171\u8350\ubded\u34df\uc9f6<Void>>(\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>::\u4d85\u4179\u92ff\u4d85\u3c25\u8d90, var_5_1D8:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>)))) {
                    goto(Label_0885)
                }
            }
            
            Label_0644:
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0959)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(8)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-1212583303))
                goto(Label_0893)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0800)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(4)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_1CF = and:int(var_2_1CF:int, ldc:int(-1223103026))
                    goto(Label_0554)
                }
                
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(8)), ldc:int(0))) {
                    var_2_1CF = and:int(var_2_1CF:int, ldc:int(1366502805))
                    loopcontinue()
                }
                
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-247632358))
                
                if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokevirtual:Class<? super Void>[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>), invokevirtual:Class<? super Void>(\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, var_5_1D8:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>)))) {
                    goto(Label_0885)
                }
            }
            
            Label_0734:
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0959)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-2068896701))
                goto(Label_0893)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(8)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0644)
                }
                
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0554)
                }
                
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_1CF = and:int(var_2_1CF:int, ldc:int(-833433132))
                    loopcontinue()
                }
                
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-274475336))
            }
            
            Label_0800:
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0959)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(2048)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(1655477882))
                goto(Label_0893)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0734)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(2048)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-1514565715))
                goto(Label_0644)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0554)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(256)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(2103438655))
                loopcontinue()
            }
            
            return:T(invokevirtual:T(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, T>::\u7bad\u071d\u2dcc\u69d9\u3504\u36d3, var_4_1C9:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>))
            Label_0885:
            
            if (cmpne:boolean(var_5_1D8:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u516c\u839e\u9033\u5bc4\uc2bd\ub1b9))) {
                athrow(invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\ubb2b\u97e6\u3e75\u51b2\u6d99\u7049, initobject:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::<init>, initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(4511), ldc:int(10311)))), invokevirtual:String(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(16408), ldc:int(1226)))), invokevirtual:String(\u1833\ud171\u8350\ubded\u34df\uc9f6<T>::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<java.lang.Void>.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_4_1C9:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Void>, Object>))))))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(10282), ldc:int(530))), invokevirtual:String[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u51fa\u97e6\uc238\u7d52\ua6bd\u1187, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(1078), ldc:int(1074))), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4e72\u52d3\ub8be\u67e9\u8753\u516c, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(1041), ldc:int(1044))), getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            }
            
            Label_0893:
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_1CF = and:int(var_2_1CF:int, ldc:int(580229178))
                    goto(Label_0800)
                }
                
                if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_1CF = and:int(var_2_1CF:int, ldc:int(-264289238))
                    goto(Label_0734)
                }
                
                if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0644)
                }
                
                if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0554)
                }
                
                if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-978846488))
            }
            
            Label_0959:
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(524288)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(2106661313))
                goto(Label_0893)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0800)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0734)
            }
            
            if (cmpne:boolean(and:int(var_2_1CF:int, ldc:int(2048)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-1392955611))
                goto(Label_0644)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_1CF = and:int(var_2_1CF:int, ldc:int(-334750497))
                goto(Label_0554)
            }
            
            if (cmpeq:boolean(and:int(var_2_1CF:int, ldc:int(256)), ldc:int(0))) {
                return:T(invokevirtual:Object[expected:T](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>))
            }
        }
    }
    
    public void \ubff1\u7ce1\u446c\u071d\uc246\u4daf(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0, T p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(-470825751), ldc:int(1691469293))
            
            if (cmpne:boolean(var_2_F9:T, aconstnull:T())) {
                if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, invokevirtual:Class<? super Object>(\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>), invokevirtual:Class<?>(Object::getClass, var_2_F9:T[expected:Object])))) {
                    if (logicalnot:boolean(instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u5245\u16f6\u6b5f\u8aa5\u3504\u965f.class, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1396334965))
                        invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(8457), ldc:int(2185)))), invokevirtual:String(Class<T>::getName, invokevirtual:Class<?>(Object::getClass, var_2_F9:T[expected:Object]))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), and:int(ldc:int(223), ldc:int(266)))), invokevirtual:Class<? super Object>[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>))))
                    }
                    else {
                        var_2_F9 = invokeinterface:Object[expected:T](\u5245\u16f6\u6b5f\u8aa5\u3504\u965f<Object>::\u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4, checkcast:\u5245\u16f6\u6b5f\u8aa5\u3504\u965f<Object>(\u51fa\u12cb\u7330\u74b1\u6c52.\u5245\u16f6\u6b5f\u8aa5\u3504\u965f<java.lang.Object>.class, p0:\u5245\u16f6\u6b5f\u8aa5\u3504\u965f<Object>), var_2_F9:T[expected:Object])
                    }
                }
            }
            
            invokeinterface:boolean(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::add, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), initobject:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::<init>, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6, var_2_F9:T[expected:Object]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \u5bc4\u3a62\u983f\u960f\u516c\u8753(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<T> p0) {
        var_4_67 : Object
        
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
            var_4_67 = invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>)
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<T>, var_4_67:T)
            return:T(var_4_67:T[expected:Object])
        }
        
        goto(Label_0006)
    }
    
    public void \u5f50\u6bb9\uf9c5\ub7dc\u7330\uae5d() {
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
            invokeinterface:boolean(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::addAll, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Collection<? extends \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            invokevirtual:void(LinkedList<E>::clear, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            
            if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)), ldc:int(0))) {
                invokevirtual:byte[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u6bb9\u8709\uc3e3\u34df\ud158))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc(io.netty.buffer.ByteBuf p0) {
        var_2_61 : int
        var_2_352 : int
        var_4_35A : int
        var_2_361 : int
        var_5_36B : Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>
        var_2_39A : int
        var_6_3A5 : \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>
        var_7_3B2 : Object
        
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
            var_2_61 = and:int(ldc:int(1315217721), ldc:int(1526634299))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0669)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1800847262))
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1110789460))
                    goto(Label_0478)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0368)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1338271571))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1365880089))
                    
                    if (cmpeq:boolean(getfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:int(-1))) {
                        goto(Label_0368)
                    }
                }
                
                Label_0190:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1869996408))
                    goto(Label_0759)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1551765260))
                    goto(Label_0669)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0570)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0478)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1766129337))
                    goto(Label_0368)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1027572009))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(299943293))
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1822885525))
                    goto(Label_0759)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(814734699))
                    goto(Label_0669)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0478)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-109133541))
                    invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, getfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
                }
                
                Label_0368:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1062738126))
                    goto(Label_0669)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0570)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1725658273))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1661230550))
                        goto(Label_0283)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(26687044))
                        goto(Label_0190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(924560943))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(829356441))
                    
                    if (invokevirtual:boolean(AbstractCollection<E>::isEmpty, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:AbstractCollection<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))) {
                        goto(Label_0759)
                    }
                }
                
                Label_0478:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1005790072))
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0669)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1182728034))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1966853924))
                        goto(Label_0190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(939843273))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-855864417))
                }
                
                Label_0570:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0759)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(375152133))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0478)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(212724828))
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(694980255))
                        goto(Label_0190)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(536461085))
                    invokeinterface:boolean(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::addAll, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Collection<? extends \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
                }
                
                Label_0669:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-809588678))
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1417413080))
                        goto(Label_0190)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(803007467))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-2013291745))
                    invokevirtual:void(LinkedList<E>::clear, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
                }
                
                Label_0759:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0669)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1070512474))
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1572813845))
                    goto(Label_0478)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0368)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1389376660))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0190)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(434571143))
            }
            
            var_2_352 = and:int(var_2_61:int, ldc:int(-698187429))
            var_4_35A = and:int(ldc:int(-16531), ldc:int(16530))
            var_2_361 = and:int(var_2_352:int, ldc:int(568696219))
            var_5_36B = invokeinterface:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::iterator, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_361:int, ldc:int(1)), ldc:int(0))) {
                    var_2_361 = and:int(var_2_361:int, ldc:int(-1103386261))
                }
                else {
                    var_2_361 = and:int(var_2_361:int, ldc:int(-958031457))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_36B:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_361:int, ldc:int(524288)), ldc:int(0))) {
                    loop {
                        var_2_39A = and:int(var_2_361:int, ldc:int(577427327))
                        var_6_3A5 = checkcast:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6, java.lang.Object>.class, invokeinterface:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>(Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::next, var_5_36B:Iterator<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>))
                        
                        try {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-721618983))
                            var_7_3B2 = invokevirtual:Exception(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Exception>::\u7bad\u071d\u2dcc\u69d9\u3504\u36d3, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Exception>)
                            Label_0948:
                            
                            while (cmpne:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Block_84)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_2141)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1259794082))
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1755)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-791261434))
                                    goto(Label_1631)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(309929547))
                                    goto(Label_1496)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(117031630))
                                    goto(Label_1371)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-177222125))
                                    goto(Label_1218)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-342540153))
                                }
                                else {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1417200537))
                                    
                                    if (cmpeq:boolean(var_7_3B2:Exception, aconstnull:Exception())) {
                                        goto(Label_1996)
                                    }
                                }
                                
                                Label_1095:
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Block_93)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Block_94)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_2141)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(475906625))
                                    goto(Label_1755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_1631)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1496)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_1371)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-550380287))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(341460825))
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1745427489))
                                }
                                
                                Label_1218:
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Block_104)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(324697727))
                                    goto(Label_2141)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-897400678))
                                    goto(Label_1755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1748256043))
                                    goto(Label_1631)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-313458415))
                                    goto(Label_1496)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-1423220333))
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-899432999))
                                    
                                    if (invokevirtual:boolean(Class<T>::isAssignableFrom, invokevirtual:Class<? super Object>(\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<java.lang.Object>.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>))), invokevirtual:Class<? extends Exception>(Exception::getClass, var_7_3B2:Exception[expected:Object]))) {
                                        goto(Label_1996)
                                    }
                                }
                                
                                Label_1371:
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Block_113)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Block_114)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_2141)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(785591752))
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(74875894))
                                    goto(Label_1755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_1631)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_1218)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(41913711))
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1474753855))
                                }
                                
                                Label_1496:
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Block_123)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_2284)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-819497352))
                                    goto(Label_2141)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1401496122))
                                    goto(Label_1996)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1756547592))
                                    goto(Label_1755)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-369365048))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_1371)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                        goto(Label_1218)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(116763067))
                                    
                                    if (logicalnot:boolean(instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u5245\u16f6\u6b5f\u8aa5\u3504\u965f.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>)))) {
                                        invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(16432), ldc:int(16441)))), invokevirtual:String(Class<T>::getName, invokevirtual:Class<? extends Exception>(Exception::getClass, var_7_3B2:Exception[expected:Object]))), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(519), ldc:int(525)))), invokevirtual:Class<? super Object>[expected:Object](\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>::\u7049\u071d\u927d\u97e6\ubb2b\u4d85, checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<java.lang.Object>.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>))))))
                                        goto(Label_1996)
                                    }
                                }
                                
                                Label_1631:
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Block_133)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Block_134)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_2141)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1569063853))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_1496)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-764954658))
                                        goto(Label_1371)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-1408702370))
                                        goto(Label_1218)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(256)), ldc:int(0))) {
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1434868871))
                                }
                                
                                Label_1755:
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Block_143)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Block_144)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_2141)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-1183556103))
                                        goto(Label_1631)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(999397864))
                                        goto(Label_1496)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(256)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-1043226522))
                                        goto(Label_1371)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-431029196))
                                        goto(Label_1218)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(1665730654))
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-1291989607))
                                    var_7_3B2 = invokeinterface:Object(\u5245\u16f6\u6b5f\u8aa5\u3504\u965f::\u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4, checkcast:\u5245\u16f6\u6b5f\u8aa5\u3504\u965f(\u51fa\u12cb\u7330\u74b1\u6c52.\u5245\u16f6\u6b5f\u8aa5\u3504\u965f.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6[expected:\u5245\u16f6\u6b5f\u8aa5\u3504\u965f<Exception>](\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>)), var_7_3B2:Exception[expected:Object])
                                }
                                
                                Label_1996:
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Block_153)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_2284)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-2101026586))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1755)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(789081220))
                                        goto(Label_1631)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(524288)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-174199637))
                                        goto(Label_1496)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(-1312921850))
                                        goto(Label_1371)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4)), ldc:int(0))) {
                                        goto(Label_1218)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_2_39A = and:int(var_2_39A:int, ldc:int(1228278087))
                                        goto(Label_1095)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(183288603))
                                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<Exception>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, checkcast:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<Exception>](\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6<java.lang.Object>.class, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>(\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>::\uc4d2\uc87f\u8d98\u3dd3\u8df4\u98a4, var_6_3A5:\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>, Object>)), p0:ByteBuf, var_7_3B2:Exception)
                                }
                                
                                Label_2141:
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_2284)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-534696332))
                                    goto(Label_1996)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_1755)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1179501803))
                                    goto(Label_1631)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1496)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1850280476))
                                    goto(Label_1371)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(1981752803))
                                    goto(Label_1218)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_39A = and:int(var_2_39A:int, ldc:int(-763829227))
                                    goto(Label_1095)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Block_172)
                                }
                            }
                            
                            goto(Label_2411)
                            Block_84:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1921837252))
                            goto(Label_2284)
                            Block_93:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1468589180))
                            goto(Label_2411)
                            Block_94:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1438953706))
                            goto(Label_2284)
                            Block_104:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1802929249))
                            goto(Label_2284)
                            Block_113:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(962847050))
                            goto(Label_2411)
                            Block_114:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1126398634))
                            goto(Label_2284)
                            Block_123:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1844956433))
                            goto(Label_2411)
                            Block_133:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(879587354))
                            goto(Label_2411)
                            Block_134:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1772899061))
                            goto(Label_2284)
                            Block_143:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-894337077))
                            goto(Label_2411)
                            Block_144:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1326677618))
                            goto(Label_2284)
                            Block_153:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1131317518))
                            goto(Label_2411)
                            Block_172:
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1911995711))
                        }
                        catch (java.lang.Exception var_7_3B2) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1987813755))
                            invokevirtual:ByteBuf(ByteBuf::clear, p0:ByteBuf)
                        }
                        
                        Label_2284:
                        
                        if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-995680083))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_2141)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1996)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                var_2_39A = and:int(var_2_39A:int, ldc:int(-1758487652))
                                goto(Label_1755)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                                var_2_39A = and:int(var_2_39A:int, ldc:int(-1752123001))
                                goto(Label_1631)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_1496)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_1371)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                                var_2_39A = and:int(var_2_39A:int, ldc:int(1309183469))
                                goto(Label_1218)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                                var_2_39A = and:int(var_2_39A:int, ldc:int(-1050390444))
                                goto(Label_1095)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0948)
                            }
                            
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-2089753285))
                            inc:int(var_4_35A, ldc:int(1))
                        }
                        
                        Label_2411:
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-384560967))
                            goto(Label_2284)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_2141)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1996)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(16)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1014363020))
                            goto(Label_1755)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_39A:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(483124008))
                            goto(Label_1631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(8)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-1820132232))
                            goto(Label_1496)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1371)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-2136428913))
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(-813953609))
                            goto(Label_1095)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_39A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_2_39A = and:int(var_2_39A:int, ldc:int(1408770286))
                            goto(Label_0948)
                        }
                        
                        looporswitchbreak()
                    }
                    
                    var_2_361 = and:int(var_2_39A:int, ldc:int(535671129))
                }
            }
            
            invokespecial:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ud217\u4e72\u6c52\ufe34\ud7e8\u51b2, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:ByteBuf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5db4\u56bd\ubded\ub83f\u527a\uae87() {
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
            
            if (cmpne:boolean(getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), aconstnull:ByteBuf())) {
                invokevirtual:ByteBuf(ByteBuf::clear, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            }
            
            invokevirtual:void(LinkedList<E>::clear, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\u8389\ufe34\u6bb9\ua068\u8d90() {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5db4\u56bd\ubded\ub83f\u527a\uae87, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            invokeinterface:void(List<E>::clear, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud217\u4e72\u6c52\ufe34\ud7e8\u51b2(io.netty.buffer.ByteBuf p0) {
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
            
            if (cmpne:boolean(getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), aconstnull:ByteBuf())) {
                invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), invokevirtual:int(ByteBuf::readableBytes, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0, boolean p1) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, p1:boolean, and:int[expected:boolean](ldc:int(30098), ldc:int(-32147)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0, boolean p1, boolean p2) {
        var_4_120 : int
        var_6_EA : ByteBuf
        var_4_13A : int
        var_6_129 : Exception
        
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
            var_4_120 = and:int(ldc:int(-947313333), ldc:int(1871361490))
            
            loop {
                if (cmpne:boolean(and:int(var_4_120:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_120 = and:int(var_4_120:int, ldc:int(1288722263))
                    goto(Label_0189)
                }
                
                if (cmpne:boolean(and:int(var_4_120:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_120 = and:int(var_4_120:int, ldc:int(1737455430))
                    
                    if (invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)) {
                        looporswitchbreak()
                    }
                }
                
                Label_0143:
                
                if (cmpeq:boolean(and:int(var_4_120:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_120 = and:int(var_4_120:int, ldc:int(913611266))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_120:int, ldc:int(256)), ldc:int(0))) {
                        var_4_120 = and:int(var_4_120:int, ldc:int(-212875667))
                        loopcontinue()
                    }
                    
                    var_4_120 = and:int(var_4_120:int, ldc:int(2139831642))
                }
                
                try {
                    Label_0189:
                    
                    if (cmpne:boolean(and:int(var_4_120:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_120 = and:int(var_4_120:int, ldc:int(-68550583))
                        goto(Label_0143)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_120:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_120 = and:int(var_4_120:int, ldc:int(1334699366))
                    var_6_EA = invokespecial:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u494c\u0c95\ua61f\uc3e3\ube23\u3711, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, p1:boolean, getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\uc2e8\u12cb\u9937\u836c\u3e2a\u960f))
                    
                    do {
                        if (cmpeq:boolean(and:int(var_4_120:int, ldc:int(33554432)), ldc:int(0))) {
                            var_4_120 = and:int(var_4_120:int, ldc:int(-2082001531))
                        }
                        else {
                            var_4_120 = and:int(var_4_120:int, ldc:int(-673628162))
                            invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\ud171\ua3b4\u3711\u4179\u9255\u40a9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), var_6_EA:ByteBuf, p2:boolean)
                        }
                    } while (cmpne:boolean(and:int(var_4_120:int, ldc:int(1048576)), ldc:int(0)))
                    
                    var_4_120 = and:int(var_4_120:int, ldc:int(-939591810))
                }
                catch (java.lang.Exception var_6_129) {
                    loop {
                        if (cmpeq:boolean(and:int(var_4_120:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_4_13A = and:int(var_4_120:int, ldc:int(-1289163886))
                        }
                        else {
                            var_4_13A = and:int(var_4_120:int, ldc:int(-543251129))
                            
                            if (invokestatic:boolean(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\uff55\u7ce1\u9033\u4975\uc246\u9af2, var_6_129:Exception[expected:Throwable], ldc:Class<\u7d52\uc238\u12b2\u6198\u527a\ubefe>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7d52\uc238\u12b2\u6198\u527a\ubefe.class))) {
                                looporswitchbreak(Label_0380)
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_13A:int, ldc:int(4)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_4_120 = and:int(var_4_13A:int, ldc:int(-2036828091))
                    }
                    
                    athrow(var_6_129:Exception)
                }
                
                looporswitchbreak()
            }
            
            Label_0380:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private io.netty.buffer.ByteBuf \u494c\u0c95\ua61f\uc3e3\ube23\u3711(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0, boolean p1, \u12b2\u7049\u8df4\uc9f6\uae87.\u7006\u6d69\uc910\u7ce1\u4975\u718f p2) {
        var_4_63 : int
        var_6_7D : \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[]
        stack_AB_0 : int [generated]
        var_4_294 : int
        var_7_AB : int
        var_8_AE : int
        var_9_B7 : int
        stack_3BD_0 : int [generated]
        stack_3DF_0 : ByteBuf [generated]
        var_9_3DF : ByteBuf
        
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
            var_4_63 = and:int(ldc:int(-1878879391), ldc:int(-77866147))
            var_6_7D = checkcast:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[].class, invokeinterface:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>::toArray, invokevirtual:List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\u3c25\u927d\uc87f\u8d90\u3d4b\u62da, invokevirtual:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u34df\u8d90\ub19c\ua6bd\u7e3f\u6cfe, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))), getstatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6bb9\u3bd6\u61a4\u3e75\ud51e\u51fa)))
            
            if (cmpne:boolean(p2:\u7006\u6d69\uc910\u7ce1\u4975\u718f, getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\uc2e8\u12cb\u9937\u836c\u3e2a\u960f))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1616430129))
                stack_AB_0 = and:int(ldc:int(-31646), ldc:int(25485))
            }
            else {
                stack_AB_0 = xor:int(ldc:int(816), ldc:int(817))
            }
            
            var_4_294 = and:int(var_4_63:int, ldc:int(-1963567131))
            var_7_AB = stack_AB_0:int
            var_8_AE = ldc:int(-1)
            var_9_B7 = and:int(ldc:int(17905), ldc:int(-17912))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0829)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(1)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-356283806))
                    goto(Label_0693)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-1055195067))
                    goto(Label_0580)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0357)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(64)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-906270983))
                }
                else {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-152667189))
                    
                    if (cmplt:boolean(var_9_B7:int, arraylength:int(var_6_7D:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[]))) {
                        if (cmpne:boolean(invokevirtual:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::getClass, loadelement:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(var_6_7D:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[], var_9_B7:int)), p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>)) {
                            goto(Label_0693)
                        }
                        
                        var_8_AE = var_9_B7:int
                    }
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0829)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-1383377332))
                    goto(Label_0693)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0580)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_294 = and:int(var_4_294:int, ldc:int(-788817033))
                    
                    if (cmpeq:boolean(var_8_AE:int, ldc:int(-1))) {
                        athrow(initobject:NoSuchElementException(NoSuchElementException::<init>, invokevirtual:String(Class::getCanonicalName, p0:Class)))
                    }
                }
                
                Label_0357:
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(64)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-204290710))
                    goto(Label_0829)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0693)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-436925840))
                    goto(Label_0580)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(256)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(407506303))
                        loopcontinue()
                    }
                    
                    var_4_294 = and:int(var_4_294:int, ldc:int(-380226747))
                    
                    if (p1:boolean) {
                        if (logicalnot:boolean(var_7_AB:int)) {
                            goto(Label_0829)
                        }
                        
                        stack_3BD_0 = sub:int(var_8_AE:int, and:int(ldc:int(13571), ldc:int(73)))
                        goto(Label_0949)
                    }
                }
                
                Label_0454:
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(1443168565))
                    goto(Label_0829)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0693)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(67108864)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(-414735644))
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(1)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(-1949473783))
                        loopcontinue()
                    }
                    
                    var_4_294 = and:int(var_4_294:int, ldc:int(-1857939513))
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u624e\u7ce1\u6435\u47c2\u836c\ud158, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                    invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\uc29a\ua562\uf94d\u72f1\u92ff\u8709, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p2:\u7006\u6d69\uc910\u7ce1\u4975\u718f, invokevirtual:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u836c\u759a\ub6ab\u3d64\u2dcc\ua3b4, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u6c52\u12b2\u6ec6\u12b2\u51fa\u69d9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))), var_8_AE:int, var_6_7D:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[], var_7_AB:boolean)
                    
                    if (cmpeq:boolean(getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), aconstnull:ByteBuf())) {
                        stack_3DF_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokeinterface:ByteBufAllocator(Channel::alloc, invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))))
                        looporswitchbreak()
                    }
                }
                
                Label_0580:
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0829)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(777525837))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0454)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(134217728)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(665953397))
                        goto(Label_0283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(2048)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(-1552515097))
                        stack_3DF_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0693:
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(64)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(1606187048))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(4096)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(849772716))
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_294:int, ldc:int(33554432)), ldc:int(0))) {
                        var_4_294 = and:int(var_4_294:int, ldc:int(827983345))
                        loopcontinue()
                    }
                    
                    var_4_294 = and:int(var_4_294:int, ldc:int(-236316805))
                    inc:int(var_9_B7, ldc:int(1))
                    loopcontinue()
                }
                
                Label_0829:
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(1)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(-775534081))
                    goto(Label_0693)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(2074046291))
                    goto(Label_0580)
                }
                
                if (cmpeq:boolean(and:int(var_4_294:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_294 = and:int(var_4_294:int, ldc:int(87963335))
                    goto(Label_0357)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_4_294:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_294 = and:int(var_4_294:int, ldc:int(-1016152203))
                stack_3BD_0 = add:int(var_8_AE:int, and:int(ldc:int(1665), ldc:int(4397)))
                Label_0949:
                var_4_294 = and:int(var_4_294:int, ldc:int(-664601737))
                var_8_AE = stack_3BD_0:int
                goto(Label_0454)
            }
            
            var_9_3DF = stack_3DF_0:ByteBuf
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_9_3DF:ByteBuf)
            return:ByteBuf(var_9_3DF:ByteBuf)
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, xor:int[expected:boolean](ldc:int(2186), ldc:int(2187)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public io.netty.channel.ChannelFuture \u8413\u8df4\uc246\u5db4\ud171\u71ae(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0) {
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
        
        if (invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)) {
            return:ChannelFuture(invokeinterface:ChannelFuture(Channel::newFailedFuture, invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)), initobject:Exception[expected:Throwable](Exception::<init>, loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(530), ldc:int(537))))))
        }
        
        return:ChannelFuture(invokevirtual:ChannelFuture(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\ub83f\ub70c\ud7e8\u600f\u7873\ub18d, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), invokespecial:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u494c\u0c95\ua61f\uc3e3\ube23\u3711, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, and:int[expected:boolean](ldc:int(9473), ldc:int(4257)), getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\uc2e8\u12cb\u9937\u836c\u3e2a\u960f))))
    }
    
    public void \ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf() {
        var_1_8F : int
        stack_BA_0 : ByteBuf [generated]
        var_3_BA : ByteBuf
        
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
            var_1_8F = and:int(ldc:int(873448220), ldc:int(1555388035))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))) {
                if (cmpne:boolean(getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), aconstnull:ByteBuf())) {
                    goto(Label_0131)
                }
                
                stack_BA_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokeinterface:ByteBufAllocator(Channel::alloc, invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))))
                goto(Label_0180)
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_1_8F:int, ldc:int(1073741824)), ldc:int(0))) {
                return:void()
            }
            
            Label_0131:
            
            if (cmpne:boolean(and:int(var_1_8F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_1_8F = and:int(var_1_8F:int, ldc:int(371384298))
            stack_BA_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            Label_0180:
            var_1_8F = and:int(var_1_8F:int, ldc:int(-1620942049))
            var_3_BA = stack_BA_0:ByteBuf
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_3_BA:ByteBuf)
            invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\ud171\ua3b4\u3711\u4179\u9255\u40a9, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), var_3_BA:ByteBuf)
            goto(Label_0105)
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8(int p0) {
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
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(initobject:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::<init>, p0:int, aconstnull:ByteBuf(), invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5654\u7049\u7049\u0800\u6cfe\ubefe p1) {
        var_5_67 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        
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
            var_5_67 = invokevirtual:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:int)
            invokeinterface:void(\u5654\u7049\u7049\u0800\u6cfe\ubefe::\u385b\uc2bd\u59ec\u3e2a\u8350\u67d0, p1:\u5654\u7049\u7049\u0800\u6cfe\ubefe, var_5_67:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(var_5_67:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \uc29a\ua562\uf94d\u72f1\u92ff\u8709(\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\u6d69\uc910\u7ce1\u4975\u718f p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4 p1, int p2, java.util.List<\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p3, boolean p4) {
        var_6_63 : int
        var_8_72 : \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[]
        stack_A3_3 : int [generated]
        
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
            var_6_63 = and:int(ldc:int(139395347), ldc:int(-837931363))
            var_8_72 = checkcast:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[].class, invokeinterface:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>::toArray, p3:List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, getstatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6bb9\u3bd6\u61a4\u3e75\ud51e\u51fa)))
            
            if (logicalnot:boolean(p4:boolean)) {
                var_6_63 = and:int(var_6_63:int, ldc:int(1504479515))
                stack_A3_3 = p2:int
            }
            else {
                stack_A3_3 = sub:int(arraylength:int(var_8_72:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[]), xor:int(ldc:int(16434), ldc:int(16435)))
            }
            
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\uc29a\ua562\uf94d\u72f1\u92ff\u8709, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u7006\u6d69\uc910\u7ce1\u4975\u718f, p1:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4, stack_A3_3:int, var_8_72:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[], p4:boolean))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \uc29a\ua562\uf94d\u72f1\u92ff\u8709(\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\u6d69\uc910\u7ce1\u4975\u718f p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4 p1, int p2, java.util.List<\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p3) {
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
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(invokespecial:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\uc29a\ua562\uf94d\u72f1\u92ff\u8709, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u7006\u6d69\uc910\u7ce1\u4975\u718f, p1:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4, p2:int, checkcast:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[].class, invokeinterface:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>::toArray, p3:List<\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, getstatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6bb9\u3bd6\u61a4\u3e75\ud51e\u51fa))), and:int[expected:boolean](ldc:int(10563), ldc:int(-10568))))
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 \uc29a\ua562\uf94d\u72f1\u92ff\u8709(\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\u6d69\uc910\u7ce1\u4975\u718f p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4 p1, int p2, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[] p3, boolean p4) {
        var_6_63 : int
        var_8_73 : int
        var_8_7D : int
        
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
            var_6_63 = and:int(ldc:int(1047961962), ldc:int(-740379137))
            
            if (logicalnot:boolean(p4:boolean)) {
                var_8_73 = p2:int
                
                while (cmplt:boolean(var_8_73:int, arraylength:int(p3:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[]))) {
                    invokevirtual:void(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ud217\uff55\ud523\u59ec\u965f\ua61f, loadelement:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(p3:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[], var_8_73:int), p0:\u7006\u6d69\uc910\u7ce1\u4975\u718f, p1:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u624e\u7ce1\u6435\u47c2\u836c\ud158, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                    inc:int(var_8_73, ldc:int(1))
                }
            }
            else {
                var_8_7D = p2:int
                
                loop {
                    if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(8192)), ldc:int(0))) {
                        var_6_63 = and:int(var_6_63:int, ldc:int(-382672659))
                    }
                    else {
                        var_6_63 = and:int(var_6_63:int, ldc:int(1048033528))
                        
                        if (cmpge:boolean(var_8_7D:int, ldc:int(0))) {
                            invokevirtual:void(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ud217\uff55\ud523\u59ec\u965f\ua61f, loadelement:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(p3:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[], var_8_7D:int), p0:\u7006\u6d69\uc910\u7ce1\u4975\u718f, p1:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u624e\u7ce1\u6435\u47c2\u836c\ud158, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                            inc:int(var_8_7D, ldc:int(-1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u7043\ud523\ub1b9\ub83f\u760c() {
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
            putfield:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\u156b\u7873\ub1b9\u16f6\uc910, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, and:int[expected:boolean](ldc:int(29195), ldc:int(-31292)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-771953261), ldc:int(-706122318))
            
            if (getfield:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\u156b\u7873\ub1b9\u16f6\uc910, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-654741701))
                stack_8A_0 = and:int(ldc:int(-1667), ldc:int(1666))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(8710), ldc:int(8711))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 \u6b0d\u6bb9\u6fb0\u5245\u4975\u624e() {
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
            return:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u3c25\u0b8e\u67d0\u385b\ud4fe\u6ec6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u7ce1\u6435\u47c2\u836c\ud158() {
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
            invokeinterface:boolean(List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::addAll, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Collection<? extends \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            invokevirtual:void(LinkedList<E>::clear, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            invokevirtual:boolean(LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>::addAll, getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Collection<? extends \u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            invokeinterface:void(List<E>::clear, getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u8389\u9255\u72f1\ud36e\u2dcc() {
        var_1_A1 : int
        stack_CC_0 : ByteBuf [generated]
        var_3_CC : ByteBuf
        
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
            var_1_A1 = and:int(ldc:int(-1460293796), ldc:int(-294716989))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))) {
                if (cmpne:boolean(getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), aconstnull:ByteBuf())) {
                    goto(Label_0139)
                }
                
                stack_CC_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokeinterface:ByteBufAllocator(Channel::alloc, invokevirtual:Channel(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\uc2bd\uc2e8\u7049\ud4fe\ubff1\ub32d, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))))
                goto(Label_0198)
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_1_A1:int, ldc:int(524288)), ldc:int(0))) {
                return:void()
            }
            
            var_1_A1 = and:int(var_1_A1:int, ldc:int(-187572093))
            Label_0139:
            
            if (cmpne:boolean(and:int(var_1_A1:int, ldc:int(2)), ldc:int(0))) {
                var_1_A1 = and:int(var_1_A1:int, ldc:int(-1118105894))
                goto(Label_0105)
            }
            
            var_1_A1 = and:int(var_1_A1:int, ldc:int(-101914729))
            stack_CC_0 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, getfield:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u9af2\uf9c5\u67d0\u40a9\ubefe\u97b7, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)))
            Label_0198:
            var_1_A1 = and:int(var_1_A1:int, ldc:int(-60477165))
            var_3_CC = stack_CC_0:ByteBuf
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_3_CC:ByteBuf)
            invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u760c\u40a9\u3e75\uae5d\ube23\u62da, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), var_3_CC:ByteBuf, xor:int[expected:boolean](ldc:int(17442), ldc:int(17443)))
            goto(Label_0105)
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u8389\u9255\u72f1\ud36e\u2dcc(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0, boolean p1, boolean p2) {
        var_4_124 : int
        var_6_E3 : ByteBuf
        var_6_12D : Exception
        
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
            var_4_124 = and:int(ldc:int(73930909), ldc:int(1462483100))
            
            loop {
                if (cmpne:boolean(and:int(var_4_124:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_124 = and:int(var_4_124:int, ldc:int(-583436781))
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_4_124:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_124 = and:int(var_4_124:int, ldc:int(-247061322))
                    
                    if (invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u392e\ub1b9\u12cb\ub1b9\u7c6b\u120d, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)) {
                        looporswitchbreak()
                    }
                }
                
                Label_0145:
                
                if (cmpne:boolean(and:int(var_4_124:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_124 = and:int(var_4_124:int, ldc:int(651342697))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_124:int, ldc:int(256)), ldc:int(0))) {
                        var_4_124 = and:int(var_4_124:int, ldc:int(232532702))
                        loopcontinue()
                    }
                    
                    var_4_124 = and:int(var_4_124:int, ldc:int(-712511587))
                }
                
                try {
                    Label_0192:
                    
                    if (cmpne:boolean(and:int(var_4_124:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0145)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_124:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_124 = and:int(var_4_124:int, ldc:int(174754294))
                    var_6_E3 = invokespecial:ByteBuf(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u494c\u0c95\ua61f\uc3e3\ube23\u3711, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, p1:boolean, getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\ua6bd\u6d99\uc246\u7043\u5fe1\u7d52))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_4_124:int, ldc:int(2)), ldc:int(0))) {
                            var_4_124 = and:int(var_4_124:int, ldc:int(-1029877213))
                        }
                        else {
                            var_4_124 = and:int(var_4_124:int, ldc:int(-1665690478))
                            invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u760c\u40a9\u3e75\uae5d\ube23\u62da, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), var_6_E3:ByteBuf, p2:boolean)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_124:int, ldc:int(33554432)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_4_124 = and:int(var_4_124:int, ldc:int(1984214948))
                    }
                    
                    var_4_124 = and:int(var_4_124:int, ldc:int(1512349939))
                }
                catch (java.lang.Exception var_6_12D) {
                    do {
                        if (cmpeq:boolean(and:int(var_4_124:int, ldc:int(16)), ldc:int(0))) {
                            var_4_124 = and:int(var_4_124:int, ldc:int(-1830497006))
                        }
                        else {
                            var_4_124 = and:int(var_4_124:int, ldc:int(-584898890))
                            
                            if (logicalnot:boolean(invokestatic:boolean(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\uff55\u7ce1\u9033\u4975\uc246\u9af2, var_6_12D:Exception[expected:Throwable], ldc:Class<\u7d52\uc238\u12b2\u6198\u527a\ubefe>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7d52\uc238\u12b2\u6198\u527a\ubefe.class)))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak(Label_0372)
                        }
                    } while (cmpne:boolean(and:int(var_4_124:int, ldc:int(16777216)), ldc:int(0)))
                    
                    athrow(var_6_12D:Exception)
                }
                
                looporswitchbreak()
            }
            
            Label_0372:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u8389\u9255\u72f1\ud36e\u2dcc(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0, boolean p1) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4f52\u8389\u9255\u72f1\ud36e\u2dcc, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, p1:boolean, and:int[expected:boolean](ldc:int(1804), ldc:int(-3853)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u8389\u9255\u72f1\ud36e\u2dcc(java.lang.Class<? extends \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd> p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4f52\u8389\u9255\u72f1\ud36e\u2dcc, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:Class<? extends \uc3e3\u4daf\u3c25\u516c\u3a62\u56bd>, xor:int[expected:boolean](ldc:int(16517), ldc:int(16516)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u4e72\u52d3\ub8be\u67e9\u8753\u516c() {
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
            return:int(getfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u7bad\u7d52\u9937\uafe7\u8d98(int p0) {
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
            putfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(-32629), ldc:int(-32633)))), getfield:List<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u62da\u5245\u3bd6\ub8be\u51b2\uc2bd, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(9231), ldc:int(9218)))), getfield:LinkedList<\u0a06\u527a\u4c04\uae5d\u3776\uc238<\u1833\ud171\u8350\ubded\u34df\uc9f6, Object>>[expected:Object](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u12b2\u74b1\u9937\u59ec\u0800\u16f6, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)), loadelement:String(getstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3), xor:int(ldc:int(-23994), ldc:int(-23992)))), getfield:int(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7e3f\ubefe\u8d90\u8640\ubb2b\u718f, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)), ldc:char(125))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_310 : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_101_0 : byte[] [generated]
        stack_103_0 : byte[] [generated]
        stack_127_0 : byte[] [generated]
        stack_323_0 : byte[] [generated]
        stack_39B_0 : byte[] [generated]
        stack_425_0 : byte[] [generated]
        stack_460_0 : byte[] [generated]
        var_4_2F4 : int
        var_3_2F9 : byte[]
        var_5_2FA : int
        expr_323 : byte [generated]
        var_0_391 : int
        expr_39B : byte [generated]
        stack_3D9_2 : byte [generated]
        stack_3B7_0 : byte [generated]
        expr_9C : int [generated]
        expr_D3 : int [generated]
        var_2_101 : byte[]
        expr_105 : int [generated]
        var_3_44E : byte[]
        var_5_44F : int
        var_3_133 : String
        stack_2E0_0 : String[] [generated]
        expr_145 : String[] [generated]
        
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
        var_0_310 = and:int(ldc:int(-1737388533), ldc:int(-616848257))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_101_0 = stack_103_0 = stack_127_0 = stack_323_0 = stack_39B_0 = stack_425_0 = stack_460_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("k97fFKvbQJaeqB3dHdkJmp6o3UrRV6gQWJpc2tse2RZQnVob30suHRPe2Bxdm9lLqp/XHJ0aX1+WHVmJqh/bzKYdXNwJqpDcWchqlNJQ1pXUGdtQkd8cnRpPptVant8cnRpfVFJXX5vY3t3Y1xydGl8UXl7dlw8uUFOcmxnZHslqkNxZyGremh4amFBXzBAlmJDbDuaf1xydGk+mnF4ZD+Yf28ymndnQR2rbzijd3BzcS6YcUNebW86qFdRZ2JfRWNseyWqQSucQWJpMqpDcWchaWw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F4 = expr_6E:int
        var_3_2F9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2FA = expr_6E:int
        Label_0764:
        
        while (cmpeq:boolean(and:int(var_0_310:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_310:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_310 = and:int(var_0_310:int, ldc:int(-2032129084))
                goto(Label_0875)
            }
            
            var_0_310 = and:int(var_0_310:int, ldc:int(-92537462))
            var_5_2FA = add:int(var_5_2FA:int, ldc:int(-1))
            expr_323 = loadelement:byte(stack_323_0:byte[], var_5_2FA:int)
            storeelement:byte(var_3_2F9:byte[], var_5_2FA:int, add:int(or:int(and:int(shl:int(expr_323:byte, xor:int(ldc:int(297), ldc:int(301))), ldc:int(-16)), and:int(shr:int(expr_323:byte[expected:int], xor:int(ldc:int(25090), ldc:int(25094))), ldc:int(15))), ldc:int(71)))
            
            if (cmpne:boolean(var_5_2FA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D1_0 = stack_D3_0 = stack_101_0 = stack_103_0 = stack_127_0 = stack_323_0 = stack_39B_0 = stack_425_0 = stack_460_0 = var_3_2F9:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1023)
        Label_0875:
        
        while (cmpeq:boolean(and:int(var_0_310:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_310:int, ldc:int(131072)), ldc:int(0))) {
                var_0_310 = and:int(var_0_310:int, ldc:int(-331230373))
                goto(Label_0764)
            }
            
            var_0_391 = and:int(var_0_310:int, ldc:int(-1713920721))
            var_5_2FA = add:int(var_5_2FA:int, ldc:int(-1))
            expr_39B = stack_3D9_2 = loadelement(stack_39B_0, var_5_2FA)
            
            if (cmplt:boolean(add:int(add:int(var_5_2FA:int, ldc:int(1)), neg:int(var_4_2F4:int)), ldc:int(0))) {
                stack_3D9_2 = stack_3B7_0 = add:byte(expr_39B:byte, loadelement:byte(var_3_2F9:byte[], add:int(var_5_2FA:int, ldc:int(1))))
                goto(Label_0967)
            }
            
            Label_0936:
            
            if (cmpeq:boolean(and:int(var_0_391:int, ldc:int(524288)), ldc:int(0))) {
                var_0_391 = and:int(var_0_391:int, ldc:int(-1084760390))
                stack_3D9_2 = stack_3B7_0 = add:byte(expr_39B:byte, ldc:byte(1))
            }
            
            Label_0967:
            
            if (cmpeq:boolean(and:int(var_0_391:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0936)
            }
            
            var_0_310 = and:int(var_0_391:int, ldc:int(-1625705041))
            storeelement:byte(var_3_2F9:byte[], var_5_2FA:int, stack_3D9_2:byte)
            
            if (cmpne:boolean(var_5_2FA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D1_0 = stack_D3_0 = stack_101_0 = stack_103_0 = stack_127_0 = stack_323_0 = stack_39B_0 = stack_425_0 = stack_460_0 = var_3_2F9:byte[]
            goto(Label_0161)
        }
        
        var_0_310 = and:int(var_0_310:int, ldc:int(369809033))
        Label_1023:
        
        while (cmpne:boolean(and:int(var_0_310:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(32768)), ldc:int(0))) {
                var_0_310 = and:int(var_0_310:int, ldc:int(836815382))
                goto(Label_0764)
            }
            
            var_0_310 = and:int(var_0_310:int, ldc:int(-10515362))
            var_5_2FA = add:int(var_5_2FA:int, ldc:int(-1))
            storeelement:byte(var_3_2F9:byte[], var_5_2FA:int, xor:byte(loadelement:byte(stack_425_0:byte[], var_5_2FA:int), ldc:byte(125)))
            
            if (cmpne:boolean(var_5_2FA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D1_0 = stack_D3_0 = stack_101_0 = stack_103_0 = stack_127_0 = stack_323_0 = stack_39B_0 = stack_425_0 = stack_460_0 = var_3_2F9:byte[]
            goto(Label_0216)
        }
        
        goto(Label_0875)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_310 = and:int(var_0_310:int, ldc:int(-981102397))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_0_310:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_310:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_310 = and:int(var_0_310:int, ldc:int(-57545410))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_2F4 = expr_9C:int
                var_3_2F9 = newarray:byte[](byte.class, expr_9C:int)
                var_5_2FA = expr_9C:int
                goto(Label_0875)
            }
        }
        
        Label_0161:
        
        if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_0_310:int, ldc:int(131072)), ldc:int(0))) {
            var_0_310 = and:int(var_0_310:int, ldc:int(-1886756958))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(8)), ldc:int(0))) {
                var_0_310 = and:int(var_0_310:int, ldc:int(-1612637345))
                goto(Label_0115)
            }
            
            var_0_310 = and:int(var_0_310:int, ldc:int(-553925202))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_2F4 = expr_D3:int
                var_3_2F9 = newarray:byte[](byte.class, expr_D3:int)
                var_5_2FA = expr_D3:int
                goto(Label_1023)
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_310 = and:int(var_0_310:int, ldc:int(302962223))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_0_310:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_310 = and:int(var_0_310:int, ldc:int(-549997478))
            var_2_101 = stack_101_0:byte[]
            expr_105 = add:int(arraylength:int(stack_103_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_105:int, ldc:int(0))) {
                var_3_44E = newarray:byte[](byte.class, expr_105:int)
                var_5_44F = expr_105:int
                
                loop {
                    var_0_310 = and:int(var_0_310:int, ldc:int(-17439185))
                    var_5_44F = add:int(var_5_44F:int, ldc:int(-1))
                    storeelement:byte(var_3_44E:byte[], var_5_44F:int, add:int(shl:int(loadelement:byte(stack_460_0:byte[], var_5_44F:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_101:byte[], add:int(var_5_44F:int, and:int(ldc:int(513), ldc:int(1267)))), ldc:int(2)), xor:int(ldc:int(5241), ldc:int(5190)))))
                    
                    if (cmpne:boolean(var_5_44F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D1_0 = stack_D3_0 = stack_101_0 = stack_103_0 = stack_127_0 = stack_323_0 = stack_39B_0 = stack_425_0 = stack_460_0 = var_3_44E:byte[]
            }
        }
        
        Label_0266:
        
        if (cmpne:boolean(and:int(var_0_310:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_0_310:int, ldc:int(131072)), ldc:int(0))) {
            var_3_133 = initobject:String(String::<init>, stack_127_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2E0_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8207), ldc:int(16703)))
            expr_145 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(143), ldc:int(10559)))
            storeelement:String(expr_145:String[], and:int(ldc:int(4746), ldc:int(2334)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(21584), ldc:int(-23633)), xor:int(ldc:int(1155), ldc:int(1159))))
            storeelement:String(expr_145:String[], and:int(ldc:int(4457), ldc:int(16403)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(8212), ldc:int(22532)), and:int(ldc:int(4104), ldc:int(27212))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(16398), ldc:int(16390)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(5640), ldc:int(24715)), and:int(ldc:int(17), ldc:int(2104))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(16392), ldc:int(16390)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(16421), ldc:int(16437)), and:int(ldc:int(1879), ldc:int(10261))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(-32566), ldc:int(-32569)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(1629), ldc:int(16405)), and:int(ldc:int(551), ldc:int(18471))))
            storeelement:String(expr_145:String[], and:int(ldc:int(9259), ldc:int(4367)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(12855), ldc:int(3239)), and:int(ldc:int(4151), ldc:int(55))))
            storeelement:String(expr_145:String[], and:int(ldc:int(27208), ldc:int(-27209)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(24703), ldc:int(7607)), xor:int(ldc:int(20994), ldc:int(21065))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(21002), ldc:int(21007)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(8271), ldc:int(1371)), and:int(ldc:int(8271), ldc:int(1263))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(16897), ldc:int(16898)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(79), ldc:int(2655)), and:int(ldc:int(2132), ldc:int(24822))))
            storeelement:String(expr_145:String[], and:int(ldc:int(26255), ldc:int(4164)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(2261), ldc:int(17268)), and:int(ldc:int(2143), ldc:int(16637))))
            storeelement:String(expr_145:String[], and:int(ldc:int(28), ldc:int(15919)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(-24332), ldc:int(-24407)), and:int(ldc:int(26744), ldc:int(120))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(25345), ldc:int(25352)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(24698), ldc:int(1533)), xor:int(ldc:int(1099), ldc:int(1243))))
            storeelement:String(expr_145:String[], and:int(ldc:int(8823), ldc:int(16398)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(468), ldc:int(26802)), and:int(ldc:int(18622), ldc:int(5051))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(1033), ldc:int(1035)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(8702), ldc:int(1722)), xor:int(ldc:int(-16282), ldc:int(-16168))))
            storeelement:String(expr_145:String[], and:int(ldc:int(39), ldc:int(14471)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(8382), ldc:int(18878)), and:int(ldc:int(1498), ldc:int(16594))))
            putstatic:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubcb0\ucfaf\u647c\ubcb0\u8c8a\u36d3, expr_145:String[])
            putstatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6bb9\u3bd6\u61a4\u3e75\ud51e\u51fa, newarray:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd[](\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd.class, and:int(ldc:int(-21688), ldc:int(20519))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \uc3e3\ud12e\u4975\u4f52\u7e3f\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B5 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_6C0 : int
        
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
        var_3_6B5 = and:int(ldc:int(1755285678), ldc:int(-1472882645))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1623703023))
            var_5_81 = and:int(ldc:int(-4251), ldc:int(4250))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28326), ldc:int(-32680)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_6B5:int, ldc:int(-182989073))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(9296), ldc:int(9297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(11285), ldc:int(20555)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_6B5 = and:int(var_3_D0:int, ldc:int(1813904046))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1313), ldc:int(23131)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-630504094))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1721557441))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1246071309))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-366428396))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(622874899))
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1389804074))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(922668517))
                    }
                    else {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1969737515))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0601)
                            }
                            
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-848432094))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1850418661))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(938479839))
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(219326969))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1994500975))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(658305964))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(728746878))
                            var_11_E1 = and:int(ldc:int(27681), ldc:int(-27682))
                            goto(Label_1604)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0601:
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1401118488))
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-828399162))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1231186429))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1941395767))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1626959383))
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-338104077))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1242694465))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0742:
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1877686859))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1817050829))
                        goto(Label_0989)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(463896940))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-681850777))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1859480890))
                            loopcontinue()
                        }
                        
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(2077601515))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0877:
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1493820521))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-752365282))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(713402416))
                            loopcontinue()
                        }
                        
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(543005183))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(2314), ldc:int(2315))
                                goto(Label_1162)
                            }
                        }
                    }
                    
                    Label_0989:
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(149737414))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1460147521))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1919971482))
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1104760947))
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(163685982))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(832451655))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-448422290))
                        var_11_E1 = and:int(ldc:int(21034), ldc:int(-21036))
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-8685983))
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-599293763))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0989)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1817432444))
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(2004524024))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1992789008))
                            loopcontinue()
                        }
                        
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(691924526))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1439)
                            }
                        }
                    }
                    
                    Label_1290:
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1106696409))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1162)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-682520197))
                            goto(Label_0989)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(2092973554))
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1396729243))
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-191130092))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1336535971))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1693436798))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1604)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1439:
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(2072947605))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1848991066))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(620997882))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(2108015832))
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1471241367))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1997638927))
                        goto(Label_0601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-2061192456))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1779878217))
                        loopcontinue()
                    }
                    
                    var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1923063295))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1604:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C0 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1615:
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(1922133162))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0989)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-1919603007))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-2095333871))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B5 = and:int(var_3_6B5:int, ldc:int(651013950))
                        var_17_6C0 = add:int(var_16_10F:int, xor:int(ldc:int(144), ldc:int(145)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B5 = and:int(var_3_6B5:int, ldc:int(-191377542))
                
                if (cmple:boolean(var_5_81 = var_17_6C0:int, sub:int(var_6_88:int, and:int(ldc:int(2331), ldc:int(1569))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6B5:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
