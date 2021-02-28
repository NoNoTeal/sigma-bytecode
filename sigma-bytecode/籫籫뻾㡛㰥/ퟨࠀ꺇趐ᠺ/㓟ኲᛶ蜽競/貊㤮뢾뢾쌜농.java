public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d {
    public void \u8c8a\u392e\ub8be\ub8be\uc31c\ub18d() {
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
            invokespecial:Object(Object::<init>, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d)
            putfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, invokestatic:HashMap[expected:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9033\u4daf\u9af2\u7330\u3e75\uc229(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0) {
        var_2_5F : int
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
            var_2_5F = and:int(ldc:int(-338903225), ldc:int(1798668123))
            
            if (cmple:boolean(invokevirtual:float(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\ub8be\u47c2\u0a06\uf995\u839e\u5245, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, ldc:float(0.0f)), ldc:float(0.0f))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1807580759))
                stack_8A_0 = and:int(ldc:int(-4936), ldc:int(839))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(-32464), ldc:int(-32463))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public float \ub8be\u47c2\u0a06\uf995\u839e\u5245(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0, float p1) {
        var_5_6D : \u97e6\u98a4\ubded\u527a\u836c\u4975
        
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
        var_5_6D = checkcast:\u97e6\u98a4\ubded\u527a\u836c\u4975(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u97e6\u98a4\ubded\u527a\u836c\u4975.class, invokeinterface:\u97e6\u98a4\ubded\u527a\u836c\u4975(Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::get, getfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object]))
        
        if (cmpeq:boolean(var_5_6D:\u97e6\u98a4\ubded\u527a\u836c\u4975, aconstnull:\u97e6\u98a4\ubded\u527a\u836c\u4975())) {
            return:float(ldc:float(0.0f))
        }
        
        return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, div:float(sub:float(i2f:float(invokestatic:int(\u97e6\u98a4\ubded\u527a\u836c\u4975::\u4e72\u92ff\ua3b4\u927d\u8709\ufcaf, var_5_6D:\u97e6\u98a4\ubded\u527a\u836c\u4975)), add:float(i2f:float(getfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d)), p1:float)), i2f:float(sub:int(invokestatic:int(\u97e6\u98a4\ubded\u527a\u836c\u4975::\u4e72\u92ff\ua3b4\u927d\u8709\ufcaf, var_5_6D:\u97e6\u98a4\ubded\u527a\u836c\u4975), invokestatic:int(\u97e6\u98a4\ubded\u527a\u836c\u4975::\u36d3\u516c\ud12e\uae87\uf94d\ua3b4, var_5_6D:\u97e6\u98a4\ubded\u527a\u836c\u4975)))), ldc:float(0.0f), ldc:float(1.0f)))
    }
    
    public void \u6cfe\u74b1\u7330\ub113\ubb2b\ube23() {
        var_1_CD : int
        var_3_94 : Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>
        var_4_B3 : Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>
        
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
            var_1_CD = and:int(ldc:int(740577792), ldc:int(1756699455))
            putfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, add:int(getfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), xor:int(ldc:boolean(0), ldc:boolean(1))))
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::isEmpty, getfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d)))) {
                var_3_94 = invokeinterface:Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>(Set<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>::iterator, invokeinterface:Set<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>(Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::entrySet, getfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d)))
                
                loop {
                    var_1_CD = and:int(var_1_CD:int, ldc:int(-1281010870))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_94:Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>))) {
                        looporswitchbreak()
                    }
                    
                    var_4_B3 = checkcast:Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(java.util.Map.Entry<\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u97e6\u98a4\ubded\u527a\u836c\u4975>.class, invokeinterface:Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>::next, var_3_94:Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>))
                    
                    if (cmple:boolean(invokestatic:int(\u97e6\u98a4\ubded\u527a\u836c\u4975::\u4e72\u92ff\ua3b4\u927d\u8709\ufcaf, checkcast:\u97e6\u98a4\ubded\u527a\u836c\u4975(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u97e6\u98a4\ubded\u527a\u836c\u4975.class, invokeinterface:\u97e6\u98a4\ubded\u527a\u836c\u4975(Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::getValue, var_4_B3:Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>))), getfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d))) {
                        invokeinterface:void(Iterator<E>::remove, var_3_94:Iterator<Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>>)
                        invokevirtual:void(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u4bc8\u4492\ud171\u760c\u5fe1\ub113, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, checkcast:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52.class, invokeinterface:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::getKey, var_4_B3:Entry<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>)))
                    }
                    
                    var_1_CD = and:int(var_1_CD:int, ldc:int(1744738153))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u56bd\u3bd6\u600f\u156b\u9af2(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0, int p1) {
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
            invokeinterface:\u97e6\u98a4\ubded\u527a\u836c\u4975(Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::put, getfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, initobject:\u97e6\u98a4\ubded\u527a\u836c\u4975(\u97e6\u98a4\ubded\u527a\u836c\u4975::<init>, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, getfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), add:int(getfield:int(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u8389\u36d3\uae87\u8258\u6435\ua068, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), p1:int), aconstnull:\uc9f6\u3bc9\u64f2\u8cae\uf94d\u527a()))
            invokevirtual:void(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u9937\u36d3\u40a9\u4975\u5d20\u624e, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\u4daf\u93a2\u647c\u88c5\ub18d(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0) {
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
            invokeinterface:\u97e6\u98a4\ubded\u527a\u836c\u4975(Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>::remove, getfield:Map<\u9af2\u1833\u156b\u12cb\u7d52\u6c52, \u97e6\u98a4\ubded\u527a\u836c\u4975>(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u5245\u7c6b\u4ab3\ub102\u8308\u527a, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d), p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object])
            invokevirtual:void(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\u4bc8\u4492\ud171\u760c\u5fe1\ub113, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d, p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9937\u36d3\u40a9\u4975\u5d20\u624e(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0, int p1) {
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
    
    public void \u4bc8\u4492\ud171\u760c\u5fe1\ub113(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0) {
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
    
    public void \u3504\u759a\u385b\u960f\u12b2\u0a06(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_608 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_613 : int
        
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
        var_3_608 = and:int(ldc:int(1058076545), ldc:int(2105470849))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(-225155057))
        }
        else {
            var_3_608 = and:int(var_3_608:int, ldc:int(-1116405853))
            var_5_85 = and:int(ldc:int(8231), ldc:int(-12392))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25472), ldc:int(-25491)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_608:int, ldc:int(781838231))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(10897), ldc:int(261)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(13), ldc:int(10257)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_608 = and:int(var_3_D2:int, ldc:int(-1382619257))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2261), ldc:int(5161)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(398904623))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1272852939))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-977252691))
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1217642385))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1601070875))
                    }
                    else {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1869672431))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(972326040))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2017590992))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(85664698))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1509400883))
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1135953710))
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(11646481))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1855584211))
                            var_11_E3 = and:int(ldc:int(-11521), ldc:int(11520))
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-588630036))
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-475092012))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1625033463))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(758448071))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1404663718))
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-644943575))
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1973067247))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(528650337))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1645259739))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1846738855))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0800:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(973812383))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2067516137))
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(803208148))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1824321467))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(5603), ldc:int(8705))
                                goto(Label_1041)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(689068616))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1574271969))
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1008138115))
                        var_11_E3 = and:int(ldc:int(-17529), ldc:int(17528))
                    }
                    
                    Label_1041:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1177902264))
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1266516257))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-681950454))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(128)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(362739538))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(775743399))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1296)
                            }
                        }
                    }
                    
                    Label_1160:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1717534626))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(128)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(683453365))
                            goto(Label_1041)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1317544630))
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(128)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1056519049))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-2105313601))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1086523505))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1416)
                    }
                    
                    Label_1296:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1046201054))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(127528435))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1707833410))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_608 = and:int(var_3_608:int, ldc:int(-1397100667))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1416:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_613 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-295753800))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(403464485))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-987535301))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(219901749))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(197625850))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1349189729))
                        var_17_613 = add:int(var_16_111:int, xor:int(ldc:int(17056), ldc:int(17057)))
                        looporswitchbreak()
                    }
                }
                
                var_3_608 = and:int(var_3_608:int, ldc:int(-333584393))
                
                if (cmple:boolean(var_5_85 = var_17_613:int, sub:int(var_6_8C:int, and:int(ldc:int(5073), ldc:int(27653))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
