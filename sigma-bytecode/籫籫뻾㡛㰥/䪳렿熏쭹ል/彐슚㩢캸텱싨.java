public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8 {
    public void \u5f50\uc29a\u3a62\uceb8\ud171\uc2e8(java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> p0) {
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
            invokespecial:Object(Object::<init>, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
            putfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, invokestatic:HashSet[expected:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>](Sets::newHashSet))
            putfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, invokestatic:HashSet[expected:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>](Sets::newHashSet))
            putfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u93a2\u8c8a\u59ec\u51fa\u8709\u9033, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, invokestatic:HashSet[expected:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>](Sets::newHashSet))
            putfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, invokestatic:ImmutableList(ImmutableList::copyOf, p0:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>[expected:Collection]))
            
            if (cmpgt:boolean(invokeinterface:int(List::size, p0:List), xor:int(ldc:int(26632), ldc:int(26633)))) {
                putfield:boolean(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\ua068\u0c95\u4c04\u76bc\u2dcc\u69d9, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, invokestatic:boolean(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u516c\u8aa5\u7e3f\u2dcc\u759a\u8753, p0:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>))
            }
            else {
                putfield:boolean(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\ua068\u0c95\u4c04\u76bc\u2dcc\u69d9, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8, and:int[expected:boolean](ldc:int(257), ldc:int(16439)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u516c\u8aa5\u7e3f\u2dcc\u759a\u8753(java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> p0) {
        var_1_92 : int
        var_3_66 : int
        var_4_7C : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_5_85 : int
        var_6_C9 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
        var_1_92 = and:int(ldc:int(2071970907), ldc:int(-67250821))
        var_3_66 = invokeinterface:int(List::size, p0:List)
        var_4_7C = invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C>::\u446c\ucef1\u1187\u8aa5\u7330\u5245, checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::get, p0:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>, and:int(ldc:int(601), ldc:int(-2682)))))
        var_5_85 = xor:int(ldc:int(-24496), ldc:int(-24495))
        
        loop {
            if (cmpne:boolean(and:int(var_1_92:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_92 = and:int(var_1_92:int, ldc:int(1811283743))
                
                if (cmplt:boolean(var_5_85:int, var_3_66:int)) {
                    var_6_C9 = invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C>::\u446c\ucef1\u1187\u8aa5\u7330\u5245, checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::get, p0:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>, var_5_85:int)))
                    
                    if (logicaland:boolean(invokestatic:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ud51e\u927d\u7af6\uc3e3\ubcb0, var_4_7C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_6_C9:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokestatic:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\ua61f\ub113\u965f\u47c2\u3a62, var_4_7C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_6_C9:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        var_1_92 = and:int(var_1_92:int, ldc:int(-101330657))
                        inc:int(var_5_85, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-30891), ldc:int(30856)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_92:int, ldc:int(4)), ldc:int(0))) {
                return:boolean(xor:boolean(ldc:boolean(0), ldc:boolean(1)))
            }
            
            var_1_92 = and:int(var_1_92:int, ldc:int(854102777))
        }
    }
    
    public boolean \u946b\u5d20\u647c\u183a\u8258\u446c() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-206661860), ldc:int(-756613383))
            
            if (invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u93a2\u8c8a\u59ec\u51fa\u8709\u9033, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1763452649))
                stack_8B_0 = and:int(ldc:int(-1527), ldc:int(1522))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(-24063), ldc:int(-24064))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\uff55\uae87\ubb2b\u4f52\u12b2(\u51fa\u12cb\u7330\u74b1\u6c52.\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6 p0) {
        var_2_5F : int
        var_4_69 : Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
        var_5_A4 : \u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>
        
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
            var_2_5F = and:int(ldc:int(-873475138), ldc:int(-875577435))
            var_4_69 = invokeinterface:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::iterator, getfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1717386512))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1506642932))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_69:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>)) {
                        var_5_A4 = checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::next, var_4_69:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>))
                        
                        if (invokevirtual:boolean(\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6::\u3711\u92ff\u183a\ufcaf\u760c\u3776, p0:\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6, var_5_A4:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)) {
                            invokeinterface:boolean(Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::add, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u93a2\u8c8a\u59ec\u51fa\u8709\u9033, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_5_A4:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-471886869))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d4b\u67d0\u4c04\u8640\u6b0d\u5140(\u5245\u8aa5\u61a4\u7049\u4cd9.\u1187\u4c04\u5db4\u1187\u0a06\u97b7 p0, int p1, int p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6 p3) {
        var_5_61 : int
        var_7_6C : Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
        var_5_CC : int
        var_8_B9 : \u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>
        stack_FB_0 : int [generated]
        var_5_17D : int
        var_9_FB : int
        
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
            var_5_61 = and:int(ldc:int(1751516789), ldc:int(-272137476))
            var_7_6C = invokeinterface:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::iterator, getfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
            
            loop {
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(524288)), ldc:int(0))) {
                    var_5_CC = and:int(var_5_61:int, ldc:int(-348607643))
                }
                else {
                    var_5_CC = and:int(var_5_61:int, ldc:int(-129546252))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_6C:Iterator)) {
                        var_8_B9 = checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::next, var_7_6C:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>))
                        
                        if (logicaland:boolean(invokeinterface:boolean(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C>::\u4d85\uc7fe\uff55\ua562\u873d\u6c52, var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>, p1:int, p2:int), invokevirtual:boolean(\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6::\u3711\u92ff\u183a\ufcaf\u760c\u3776, p3:\u4bc8\ud36e\u4975\uc9f6\u760c\u16f6, var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>))) {
                            stack_FB_0 = xor:int(ldc:int(1040), ldc:int(1041))
                        }
                        else {
                            var_5_CC = and:int(var_5_CC:int, ldc:int(-98072961))
                            stack_FB_0 = and:int(ldc:int(-8462), ldc:int(8461))
                        }
                        
                        var_5_17D = and:int(var_5_CC:int, ldc:int(-1367507339))
                        var_9_FB = stack_FB_0:int
                        
                        if (cmpne:boolean(var_9_FB:int, ldc:int(0))) {
                            invokeinterface:boolean(Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::add, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
                            goto(Label_0312)
                        }
                        
                        Label_0258:
                        
                        if (cmpeq:boolean(and:int(var_5_17D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0340)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_17D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_5_17D = and:int(var_5_17D:int, ldc:int(781042294))
                            invokeinterface:boolean(Set<E>::remove, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object])
                        }
                        
                        Label_0312:
                        
                        if (cmpne:boolean(and:int(var_5_17D:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_5_17D:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0258)
                            }
                            
                            var_5_17D = and:int(var_5_17D:int, ldc:int(-293167492))
                            
                            if (cmpne:boolean(var_9_FB:int, ldc:int(0))) {
                                if (invokevirtual:boolean(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\u494c\u64ab\u5d20\ud4fe\u61a4\ubded, p0:\u1187\u4c04\u5db4\u1187\u0a06\u97b7, var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>, checkcast:IntList(it.unimi.dsi.fastutil.ints.IntList.class, aconstnull:IntList()))) {
                                    invokeinterface:boolean(Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::add, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
                                    goto(Label_0434)
                                }
                            }
                        }
                        
                        Label_0340:
                        
                        if (cmpne:boolean(and:int(var_5_17D:int, ldc:int(4096)), ldc:int(0))) {
                            var_5_17D = and:int(var_5_17D:int, ldc:int(-1238350042))
                            goto(Label_0312)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_17D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_5_17D = and:int(var_5_17D:int, ldc:int(1611551792))
                            goto(Label_0258)
                        }
                        
                        var_5_17D = and:int(var_5_17D:int, ldc:int(777816951))
                        invokeinterface:boolean(Set<E>::remove, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_8_B9:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object])
                        Label_0434:
                        var_5_61 = and:int(var_5_17D:int, ldc:int(-1347674506))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_CC:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_61 = and:int(var_5_CC:int, ldc:int(-885727172))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6198\ub8be\ua6bd\u4cd9\uafe7\ucb79(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?> p0) {
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
            return:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc3e3\u4179\u1187\u51b2\u61a4\u67e9() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1354604993), ldc:int(-1347457026))
            
            if (invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1342186754))
                stack_8B_0 = and:int(ldc:int(3724), ldc:int(-3727))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(-31679), ldc:int(-31680))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6c56\u759a\uc246\u5db4\uc7fe\u4c2b() {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1642488030), ldc:int(-1099489874))
            
            if (invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-23339025))
                stack_8B_0 = and:int(ldc:int(-32599), ldc:int(26438))
            }
            else {
                stack_8B_0 = and:int(ldc:int(1553), ldc:int(8271))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> \u7006\ud4fe\u3711\u16f6\u3711\u718f() {
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
            return:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(getfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> \u7006\ud4fe\u3711\u16f6\u3711\u718f(boolean p0) {
        var_2_5F : int
        var_4_63 : ArrayList
        stack_82_0 : Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> [generated]
        var_2_81 : int
        var_5_82 : Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
        var_6_8D : Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
        var_7_C2 : \u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>
        
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
            var_2_5F = and:int(ldc:int(1932995405), ldc:int(-2049869490))
            var_4_63 = invokestatic:ArrayList(Lists::newArrayList)
            
            if (logicalnot:boolean(p0:boolean)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1004187482))
                stack_82_0 = getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
            }
            else {
                stack_82_0 = getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8)
            }
            
            var_2_81 = and:int(var_2_5F:int, ldc:int(-1549325859))
            var_5_82 = stack_82_0:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
            var_6_8D = invokeinterface:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::iterator, getfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
            
            loop {
                if (cmpne:boolean(and:int(var_2_81:int, ldc:int(64)), ldc:int(0))) {
                    var_2_81 = and:int(var_2_81:int, ldc:int(931392335))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_8D:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>)) {
                        var_7_C2 = checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::next, var_6_8D:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>))
                        
                        if (invokeinterface:boolean(Set::contains, var_5_82:Set, var_7_C2:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object])) {
                            invokeinterface:boolean(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::add, var_4_63:ArrayList<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>[expected:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>], var_7_C2:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
                        }
                        
                        var_2_81 = and:int(var_2_81:int, ldc:int(-1923253921))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_81:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(var_4_63:ArrayList<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>> \ua61f\u385b\uff55\u6c56\u62da\u6d69(boolean p0) {
        var_2_7B : int
        var_4_63 : ArrayList
        var_5_6E : Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>
        var_6_AB : \u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>
        
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
            var_2_7B = and:int(ldc:int(49906426), ldc:int(1794775994))
            var_4_63 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_6E = invokeinterface:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::iterator, getfield:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u7873\u0a06\u4bc8\ufe34\u69d9\u8640, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
            
            loop {
                if (cmpne:boolean(and:int(var_2_7B:int, ldc:int(16)), ldc:int(0))) {
                    var_2_7B = and:int(var_2_7B:int, ldc:int(-1358977416))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6E:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>)) {
                        var_6_AB = checkcast:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>.class, invokeinterface:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::next, var_5_6E:Iterator<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>))
                        
                        if (invokeinterface:boolean(Set<E>::contains, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u67d0\u8413\uc2bd\u8258\uc31c\u4179, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_6_AB:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object])) {
                            if (cmpeq:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8), var_6_AB:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>[expected:Object]), p0:boolean)) {
                                invokeinterface:boolean(List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>::add, var_4_63:ArrayList<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>[expected:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>], var_6_AB:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
                            }
                        }
                        
                        var_2_7B = and:int(var_2_7B:int, ldc:int(1677257726))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7B:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_7B = and:int(var_2_7B:int, ldc:int(1948652346))
            }
            
            return:List<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>(var_4_63:ArrayList<\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>>)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3bd6\u392e\u759a\ud51e\u8258\u965f() {
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
            return:boolean(getfield:boolean(\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8::\ua068\u0c95\u4c04\u76bc\u2dcc\u69d9, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8))
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
    
    public void \u836c\u92ff\u527a\u0800\u71ae\u416d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_7E : int
        var_6_85 : int
        var_7_94 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(-1969469408), ldc:int(1555877589))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0168)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-323213156))
            var_5_7E = and:int(ldc:int(-23833), ldc:int(23832))
            var_6_85 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_94 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18821), ldc:int(18820)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_64B:int, ldc:int(-624985039))
                    var_9_BB = sub:double(var_7_94:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7E:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_85:int, and:int(ldc:int(153), ldc:int(3137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(11149), ldc:int(65)))), var_7_94:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_CD:int, ldc:int(-577147471))
                    var_14_108 = var_7_94:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7E:int), and:int(ldc:int(73), ldc:int(10001)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_85:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-925651143))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1784548221))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1612622778))
                    }
                    else {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(750267084))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_85:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0546)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0384:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(650130453))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1370258153))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1738208491))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-252126176))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1181135179))
                        var_11_DE = and:int(ldc:int(-32342), ldc:int(32321))
                        goto(Label_1473)
                    }
                    
                    Label_0546:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1723826402))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(783701209))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(234554591))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(930073453))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-2084413516))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-73449507))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(327257584))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-294557463))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1649355385))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(686268076))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-860340828))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(370790106))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1033015606))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-182538663))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(449715623))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1835127121))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1589324503))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E:int), var_7_94:double)) {
                                var_11_DE = xor:int(ldc:int(514), ldc:int(515))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0933:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-294942561))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1345855680))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-98457895))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1537642286))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-627201734))
                        var_11_DE = and:int(ldc:int(-17747), ldc:int(17746))
                    }
                    
                    Label_1090:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1428061626))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1881157681))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1330)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-377235513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-820115262))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1778903717))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1758158304))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(624498153))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1543321833))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7E:int, var_16_10C:int)
                        goto(Label_1473)
                    }
                    
                    Label_1330:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2104695521))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2089480495))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(43266192))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1177715339))
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1918362185))
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(184155374))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_7E:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(457972712))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1705219735))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-453030921))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-13643367))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(413161836))
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-121845677))
                        var_17_656 = add:int(var_16_10C:int, xor:int(ldc:int(-30576), ldc:int(-30575)))
                        looporswitchbreak()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-1991695454))
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(-1898021368))
                
                if (cmple:boolean(var_5_7E = var_17_656:int, sub:int(var_6_85:int, and:int(ldc:int(25147), ldc:int(1025))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0168:
        
        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
