public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ua562\u759a\u7043\ubefe\u516c\ucef1<T> {
    public static \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ua562\u759a\u7043\ubefe\u516c\ucef1<java.lang.Runnable> \uc238\u8389\u8d90\u71f1\ucef1\uae5d(java.util.concurrent.Executor p0, java.lang.String p1) {
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
            return:\ua562\u759a\u7043\ubefe\u516c\ucef1<Runnable>(initobject:\ua562\u759a\u7043\ubefe\u516c\ucef1<Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1<Runnable>::<init>, initobject:\ub83f\u3776\u69d9\ud4fe\u88c5\ua562<T>[expected:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super Runnable, ? extends Runnable>](\ub83f\u3776\u69d9\ud4fe\u88c5\ua562<Object>::<init>, initobject:ConcurrentLinkedQueue<Object>[expected:Queue<Object>](ConcurrentLinkedQueue<E>::<init>)), p0:Executor, p1:String))
        }
        
        goto(Label_0006)
    }
    
    public void \ua562\u759a\u7043\ubefe\u516c\ucef1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends java.lang.Runnable> p0, java.util.concurrent.Executor p1, java.lang.String p2) {
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
            invokespecial:Object(Object::<init>, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
            putfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>, initobject:AtomicInteger(AtomicInteger::<init>, and:int(ldc:int(12648), ldc:int(-13674))))
            putfield:Executor(\ua562\u759a\u7043\ubefe\u516c\ucef1::\ud51e\uc238\u93a2\u624e\u8cae\u7043, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>, p1:Executor)
            putfield:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u7d52\u624e\u52d3\u7006\ua3b4\u516c, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>, p0:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>)
            putfield:String(\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc229\u4c2b\u0b8e\uc2e8\u1833\ua61f, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>, p2:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8aa5\u8709\u647c\u071d\u61a4\ud12e() {
        var_1_5F : int
        var_1_64 : int
        var_3_6C : int
        
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
        var_1_5F = and:int(ldc:int(445152078), ldc:int(-138362887))
        
        loop {
            var_1_64 = and:int(var_1_5F:int, ldc:int(-1095500851))
            var_3_6C = invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))
            
            if (cmpne:boolean(and:int(var_3_6C:int, xor:int(ldc:int(769), ldc:int(770))), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-27915), ldc:int(27914)))
            }
            
            var_1_5F = and:int(var_1_64:int, ldc:int(375619448))
            
            if (logicalnot:boolean(invokevirtual:boolean(AtomicInteger::compareAndSet, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>), var_3_6C:int, or:int(var_3_6C:int, xor:int(ldc:int(17027), ldc:int(17025)))))) {
                loopcontinue()
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(17728), ldc:int(17729)))
        }
    }
    
    private void \u4f52\u3776\u760c\u8bb0\uf995\u8d90() {
        var_1_5F : int
        var_3_6C : int
        
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
            var_1_5F = and:int(ldc:int(-1035097980), ldc:int(-229166977))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-109231685))
                var_3_6C = invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))
                
                if (logicalnot:boolean(invokevirtual:boolean(AtomicInteger::compareAndSet, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>), var_3_6C:int, and:int(var_3_6C:int, ldc:int(-3))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8753\u16f6\u71f1\u64f2\ud7e8\u4179() {
        var_1_5F : int
        var_1_A5 : int
        stack_CF_0 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(1426642065), ldc:int(1549622559))
        
        if (cmpeq:boolean(and:int(invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)), xor:int(ldc:int(160), ldc:int(161))), ldc:int(0))) {
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(512)), ldc:int(0))) {
                    var_1_A5 = and:int(var_1_5F:int, ldc:int(442914792))
                }
                else {
                    var_1_A5 = and:int(var_1_5F:int, ldc:int(2095811216))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<T, F>::\u6bb9\u8258\u946b\u6d99\u3e75\u4daf, getfield:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u7d52\u624e\u52d3\u7006\ua3b4\u516c, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)))) {
                        stack_CF_0 = and:int(ldc:int(16463), ldc:int(14369))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_A5:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_A5 = and:int(var_1_A5:int, ldc:int(1841235357))
                    stack_CF_0 = and:int(ldc:int(-789), ldc:int(788))
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_A5:int, ldc:int(-1688329456))
            }
            
            return:boolean(stack_CF_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-22441), ldc:int(21416)))
    }
    
    public void close() {
        var_1_5F : int
        var_3_6C : int
        
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
            var_1_5F = and:int(ldc:int(1841090669), ldc:int(-440405648))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-440992825))
                var_3_6C = invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))
                
                if (logicalnot:boolean(invokevirtual:boolean(AtomicInteger::compareAndSet, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>), var_3_6C:int, or:int(var_3_6C:int, and:int(ldc:int(16513), ldc:int(1545)))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \uf94d\u5140\uc29a\u1833\ufe34\u40a9() {
        var_1_5F : int
        stack_91_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-930642845), ldc:int(1504291960))
            
            if (cmpeq:boolean(and:int(invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)), xor:int(ldc:int(16773), ldc:int(16775))), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-241042088))
                stack_91_0 = and:int(ldc:int(2834), ldc:int(-6963))
            }
            else {
                stack_91_0 = xor:int(ldc:int(16708), ldc:int(16709))
            }
            
            return:boolean(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u965f\u4179\ubcb0\u385b\u120d\u718f() {
        var_3_78 : Runnable
        var_4_8E : Thread
        var_5_91 : String
        
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
        
        if (logicalnot:boolean(invokespecial:boolean(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\uf94d\u5140\uc29a\u1833\ufe34\u40a9, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))) {
            return:boolean(and:int[expected:boolean](ldc:int(9393), ldc:int(-25778)))
        }
        
        var_3_78 = checkcast:Runnable(java.lang.Runnable.class, invokeinterface:? extends Runnable[expected:Runnable](\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>::\u3d64\u7d52\u64ab\u98a4\u1833\u93a2, getfield:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u7d52\u624e\u52d3\u7006\ua3b4\u516c, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)))
        
        if (cmpne:boolean(var_3_78:Runnable, aconstnull:Runnable())) {
            if (logicalnot:boolean(getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006))) {
                var_4_8E = aconstnull:Thread()
                var_5_91 = aconstnull:String()
            }
            else {
                var_4_8E = invokestatic:Thread(Thread::currentThread)
                var_5_91 = invokevirtual:String(Thread::getName, var_4_8E:Thread)
                invokevirtual:void(Thread::setName, var_4_8E:Thread, getfield:String(\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc229\u4c2b\u0b8e\uc2e8\u1833\ua61f, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))
            }
            
            invokeinterface:void(Runnable::run, var_3_78:Runnable)
            
            if (cmpne:boolean(var_4_8E:Thread, aconstnull:Thread())) {
                invokevirtual:void(Thread::setName, var_4_8E:Thread, var_5_91:String)
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(897), ldc:int(23577)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-24562), ldc:int(24033)))
    }
    
    public void run() {
        var_1_F9 : int
        
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
            var_1_F9 = and:int(ldc:int(45309959), ldc:int(477349335))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0224)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(458729191))
                        goto(Label_0194)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(-704675620))
                    }
                    else {
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(1014705333))
                        invokespecial:int(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u718f\ub102\u4f52\u7043\u6c56\ubcb0, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>, invokedynamic:Int2BooleanFunction(get:()Lit/unimi/dsi/fastutil/ints/Int2BooleanFunction;))
                    }
                    
                    Label_0148:
                    
                    if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(1)), ldc:int(0))) {
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(864364513))
                        goto(Label_0224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_F9 = and:int(var_1_F9:int, ldc:int(-101568264))
                            loopcontinue()
                        }
                        
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(664227501))
                        invokespecial:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u4f52\u3776\u760c\u8bb0\uf995\u8d90, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
                    }
                    
                    Label_0194:
                    
                    if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0148)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_F9 = and:int(var_1_F9:int, ldc:int(506943535))
                        invokespecial:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u0c95\u6c56\u61a4\u183a\uafe7\u71ae, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
                    }
                    
                    Label_0224:
                    
                    if (cmpne:boolean(and:int(var_1_F9:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_F9:int, ldc:int(536870912)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_F9 = and:int(var_1_F9:int, ldc:int(1918867767))
            }
            finally {
                invokespecial:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u4f52\u3776\u760c\u8bb0\uf995\u8d90, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
                invokespecial:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u0c95\u6c56\u61a4\u183a\uafe7\u71ae, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\ud4fe\ub18d\ub171\u98a4\u873d(T p0) {
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
            invokeinterface:boolean(\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>::\u965f\u3e2a\u836c\uc3e3\u4bc8\u9033, getfield:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u7d52\u624e\u52d3\u7006\ua3b4\u516c, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>), p0:T[expected:? super T])
            invokespecial:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u0c95\u6c56\u61a4\u183a\uafe7\u71ae, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u0c95\u6c56\u61a4\u183a\uafe7\u71ae() {
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0333:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private int \u718f\ub102\u4f52\u7043\u6c56\ubcb0(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0) {
        var_2_61 : int
        var_4_69 : int
        
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
            var_2_61 = and:int(ldc:int(1300877293), ldc:int(2012974451))
            var_4_69 = and:int(ldc:int(19128), ldc:int(-19129))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1477849993))
                
                if (logicalnot:boolean(logicaland:boolean(invokeinterface:boolean(Int2BooleanFunction::get, p0:Int2BooleanFunction, var_4_69:int), invokespecial:boolean(\ua562\u759a\u7043\ubefe\u516c\ucef1<T>::\u965f\u4179\ubcb0\u385b\u120d\u718f, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)))) {
                    looporswitchbreak()
                }
                
                inc:int(var_4_69, ldc:int(1))
            }
            
            return:int(var_4_69:int)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc229\u4c2b\u0b8e\uc2e8\u1833\ua61f, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)), loadelement:String(getstatic:String[](\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc84e\u8753\ufe34\uf995\u3e2a\u4492), and:int(ldc:int(20737), ldc:int(21)))), invokevirtual:int(AtomicInteger::get, getfield:AtomicInteger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u5bc4\u3504\u5140\u88c5\u960f\ub6ab, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))), loadelement:String(getstatic:String[](\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc84e\u8753\ufe34\uf995\u3e2a\u4492), and:int(ldc:int(2661), ldc:int(20737)))), invokeinterface:boolean(\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<T, F>::\u6bb9\u8258\u946b\u6d99\u3e75\u4daf, getfield:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super T, ? extends Runnable>(\ua562\u759a\u7043\ubefe\u516c\ucef1::\u7d52\u624e\u52d3\u7006\ua3b4\u516c, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>)))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uf9c5\u8389\u600f\u965f\u446c\ua3b4() {
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
            return:String(getfield:String(\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc229\u4c2b\u0b8e\uc2e8\u1833\ua61f, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub102\ufcaf\u40a9\u67d0\u92ee\u071d$0(int p0) {
        var_1_61 : int
        stack_87_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1167332193), ldc:int(1945981939))
            
            if (cmpne:boolean(p0:int, ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(968782689))
                stack_87_0 = and:int(ldc:int(-24801), ldc:int(24800))
            }
            else {
                stack_87_0 = and:int(ldc:int(3285), ldc:int(17153))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_1B1_0 : byte[] [generated]
        stack_212_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_142 : byte[]
        var_4_143 : int
        expr_97 : int [generated]
        var_5_193 : int
        var_3_198 : byte[]
        var_4_199 : int
        expr_1B4 : byte [generated]
        var_0_208 : int
        expr_212 : byte [generated]
        stack_242_2 : byte [generated]
        expr_BE : int [generated]
        var_3_E5 : String
        stack_133_0 : String[] [generated]
        expr_F7 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-1692862358), ldc:int(-78005268))
            expr_68 = var_2_6C = stack_95_0 = stack_97_0 = stack_BC_0 = stack_BE_0 = stack_D9_0 = stack_1B1_0 = stack_212_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BWgf48AMjEIORkHvx5aMQmBBxoppxY0IV1nSSA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_142 = newarray:byte[](byte.class, expr_70:int)
                var_4_143 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-652297170))
                    var_4_143 = add:int(var_4_143:int, ldc:int(-1))
                    storeelement:byte(var_3_142:byte[], var_4_143:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_143:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_143:int, xor:int(ldc:int(-32698), ldc:int(-32697)))), ldc:int(3)), and:int(ldc:int(31), ldc:int(9791)))))
                    
                    if (cmpne:boolean(var_4_143:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_BC_0 = stack_BE_0 = stack_D9_0 = stack_1B1_0 = stack_212_0 = var_3_142:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0195)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(171273894))
                    goto(Label_0156)
                }
                
                var_0_61 = and:int(var_0_61:int, ldc:int(-327929))
                expr_97 = arraylength:int(stack_97_0:byte[])
                
                if (cmpeq:boolean(expr_97:int, ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_5_193 = expr_97:int
                var_3_198 = newarray:byte[](byte.class, expr_97:int)
                var_4_199 = expr_97:int
                Label_0411:
                
                while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-79955871))
                    var_4_199 = add:int(var_4_199:int, ldc:int(-1))
                    expr_1B4 = add:byte(loadelement:byte(stack_1B1_0:byte[], var_4_199:int), ldc:byte(59))
                    storeelement:byte(var_3_198:byte[], var_4_199:int, xor:int(or:int(and:int(shl:int(expr_1B4:byte, and:int(ldc:int(269), ldc:int(10822))), ldc:int(-16)), and:int(shr:int(expr_1B4:byte[expected:int], xor:int(ldc:int(16547), ldc:int(16551))), ldc:int(15))), ldc:int(60)))
                    
                    if (cmpne:boolean(var_4_199:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_BC_0 = stack_BE_0 = stack_D9_0 = stack_1B1_0 = stack_212_0 = var_3_198:byte[]
                    goto(Label_0156)
                }
                
                Label_0508:
                
                while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_208 = and:int(var_0_61:int, ldc:int(-1613186823))
                    var_4_199 = add:int(var_4_199:int, ldc:int(-1))
                    expr_212 = loadelement:byte(stack_212_0:byte[], var_4_199:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_199:int, ldc:int(4)), neg:int(var_5_193:int)), ldc:int(0))) {
                        var_0_208 = and:int(var_0_208:int, ldc:int(-1680080992))
                        stack_242_2 = add:byte(expr_212:byte, ldc:byte(4))
                    }
                    else {
                        stack_242_2 = add:byte(expr_212:byte, loadelement:byte(var_3_198:byte[], add:int(var_4_199:int, ldc:int(4))))
                    }
                    
                    var_0_61 = and:int(var_0_208:int, ldc:int(-107167928))
                    storeelement:byte(var_3_198:byte[], var_4_199:int, stack_242_2:byte)
                    
                    if (cmpne:boolean(var_4_199:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_BC_0 = stack_BE_0 = stack_D9_0 = stack_1B1_0 = stack_212_0 = var_3_198:byte[]
                    goto(Label_0195)
                }
                
                goto(Label_0411)
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1024)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_61:int, ldc:int(-176960992))
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1088505604))
                    expr_BE = arraylength:int(stack_BE_0:byte[])
                    
                    if (cmpne:boolean(expr_BE:int, ldc:int(0))) {
                        var_5_193 = expr_BE:int
                        var_3_198 = newarray:byte[](byte.class, expr_BE:int)
                        var_4_199 = expr_BE:int
                        goto(Label_0508)
                    }
                }
                
                Label_0195:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E5 = initobject:String(String::<init>, stack_D9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_133_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8771), ldc:int(8769)))
            expr_F7 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16962), ldc:int(7450)))
            storeelement:String(expr_F7:String[], and:int(ldc:int(8257), ldc:int(17197)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(-13711), ldc:int(1422)), xor:int(ldc:int(16400), ldc:int(16401))))
            storeelement:String(expr_F7:String[], and:int(ldc:int(-12042), ldc:int(12040)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(2070), ldc:int(2071)), and:int(ldc:int(2107), ldc:int(8219))))
            putstatic:String[](\ua562\u759a\u7043\ubefe\u516c\ucef1::\uc84e\u8753\ufe34\uf995\u3e2a\u4492, expr_F7:String[])
            putstatic:Logger(\ua562\u759a\u7043\ubefe\u516c\ucef1::\ub7dc\u4e72\u47c2\uc3e3\uc29a\u92ee, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubefe\u5f50\uf9c5\ud12e\ufe34\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_609 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_614 : int
        
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
        var_3_609 = and:int(ldc:int(-1876464775), ldc:int(-1230553095))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua562\u759a\u7043\ubefe\u516c\ucef1<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_609 = and:int(var_3_609:int, ldc:int(874986867))
            var_5_80 = and:int(ldc:int(4245), ldc:int(-4246))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3762), ldc:int(3761)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_609:int, ldc:int(837626339))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(-31998), ldc:int(-31997)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(8261), ldc:int(8260)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_609 = and:int(var_3_D9:int, ldc:int(1570056573))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(28681), ldc:int(931)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(2019066440))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1672454551))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1208342714))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1999499233))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0539)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-720994561))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-184235769))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(-1746932865))
                            var_11_EA = and:int(ldc:int(-20011), ldc:int(17962))
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0539:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1041179521))
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-137903848))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(27076132))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-794187774))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(-1462431368))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_609 = and:int(var_3_609:int, ldc:int(2142580593))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(443621752))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1790964790))
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(810384012))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_609 = and:int(var_3_609:int, ldc:int(-195068573))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1151943096))
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1817271616))
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-660336650))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1040630735))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1807052281))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(-1424776602))
                            loopcontinue()
                        }
                        
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1647988873))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(576), ldc:int(577))
                                goto(Label_1072)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(967153781))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1774123203))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(2090242851))
                            loopcontinue()
                        }
                        
                        var_3_609 = and:int(var_3_609:int, ldc:int(1446324729))
                        var_11_EA = and:int(ldc:int(-18171), ldc:int(18090))
                    }
                    
                    Label_1072:
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1425185558))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(-548246373))
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(-1806123588))
                            loopcontinue()
                        }
                        
                        var_3_609 = and:int(var_3_609:int, ldc:int(1357364079))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1183:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(64)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1826352142))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1531309650))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_609 = and:int(var_3_609:int, ldc:int(1427586401))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1295:
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1543883633))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(2094302431))
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-813289645))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1477407354))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-121299957))
                        loopcontinue()
                    }
                    
                    var_3_609 = and:int(var_3_609:int, ldc:int(-667030545))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1436:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_614 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1447:
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(-1673917764))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(256)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(2088091185))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1740859923))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_609:int, ldc:int(32)), ldc:int(0))) {
                        var_3_609 = and:int(var_3_609:int, ldc:int(1361029485))
                        var_17_614 = add:int(var_16_118:int, xor:int(ldc:int(-24048), ldc:int(-24047)))
                        looporswitchbreak()
                    }
                }
                
                var_3_609 = and:int(var_3_609:int, ldc:int(-1822032411))
                
                if (cmple:boolean(var_5_80 = var_17_614:int, sub:int(var_6_87:int, and:int(ldc:int(385), ldc:int(533))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_609:int, ldc:int(65536)), ldc:int(0))) {
            var_3_609 = and:int(var_3_609:int, ldc:int(1922263339))
            goto(Label_0108)
        }
    }
}
