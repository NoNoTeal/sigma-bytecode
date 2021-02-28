public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u7006\u3711\uf995\u8bb0\u64ab {
    public void \u7006\u3711\uf995\u8bb0\u64ab() {
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
            invokespecial:Object(Object::<init>, this:\u7006\u3711\uf995\u8bb0\u64ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d> \u0b8e\u600f\ub171\u6d69\ubff1(java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3c25\ub32d\u3c25\ubb2b\u9255 p1, java.lang.String p2, java.lang.String p3) {
        var_4_61 : int
        var_6_69 : List<\ud217\u624e\u34df\u0b8e\u416d>
        var_4_7C : int
        var_7_85 : ArrayList<\ud217\u624e\u34df\u0b8e\u416d>
        var_8_8E : Iterator<\ud217\u624e\u34df\u0b8e\u416d>
        var_9_C9 : \ud217\u624e\u34df\u0b8e\u416d
        var_4_AD : int
        var_9_B6 : Iterator<\ud217\u624e\u34df\u0b8e\u416d>
        var_10_12C : \ud217\u624e\u34df\u0b8e\u416d
        
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
        var_4_61 = and:int(ldc:int(-1147792866), ldc:int(1536234039))
        var_6_69 = invokestatic:List<\ud217\u624e\u34df\u0b8e\u416d>(\u7006\u3711\uf995\u8bb0\u64ab::\u0b8e\u600f\ub171\u6d69\ubff1, p0:List<\ud217\u624e\u34df\u0b8e\u416d>, p1:\u3c25\ub32d\u3c25\ubb2b\u9255, p2:String)
        p3 = invokevirtual:String(String::toLowerCase, p3:String)
        
        if (cmpne:boolean(invokevirtual:int(String::length, p3:String), ldc:int(0))) {
            var_4_7C = and:int(var_4_61:int, ldc:int(2146759583))
            var_7_85 = initobject:ArrayList<\ud217\u624e\u34df\u0b8e\u416d>(ArrayList<E>::<init>)
            var_8_8E = invokeinterface:Iterator<\ud217\u624e\u34df\u0b8e\u416d>(List<\ud217\u624e\u34df\u0b8e\u416d>::iterator, var_6_69:List<\ud217\u624e\u34df\u0b8e\u416d>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_8E:Iterator)) {
                var_9_C9 = checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, invokeinterface:\ud217\u624e\u34df\u0b8e\u416d(Iterator<\ud217\u624e\u34df\u0b8e\u416d>::next, var_8_8E:Iterator<\ud217\u624e\u34df\u0b8e\u416d>))
                
                if (invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toLowerCase, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u9937\u1187\u8308\u64ab\uc29a, var_9_C9:\ud217\u624e\u34df\u0b8e\u416d)), p3:String)) {
                    invokeinterface:boolean(List<\ud217\u624e\u34df\u0b8e\u416d>::add, var_7_85:ArrayList<\ud217\u624e\u34df\u0b8e\u416d>[expected:List<\ud217\u624e\u34df\u0b8e\u416d>], var_9_C9:\ud217\u624e\u34df\u0b8e\u416d)
                    invokeinterface:void(Iterator::remove, var_8_8E:Iterator)
                }
                
                var_4_7C = and:int(var_4_7C:int, ldc:int(2006474582))
            }
            
            var_4_AD = and:int(var_4_7C:int, ldc:int(1608407647))
            var_9_B6 = invokeinterface:Iterator<\ud217\u624e\u34df\u0b8e\u416d>(List<\ud217\u624e\u34df\u0b8e\u416d>::iterator, var_6_69:List<\ud217\u624e\u34df\u0b8e\u416d>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_9_B6:Iterator)) {
                var_10_12C = checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, invokeinterface:\ud217\u624e\u34df\u0b8e\u416d(Iterator<\ud217\u624e\u34df\u0b8e\u416d>::next, var_9_B6:Iterator<\ud217\u624e\u34df\u0b8e\u416d>))
                
                if (invokevirtual:boolean(String::contains, invokevirtual:String(String::toLowerCase, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u9937\u1187\u8308\u64ab\uc29a, var_10_12C:\ud217\u624e\u34df\u0b8e\u416d)), p3:String[expected:CharSequence])) {
                    invokeinterface:boolean(List<\ud217\u624e\u34df\u0b8e\u416d>::add, var_7_85:ArrayList<\ud217\u624e\u34df\u0b8e\u416d>[expected:List<\ud217\u624e\u34df\u0b8e\u416d>], var_10_12C:\ud217\u624e\u34df\u0b8e\u416d)
                    invokeinterface:void(Iterator::remove, var_9_B6:Iterator)
                }
                
                var_4_AD = and:int(var_4_AD:int, ldc:int(2079807391))
            }
            
            invokeinterface:boolean(List<Object>::addAll, var_7_85:List<Object>, var_6_69:List<\ud217\u624e\u34df\u0b8e\u416d>[expected:Collection<?>])
            return:List<\ud217\u624e\u34df\u0b8e\u416d>(var_7_85:ArrayList<\ud217\u624e\u34df\u0b8e\u416d>)
        }
        
        return:List<\ud217\u624e\u34df\u0b8e\u416d>(var_6_69:List<\ud217\u624e\u34df\u0b8e\u416d>)
    }
    
    public static java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d> \u0b8e\u600f\ub171\u6d69\ubff1(java.util.List<\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3c25\ub32d\u3c25\ubb2b\u9255 p1, java.lang.String p2) {
        var_3_117 : int
        var_5_6D : ArrayList<Object>
        
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
            var_3_117 = and:int(and:int(ldc:int(-330562713), ldc:int(-488436953)), ldc:int(-102003713))
            var_5_6D = initobject:ArrayList<Object>(ArrayList<Object>::<init>, p0:Collection<? extends T>)
            
            loop {
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-1795729372))
                    goto(Label_0549)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0458)
                }
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0367)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0300)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(128)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-450358441))
                    
                    switch (loadelement:int(getstatic:int[](\u4d85\u1187\u8709\uc31c\u4e72::\u6bb9\ubefe\u183a\u92ee\uc3e3), invokevirtual:int(Enum<E>::ordinal, p1:\u3c25\ub32d\u3c25\ubb2b\u9255[expected:Enum<\u3c25\ub32d\u3c25\ubb2b\u9255>]))) {
                        case 1:
                            invokestatic:void(Collections::sort, var_5_6D:List<Object>, initobject:\ud51e\u836c\ub70c\uc31c\u960f[expected:Comparator<? super Object>](\ud51e\u836c\ub70c\uc31c\u960f::<init>))
                            looporswitchbreak()
                        
                        case 2:
                            invokestatic:void(Collections::sort, var_5_6D:List<Object>, initobject:\ub102\u624e\u983f\uf9c5\ud171[expected:Comparator<? super Object>](\ub102\u624e\u983f\uf9c5\ud171::<init>, p2:String))
                            goto(Label_0300)
                        
                        case 3:
                            invokestatic:void(Collections::sort, var_5_6D:List<Object>, initobject:\u64ab\u3bc9\ubcb0\ua6bd\ubefe[expected:Comparator<? super Object>](\u64ab\u3bc9\ubcb0\ua6bd\ubefe::<init>))
                            goto(Label_0367)
                        
                        case 4:
                            invokestatic:void(Collections::sort, var_5_6D:List<Object>, initobject:\u7e3f\ufe34\u92ff\u97b7\ubf56[expected:Comparator<? super Object>](\u7e3f\ufe34\u92ff\u97b7\ubf56::<init>))
                            goto(Label_0458)
                        
                        case 5:
                            invokestatic:void(Collections::sort, var_5_6D:List<Object>, initobject:\u12cb\u0a06\u7af6\u59ec\ua068[expected:Comparator<? super Object>](\u12cb\u0a06\u7af6\u59ec\ua068::<init>))
                            goto(Label_0549)
                        
                        default:
                            looporswitchbreak(Label_0605)
                    }
                }
                
                Label_0216:
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0549)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(2)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(464711813))
                    goto(Label_0458)
                }
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0367)
                }
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(127228739))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_117:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(1696603459))
                        loopcontinue()
                    }
                    
                    var_3_117 = and:int(var_3_117:int, ldc:int(-229155025))
                    looporswitchbreak()
                }
                
                Label_0300:
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0549)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0458)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(434502181))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(-64741537))
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0367:
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(1)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(1290754344))
                    goto(Label_0549)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-1246887609))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_117:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(160537845))
                        goto(Label_0300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(256)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(-612531595))
                        loopcontinue()
                    }
                    
                    var_3_117 = and:int(var_3_117:int, ldc:int(-378773689))
                    looporswitchbreak()
                }
                
                Label_0458:
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(1177457885))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(1004752156))
                        goto(Label_0367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_117:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(-885460172))
                        goto(Label_0300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(1)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(1026637261))
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(128)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(-48378985))
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0549:
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0458)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-1272415955))
                    goto(Label_0367)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-835167906))
                    goto(Label_0300)
                }
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(-389843177))
                    looporswitchbreak()
                }
            }
            
            Label_0605:
            return:List<\ud217\u624e\u34df\u0b8e\u416d>(var_5_6D:ArrayList<Object>)
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
    
    public void \u56bd\uc4d2\u61a4\u4ab3\u1187(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(-1265217261), ldc:int(-1294798245))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u3711\uf995\u8bb0\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(-1311329509))
            var_5_7D = and:int(ldc:int(-4720), ldc:int(4143))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2758), ldc:int(2753)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_633:int, ldc:int(-688685865))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(17545), ldc:int(8725)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(17537), ldc:int(17536)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_D2:int, ldc:int(-759971753))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18500), ldc:int(18501)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(460900888))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-688481100))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(287623349))
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1294543401))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1919404032))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(643762302))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1862907619))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-545054403))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1668422226))
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1147676073))
                            var_11_E3 = and:int(ldc:int(840), ldc:int(-841))
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1299298920))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(400575024))
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-860425252))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1176771945))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0649:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1898110046))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1214923192))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1097284268))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-732315625))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(520105595))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-128703976))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-543539909))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0792:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1577347369))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1411756483))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-617949825))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1573993582))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0649)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(2040031438))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1924031895))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-153115493))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-24543), ldc:int(-24544))
                                goto(Label_1094)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-793756360))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1897473476))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(668811806))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(710094972))
                            goto(Label_0649)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(509522904))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1163999105))
                        var_11_E3 = and:int(ldc:int(-11474), ldc:int(11473))
                    }
                    
                    Label_1094:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2051406810))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-451919139))
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1147282036))
                            goto(Label_0649)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-453518476))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(65788486))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1686603781))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-83947981))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1351)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1626034725))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1094)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0649)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(970297322))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1963681828))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1145945413))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1351:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1140284326))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1627773073))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-32510801))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-120062733))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(101449236))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1893030777))
                        goto(Label_0649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-220396312))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1744888717))
                        var_17_63E = add:int(var_16_111:int, and:int(ldc:int(1), ldc:int(2351)))
                        looporswitchbreak()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(942596692))
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(-252191393))
                
                if (cmple:boolean(var_5_7D = var_17_63E:int, sub:int(var_6_84:int, and:int(ldc:int(14477), ldc:int(16481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(1723285677))
            goto(Label_0106)
        }
    }
}
