public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T> {
    public void \u1187\u62da\u718f\u3c25\u6ec6\u5d20(java.lang.String p0, java.lang.Class<T> p1, java.util.Collection<T> p2) {
        var_6_7B : Iterator<T>
        var_7_9E : Enum
        var_8_AA : String
        
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
            invokespecial:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::<init>, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>], p0:String, p1:Class<T>)
            putfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>, invokestatic:HashMap[expected:Map<String, T>](Maps::newHashMap))
            putfield:ImmutableSet<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u927d\u3dd3\u61a4\u8413\u983f\u7049, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>, invokestatic:ImmutableSet(ImmutableSet::copyOf, p2:Collection<T>))
            var_6_7B = invokeinterface:Iterator<T>(Collection<T>::iterator, p2:Collection<T>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_7B:Iterator<T>)) {
                var_7_9E = checkcast:Enum(java.lang.Enum.class, invokeinterface:T extends Enum<T> & \u8cae\u392e\u5fe1\u5140\u3dd3\u7006[expected:Enum](Iterator<T>::next, var_6_7B:Iterator<T>))
                var_8_AA = invokeinterface:String(\u8cae\u392e\u5fe1\u5140\u3dd3\u7006::\u99f7\u4e72\u624e\u527a\u624e\ubefe, checkcast:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006.class, var_7_9E:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006))
                
                if (invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>), var_8_AA:String[expected:Object])) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u5654\u71ae\u6bb9\ua61f\u6b5f\uf995), and:int(ldc:int(-19251), ldc:int(18994)))), var_8_AA:String), loadelement:String(getstatic:String[](\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u5654\u71ae\u6bb9\ua61f\u6b5f\uf995), xor:int(ldc:int(-16316), ldc:int(-16315)))))))
                }
                
                invokeinterface:T extends Enum<T> & \u8cae\u392e\u5fe1\u5140\u3dd3\u7006(Map<String, T>::put, getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>), var_8_AA:String, var_7_9E:T extends Enum<T> & \u8cae\u392e\u5fe1\u5140\u3dd3\u7006)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<T> \u12cb\u67e9\ud171\u6b5f\u6198\u36d3() {
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
            return:Collection<T>(getfield:ImmutableSet<T>[expected:Collection<T>](\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u927d\u3dd3\u61a4\u8413\u983f\u7049, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<T> \u873d\uc87f\ucef1\u9033\u3bc9\u6bb9(java.lang.String p0) {
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
            return:Optional<T>(invokestatic:Optional<T>(Optional<T>::ofNullable, invokeinterface:T extends Enum<T> & \u8cae\u392e\u5fe1\u5140\u3dd3\u7006(Map<String, T>::get, getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>), p0:String[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1(T extends java.lang.Enum<T> & \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006 p0) {
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
            return:String(invokeinterface:String(\u8cae\u392e\u5fe1\u5140\u3dd3\u7006::\u99f7\u4e72\u624e\u527a\u624e\ubefe, checkcast:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006.class, p0:T extends Enum<T> & \u8cae\u392e\u5fe1\u5140\u3dd3\u7006[expected:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006])))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_C7 : int
        var_4_B2 : \u1187\u62da\u718f\u3c25\u6ec6\u5d20
        stack_FA_0 : int [generated]
        
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
        var_2_C7 = and:int(ldc:int(-1459113508), ldc:int(-15597859))
        
        if (cmpeq:boolean(this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>[expected:Object], p0:Object)) {
            return:boolean(xor:int[expected:boolean](ldc:int(12336), ldc:int(12337)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_C7:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_C7 = and:int(var_2_C7:int, ldc:int(-1452438292))
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20.class, p0:Object)) {
                    if (invokespecial:boolean(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::equals, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>], p0:Object)) {
                        var_4_B2 = checkcast:\u1187\u62da\u718f\u3c25\u6ec6\u5d20(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20.class, p0:Object[expected:\u1187\u62da\u718f\u3c25\u6ec6\u5d20])
                        
                        if (logicaland:boolean(invokevirtual:boolean(ImmutableSet::equals, getfield:ImmutableSet<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u927d\u3dd3\u61a4\u8413\u983f\u7049, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>), getfield:ImmutableSet<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u927d\u3dd3\u61a4\u8413\u983f\u7049, var_4_B2:\u1187\u62da\u718f\u3c25\u6ec6\u5d20)), invokeinterface:boolean(Map<K, V>::equals, getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>), getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, var_4_B2:\u1187\u62da\u718f\u3c25\u6ec6\u5d20)))) {
                            stack_FA_0 = and:int(ldc:int(11425), ldc:int(16659))
                        }
                        else {
                            var_2_C7 = and:int(var_2_C7:int, ldc:int(2075652588))
                            stack_FA_0 = and:int(ldc:int(23077), ldc:int(-23078))
                        }
                        
                        return:boolean(stack_FA_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_C7:int, ldc:int(32768)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(11830), ldc:int(-12087)))
            }
        }
    }
    
    public int \u7d52\u6d99\uc29a\u9937\u7af6\ucb79() {
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
            return:int(add:int(mul:int(ldc:int(31), add:int(mul:int(ldc:int(31), invokespecial:int(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u7d52\u6d99\uc29a\u9937\u7af6\ucb79, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>])), invokevirtual:int(ImmutableSet::hashCode, getfield:ImmutableSet<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u927d\u3dd3\u61a4\u8413\u983f\u7049, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>)))), invokeinterface:int(Map<K, V>::hashCode, getfield:Map<String, T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\ud4fe\u8709\u527a\uc238\u7c6b\u3e75, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>))))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T> \ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a(java.lang.String p0, java.lang.Class<T> p1) {
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
            return:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(invokestatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>::\ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a, p0:String, p1:Class<T>, invokestatic:Predicate[expected:Predicate<T>](Predicates::alwaysTrue)))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T> \ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a(java.lang.String p0, java.lang.Class<T> p1, java.util.function.Predicate<T> p2) {
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
            return:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(invokestatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>::\ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a, p0:String, p1:Class<T>, checkcast:Collection<T>(java.util.Collection<T>.class, invokeinterface:Collection<T>(Stream<T>::collect, invokeinterface:Stream<T>(Stream<T>::filter, invokestatic:Stream<T>(Arrays::stream, invokevirtual:T[](Class<T>::getEnumConstants, p1:Class<T>)), p2:Predicate<T>), invokestatic:Collector<? super T, ?, List<? super T>>(Collectors::toList)))))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T> \ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a(java.lang.String p0, java.lang.Class<T> p1, T[] p2) {
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
            return:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(invokestatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>::\ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a, p0:String, p1:Class<T>, invokestatic:ArrayList[expected:Collection<T>](Lists::newArrayList, p2:T[][expected:Object[]])))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T> \ub19c\u7d52\u52d3\u88c5\u3e2a\uc29a(java.lang.String p0, java.lang.Class<T> p1, java.util.Collection<T> p2) {
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
            return:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(initobject:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>(\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>::<init>, p0:String, p1:Class<T>, p2:Collection<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1(java.lang.Comparable p0) {
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
            return:String(invokevirtual:String(\u1187\u62da\u718f\u3c25\u6ec6\u5d20<Enum>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>, checkcast:Enum(java.lang.Enum.class, p0:Enum)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1BB : int
        expr_6B : int [generated]
        stack_A2_0 : byte[] [generated]
        stack_A4_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_1CE_0 : byte[] [generated]
        stack_214_0 : byte[] [generated]
        stack_298_0 : byte[] [generated]
        stack_2EE_0 : byte[] [generated]
        var_4_1A6 : int
        var_3_1AB : byte[]
        var_5_1AC : int
        var_0_22E : int
        expr_214 : byte [generated]
        stack_266_2 : byte [generated]
        stack_23A_0 : byte [generated]
        expr_A4 : int [generated]
        var_2_DB : byte[]
        expr_DF : int [generated]
        var_3_286 : byte[]
        var_5_287 : int
        expr_118 : int [generated]
        var_3_2DC : byte[]
        var_5_2DD : int
        expr_2F1 : byte [generated]
        var_3_151 : String
        stack_19F_0 : String[] [generated]
        expr_163 : String[] [generated]
        
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
        var_0_1BB = and:int(ldc:int(-2134579759), ldc:int(-994822191))
        expr_6B = arraylength:int(stack_A2_0 = stack_A4_0 = stack_DB_0 = stack_DD_0 = stack_116_0 = stack_118_0 = stack_145_0 = stack_1CE_0 = stack_214_0 = stack_298_0 = stack_2EE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("LVOx6+0ZXwXZ5VEH42ET4eV7YccL6/H92+VtbQPb5YdfhLCqNCc=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1A6 = expr_6B:int
        var_3_1AB = newarray:byte[](byte.class, expr_6B:int)
        var_5_1AC = expr_6B:int
        Label_0430:
        
        while (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-487301121))
            var_5_1AC = add:int(var_5_1AC:int, ldc:int(-1))
            storeelement:byte(var_3_1AB:byte[], var_5_1AC:int, add:byte(loadelement:byte(stack_1CE_0:byte[], var_5_1AC:int), ldc:byte(21)))
            
            if (cmpne:boolean(var_5_1AC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_DB_0 = stack_DD_0 = stack_116_0 = stack_118_0 = stack_145_0 = stack_1CE_0 = stack_214_0 = stack_298_0 = stack_2EE_0 = var_3_1AB:byte[]
            goto(Label_0112)
        }
        
        var_0_1BB = and:int(var_0_1BB:int, ldc:int(1232977166))
        Label_0509:
        
        while (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(1)), ldc:int(0))) {
            var_0_22E = and:int(var_0_1BB:int, ldc:int(-2038482979))
            var_5_1AC = add:int(var_5_1AC:int, ldc:int(-1))
            expr_214 = stack_266_2 = loadelement(stack_214_0, var_5_1AC)
            
            if (cmplt:boolean(add:int(add:int(var_5_1AC:int, ldc:int(4)), neg:int(var_4_1A6:int)), ldc:int(0))) {
                stack_266_2 = stack_23A_0 = add:byte(expr_214:byte, loadelement:byte(var_3_1AB:byte[], add:int(var_5_1AC:int, ldc:int(4))))
                goto(Label_0586)
            }
            
            Label_0545:
            
            if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(512)), ldc:int(0))) {
                var_0_22E = and:int(var_0_22E:int, ldc:int(123121312))
            }
            else {
                var_0_22E = and:int(var_0_22E:int, ldc:int(-1699894315))
                stack_266_2 = stack_23A_0 = add:byte(expr_214:byte, ldc:byte(4))
            }
            
            Label_0586:
            
            if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(4096)), ldc:int(0))) {
                var_0_22E = and:int(var_0_22E:int, ldc:int(-227014309))
                goto(Label_0545)
            }
            
            var_0_1BB = and:int(var_0_22E:int, ldc:int(-1513532427))
            storeelement:byte(var_3_1AB:byte[], var_5_1AC:int, stack_266_2:byte)
            
            if (cmpne:boolean(var_5_1AC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_DB_0 = stack_DD_0 = stack_116_0 = stack_118_0 = stack_145_0 = stack_1CE_0 = stack_214_0 = stack_298_0 = stack_2EE_0 = var_3_1AB:byte[]
            goto(Label_0169)
        }
        
        goto(Label_0430)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-897266522))
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(256)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-1775960210))
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(256)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-511133245))
            expr_A4 = arraylength:int(stack_A4_0:byte[])
            
            if (cmpne:boolean(expr_A4:int, ldc:int(0))) {
                var_4_1A6 = expr_A4:int
                var_3_1AB = newarray:byte[](byte.class, expr_A4:int)
                var_5_1AC = expr_A4:int
                goto(Label_0509)
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(1)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(152146562))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(64)), ldc:int(0))) {
                var_0_1BB = and:int(var_0_1BB:int, ldc:int(1636586863))
                goto(Label_0112)
            }
            
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-34417703))
            var_2_DB = stack_DB_0:byte[]
            expr_DF = add:int(arraylength:int(stack_DD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                var_3_286 = newarray:byte[](byte.class, expr_DF:int)
                var_5_287 = expr_DF:int
                
                loop {
                    var_0_1BB = and:int(var_0_1BB:int, ldc:int(-63779877))
                    var_5_287 = add:int(var_5_287:int, ldc:int(-1))
                    storeelement:byte(var_3_286:byte[], var_5_287:int, add:int(shl:int(loadelement:byte(stack_298_0:byte[], var_5_287:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_DB:byte[], add:int(var_5_287:int, and:int(ldc:int(2145), ldc:int(21131)))), ldc:int(5)), and:int(ldc:int(2063), ldc:int(5815)))))
                    
                    if (cmpne:boolean(var_5_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_DB_0 = stack_DD_0 = stack_116_0 = stack_118_0 = stack_145_0 = stack_1CE_0 = stack_214_0 = stack_298_0 = stack_2EE_0 = var_3_286:byte[]
            }
        }
        
        Label_0228:
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(2048)), ldc:int(0))) {
                var_0_1BB = and:int(var_0_1BB:int, ldc:int(1082275909))
                goto(Label_0169)
            }
            
            if (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(64)), ldc:int(0))) {
                var_0_1BB = and:int(var_0_1BB:int, ldc:int(174055034))
                goto(Label_0112)
            }
            
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-1040703527))
            expr_118 = arraylength:int(stack_118_0:byte[])
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_3_2DC = newarray:byte[](byte.class, expr_118:int)
                var_5_2DD = expr_118:int
                
                loop {
                    var_0_1BB = and:int(var_0_1BB:int, ldc:int(-1222869003))
                    var_5_2DD = add:int(var_5_2DD:int, ldc:int(-1))
                    expr_2F1 = xor:byte(loadelement:byte(stack_2EE_0:byte[], var_5_2DD:int), ldc:byte(24))
                    storeelement:byte(var_3_2DC:byte[], var_5_2DD:int, or:int(and:int(shl:int(expr_2F1:byte, xor:int(ldc:int(2088), ldc:int(2092))), ldc:int(-16)), and:int(shr:int(expr_2F1:byte[expected:int], and:int(ldc:int(4356), ldc:int(25205))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2DD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_DB_0 = stack_DD_0 = stack_116_0 = stack_118_0 = stack_145_0 = stack_1CE_0 = stack_214_0 = stack_298_0 = stack_2EE_0 = var_3_2DC:byte[]
            }
        }
        
        Label_0285:
        
        if (cmpeq:boolean(and:int(var_0_1BB:int, ldc:int(64)), ldc:int(0))) {
            var_0_1BB = and:int(var_0_1BB:int, ldc:int(-1423101761))
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0169)
        }
        
        if (cmpne:boolean(and:int(var_0_1BB:int, ldc:int(128)), ldc:int(0))) {
            var_3_151 = initobject:String(String::<init>, stack_145_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_19F_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16418), ldc:int(1290)))
            expr_163 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8258), ldc:int(19462)))
            storeelement:String(expr_163:String[], xor:int(ldc:int(712), ldc:int(713)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(2849), ldc:int(-2850)), xor:int(ldc:int(6177), ldc:int(6176))))
            storeelement:String(expr_163:String[], and:int(ldc:int(-24996), ldc:int(24867)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(10241), ldc:int(16399)), and:int(ldc:int(53), ldc:int(16559))))
            putstatic:String[](\u1187\u62da\u718f\u3c25\u6ec6\u5d20::\u5654\u71ae\u6bb9\ua61f\u6b5f\uf995, expr_163:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ud171\u8cae\u59ec\u4cd9\u8d90\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68F : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_69A : int
        
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
        var_3_68F = and:int(ldc:int(1243185908), ldc:int(-910844178))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(545635486))
        }
        else {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-19943870))
            var_5_89 = and:int(ldc:int(-9004), ldc:int(9002))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15206), ldc:int(15201)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_68F:int, ldc:int(1784664678))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(768), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(544), ldc:int(545)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_68F = and:int(var_3_E2:int, ldc:int(-444099642))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(18692), ldc:int(18693)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(653721192))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1881155742))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-36860296))
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1101235719))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2099161050))
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-352686542))
                    }
                    else {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-182209687))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0437:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2074525272))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1323842634))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1870684463))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1276089582))
                            var_11_F3 = and:int(ldc:int(3416), ldc:int(-3417))
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0594:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1872717416))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(328846695))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-81180798))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-113265437))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-749234699))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1307603158))
                            goto(Label_0437)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1412889219))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1429710326))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1131014795))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1290771860))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1898880311))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0437)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(350268818))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1935537002))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0877:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1627925899))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1515259520))
                            goto(Label_0437)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1532749761))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-539381801))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(25297), ldc:int(3105))
                                goto(Label_1142)
                            }
                        }
                    }
                    
                    Label_0992:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1692949881))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1950212105))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1589309273))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1001270421))
                        var_11_F3 = and:int(ldc:int(-880), ldc:int(815))
                    }
                    
                    Label_1142:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1853591718))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1954267891))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(807853180))
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(502075424))
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(662770186))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(403819955))
                            goto(Label_0437)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-242752779))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-868913129))
                            goto(Label_1142)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-115049228))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-112870412))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1401:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1853159288))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-986183882))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1480717571))
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1655202980))
                        goto(Label_0437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(415060995))
                        loopcontinue()
                    }
                    
                    var_3_68F = and:int(var_3_68F:int, ldc:int(-929454268))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69A = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-383305067))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(738523440))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-272894082))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1888899804))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(2113661420))
                        var_17_69A = add:int(var_16_121:int, xor:int(ldc:int(5186), ldc:int(5187)))
                        looporswitchbreak()
                    }
                    
                    var_3_68F = and:int(var_3_68F:int, ldc:int(358460912))
                }
                
                var_3_68F = and:int(var_3_68F:int, ldc:int(-996814743))
                
                if (cmple:boolean(var_5_89 = var_17_69A:int, sub:int(var_6_90:int, xor:int(ldc:int(24864), ldc:int(24865))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-390828335))
            goto(Label_0108)
        }
    }
}
