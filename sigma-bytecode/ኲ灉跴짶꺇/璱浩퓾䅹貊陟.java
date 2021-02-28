public class \u12b2\u7049\u8df4\uc9f6\uae87.\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f {
    public void \u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(com.google.common.collect.ImmutableList<\u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6> p0) {
        var_4_94 : int
        var_5_9A : UnmodifiableIterator
        var_6_C3 : \u67e9\u99f7\ucfaf\u156b\u3504\u6ec6
        var_7_D6 : \u97e6\u52d3\u5bc4\u647c\u516c\uc29a
        
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
            invokespecial:Object(Object::<init>, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f)
            putfield:IntList(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u16f6\u4daf\ua6bd\u7006\u40a9\u8bb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, initobject:IntArrayList[expected:IntList](IntArrayList::<init>))
            putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u93a2\u9a18\u6b0d\ud4fe\uc9f6\ubcb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, ldc:int(-1))
            putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u183a\uc2bd\u9033\u3c25\u8413\u718f, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, ldc:int(-1))
            putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ubb2b\u759a\uc84e\uc910\u873d\u4c04, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, ldc:int(-1))
            putfield:Int2IntMap(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u92ee\uae87\ufcaf\u760c\uc7fe\ua562, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, initobject:Int2IntArrayMap[expected:Int2IntMap](Int2IntArrayMap::<init>))
            putfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, p0:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>)
            var_4_94 = and:int(ldc:int(-898), ldc:int(897))
            var_5_9A = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, p0:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_5_9A:Iterator)) {
                var_6_C3 = checkcast:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6.class, invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(Iterator<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>::next, var_5_9A:Iterator<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>))
                invokeinterface:boolean(IntList::add, getfield:IntList(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u16f6\u4daf\ua6bd\u7006\u40a9\u8bb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), var_4_94:int)
                var_7_D6 = invokevirtual:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u5245\ubf56\u6d99\u9033\u8413\u7873, var_6_C3:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6)
                
                if (cmpne:boolean(var_7_D6:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a, getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\ud217\ubded\u1187\u3e2a\u071d\u6d99))) {
                    if (cmpne:boolean(var_7_D6:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a, getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\uc2bd\u52d3\ub102\u3e2a\ub6ab\u4ab3))) {
                        if (cmpne:boolean(var_7_D6:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a, getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\u8aa5\u7bad\u7873\u67e9\u67d0\u071d))) {
                            if (cmpeq:boolean(var_7_D6:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a, getstatic:\u97e6\u52d3\u5bc4\u647c\u516c\uc29a(\u97e6\u52d3\u5bc4\u647c\u516c\uc29a::\u76bc\u9af2\u927d\ud7e8\u5bc4\ud4fe))) {
                                invokeinterface:int(Int2IntMap::put, getfield:Int2IntMap(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u92ee\uae87\ufcaf\u760c\uc7fe\ua562, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), invokevirtual:int(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u446c\u6cfe\ucfaf\u4f4a\u5d20\u759a, var_6_C3:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6), var_4_94:int)
                            }
                        }
                        else {
                            putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ubb2b\u759a\uc84e\uc910\u873d\u4c04, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, var_4_94:int)
                        }
                    }
                    else {
                        putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u183a\uc2bd\u9033\u3c25\u8413\u718f, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, var_4_94:int)
                    }
                }
                else {
                    putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u93a2\u9a18\u6b0d\ud4fe\uc9f6\ubcb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, var_4_94:int)
                }
                
                var_4_94 = add:int(var_4_94:int, invokevirtual:int(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\u12b2\u9937\u927d\u6c52\uc4d2\u6198, var_6_C3:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6))
            }
            
            putfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4cd9\uafe7\u4ab3\u7006\u62da\u3e2a, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, var_4_94:int)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ud51e\u56bd\u8308\ucef1\u516c\u6ec6), and:int(ldc:int(-7705), ldc:int(7696)))), invokevirtual:int(ImmutableList::size, getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))), loadelement:String(getstatic:String[](\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ud51e\u56bd\u8308\ucef1\u516c\u6ec6), and:int(ldc:int(13775), ldc:int(18945)))), checkcast:String(java.lang.String.class, invokeinterface:String(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokevirtual:Stream(ImmutableList::stream, getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f)), invokedynamic:Function<? super Object, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining, loadelement:String[expected:CharSequence](getstatic:String[](\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ud51e\u56bd\u8308\ucef1\u516c\u6ec6), xor:int(ldc:int(-16384), ldc:int(-16382)))))))))
        }
        
        goto(Label_0006)
    }
    
    public int \u5245\u4ab3\u624e\ucb79\u92ff\u3504() {
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
            return:int(div:int(invokevirtual:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ua3b4\u3d4b\uc2bd\u7d52\uc7fe\u4e72, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), xor:int(ldc:int(16642), ldc:int(16646))))
        }
        
        goto(Label_0006)
    }
    
    public int \ua3b4\u3d4b\uc2bd\u7d52\uc7fe\u4e72() {
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
            return:int(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4cd9\uafe7\u4ab3\u7006\u62da\u3e2a, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.ImmutableList<\u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6> \u4975\ua068\u5bc4\ud12e\uc7fe\ub18d() {
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
            return:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_C4 : int
        var_4_B2 : \u74b1\u6d69\ud4fe\u4179\u8c8a\u965f
        stack_E4_0 : int [generated]
        
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
        var_2_C4 = and:int(ldc:int(805721793), ldc:int(366690847))
        
        if (cmpeq:boolean(this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f[expected:Object], p0:Object)) {
            return:boolean(xor:int[expected:boolean](ldc:int(8864), ldc:int(8865)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(8192)), ldc:int(0))) {
                var_2_C4 = and:int(var_2_C4:int, ldc:int(355429995))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u74b1\u6d69\ud4fe\u4179\u8c8a\u965f>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::getClass, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        var_4_B2 = checkcast:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u12b2\u7049\u8df4\uc9f6\uae87.\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f.class, p0:Object[expected:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f])
                        
                        if (cmpeq:boolean(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4cd9\uafe7\u4ab3\u7006\u62da\u3e2a, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4cd9\uafe7\u4ab3\u7006\u62da\u3e2a, var_4_B2:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(1465285406))
                            stack_E4_0 = invokevirtual:boolean[expected:int](ImmutableList::equals, getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>[expected:Object](\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, var_4_B2:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
                        }
                        else {
                            stack_E4_0 = and:int(ldc:int(-4424), ldc:int(4421))
                        }
                        
                        return:boolean(stack_E4_0:int)
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(67108864)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(2639), ldc:int(-2656)))
            }
        }
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(ImmutableList::hashCode, getfield:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4daf\u6c52\u446c\uceb8\ubcb0\u3711, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f)))
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\u527a\u839e\u600f\u946b\ub6ab(long p0) {
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
    
    public void \u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06() {
        var_1_61 : int
        var_3_75 : UnmodifiableIterator
        
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
            var_1_61 = and:int(ldc:int(1903472960), ldc:int(1054111260))
            
            if (invokestatic:boolean(\u9af2\u6ec6\u983f\ua068\u8c8a::\u873d\u156b\u8308\uafe7\u6fb0\u5654)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(855406280))
                var_3_75 = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, invokevirtual:ImmutableList<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u4975\ua068\u5bc4\ud12e\uc7fe\ub18d, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_3_75:Iterator)) {
                    invokevirtual:void(\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6::\ud523\ufcaf\u4bc8\u5654\ua562\uc87f, checkcast:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(\u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6.class, invokeinterface:\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6(Iterator<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>::next, var_3_75:Iterator<\u67e9\u99f7\ucfaf\u156b\u3504\u6ec6>)))
                }
            }
            else {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u446c\ubcb0\u8d98\u6c56\uc7fe\ub19c, invokedynamic:\u6b5f\u8389\ub32d\ub83f\u71f1(\u12b2\ub32d\u92ff\ud217\u3d4b\u3776:(L\u12b2\u7049\u8df4\uc9f6\uae87/\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f;)L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u6b5f\u8389\ub32d\ub83f\u71f1;, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u836c\u6fb0\uc29a\u7330\u416d\ube23(int p0) {
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
            return:int(invokeinterface:int(IntList::getInt, getfield:IntList(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u16f6\u4daf\ua6bd\u7006\u40a9\u8bb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9033\u8c8a\u7006\u946b\u8753\u98a4() {
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
            var_1_61 = and:int(ldc:int(-1591327197), ldc:int(-11043033))
            
            if (cmplt:boolean(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u93a2\u9a18\u6b0d\ud4fe\uc9f6\ubcb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2033098287))
                stack_8A_0 = and:int(ldc:int(-27407), ldc:int(26890))
            }
            else {
                stack_8A_0 = and:int(ldc:int(8731), ldc:int(19877))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \uc910\u8d90\u8bb0\ub32d\u8258\u7d52() {
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
            return:int(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u93a2\u9a18\u6b0d\ud4fe\uc9f6\ubcb0, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8709\u51b2\u8aa5\ud4fe\uc31c\ua6bd() {
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
            var_1_61 = and:int(ldc:int(580815879), ldc:int(1776089057))
            
            if (cmplt:boolean(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u183a\uc2bd\u9033\u3c25\u8413\u718f, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1283634173))
                stack_8A_0 = and:int(ldc:int(9560), ldc:int(-10201))
            }
            else {
                stack_8A_0 = and:int(ldc:int(2187), ldc:int(20497))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u5654\ua068\u946b\u7e3f\ua3b4\u67e9() {
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
            return:int(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u183a\uc2bd\u9033\u3c25\u8413\u718f, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71f1\u7043\u64ab\u3c25\u5f50\u839e() {
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
            var_1_61 = and:int(ldc:int(-923676679), ldc:int(-605033048))
            
            if (cmplt:boolean(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ubb2b\u759a\uc84e\uc910\u873d\u4c04, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-790104149))
                stack_8A_0 = and:int(ldc:int(-11092), ldc:int(11090))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(-28672), ldc:int(-28671))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u52d3\uae5d\ua3b4\u4e72\uc910\u071d() {
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
            return:int(getfield:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ubb2b\u759a\uc84e\uc910\u873d\u4c04, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\u3d64\u4492\u34df\u9af2\u5d20(int p0) {
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
            return:boolean(invokeinterface:boolean(Int2IntMap::containsKey, getfield:Int2IntMap(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u92ee\uae87\ufcaf\u760c\uc7fe\ua562, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public int \ud4fe\u93a2\u12cb\ubf56\u5fe1\u3a62(int p0) {
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
            return:int(invokeinterface:int(Int2IntMap::get, getfield:Int2IntMap(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u92ee\uae87\ufcaf\u760c\uc7fe\ua562, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u600f\u74b1\u5140\u446c\ub83f\u385b$0(long p0) {
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
            invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_229 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_CA_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_13C_0 : byte[] [generated]
        stack_1D7_0 : byte[] [generated]
        stack_23C_0 : byte[] [generated]
        stack_2AE_0 : byte[] [generated]
        stack_304_0 : byte[] [generated]
        var_4_1B8 : int
        var_3_1BD : byte[]
        var_5_1BE : int
        expr_1D7 : byte [generated]
        var_0_232 : int
        expr_23C : byte [generated]
        stack_27C_2 : byte [generated]
        stack_259_0 : byte [generated]
        expr_9D : int [generated]
        var_2_CA : byte[]
        expr_CE : int [generated]
        var_3_29C : byte[]
        var_5_29D : int
        expr_107 : int [generated]
        var_3_2F2 : byte[]
        var_5_2F3 : int
        var_3_148 : String
        stack_1B1_0 : String[] [generated]
        expr_15A : String[] [generated]
        
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
        var_0_229 = and:int(ldc:int(2117185675), ldc:int(1874718847))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_CA_0 = stack_CC_0 = stack_105_0 = stack_107_0 = stack_13C_0 = stack_1D7_0 = stack_23C_0 = stack_2AE_0 = stack_304_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Nf4NAM8AwESWX/s9TQWPSxaSPZjq")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B8 = expr_6E:int
        var_3_1BD = newarray:byte[](byte.class, expr_6E:int)
        var_5_1BE = expr_6E:int
        Label_0448:
        
        while (cmpeq:boolean(and:int(var_0_229:int, ldc:int(4)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-1302216945))
            var_5_1BE = add:int(var_5_1BE:int, ldc:int(-1))
            expr_1D7 = loadelement:byte(stack_1D7_0:byte[], var_5_1BE:int)
            storeelement:byte(var_3_1BD:byte[], var_5_1BE:int, or:int(and:int(shl:int(expr_1D7:byte, xor:int(ldc:int(897), ldc:int(901))), ldc:int(-16)), and:int(shr:int(expr_1D7:byte[expected:int], xor:int(ldc:int(-28602), ldc:int(-28606))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CA_0 = stack_CC_0 = stack_105_0 = stack_107_0 = stack_13C_0 = stack_1D7_0 = stack_23C_0 = stack_2AE_0 = stack_304_0 = var_3_1BD:byte[]
            goto(Label_0115)
        }
        
        Label_0540:
        
        while (cmpne:boolean(and:int(var_0_229:int, ldc:int(65536)), ldc:int(0))) {
            var_0_232 = and:int(var_0_229:int, ldc:int(-1414021981))
            var_5_1BE = add:int(var_5_1BE:int, ldc:int(-1))
            expr_23C = stack_27C_2 = loadelement(stack_23C_0, var_5_1BE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1BE:int, ldc:int(2)), neg:int(var_4_1B8:int)), ldc:int(0))) {
                stack_27C_2 = stack_259_0 = add:byte(expr_23C:byte, loadelement:byte(var_3_1BD:byte[], add:int(var_5_1BE:int, ldc:int(2))))
                goto(Label_0617)
            }
            
            Label_0585:
            
            if (cmpeq:boolean(and:int(var_0_232:int, ldc:int(131072)), ldc:int(0))) {
                var_0_232 = and:int(var_0_232:int, ldc:int(-1142688317))
                stack_27C_2 = stack_259_0 = add:byte(expr_23C:byte, ldc:byte(2))
            }
            
            Label_0617:
            
            if (cmpne:boolean(and:int(var_0_232:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0585)
            }
            
            var_0_229 = and:int(var_0_232:int, ldc:int(1659746251))
            storeelement:byte(var_3_1BD:byte[], var_5_1BE:int, stack_27C_2:byte)
            
            if (cmpne:boolean(var_5_1BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CA_0 = stack_CC_0 = stack_105_0 = stack_107_0 = stack_13C_0 = stack_1D7_0 = stack_23C_0 = stack_2AE_0 = stack_304_0 = var_3_1BD:byte[]
            goto(Label_0162)
        }
        
        var_0_229 = and:int(var_0_229:int, ldc:int(-708374653))
        goto(Label_0448)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0268)
        }
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(2043881684))
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(1)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-289950617))
            expr_9D = arraylength:int(stack_9D_0:byte[])
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_4_1B8 = expr_9D:int
                var_3_1BD = newarray:byte[](byte.class, expr_9D:int)
                var_5_1BE = expr_9D:int
                goto(Label_0540)
            }
        }
        
        Label_0162:
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0268)
        }
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(16)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-744311022))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_229 = and:int(var_0_229:int, ldc:int(1944434855))
            var_2_CA = stack_CA_0:byte[]
            expr_CE = add:int(arraylength:int(stack_CC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CE:int, ldc:int(0))) {
                var_3_29C = newarray:byte[](byte.class, expr_CE:int)
                var_5_29D = expr_CE:int
                
                loop {
                    var_0_229 = and:int(var_0_229:int, ldc:int(-1573012953))
                    var_5_29D = add:int(var_5_29D:int, ldc:int(-1))
                    storeelement:byte(var_3_29C:byte[], var_5_29D:int, add:int(shl:int(loadelement:byte(stack_2AE_0:byte[], var_5_29D:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_CA:byte[], add:int(var_5_29D:int, and:int(ldc:int(1161), ldc:int(4193)))), ldc:int(2)), and:int(ldc:int(5439), ldc:int(16575)))))
                    
                    if (cmpne:boolean(var_5_29D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CA_0 = stack_CC_0 = stack_105_0 = stack_107_0 = stack_13C_0 = stack_1D7_0 = stack_23C_0 = stack_2AE_0 = stack_304_0 = var_3_29C:byte[]
            }
        }
        
        Label_0211:
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(64)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-1654674734))
        }
        else {
            if (cmpne:boolean(and:int(var_0_229:int, ldc:int(32)), ldc:int(0))) {
                var_0_229 = and:int(var_0_229:int, ldc:int(-1468280206))
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_229 = and:int(var_0_229:int, ldc:int(669230027))
            expr_107 = arraylength:int(stack_107_0:byte[])
            
            if (cmpne:boolean(expr_107:int, ldc:int(0))) {
                var_3_2F2 = newarray:byte[](byte.class, expr_107:int)
                var_5_2F3 = expr_107:int
                
                loop {
                    var_0_229 = and:int(var_0_229:int, ldc:int(-1149239653))
                    var_5_2F3 = add:int(var_5_2F3:int, ldc:int(-1))
                    storeelement:byte(var_3_2F2:byte[], var_5_2F3:int, xor:byte(add:byte(loadelement:byte(stack_304_0:byte[], var_5_2F3:int), ldc:byte(38)), ldc:byte(50)))
                    
                    if (cmpne:boolean(var_5_2F3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CA_0 = stack_CC_0 = stack_105_0 = stack_107_0 = stack_13C_0 = stack_1D7_0 = stack_23C_0 = stack_2AE_0 = stack_304_0 = var_3_2F2:byte[]
            }
        }
        
        Label_0268:
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(32)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(647460036))
            goto(Label_0211)
        }
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(8192)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(600908014))
            goto(Label_0162)
        }
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(1)), ldc:int(0))) {
            var_3_148 = initobject:String(String::<init>, stack_13C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B1_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16945), ldc:int(16946)))
            expr_15A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(339), ldc:int(4139)))
            storeelement:String(expr_15A:String[], xor:int(ldc:int(4108), ldc:int(4110)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(-27287), ldc:int(19094)), xor:int(ldc:int(2124), ldc:int(2125))))
            storeelement:String(expr_15A:String[], xor:int(ldc:int(18497), ldc:int(18496)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(24645), ldc:int(2081)), and:int(ldc:int(110), ldc:int(9996))))
            storeelement:String(expr_15A:String[], and:int(ldc:int(-28308), ldc:int(10899)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(9245), ldc:int(2828)), xor:int(ldc:int(332), ldc:int(344))))
            putstatic:String[](\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ud51e\u56bd\u8308\ucef1\u516c\u6ec6, expr_15A:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u8308\u92ff\u5fe1\ud51e\u8389\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(67962669), ldc:int(211810219))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-961544630))
            var_5_81 = and:int(ldc:int(23752), ldc:int(-32730))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27700), ldc:int(-31797)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_653:int, ldc:int(1034755964))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(225), ldc:int(224)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(3232), ldc:int(3233)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_D1:int, ldc:int(-1665321254))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(257), ldc:int(26149)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-970418594))
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-710990318))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1536282739))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1222244214))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2062843422))
                    }
                    else {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1406253105))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(245639311))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1087767860))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1275595701))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1039134620))
                        var_11_E2 = and:int(ldc:int(-17139), ldc:int(17136))
                        goto(Label_1486)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-986064307))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1516412948))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1378420852))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-316167716))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1956622060))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1972637549))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-8888339))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1560517031))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1910989459))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1713155742))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0824:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1267896029))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(127202031))
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(131002360))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(657467307))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1756041501))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-439552243))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(3), ldc:int(4129))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1892536796))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1020890323))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1908642292))
                        var_11_E2 = and:int(ldc:int(-13607), ldc:int(13606))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1156159689))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1630122598))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(635136579))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-414294114))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1216:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1013562703))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1236000497))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(348454101))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1203318732))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(617490364))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1486)
                    }
                    
                    Label_1350:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1967110454))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1836324840))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1097529565))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-39463953))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(611073577))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1889166677))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(651807009))
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-637567557))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-526792174))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1772187889))
                        var_17_65E = add:int(var_16_110:int, and:int(ldc:int(1029), ldc:int(6153)))
                        looporswitchbreak()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(-592958663))
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(-826452404))
                
                if (cmple:boolean(var_5_81 = var_17_65E:int, sub:int(var_6_88:int, and:int(ldc:int(8195), ldc:int(1089))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
